package com.kb.lims.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.sql.Timestamp;

//@Data
@TableName("test_request")
public class TestRequest implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer status;

    private String target;

    private String costCenter;

    private String projectNumber;

    private Integer sampleId; // 关联样件id

    private String drawingIncludingRevision;

    private String individualRequests;

    private Integer dvpId; // 关联dvp id

    private Integer taskNumber;

    private String taskName;

    private String comments;

    private Timestamp dueDate;

    private Timestamp samplesAvailableFrom;

    private String RDManager;

    private String division;

    private String creatorId;

    private Timestamp createdAt;

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

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    public Integer getSampleId() {
        return sampleId;
    }

    public void setSampleId(Integer sampleId) {
        this.sampleId = sampleId;
    }

    public String getDrawingIncludingRevision() {
        return drawingIncludingRevision;
    }

    public void setDrawingIncludingRevision(String drawingIncludingRevision) {
        this.drawingIncludingRevision = drawingIncludingRevision;
    }

    public String getIndividualRequests() {
        return individualRequests;
    }

    public void setIndividualRequests(String individualRequests) {
        this.individualRequests = individualRequests;
    }

    public Integer getDvpId() {
        return dvpId;
    }

    public void setDvpId(Integer dvpId) {
        this.dvpId = dvpId;
    }

    public Integer getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(Integer taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Timestamp getDueDate() {
        return dueDate;
    }

    public void setDueDate(Timestamp dueDate) {
        this.dueDate = dueDate;
    }

    public Timestamp getSamplesAvailableFrom() {
        return samplesAvailableFrom;
    }

    public void setSamplesAvailableFrom(Timestamp samplesAvailableFrom) {
        this.samplesAvailableFrom = samplesAvailableFrom;
    }

    public String getRDManager() {
        return RDManager;
    }

    public void setRDManager(String RDManager) {
        this.RDManager = RDManager;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
