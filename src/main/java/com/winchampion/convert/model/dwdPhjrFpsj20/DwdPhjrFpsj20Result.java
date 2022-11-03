package com.winchampion.model.response.dwdPhjrFpsj20;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdPhjrFpsj20 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_phjr_fpsj_20数据对象")
public class DwdPhjrFpsj20Result {
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


    @Schema(name = "nsrdzdah", description = "纳税人电子档案号")
    private String nsrdzdah;


    @Schema(name = "shxydm", description = "社会信用代码")
    private String shxydm;


    @Schema(name = "kpyfDm", description = "开票月份代码")
    private String kpyfDm;


    @Schema(name = "syhs", description = "上游户数")
    private String syhs;


    @Schema(name = "jxzje", description = "进项总金额")
    private String jxzje;


    @Schema(name = "xyhs", description = "下游户数")
    private String xyhs;


    @Schema(name = "kpzje", description = "开票总金额")
    private String kpzje;


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

    public String getNsrdzdah() {
        return nsrdzdah;
    }

    public void setNsrdzdah(String nsrdzdah) {
        this.nsrdzdah = nsrdzdah;
    }

    public String getShxydm() {
        return shxydm;
    }

    public void setShxydm(String shxydm) {
        this.shxydm = shxydm;
    }

    public String getKpyfDm() {
        return kpyfDm;
    }

    public void setKpyfDm(String kpyfDm) {
        this.kpyfDm = kpyfDm;
    }

    public String getSyhs() {
        return syhs;
    }

    public void setSyhs(String syhs) {
        this.syhs = syhs;
    }

    public String getJxzje() {
        return jxzje;
    }

    public void setJxzje(String jxzje) {
        this.jxzje = jxzje;
    }

    public String getXyhs() {
        return xyhs;
    }

    public void setXyhs(String xyhs) {
        this.xyhs = xyhs;
    }

    public String getKpzje() {
        return kpzje;
    }

    public void setKpzje(String kpzje) {
        this.kpzje = kpzje;
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
