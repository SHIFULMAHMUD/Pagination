
package com.shiful.pagination.model.ques_ans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GetSpeciality implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("doctor_id")
    @Expose
    private String doctorId;
    @SerializedName("speciality_id")
    @Expose
    private String specialityId;
    @SerializedName("remarks")
    @Expose
    private String remarks;
    @SerializedName("deleted_at")
    @Expose
    private String deletedAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("get_speciality")
    @Expose
    private GetSpeciality__1 getSpeciality;
    
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

    public String getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(String specialityId) {
        this.specialityId = specialityId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public GetSpeciality__1 getGetSpeciality() {
        return getSpeciality;
    }

    public void setGetSpeciality(GetSpeciality__1 getSpeciality) {
        this.getSpeciality = getSpeciality;
    }

}
