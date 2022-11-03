package com.winchampion.model.response.dwdCurrentcerHouseT;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdCurrentcerHouseT 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_currentcer_house_t数据对象")
public class DwdCurrentcerHouseTResult {
    @Schema(name = "pjah", description = "自定义主键ID")
    private Long customizeId;

    @Schema(name = "dataBatchId", description = "数据批次ID")
    private Long dataBatchId;

    public Long getCustomizeId() {
        return customizeId;
    }

    public void setCustomizeId(Long customizeId) {
        this.customizeId = customizeId;
    }

    public Long getDataBatchId() {
        return dataBatchId;
    }

    public void setDataBatchId(Long dataBatchId) {
        this.dataBatchId = dataBatchId;
    }

    @Schema(name = "currenthouseid", description = "证房屋唯一编号")
    private String currenthouseid;


    @Schema(name = "righttype", description = "权利类型")
    private String righttype;


    @Schema(name = "rightid", description = "权利编号")
    private String rightid;


    @Schema(name = "housenum", description = "房屋序号")
    private String housenum;


    @Schema(name = "s", description = "收件编号")
    private String s;


    @Schema(name = "houseId", description = "房屋编号")
    private String houseId;


    @Schema(name = "districtid", description = "区县代码")
    private String districtid;


    @Schema(name = "location", description = "房屋坐落")
    private String location;


    @Schema(name = "doornum", description = "幢号")
    private String doornum;


    @Schema(name = "part", description = "部位")
    private String part;


    @Schema(name = "buildingarea", description = "建筑面积")
    private String buildingarea;


    @Schema(name = "cellarArea", description = "其中地下建筑面积")
    private String cellarArea;


    @Schema(name = "totalfloors", description = "总层数")
    private String totalfloors;


    @Schema(name = "housetype", description = "房屋类型")
    private String housetype;


    @Schema(name = "housearch", description = "房屋结构")
    private String housearch;


    @Schema(name = "finisheddate", description = "竣工日期")
    private String finisheddate;


    @Schema(name = "delflag", description = "删除标志")
    private String delflag;


    @Schema(name = "ywsjDate", description = "业务时间（应推送时间）")
    private String ywsjDate;


    @Schema(name = "jhptUpdateTime", description = "JHPT_UPDATE_TIME")
    private String jhptUpdateTime;


    @Schema(name = "dsjzxTaskid", description = "dsjzx_taskid")
    private String dsjzxTaskid;

    public String getCurrenthouseid() {
        return currenthouseid;
    }

    public void setCurrenthouseid(String currenthouseid) {
        this.currenthouseid = currenthouseid;
    }

    public String getRighttype() {
        return righttype;
    }

    public void setRighttype(String righttype) {
        this.righttype = righttype;
    }

    public String getRightid() {
        return rightid;
    }

    public void setRightid(String rightid) {
        this.rightid = rightid;
    }

    public String getHousenum() {
        return housenum;
    }

    public void setHousenum(String housenum) {
        this.housenum = housenum;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getDistrictid() {
        return districtid;
    }

    public void setDistrictid(String districtid) {
        this.districtid = districtid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDoornum() {
        return doornum;
    }

    public void setDoornum(String doornum) {
        this.doornum = doornum;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getBuildingarea() {
        return buildingarea;
    }

    public void setBuildingarea(String buildingarea) {
        this.buildingarea = buildingarea;
    }

    public String getCellarArea() {
        return cellarArea;
    }

    public void setCellarArea(String cellarArea) {
        this.cellarArea = cellarArea;
    }

    public String getTotalfloors() {
        return totalfloors;
    }

    public void setTotalfloors(String totalfloors) {
        this.totalfloors = totalfloors;
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype;
    }

    public String getHousearch() {
        return housearch;
    }

    public void setHousearch(String housearch) {
        this.housearch = housearch;
    }

    public String getFinisheddate() {
        return finisheddate;
    }

    public void setFinisheddate(String finisheddate) {
        this.finisheddate = finisheddate;
    }

    public String getDelflag() {
        return delflag;
    }

    public void setDelflag(String delflag) {
        this.delflag = delflag;
    }

    public String getYwsjDate() {
        return ywsjDate;
    }

    public void setYwsjDate(String ywsjDate) {
        this.ywsjDate = ywsjDate;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
