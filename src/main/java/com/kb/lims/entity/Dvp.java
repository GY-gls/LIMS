package com.kb.lims.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

//@Data
@TableName("dvp")
public class Dvp implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer status;

    private String planCreator;

    private Integer creatorId;

    private String RDManager;

    private String supervisor;

    private String dvpNumber;

    private String product;

    private Integer revision;

    private Double COC;

    private String verificationAndValidationScope;

    private String KBPartNumber;

    private String customerPartNumber;

    private String customerProject;

    private String RDApproval;

    private Timestamp RDDate;

    private String individualTestRequest;

    private Integer taskNumber;

    private String taskSummary;

    private String taskName;

    private Timestamp createdAt;

    public String getPlanCreator() {
        return planCreator;
    }

    public void setPlanCreator(String planCreator) {
        this.planCreator = planCreator;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public String getRDManager() {
        return RDManager;
    }

    public void setRDManager(String RAndDManager) {
        this.RDManager = RAndDManager;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getDvpNumber() {
        return dvpNumber;
    }

    public void setDvpNumber(String dvpNumber) {
        this.dvpNumber = dvpNumber;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public Double getCOC() {
        return COC;
    }

    public void setCOC(Double COC) {
        this.COC = COC;
    }

    public String getVerificationAndValidationScope() {
        return verificationAndValidationScope;
    }

    public void setVerificationAndValidationScope(String verificationAndValidationScope) {
        this.verificationAndValidationScope = verificationAndValidationScope;
    }

    public String getKBPartNumber() {
        return KBPartNumber;
    }

    public void setKBPartNumber(String KBPartNumber) {
        this.KBPartNumber = KBPartNumber;
    }

    public String getCustomerPartNumber() {
        return customerPartNumber;
    }

    public void setCustomerPartNumber(String customerPartNumber) {
        this.customerPartNumber = customerPartNumber;
    }

    public String getCustomerProject() {
        return customerProject;
    }

    public void setCustomerProject(String customerProject) {
        this.customerProject = customerProject;
    }

    public String getRDApproval() {
        return RDApproval;
    }

    public void setRDApproval(String RDApproval) {
        this.RDApproval = RDApproval;
    }

    public Timestamp getRDDate() {
        return RDDate;
    }

    public void setRDDate(Timestamp RDDate) {
        this.RDDate = RDDate;
    }

    public String getIndividualTestRequest() {
        return individualTestRequest;
    }

    public void setIndividualTestRequest(String individualTestRequest) {
        this.individualTestRequest = individualTestRequest;
    }

    public Integer getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(Integer taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getTaskSummary() {
        return taskSummary;
    }

    public void setTaskSummary(String taskSummary) {
        this.taskSummary = taskSummary;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

}
