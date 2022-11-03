package com.winchampion.model.response.dwdPhjrFzxx20;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdPhjrFzxx20 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_phjr_fzxx_20数据对象")
public class DwdPhjrFzxx20Result {
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


    @Schema(name = "djrq", description = "登记日期")
    private String djrq;


    @Schema(name = "sswflxDm", description = "违法类型代码")
    private String sswflxDm;


    @Schema(name = "wfwzlxmc", description = "违法类型名称")
    private String wfwzlxmc;


    @Schema(name = "wfsd", description = "违法手段")
    private String wfsd;


    @Schema(name = "cfjd", description = "处罚决定")
    private String cfjd;


    @Schema(name = "sswfsdDm", description = "税收违法手段代码")
    private String sswfsdDm;


    @Schema(name = "sswfxwclztDm", description = "税收违法行为处罚状态代码")
    private String sswfxwclztDm;


    @Schema(name = "sswfxwclztmc", description = "税收违法行为处理状态名称")
    private String sswfxwclztmc;


    @Schema(name = "ssqjq1", description = "所属期起")
    private String ssqjq1;


    @Schema(name = "ssqjz1", description = "所属期止")
    private String ssqjz1;


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

    public String getDjrq() {
        return djrq;
    }

    public void setDjrq(String djrq) {
        this.djrq = djrq;
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

    public String getSswfsdDm() {
        return sswfsdDm;
    }

    public void setSswfsdDm(String sswfsdDm) {
        this.sswfsdDm = sswfsdDm;
    }

    public String getSswfxwclztDm() {
        return sswfxwclztDm;
    }

    public void setSswfxwclztDm(String sswfxwclztDm) {
        this.sswfxwclztDm = sswfxwclztDm;
    }

    public String getSswfxwclztmc() {
        return sswfxwclztmc;
    }

    public void setSswfxwclztmc(String sswfxwclztmc) {
        this.sswfxwclztmc = sswfxwclztmc;
    }

    public String getSsqjq1() {
        return ssqjq1;
    }

    public void setSsqjq1(String ssqjq1) {
        this.ssqjq1 = ssqjq1;
    }

    public String getSsqjz1() {
        return ssqjz1;
    }

    public void setSsqjz1(String ssqjz1) {
        this.ssqjz1 = ssqjz1;
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
