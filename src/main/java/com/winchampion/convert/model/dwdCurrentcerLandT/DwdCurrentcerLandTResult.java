package com.winchampion.model.response.dwdCurrentcerLandT;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdCurrentcerLandT 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_currentcer_land_t数据对象")
public class DwdCurrentcerLandTResult {
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

    @Schema(name = "currentlotid", description = "证土地唯一编号")
    private String currentlotid;


    @Schema(name = "districtid", description = "区县代码")
    private String districtid;


    @Schema(name = "righttype", description = "权利类型")
    private String righttype;


    @Schema(name = "rightid", description = "权利编号")
    private String rightid;


    @Schema(name = "transactionid", description = "收件编号")
    private String transactionid;


    @Schema(name = "lotcode", description = "土地宗地号")
    private String lotcode;


    @Schema(name = "usabledate", description = "使用期限(起始）")
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


    @Schema(name = "delflag", description = "删除标志")
    private String delflag;


    @Schema(name = "ywsjDate", description = "业务时间（应推送时间）")
    private String ywsjDate;


    @Schema(name = "jhptUpdateTime", description = "jhpt_update_time")
    private String jhptUpdateTime;


    @Schema(name = "taskid", description = "taskid")
    private String taskid;

    public String getCurrentlotid() {
        return currentlotid;
    }

    public void setCurrentlotid(String currentlotid) {
        this.currentlotid = currentlotid;
    }

    public String getDistrictid() {
        return districtid;
    }

    public void setDistrictid(String districtid) {
        this.districtid = districtid;
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

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
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

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }
}
