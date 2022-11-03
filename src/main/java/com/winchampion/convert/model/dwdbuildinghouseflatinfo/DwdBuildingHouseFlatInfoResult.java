package com.winchampion.model.response.dwdbuildinghouseflatinfo;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdBuildingHouseFlatInfo 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_building_house_flat_info数据对象")
public class DwdBuildingHouseFlatInfoResult {


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

    @Schema(name = "houseId", description = "户编号")
    private String houseId;


    @Schema(name = "buildingId", description = "楼栋编号")
    private String buildingId;


    @Schema(name = "buildingName", description = "建筑物名称")
    private String buildingName;


    @Schema(name = "stateDate", description = "状态日期")
    private String stateDate;


    @Schema(name = "roomNumber", description = "室号或部位")
    private String roomNumber;


    @Schema(name = "locationname", description = "坐落名")
    private String locationname;


    @Schema(name = "landusename", description = "房屋用途")
    private String landusename;


    @Schema(name = "housetypename", description = "房屋类型")
    private String housetypename;


    @Schema(name = "districtCode", description = "区县代码")
    private String districtCode;


    @Schema(name = "streetCode", description = "街道编号")
    private String streetCode;


    @Schema(name = "streetname", description = "街道名称")
    private String streetname;


    @Schema(name = "jhptUpdateTime", description = "更新时间")
    private String jhptUpdateTime;


    @Schema(name = "ywsjDate", description = "业务时间")
    private String ywsjDate;


    @Schema(name = "jhptDelete", description = "删除标志位")
    private String jhptDelete;


    @Schema(name = "dsjzxTaskid", description = "dsjzx_taskid")
    private String dsjzxTaskid;

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getStateDate() {
        return stateDate;
    }

    public void setStateDate(String stateDate) {
        this.stateDate = stateDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    public String getLandusename() {
        return landusename;
    }

    public void setLandusename(String landusename) {
        this.landusename = landusename;
    }

    public String getHousetypename() {
        return housetypename;
    }

    public void setHousetypename(String housetypename) {
        this.housetypename = housetypename;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getYwsjDate() {
        return ywsjDate;
    }

    public void setYwsjDate(String ywsjDate) {
        this.ywsjDate = ywsjDate;
    }

    public String getJhptDelete() {
        return jhptDelete;
    }

    public void setJhptDelete(String jhptDelete) {
        this.jhptDelete = jhptDelete;
    }

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
