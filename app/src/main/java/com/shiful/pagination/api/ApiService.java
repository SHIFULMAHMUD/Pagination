package com.shiful.pagination.api;

import com.shiful.pagination.model.ques_ans.QuestionAnswer;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("questionList/")
    Call<QuestionAnswer> getQuestionList(@Query("page") Integer page);
}
