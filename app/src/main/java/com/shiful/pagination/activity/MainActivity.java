package com.shiful.pagination.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;

import com.shiful.pagination.R;
import com.shiful.pagination.adapter.PaginationAdapter;
import com.shiful.pagination.api.ApiService;
import com.shiful.pagination.api.ClientApi;
import com.shiful.pagination.listener.PaginationScrollListener;
import com.shiful.pagination.model.ques_ans.Data;
import com.shiful.pagination.model.ques_ans.QuestionAnswer;

import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private PaginationAdapter paginationAdapter;
    private ApiService apiService;
    private ProgressBar progressBar;
    private static final int PAGE_START = 1;
    private boolean isLoading = false;
    private boolean isLastPage = false;
    private int currentPage = PAGE_START;
    SwipeRefreshLayout refreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        progressBar = findViewById(R.id.progressbar);
        refreshLayout=findViewById(R.id.refreshLayout);
        apiService = ClientApi.getClient().create(ApiService.class);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        paginationAdapter = new PaginationAdapter(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(paginationAdapter);

        refreshLayout.setColorSchemeResources(R.color.teal_700);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadFirstPage(PAGE_START);
                refreshLayout.setRefreshing(false);
            }
        });

        recyclerView.addOnScrollListener(new PaginationScrollListener(linearLayoutManager) {
            @Override
            protected void loadMoreItems() {
                isLoading = true;
                currentPage += 1;
                loadNextPage(currentPage);
            }

            @Override
            public boolean isLastPage() {
                return isLastPage;
            }

            @Override
            public boolean isLoading() {
                return isLoading;
            }
        });

        loadFirstPage(currentPage);
    }

    private void loadNextPage(Integer pageNumber) {
        apiService.getQuestionList(pageNumber).enqueue(new Callback<QuestionAnswer>() {
            @Override
            public void onResponse(Call<QuestionAnswer> call, Response<QuestionAnswer> response) {
                paginationAdapter.removeLoadingFooter();
                isLoading = false;

                QuestionAnswer results = response.body();
                List<Data> data= results.getAskList().getData();
                paginationAdapter.addAll(data);
                Log.e("last_page", String.valueOf(results.getAskList().getLast_page()));
                if (currentPage != results.getAskList().getLast_page()) paginationAdapter.addLoadingFooter();
                else isLastPage = true;
            }

            @Override
            public void onFailure(Call<QuestionAnswer> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    private void loadFirstPage(Integer pageNumber) {
        apiService.getQuestionList(pageNumber).enqueue(new Callback<QuestionAnswer>() {
            @Override
            public void onResponse(Call<QuestionAnswer> call, Response<QuestionAnswer> response) {
                QuestionAnswer results = response.body();
                List<Data> data= results.getAskList().getData();
                progressBar.setVisibility(View.GONE);
                paginationAdapter.addAll(data);
                Log.e("last_page", String.valueOf(results.getAskList().getLast_page()));
                if (currentPage <= results.getAskList().getLast_page()) paginationAdapter.addLoadingFooter();
                else isLastPage = true;
            }

            @Override
            public void onFailure(Call<QuestionAnswer> call, Throwable t) {

            }

        });
    }
}