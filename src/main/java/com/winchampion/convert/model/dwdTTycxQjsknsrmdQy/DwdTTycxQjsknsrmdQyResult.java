package com.winchampion.model.response.dwdTTycxQjsknsrmdQy;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdTTycxQjsknsrmdQy 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_t_tycx_qjsknsrmd_qy数据对象")
public class DwdTTycxQjsknsrmdQyResult {
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

    @Schema(name = "id", description = "id")
    private String id;


    @Schema(name = "nsrmc", description = "纳税人名称")
    private String nsrmc;


    @Schema(name = "swdjh", description = "税务登记号")
    private String swdjh;


    @Schema(name = "fzrxm", description = "负责人姓名")
    private String fzrxm;


    @Schema(name = "zjmc", description = "证件名称")
    private String zjmc;


    @Schema(name = "zjhm", description = "证件号码")
    private String zjhm;


    @Schema(name = "zcdz", description = "注册地址")
    private String zcdz;


    @Schema(name = "jydz", description = "经营地址")
    private String jydz;


    @Schema(name = "qssz", description = "欠税税种")
    private String qssz;


    @Schema(name = "hj", description = "合计金额")
    private String hj;


    @Schema(name = "cqye", description = "以前年度陈欠金额")
    private String cqye;


    @Schema(name = "xqye", description = "本年度新欠余额")
    private String xqye;


    @Schema(name = "ssswjg", description = "所属税务机关")
    private String ssswjg;


    @Schema(name = "jzrq", description = "截止日期")
    private String jzrq;


    @Schema(name = "jhptUpdateTime", description = "数据更新时间")
    private String jhptUpdateTime;


    @Schema(name = "jhptDelete", description = "删除标志")
    private String jhptDelete;


    @Schema(name = "sysTime", description = "业务时间")
    private String sysTime;


    @Schema(name = "dsjzxTaskid", description = "批次号")
    private String dsjzxTaskid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getSwdjh() {
        return swdjh;
    }

    public void setSwdjh(String swdjh) {
        this.swdjh = swdjh;
    }

    public String getFzrxm() {
        return fzrxm;
    }

    public void setFzrxm(String fzrxm) {
        this.fzrxm = fzrxm;
    }

    public String getZjmc() {
        return zjmc;
    }

    public void setZjmc(String zjmc) {
        this.zjmc = zjmc;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public String getZcdz() {
        return zcdz;
    }

    public void setZcdz(String zcdz) {
        this.zcdz = zcdz;
    }

    public String getJydz() {
        return jydz;
    }

    public void setJydz(String jydz) {
        this.jydz = jydz;
    }

    public String getQssz() {
        return qssz;
    }

    public void setQssz(String qssz) {
        this.qssz = qssz;
    }

    public String getHj() {
        return hj;
    }

    public void setHj(String hj) {
        this.hj = hj;
    }

    public String getCqye() {
        return cqye;
    }

    public void setCqye(String cqye) {
        this.cqye = cqye;
    }

    public String getXqye() {
        return xqye;
    }

    public void setXqye(String xqye) {
        this.xqye = xqye;
    }

    public String getSsswjg() {
        return ssswjg;
    }

    public void setSsswjg(String ssswjg) {
        this.ssswjg = ssswjg;
    }

    public String getJzrq() {
        return jzrq;
    }

    public void setJzrq(String jzrq) {
        this.jzrq = jzrq;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getJhptDelete() {
        return jhptDelete;
    }

    public void setJhptDelete(String jhptDelete) {
        this.jhptDelete = jhptDelete;
    }

    public String getSysTime() {
        return sysTime;
    }

    public void setSysTime(String sysTime) {
        this.sysTime = sysTime;
    }

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
