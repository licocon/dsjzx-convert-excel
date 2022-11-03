package com.winchampion.model.response.dwdRightRealT;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdRightRealT 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_right_real_t数据对象")
public class DwdRightRealTResult {
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

    @Schema(name = "realid", description = "产权编号")
    private String realid;


    @Schema(name = "districtid", description = "区县代码")
    private String districtid;


    @Schema(name = "transactionid", description = "收件编号")
    private String transactionid;


    @Schema(name = "location", description = "产权坐落")
    private String location;


    @Schema(name = "realno", description = "产权证号")
    private String realno;


    @Schema(name = "startdate", description = "受理日期")
    private String startdate;


    @Schema(name = "passdate", description = "核准日期")
    private String passdate;


    @Schema(name = "remark", description = "产权备注")
    private String remark;


    @Schema(name = "delflag", description = "删除标志")
    private String delflag;


    @Schema(name = "ywsjDate", description = "业务时间（应推送时间）")
    private String ywsjDate;


    @Schema(name = "jhptUpdateTime", description = "JHPT_UPDATE_TIME")
    private String jhptUpdateTime;


    @Schema(name = "dsjzxTaskid", description = "dsjzx_taskid")
    private String dsjzxTaskid;

    public String getRealid() {
        return realid;
    }

    public void setRealid(String realid) {
        this.realid = realid;
    }

    public String getDistrictid() {
        return districtid;
    }

    public void setDistrictid(String districtid) {
        this.districtid = districtid;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
