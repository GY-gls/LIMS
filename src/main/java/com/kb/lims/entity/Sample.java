package com.kb.lims.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

// Sample没有设置DTO因为SampleDTO只会比Sample少一个id
//@Data
@TableName("sample")
public class Sample implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String projectName; // 所属项目名称

    private String model; // 型号

    private Integer number;

    private String initiator; // 发起人

    private String initiatorDepartment; // 发起人部门

    private String receiver; // 接受人

    private String receiverDepartment; // 接受人部门

    private Timestamp initiateDate; // 发起日期

    private Timestamp receiveDate; // 接受日期

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getInitiatorDepartment() {
        return initiatorDepartment;
    }

    public void setInitiatorDepartment(String initiatorDepartment) {
        this.initiatorDepartment = initiatorDepartment;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiverDepartment() {
        return receiverDepartment;
    }

    public void setReceiverDepartment(String receiverDepartment) {
        this.receiverDepartment = receiverDepartment;
    }

    public Timestamp getInitiateDate() {
        return initiateDate;
    }

    public void setInitiateDate(Timestamp initiateDate) {
        this.initiateDate = initiateDate;
    }

    public Timestamp getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Timestamp receiveDate) {
        this.receiveDate = receiveDate;
    }

}
