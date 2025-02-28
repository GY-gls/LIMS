package com.kb.lims.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

// Bench没有设置DTO因为BenchDTO和Bench太相似了（BenchDTO只会比Bench少一个id）
//@Data
@TableName("bench")
public class Bench implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String name;

    private String location; // 苏州、重庆、大连

    private String projectName; // 所属项目名称

    private Timestamp dateOfPurchase;

    private String manager;

    private String state;

    private String user;

    private Timestamp lastCalibrationDate;

    private Integer calibrationPeriod; // 校准周期精准到天

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Timestamp getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Timestamp dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Timestamp getLastCalibrationDate() {
        return lastCalibrationDate;
    }

    public void setLastCalibrationDate(Timestamp lastCalibrationDate) {
        this.lastCalibrationDate = lastCalibrationDate;
    }

    public Integer getCalibrationPeriod() {
        return calibrationPeriod;
    }

    public void setCalibrationPeriod(Integer calibrationPeriod) {
        this.calibrationPeriod = calibrationPeriod;
    }
}
