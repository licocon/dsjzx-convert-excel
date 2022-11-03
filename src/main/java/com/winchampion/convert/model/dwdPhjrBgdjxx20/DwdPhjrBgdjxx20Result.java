package com.winchampion.model.response.dwdPhjrBgdjxx20;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdPhjrBgdjxx20 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_phjr_bgdjxx_20数据对象")
public class DwdPhjrBgdjxx20Result {
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


    @Schema(name = "bgxmDm", description = "变更项目代码")
    private String bgxmDm;


    @Schema(name = "bgxmmc", description = "变更项目名称")
    private String bgxmmc;


    @Schema(name = "bgsj", description = "变更时间")
    private String bgsj;


    @Schema(name = "bgqnr", description = "变更前内容")
    private String bgqnr;


    @Schema(name = "bghnr", description = "变更后内容")
    private String bghnr;


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

    public String getBgxmDm() {
        return bgxmDm;
    }

    public void setBgxmDm(String bgxmDm) {
        this.bgxmDm = bgxmDm;
    }

    public String getBgxmmc() {
        return bgxmmc;
    }

    public void setBgxmmc(String bgxmmc) {
        this.bgxmmc = bgxmmc;
    }

    public String getBgsj() {
        return bgsj;
    }

    public void setBgsj(String bgsj) {
        this.bgsj = bgsj;
    }

    public String getBgqnr() {
        return bgqnr;
    }

    public void setBgqnr(String bgqnr) {
        this.bgqnr = bgqnr;
    }

    public String getBghnr() {
        return bghnr;
    }

    public void setBghnr(String bghnr) {
        this.bghnr = bghnr;
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
