package com.shiful.pagination.adapter;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.shiful.pagination.R;
import com.shiful.pagination.model.ques_ans.Data;

import java.util.LinkedList;
import java.util.List;

public class PaginationAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<Data> askList;
    private static final int LOADING = 0;
    private static final int ITEM = 1;
    private boolean isLoadingAdded = false;

    public PaginationAdapter(Context context) {
        this.context = context;
        askList = new LinkedList<>();
    }

    public void setDataList(List<Data> askList) {
        this.askList = askList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        switch (viewType) {
            case ITEM:
                View viewItem = inflater.inflate(R.layout.item_ask_list, parent, false);
                viewHolder = new DataViewHolder(viewItem);
                break;
            case LOADING:
                View viewLoading = inflater.inflate(R.layout.item_loading, parent, false);
                viewHolder = new LoadingViewHolder(viewLoading);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case ITEM:
                populateItemRows((DataViewHolder) holder, position);
                break;
            case LOADING:
                LoadingViewHolder loadingViewHolder = (LoadingViewHolder) holder;
                loadingViewHolder.progressBar.setVisibility(View.VISIBLE);
                break;
        }
    }


    @Override
    public int getItemCount() {
        return askList == null ? 0 : askList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return (position == askList.size() - 1 && isLoadingAdded) ? LOADING : ITEM;
    }

    public void addLoadingFooter() {
        isLoadingAdded = true;
        add(new Data());
    }

    public void removeLoadingFooter() {
        isLoadingAdded = false;

        int position = askList.size() - 1;
        Data result = getItem(position);

        if (result != null) {
            askList.remove(position);
            notifyItemRemoved(position);
        }
    }

    public void add(Data movie) {
        askList.add(movie);
        notifyItemInserted(askList.size() - 1);
    }

    public void addAll(List<Data> moveResults) {
        for (Data result : moveResults) {
            add(result);
        }
    }

    public Data getItem(int position) {
        return askList.get(position);
    }


    private static class DataViewHolder extends RecyclerView.ViewHolder {
        TextView textViewQuestion,textViewName,textViewDesignation,textViewAnswer;
        CircularImageView doctorImageView;
        ConstraintLayout lyt_parent;

        public DataViewHolder(View itemView) {
            super(itemView);
            textViewQuestion=itemView.findViewById(R.id.textViewQuestion);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewDesignation = itemView.findViewById(R.id.textViewDesignation);
            textViewAnswer = itemView.findViewById(R.id.textViewAnswer);
            doctorImageView = itemView.findViewById(R.id.doctorImageView);
            lyt_parent = itemView.findViewById(R.id.lyt_parent);
        }
    }

    private static class LoadingViewHolder extends RecyclerView.ViewHolder {

        private ProgressBar progressBar;

        public LoadingViewHolder(View itemView) {
            super(itemView);
            progressBar = (ProgressBar) itemView.findViewById(R.id.loadmore_progress);

        }
    }
    private void showLoadingView(LoadingViewHolder viewHolder, int position) {
        //ProgressBar would be displayed

    }

    private void populateItemRows(DataViewHolder holder, int position) {
        String date, title, reply;
        if (askList.get(position).getTitle() == null) {
            holder.textViewQuestion.setText("");
            title = "";
        } else {
            String question = "";
            question = askList.get(position).getTitle();
            title = question;
            if (question.length() < 50) {
                holder.textViewQuestion.setText(Html.fromHtml(question).toString());
            } else {
                holder.textViewQuestion.setText(Html.fromHtml(question.substring(0, 49)).toString() + " ....");
            }
        }

        if (askList.get(position).getReply() == null) {
            holder.textViewAnswer.setText("");
            reply = "";
        } else {
            String answer = "";
            answer = askList.get(position).getReply();
            reply = answer;
            if (answer.length() < 50) {
                holder.textViewAnswer.setText(Html.fromHtml(answer).toString());
            } else {
                holder.textViewAnswer.setText(Html.fromHtml(answer.substring(0, 49)).toString() + " ....");
            }
        }
        if (askList.get(position).getEntryDate() == null) {
            date = "";
        } else {
            date = askList.get(position).getEntryDate();
        }
        if (askList.get(position).getGetDoctor() == null) {
            holder.textViewName.setText("");
            holder.textViewDesignation.setText("");
            holder.doctorImageView.setVisibility(View.GONE);
        } else {
            if (askList.get(position).getGetDoctor().getDoctorName() == null) {
                holder.textViewName.setText("");
            } else {
                holder.textViewName.setText(askList.get(position).getGetDoctor().getDoctorName());
            }

            if (askList.get(position).getGetDoctor().getCurrentDesignation() == null) {
                holder.textViewDesignation.setText("");
            } else {
                holder.textViewDesignation.setText(askList.get(position).getGetDoctor().getCurrentDesignation());
            }

            if (askList.get(position).getGetDoctor().getGetPhoto().getUserPhoto() == null) {
                holder.doctorImageView.setVisibility(View.GONE);
            } else {
                holder.doctorImageView.setVisibility(View.VISIBLE);
            }

        }

    }
}
