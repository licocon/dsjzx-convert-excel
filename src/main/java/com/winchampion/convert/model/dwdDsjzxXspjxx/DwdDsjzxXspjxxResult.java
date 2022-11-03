package com.winchampion.model.response.dwdDsjzxXspjxx;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdDsjzxXspjxx 数据对象返回类
 * 个人-刑事判决信息
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_dsjzx_xspjxx数据对象")
public class DwdDsjzxXspjxxResult {
    @Schema(name = "pjah", description = "自定义主键ID")
    private Long customizeId;

    @Schema(name = "dataBatchId", description = "数据批次ID")
    private Long dataBatchId;


    @Schema(name = "pjah", description = "判决案号")
    private String pjah;


    @Schema(name = "pjzm", description = "判决罪名")
    private String pjzm;


    @Schema(name = "jarq", description = "判决日期")
    private String jarq;


    @Schema(name = "pjfy", description = "判决法院")
    private String pjfy;


    @Schema(name = "xfzlqx", description = "刑罚种类和期限")
    private String xfzlqx;


    @Schema(name = "fjx", description = "附加刑")
    private String fjx;


    @Schema(name = "bdzzqlqx", description = "剥夺政治权利")
    private String bdzzqlqx;


    @Schema(name = "saje", description = "涉案金额")
    private String saje;


    @Schema(name = "dsrmc", description = "当事人姓名")
    private String dsrmc;


    @Schema(name = "zjlx", description = "证件类型")
    private String zjlx;


    @Schema(name = "zjhm", description = "证件号码")
    private String zjhm;


    @Schema(name = "gj", description = "国籍")
    private String gj;


    @Schema(name = "uuid", description = "主键")
    private String uuid;


    @Schema(name = "businessTime", description = "业务时间戳")
    private String businessTime;


    @Schema(name = "jhptDelete", description = "是否删除")
    private String jhptDelete;


    @Schema(name = "jhptUpdateTime", description = "归集时间戳")
    private String jhptUpdateTime;


    @Schema(name = "dsjzxTaskid", description = "批次号")
    private String dsjzxTaskid;

    public String getPjah() {
        return pjah;
    }

    public void setPjah(String pjah) {
        this.pjah = pjah;
    }

    public String getPjzm() {
        return pjzm;
    }

    public void setPjzm(String pjzm) {
        this.pjzm = pjzm;
    }

    public String getJarq() {
        return jarq;
    }

    public void setJarq(String jarq) {
        this.jarq = jarq;
    }

    public String getPjfy() {
        return pjfy;
    }

    public void setPjfy(String pjfy) {
        this.pjfy = pjfy;
    }

    public String getXfzlqx() {
        return xfzlqx;
    }

    public void setXfzlqx(String xfzlqx) {
        this.xfzlqx = xfzlqx;
    }

    public String getFjx() {
        return fjx;
    }

    public void setFjx(String fjx) {
        this.fjx = fjx;
    }

    public String getBdzzqlqx() {
        return bdzzqlqx;
    }

    public void setBdzzqlqx(String bdzzqlqx) {
        this.bdzzqlqx = bdzzqlqx;
    }

    public String getSaje() {
        return saje;
    }

    public void setSaje(String saje) {
        this.saje = saje;
    }

    public String getDsrmc() {
        return dsrmc;
    }

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

    public void setDsrmc(String dsrmc) {
        this.dsrmc = dsrmc;
    }

    public String getZjlx() {
        return zjlx;
    }

    public void setZjlx(String zjlx) {
        this.zjlx = zjlx;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getBusinessTime() {
        return businessTime;
    }

    public void setBusinessTime(String businessTime) {
        this.businessTime = businessTime;
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

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
