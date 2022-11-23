package com.shiful.pagination.model.ques_ans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class QuestionAnswer implements Serializable
{
    @SerializedName("askList")
    @Expose
    private AskList askList;

    public AskList getAskList() {
        return askList;
    }

    public void setAskList(AskList askList) {
        this.askList = askList;
    }

}
