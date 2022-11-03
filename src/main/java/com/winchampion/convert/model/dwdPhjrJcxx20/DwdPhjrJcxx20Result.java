package com.winchampion.model.response.dwdPhjrJcxx20;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdPhjrJcxx20 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_phjr_jcxx_20数据对象")
public class DwdPhjrJcxx20Result {
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


    @Schema(name = "djxh", description = "登记序号")
    private String djxh;


    @Schema(name = "shxydm", description = "社会信用代码")
    private String shxydm;


    @Schema(name = "nsrmc", description = "纳税人名称")
    private String nsrmc;


    @Schema(name = "larq", description = "立案日期")
    private String larq;


    @Schema(name = "sswflxDm", description = "税务违法行为类型代码")
    private String sswflxDm;


    @Schema(name = "wfwzlxmc", description = "税务违法行为类型名称")
    private String wfwzlxmc;


    @Schema(name = "wfsd", description = "违法手段")
    private String wfsd;


    @Schema(name = "cfjd", description = "处罚决定")
    private String cfjd;


    @Schema(name = "sjjcsj", description = "数据集成时间")
    private String sjjcsj;


    @Schema(name = "jhptUpdateTime", description = "数据更新时间")
    private String jhptUpdateTime;


    @Schema(name = "jhptDelete", description = "删除标志")
    private String jhptDelete;


    @Schema(name = "dsjzxTaskid", description = "批次号")
    private String dsjzxTaskid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDjxh() {
        return djxh;
    }

    public void setDjxh(String djxh) {
        this.djxh = djxh;
    }

    public String getShxydm() {
        return shxydm;
    }

    public void setShxydm(String shxydm) {
        this.shxydm = shxydm;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getLarq() {
        return larq;
    }

    public void setLarq(String larq) {
        this.larq = larq;
    }

    public String getSswflxDm() {
        return sswflxDm;
    }

    public void setSswflxDm(String sswflxDm) {
        this.sswflxDm = sswflxDm;
    }

    public String getWfwzlxmc() {
        return wfwzlxmc;
    }

    public void setWfwzlxmc(String wfwzlxmc) {
        this.wfwzlxmc = wfwzlxmc;
    }

    public String getWfsd() {
        return wfsd;
    }

    public void setWfsd(String wfsd) {
        this.wfsd = wfsd;
    }

    public String getCfjd() {
        return cfjd;
    }

    public void setCfjd(String cfjd) {
        this.cfjd = cfjd;
    }

    public String getSjjcsj() {
        return sjjcsj;
    }

    public void setSjjcsj(String sjjcsj) {
        this.sjjcsj = sjjcsj;
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

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
