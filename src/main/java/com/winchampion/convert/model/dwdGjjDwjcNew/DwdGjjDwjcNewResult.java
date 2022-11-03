package com.winchampion.model.response.dwdGjjDwjcNew;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdGjjDwjcNew 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_gjj_dwjc_new数据对象")
public class DwdGjjDwjcNewResult {
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


    @Schema(name = "dwzh", description = "缴交单位帐户代码")
    private String dwzh;


    @Schema(name = "creditCode", description = "统一社会信用代码")
    private String creditCode;


    @Schema(name = "dwmc", description = "单位名称")
    private String dwmc;


    @Schema(name = "dwyb", description = "单位邮编")
    private String dwyb;


    @Schema(name = "contactMobilePhone", description = "单位联系电话")
    private String contactMobilePhone;


    @Schema(name = "paymentSite", description = "管理行代码")
    private String paymentSite;


    @Schema(name = "companyAccountState", description = "单位缴交状态")
    private String companyAccountState;


    @Schema(name = "dwjcrs", description = "当前实缴人数")
    private String dwjcrs;


    @Schema(name = "totalMonth", description = "月交金额")
    private String totalMonth;


    @Schema(name = "dwjcbl", description = "缴交比例")
    private String dwjcbl;


    @Schema(name = "jzny", description = "末次汇缴月份")
    private String jzny;


    @Schema(name = "dwkhrq", description = "开户日期")
    private String dwkhrq;


    @Schema(name = "dwxhrq", description = "销户日期")
    private String dwxhrq;


    @Schema(name = "dwxhyy", description = "销户原因代码")
    private String dwxhyy;


    @Schema(name = "contactName", description = "单位联系人")
    private String contactName;


    @Schema(name = "contactAddress", description = "单位地址")
    private String contactAddress;


    @Schema(name = "jhptUpdateTime", description = "插入时间")
    private String jhptUpdateTime;


    @Schema(name = "exchangeDate", description = "交换时间")
    private String exchangeDate;


    @Schema(name = "sfrk", description = "是否入库")
    private String sfrk;


    @Schema(name = "error", description = "报错字段")
    private String error;


    @Schema(name = "businessTime", description = "业务字段")
    private String businessTime;


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

    public String getDwzh() {
        return dwzh;
    }

    public void setDwzh(String dwzh) {
        this.dwzh = dwzh;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public String getDwmc() {
        return dwmc;
    }

    public void setDwmc(String dwmc) {
        this.dwmc = dwmc;
    }

    public String getDwyb() {
        return dwyb;
    }

    public void setDwyb(String dwyb) {
        this.dwyb = dwyb;
    }

    public String getContactMobilePhone() {
        return contactMobilePhone;
    }

    public void setContactMobilePhone(String contactMobilePhone) {
        this.contactMobilePhone = contactMobilePhone;
    }

    public String getPaymentSite() {
        return paymentSite;
    }

    public void setPaymentSite(String paymentSite) {
        this.paymentSite = paymentSite;
    }

    public String getCompanyAccountState() {
        return companyAccountState;
    }

    public void setCompanyAccountState(String companyAccountState) {
        this.companyAccountState = companyAccountState;
    }

    public String getDwjcrs() {
        return dwjcrs;
    }

    public void setDwjcrs(String dwjcrs) {
        this.dwjcrs = dwjcrs;
    }

    public String getTotalMonth() {
        return totalMonth;
    }

    public void setTotalMonth(String totalMonth) {
        this.totalMonth = totalMonth;
    }

    public String getDwjcbl() {
        return dwjcbl;
    }

    public void setDwjcbl(String dwjcbl) {
        this.dwjcbl = dwjcbl;
    }

    public String getJzny() {
        return jzny;
    }

    public void setJzny(String jzny) {
        this.jzny = jzny;
    }

    public String getDwkhrq() {
        return dwkhrq;
    }

    public void setDwkhrq(String dwkhrq) {
        this.dwkhrq = dwkhrq;
    }

    public String getDwxhrq() {
        return dwxhrq;
    }

    public void setDwxhrq(String dwxhrq) {
        this.dwxhrq = dwxhrq;
    }

    public String getDwxhyy() {
        return dwxhyy;
    }

    public void setDwxhyy(String dwxhyy) {
        this.dwxhyy = dwxhyy;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getExchangeDate() {
        return exchangeDate;
    }

    public void setExchangeDate(String exchangeDate) {
        this.exchangeDate = exchangeDate;
    }

    public String getSfrk() {
        return sfrk;
    }

    public void setSfrk(String sfrk) {
        this.sfrk = sfrk;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
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

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
