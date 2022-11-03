package com.winchampion.model.response.dwdZwyCompPayXxb;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdZwyCompPayXxb 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_zwy_comp_pay_xxb数据对象")
public class DwdZwyCompPayXxbResult {
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

    @Schema(name = "ny", description = "年月")
    private String ny;


    @Schema(name = "xzId", description = "险种id")
    private String xzId;


    @Schema(name = "shbxm", description = "社会保险码")
    private String shbxm;


    @Schema(name = "xzmc", description = "险种名称")
    private String xzmc;


    @Schema(name = "tyshxym", description = "统一社会信用代码")
    private String tyshxym;


    @Schema(name = "dwmc", description = "单位名称")
    private String dwmc;


    @Schema(name = "jnje", description = "缴纳金额")
    private String jnje;


    @Schema(name = "jhptUpdateTime", description = "更新时间")
    private String jhptUpdateTime;


    @Schema(name = "jhptUpdateFlag", description = "更新标志")
    private String jhptUpdateFlag;


    @Schema(name = "jhptDelete", description = "删除标志")
    private String jhptDelete;


    @Schema(name = "ywUpdateTime", description = "业务更新时间")
    private String ywUpdateTime;


    @Schema(name = "dsjzxTaskid", description = "批次号")
    private String dsjzxTaskid;

    public String getNy() {
        return ny;
    }

    public void setNy(String ny) {
        this.ny = ny;
    }

    public String getXzId() {
        return xzId;
    }

    public void setXzId(String xzId) {
        this.xzId = xzId;
    }

    public String getShbxm() {
        return shbxm;
    }

    public void setShbxm(String shbxm) {
        this.shbxm = shbxm;
    }

    public String getXzmc() {
        return xzmc;
    }

    public void setXzmc(String xzmc) {
        this.xzmc = xzmc;
    }

    public String getTyshxym() {
        return tyshxym;
    }

    public void setTyshxym(String tyshxym) {
        this.tyshxym = tyshxym;
    }

    public String getDwmc() {
        return dwmc;
    }

    public void setDwmc(String dwmc) {
        this.dwmc = dwmc;
    }

    public String getJnje() {
        return jnje;
    }

    public void setJnje(String jnje) {
        this.jnje = jnje;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getJhptUpdateFlag() {
        return jhptUpdateFlag;
    }

    public void setJhptUpdateFlag(String jhptUpdateFlag) {
        this.jhptUpdateFlag = jhptUpdateFlag;
    }

    public String getJhptDelete() {
        return jhptDelete;
    }

    public void setJhptDelete(String jhptDelete) {
        this.jhptDelete = jhptDelete;
    }

    public String getYwUpdateTime() {
        return ywUpdateTime;
    }

    public void setYwUpdateTime(String ywUpdateTime) {
        this.ywUpdateTime = ywUpdateTime;
    }

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
