
package com.shiful.pagination.model.ques_ans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GetDegree implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("doctor_id")
    @Expose
    private String doctorId;
    @SerializedName("degree_id")
    @Expose
    private String degreeId;
    @SerializedName("institute")
    @Expose
    private String institute;
    @SerializedName("passing_year")
    @Expose
    private String passingYear;
    @SerializedName("deleted_at")
    @Expose
    private String deletedAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("get_degree")
    @Expose
    private GetDegree__1 getDegree;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(String degreeId) {
        this.degreeId = degreeId;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(String passingYear) {
        this.passingYear = passingYear;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GetDegree__1 getGetDegree() {
        return getDegree;
    }

    public void setGetDegree(GetDegree__1 getDegree) {
        this.getDegree = getDegree;
    }

}
