package com.example.mini_program.entity;

import java.util.Date;

public class Area {
    /**
     * 主键ID
     */
    private Integer areaId;
    /**
     * 名称
     */
    private String areaName;
    /**
     * 权重   越大越排名靠前
     */
    private Integer Priority;
    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date LastEditTime;
    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriority() {
        return Priority;
    }

    public void setPriority(Integer priority) {
        Priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return LastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        LastEditTime = lastEditTime;
    }



}
