package com.winchampion.model.response.dwdZwFjmkaizhangxx;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdZwFjmkaizhangxx 数据对象返回类
 * 非居民开账信息
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_zw_fjmkaizhangxx数据对象")
public class DwdZwFjmkaizhangxxResult {
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


    @Schema(name = "sDz", description = "地址")
    private String sDz;


    @Schema(name = "sCid", description = "客户编号")
    private String sCid;


    @Schema(name = "jhptUpdateTime", description = "操作时间")
    private String jhptUpdateTime;


    @Schema(name = "id", description = "主键")
    private String id;


    @Schema(name = "sHm", description = "户名")
    private String sHm;


    @Schema(name = "sQuyu", description = "行政区")
    private String sQuyu;


    @Schema(name = "jhptDelete", description = "记录状态0，有效，-1无效")
    private String jhptDelete;


    @Schema(name = "dsjzxTaskid", description = "数据日期")
    private String dsjzxTaskid;


    @Schema(name = "iXiaofeil", description = "消费量")
    private String iXiaofeil;


    @Schema(name = "dKaizhangsj", description = "开账时间")
    private String dKaizhangsj;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getsDz() {
        return sDz;
    }

    public void setsDz(String sDz) {
        this.sDz = sDz;
    }

    public String getsCid() {
        return sCid;
    }

    public void setsCid(String sCid) {
        this.sCid = sCid;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getsHm() {
        return sHm;
    }

    public void setsHm(String sHm) {
        this.sHm = sHm;
    }

    public String getsQuyu() {
        return sQuyu;
    }

    public void setsQuyu(String sQuyu) {
        this.sQuyu = sQuyu;
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

    public String getiXiaofeil() {
        return iXiaofeil;
    }

    public void setiXiaofeil(String iXiaofeil) {
        this.iXiaofeil = iXiaofeil;
    }

    public String getdKaizhangsj() {
        return dKaizhangsj;
    }

    public void setdKaizhangsj(String dKaizhangsj) {
        this.dKaizhangsj = dKaizhangsj;
    }
}
