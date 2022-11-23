
package com.shiful.pagination.model.ques_ans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class GetDoctor implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("doctor_name")
    @Expose
    private String doctorName;
    @SerializedName("visiting_fees")
    @Expose
    private String visitingFees;
    @SerializedName("messaging_fees")
    @Expose
    private String messagingFees;
    @SerializedName("emergency_contact")
    @Expose
    private String emergencyContact;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("age")
    @Expose
    private String age;
    @SerializedName("bio_data")
    @Expose
    private String bioData;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("current_designation")
    @Expose
    private String currentDesignation;
    @SerializedName("year_of_experience")
    @Expose
    private String yearOfExperience;
    @SerializedName("bmdc_reg_no")
    @Expose
    private String bmdcRegNo;
    @SerializedName("bmdc_reg_year")
    @Expose
    private String bmdcRegYear;
    @SerializedName("bmdc_doc")
    @Expose
    private String bmdcDoc;
    @SerializedName("passport_nid")
    @Expose
    private String passportNid;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("premium")
    @Expose
    private String premium;
    @SerializedName("online")
    @Expose
    private String online;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("deleted_at")
    @Expose
    private String deletedAt;
    @SerializedName("created_by")
    @Expose
    private String createdBy;
    @SerializedName("updated_by")
    @Expose
    private String updatedBy;
    @SerializedName("get_speciality")
    @Expose
    private List<GetSpeciality> getSpeciality = null;
    @SerializedName("get_degree")
    @Expose
    private List<GetDegree> getDegree = null;
    @SerializedName("get_photo")
    @Expose
    private GetPhoto getPhoto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getVisitingFees() {
        return visitingFees;
    }

    public void setVisitingFees(String visitingFees) {
        this.visitingFees = visitingFees;
    }

    public String getMessagingFees() {
        return messagingFees;
    }

    public void setMessagingFees(String messagingFees) {
        this.messagingFees = messagingFees;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBioData() {
        return bioData;
    }

    public void setBioData(String bioData) {
        this.bioData = bioData;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCurrentDesignation() {
        return currentDesignation;
    }

    public void setCurrentDesignation(String currentDesignation) {
        this.currentDesignation = currentDesignation;
    }

    public String getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(String yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getBmdcRegNo() {
        return bmdcRegNo;
    }

    public void setBmdcRegNo(String bmdcRegNo) {
        this.bmdcRegNo = bmdcRegNo;
    }

    public String getBmdcRegYear() {
        return bmdcRegYear;
    }

    public void setBmdcRegYear(String bmdcRegYear) {
        this.bmdcRegYear = bmdcRegYear;
    }

    public String getBmdcDoc() {
        return bmdcDoc;
    }

    public void setBmdcDoc(String bmdcDoc) {
        this.bmdcDoc = bmdcDoc;
    }

    public String getPassportNid() {
        return passportNid;
    }

    public void setPassportNid(String passportNid) {
        this.passportNid = passportNid;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public List<GetSpeciality> getGetSpeciality() {
        return getSpeciality;
    }

    public void setGetSpeciality(List<GetSpeciality> getSpeciality) {
        this.getSpeciality = getSpeciality;
    }

    public List<GetDegree> getGetDegree() {
        return getDegree;
    }

    public void setGetDegree(List<GetDegree> getDegree) {
        this.getDegree = getDegree;
    }

    public GetPhoto getGetPhoto() {
        return getPhoto;
    }

    public void setGetPhoto(GetPhoto getPhoto) {
        this.getPhoto = getPhoto;
    }

}
