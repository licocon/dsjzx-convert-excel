package com.winchampion.model.response.dwdSnwGlnybtffqkQy;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdSnwGlnybtffqkQy 数据对象返回类
 *
 * @author licocon
 * @since 2022-08-16
 */
@SuppressWarnings("SpellCheckingInspection")
@Schema(name = "DWD_SNW_GLNYBTFFQK_QY数据对象")
public class DwdSnwGlnybtffqkQyResult {
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
    private Long id;


    @Schema(name = "companyNameA", description = "补贴受益企业/合作社名称")
    private String companyNameA;


    @Schema(name = "companyCodeA", description = "补贴受益主体组织机构代码")
    private String companyCodeA;


    @Schema(name = "districtCodeA", description = "补贴受益主体所在区")
    private String districtCodeA;


    @Schema(name = "townCodeA", description = "补贴受益主体所在镇")
    private String townCodeA;


    @Schema(name = "villageCodeA", description = "补贴受益主体所在村")
    private String villageCodeA;


    @Schema(name = "fiscalYear", description = "财务年度")
    private String fiscalYear;


    @Schema(name = "subsiItem", description = "补贴项目名称")
    private String subsiItem;


    @Schema(name = "subsiAmountSubtotalF", description = "补贴金额")
    private String subsiAmountSubtotalF;


    @Schema(name = "telNumA", description = "补贴受益主体联系电话")
    private String telNumA;


    @Schema(name = "jhptDelete", description = "删除标志")
    private String jhptDelete;


    @Schema(name = "jhptUpdateTime", description = "导入时间")
    private String jhptUpdateTime;


    @Schema(name = "xkSjc", description = "XK_SJC")
    private String xkSjc;


    @Schema(name = "jhptUpdateFlag", description = "更新标识")
    private String jhptUpdateFlag;


    @Schema(name = "dsjzxTaskid", description = "批次号")
    private String dsjzxTaskid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyNameA() {
        return companyNameA;
    }

    public void setCompanyNameA(String companyNameA) {
        this.companyNameA = companyNameA;
    }

    public String getCompanyCodeA() {
        return companyCodeA;
    }

    public void setCompanyCodeA(String companyCodeA) {
        this.companyCodeA = companyCodeA;
    }

    public String getDistrictCodeA() {
        return districtCodeA;
    }

    public void setDistrictCodeA(String districtCodeA) {
        this.districtCodeA = districtCodeA;
    }

    public String getTownCodeA() {
        return townCodeA;
    }

    public void setTownCodeA(String townCodeA) {
        this.townCodeA = townCodeA;
    }

    public String getVillageCodeA() {
        return villageCodeA;
    }

    public void setVillageCodeA(String villageCodeA) {
        this.villageCodeA = villageCodeA;
    }

    public String getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public String getSubsiItem() {
        return subsiItem;
    }

    public void setSubsiItem(String subsiItem) {
        this.subsiItem = subsiItem;
    }

    public String getSubsiAmountSubtotalF() {
        return subsiAmountSubtotalF;
    }

    public void setSubsiAmountSubtotalF(String subsiAmountSubtotalF) {
        this.subsiAmountSubtotalF = subsiAmountSubtotalF;
    }

    public String getTelNumA() {
        return telNumA;
    }

    public void setTelNumA(String telNumA) {
        this.telNumA = telNumA;
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

    public String getXkSjc() {
        return xkSjc;
    }

    public void setXkSjc(String xkSjc) {
        this.xkSjc = xkSjc;
    }

    public String getJhptUpdateFlag() {
        return jhptUpdateFlag;
    }

    public void setJhptUpdateFlag(String jhptUpdateFlag) {
        this.jhptUpdateFlag = jhptUpdateFlag;
    }

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
