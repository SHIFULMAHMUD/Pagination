
package com.shiful.pagination.model.ques_ans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GetPhoto implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("user_photo")
    @Expose
    private String userPhoto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

}
