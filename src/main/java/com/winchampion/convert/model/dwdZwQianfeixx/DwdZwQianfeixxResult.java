package com.winchampion.model.response.dwdZwQianfeixx;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdZwQianfeixx 数据对象返回类
 * 燃气居民客户和非居民客户欠费信息
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_zw_qianfeixx数据对象")
public class DwdZwQianfeixxResult {
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


    @Schema(name = "sCid", description = "客户编号")
    private String sCid;


    @Schema(name = "sDz", description = "地址")
    private String sDz;


    @Schema(name = "sHm", description = "户名")
    private String sHm;


    @Schema(name = "nJe", description = "金额")
    private String nJe;


    @Schema(name = "jhptDelete", description = "记录状态0，有效，-1无效")
    private String jhptDelete;


    @Schema(name = "id", description = "主键")
    private String id;


    @Schema(name = "dKaizhangsj", description = "开账时间")
    private String dKaizhangsj;


    @Schema(name = "sQuyu", description = "行政区")
    private String sQuyu;


    @Schema(name = "dsjzxTaskid", description = "数据日期")
    private String dsjzxTaskid;


    @Schema(name = "iJumim", description = "居民非居民标志，1，居民，2非居民")
    private String iJumim;


    @Schema(name = "jhptUpdateTime", description = "时间戳")
    private String jhptUpdateTime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getsCid() {
        return sCid;
    }

    public void setsCid(String sCid) {
        this.sCid = sCid;
    }

    public String getsDz() {
        return sDz;
    }

    public void setsDz(String sDz) {
        this.sDz = sDz;
    }

    public String getsHm() {
        return sHm;
    }

    public void setsHm(String sHm) {
        this.sHm = sHm;
    }

    public String getnJe() {
        return nJe;
    }

    public void setnJe(String nJe) {
        this.nJe = nJe;
    }

    public String getJhptDelete() {
        return jhptDelete;
    }

    public void setJhptDelete(String jhptDelete) {
        this.jhptDelete = jhptDelete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getdKaizhangsj() {
        return dKaizhangsj;
    }

    public void setdKaizhangsj(String dKaizhangsj) {
        this.dKaizhangsj = dKaizhangsj;
    }

    public String getsQuyu() {
        return sQuyu;
    }

    public void setsQuyu(String sQuyu) {
        this.sQuyu = sQuyu;
    }

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }

    public String getiJumim() {
        return iJumim;
    }

    public void setiJumim(String iJumim) {
        this.iJumim = iJumim;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }
}
