package com.winchampion.model.response.dwdGdcConsOweCorp;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdGdcConsOweCorp 数据对象返回类
 * 电力法人欠费信息
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_gdc_cons_owe_corp数据对象")
public class DwdGdcConsOweCorpResult {
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

    @Schema(name = "uuid", description = "uuid")
    private String uuid;


    @Schema(name = "busiCreatTime", description = "业务时间戳")
    private String busiCreatTime;


    @Schema(name = "rcvblAmt", description = "欠费金额")
    private String rcvblAmt;


    @Schema(name = "elecAddr", description = "用电地址")
    private String elecAddr;


    @Schema(name = "isSettle", description = "是否结清")
    private String isSettle;


    @Schema(name = "dsjzxTaskid", description = "批次号")
    private String dsjzxTaskid;


    @Schema(name = "createDate", description = "数据生成时间")
    private String createDate;


    @Schema(name = "infoId", description = "INFO_ID")
    private String infoId;


    @Schema(name = "consName", description = "用户名称")
    private String consName;


    @Schema(name = "jhptDelete", description = "删除标志位")
    private String jhptDelete;


    @Schema(name = "jhptUpdateTime", description = "更新时间")
    private String jhptUpdateTime;


    @Schema(name = "consId", description = "用电客户唯一标识")
    private String consId;


    @Schema(name = "rcvblYm", description = "电费年月")
    private String rcvblYm;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getBusiCreatTime() {
        return busiCreatTime;
    }

    public void setBusiCreatTime(String busiCreatTime) {
        this.busiCreatTime = busiCreatTime;
    }

    public String getRcvblAmt() {
        return rcvblAmt;
    }

    public void setRcvblAmt(String rcvblAmt) {
        this.rcvblAmt = rcvblAmt;
    }

    public String getElecAddr() {
        return elecAddr;
    }

    public void setElecAddr(String elecAddr) {
        this.elecAddr = elecAddr;
    }

    public String getIsSettle() {
        return isSettle;
    }

    public void setIsSettle(String isSettle) {
        this.isSettle = isSettle;
    }

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    public String getConsName() {
        return consName;
    }

    public void setConsName(String consName) {
        this.consName = consName;
    }

    public String getJhptDelete() {
        return jhptDelete;
    }

    public void setJhptDelete(String jhptDelete) {
        this.jhptDelete = jhptDelete;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getConsId() {
        return consId;
    }

    public void setConsId(String consId) {
        this.consId = consId;
    }

    public String getRcvblYm() {
        return rcvblYm;
    }

    public void setRcvblYm(String rcvblYm) {
        this.rcvblYm = rcvblYm;
    }
}
