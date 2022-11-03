package com.winchampion.model.response.dwdRightRealOwnerT;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdRightRealOwnerT 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_right_real_owner_t数据对象")
public class DwdRightRealOwnerTResult {
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

    @Schema(name = "rightownerid", description = "产权人唯一编号")
    private String rightownerid;


    @Schema(name = "rightid", description = "产权编号")
    private String rightid;


    @Schema(name = "rightconseqnum", description = "产权人序号")
    private String rightconseqnum;


    @Schema(name = "districtid", description = "区县代码")
    private String districtid;


    @Schema(name = "rightownername", description = "权利人名称")
    private String rightownername;


    @Schema(name = "joincase", description = "共有情况")
    private String joincase;


    @Schema(name = "rate", description = "份额")
    private String rate;


    @Schema(name = "delflag", description = "删除标志")
    private String delflag;


    @Schema(name = "ywsjDate", description = "业务时间（应推送时间）")
    private String ywsjDate;


    @Schema(name = "jhptUpdateTime", description = "JHPT_UPDATE_TIME")
    private String jhptUpdateTime;


    @Schema(name = "dsjzxTaskid", description = "dsjzx_taskid")
    private String dsjzxTaskid;

    public String getRightownerid() {
        return rightownerid;
    }

    public void setRightownerid(String rightownerid) {
        this.rightownerid = rightownerid;
    }

    public String getRightid() {
        return rightid;
    }

    public void setRightid(String rightid) {
        this.rightid = rightid;
    }

    public String getRightconseqnum() {
        return rightconseqnum;
    }

    public void setRightconseqnum(String rightconseqnum) {
        this.rightconseqnum = rightconseqnum;
    }

    public String getDistrictid() {
        return districtid;
    }

    public void setDistrictid(String districtid) {
        this.districtid = districtid;
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
