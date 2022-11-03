package com.winchampion.model.response.fusionTranswarpGuitujuT1;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * FusionTranswarpGuitujuT1 数据对象返回类
 *
 * @author licocon
 * @since 2022-08-16
 */
@SuppressWarnings("SpellCheckingInspection")
@Schema(name = "FUSION_TRANSWARP_GUITUJU_T1数据对象")
public class FusionTranswarpGuitujuT1Result {
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

    @Schema(name = "rightid", description = "权利编号")
    private String rightid;


    @Schema(name = "transactionid", description = "收件编号")
    private String transactionid;


    @Schema(name = "houseId", description = "房屋编号")
    private String houseId;


    @Schema(name = "districtid", description = "区县代码")
    private String districtid;


    @Schema(name = "locationHouse", description = "房屋坐落")
    private String locationHouse;


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


    @Schema(name = "lotcode", description = "土地宗地号")
    private String lotcode;


    @Schema(name = "usabledate", description = "房屋用途")
    private String usabledate;


    @Schema(name = "enddate", description = "使用期限(终止）")
    private String enddate;


    @Schema(name = "landsource", description = "使用权取得方式")
    private String landsource;


    @Schema(name = "permitusage", description = "土地用途")
    private String permitusage;


    @Schema(name = "blockarea", description = "宗地（丘）面积")
    private String blockarea;


    @Schema(name = "landarea", description = "使用权面积")
    private String landarea;


    @Schema(name = "locationReal", description = "产权坐落")
    private String locationReal;


    @Schema(name = "realno", description = "产权证号")
    private String realno;


    @Schema(name = "startdate", description = "受理日期")
    private String startdate;


    @Schema(name = "passdate", description = "核准日期")
    private String passdate;


    @Schema(name = "remark", description = "产权备注")
    private String remark;


    @Schema(name = "rightownername", description = "权利人名称")
    private String rightownername;


    @Schema(name = "joincase", description = "共有情况")
    private String joincase;


    @Schema(name = "rate", description = "份额")
    private String rate;

    public String getRightid() {
        return rightid;
    }

    public void setRightid(String rightid) {
        this.rightid = rightid;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
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

    public String getLocationHouse() {
        return locationHouse;
    }

    public void setLocationHouse(String locationHouse) {
        this.locationHouse = locationHouse;
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

    public String getLotcode() {
        return lotcode;
    }

    public void setLotcode(String lotcode) {
        this.lotcode = lotcode;
    }

    public String getUsabledate() {
        return usabledate;
    }

    public void setUsabledate(String usabledate) {
        this.usabledate = usabledate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getLandsource() {
        return landsource;
    }

    public void setLandsource(String landsource) {
        this.landsource = landsource;
    }

    public String getPermitusage() {
        return permitusage;
    }

    public void setPermitusage(String permitusage) {
        this.permitusage = permitusage;
    }

    public String getBlockarea() {
        return blockarea;
    }

    public void setBlockarea(String blockarea) {
        this.blockarea = blockarea;
    }

    public String getLandarea() {
        return landarea;
    }

    public void setLandarea(String landarea) {
        this.landarea = landarea;
    }

    public String getLocationReal() {
        return locationReal;
    }

    public void setLocationReal(String locationReal) {
        this.locationReal = locationReal;
    }

    public String getRealno() {
        return realno;
    }

    public void setRealno(String realno) {
        this.realno = realno;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getPassdate() {
        return passdate;
    }

    public void setPassdate(String passdate) {
        this.passdate = passdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRightownername() {
        return rightownername;
    }

    public void setRightownername(String rightownername) {
        this.rightownername = rightownername;
    }

    public String getJoincase() {
        return joincase;
    }

    public void setJoincase(String joincase) {
        this.joincase = joincase;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
