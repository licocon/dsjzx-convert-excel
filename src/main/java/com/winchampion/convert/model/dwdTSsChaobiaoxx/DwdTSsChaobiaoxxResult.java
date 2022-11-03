package com.winchampion.model.response.dwdTSsChaobiaoxx;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdTSsChaobiaoxx 数据对象返回类
 * 抄表信息
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_t_ss_chaobiaoxx数据对象")
public class DwdTSsChaobiaoxxResult {
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


    @Schema(name = "dChaobiaoxxrksj", description = "抄表信息入库时间")
    private String dChaobiaoxxrksj;


    @Schema(name = "dsjzxTaskid", description = "批次号")
    private String dsjzxTaskid;


    @Schema(name = "sCeben", description = "册本")
    private String sCeben;


    @Schema(name = "jhptUpdateTime", description = "更新时间")
    private String jhptUpdateTime;


    @Schema(name = "jhptDelete", description = "删除标识")
    private String jhptDelete;


    @Schema(name = "iChaobiaon", description = "抄表年")
    private String iChaobiaon;


    @Schema(name = "dChaobiaorq", description = "抄表日期")
    private String dChaobiaorq;


    @Schema(name = "sFuwudbh", description = "服务点编号")
    private String sFuwudbh;


    @Schema(name = "iBencicm", description = "本次抄码")
    private String iBencicm;


    @Schema(name = "sZhuangtaimc", description = "抄表状态名称")
    private String sZhuangtaimc;


    @Schema(name = "sXitongly", description = "系统来源")
    private String sXitongly;


    @Schema(name = "iChaobiaoy", description = "抄表月")
    private String iChaobiaoy;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getdChaobiaoxxrksj() {
        return dChaobiaoxxrksj;
    }

    public void setdChaobiaoxxrksj(String dChaobiaoxxrksj) {
        this.dChaobiaoxxrksj = dChaobiaoxxrksj;
    }

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }

    public String getsCeben() {
        return sCeben;
    }

    public void setsCeben(String sCeben) {
        this.sCeben = sCeben;
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

    public String getiChaobiaon() {
        return iChaobiaon;
    }

    public void setiChaobiaon(String iChaobiaon) {
        this.iChaobiaon = iChaobiaon;
    }

    public String getdChaobiaorq() {
        return dChaobiaorq;
    }

    public void setdChaobiaorq(String dChaobiaorq) {
        this.dChaobiaorq = dChaobiaorq;
    }

    public String getsFuwudbh() {
        return sFuwudbh;
    }

    public void setsFuwudbh(String sFuwudbh) {
        this.sFuwudbh = sFuwudbh;
    }

    public String getiBencicm() {
        return iBencicm;
    }

    public void setiBencicm(String iBencicm) {
        this.iBencicm = iBencicm;
    }

    public String getsZhuangtaimc() {
        return sZhuangtaimc;
    }

    public void setsZhuangtaimc(String sZhuangtaimc) {
        this.sZhuangtaimc = sZhuangtaimc;
    }

    public String getsXitongly() {
        return sXitongly;
    }

    public void setsXitongly(String sXitongly) {
        this.sXitongly = sXitongly;
    }

    public String getiChaobiaoy() {
        return iChaobiaoy;
    }

    public void setiChaobiaoy(String iChaobiaoy) {
        this.iChaobiaoy = iChaobiaoy;
    }
}
