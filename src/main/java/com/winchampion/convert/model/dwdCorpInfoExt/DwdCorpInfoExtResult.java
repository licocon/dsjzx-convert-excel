package com.winchampion.model.response.dwdCorpInfoExt;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdCorpInfoExt 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_corp_info_ext数据对象")
public class DwdCorpInfoExtResult {
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

    @Schema(name = "id", description = "主键")
    private String id;


    @Schema(name = "corpInfoId", description = "法人登记主表主键")
    private String corpInfoId;


    @Schema(name = "entityId", description = "工商提供法人登记信息唯一标示")
    private String entityId;


    @Schema(name = "proLoc", description = "生产经营地")
    private String proLoc;


    @Schema(name = "calcMethod", description = "核算方式")
    private String calcMethod;


    @Schema(name = "financeName", description = "财务负责人姓名")
    private String financeName;


    @Schema(name = "cerType", description = "财务负责人证件类型")
    private String cerType;


    @Schema(name = "cerNo", description = "财务负责人证件号码")
    private String cerNo;


    @Schema(name = "tel", description = "财务负责人固定电话")
    private String tel;


    @Schema(name = "mobTel", description = "财务负责人移动电话")
    private String mobTel;


    @Schema(name = "email", description = "财务负责人电子邮箱")
    private String email;


    @Schema(name = "validity", description = "VALIDITY")
    private String validity;


    @Schema(name = "trdStartDate", description = "经营/合伙期限自")
    private String trdStartDate;


    @Schema(name = "trdEndDate", description = "经营/合伙期限至")
    private String trdEndDate;


    @Schema(name = "regOrgan", description = "登记机关")
    private String regOrgan;


    @Schema(name = "revokeDate", description = "吊销日期")
    private String revokeDate;


    @Schema(name = "etpsType", description = "企业类型")
    private String etpsType;


    @Schema(name = "parentLocationType", description = "隶属企业属地标志")
    private String parentLocationType;


    @Schema(name = "personTelephone", description = "法定代表人电话")
    private String personTelephone;


    @Schema(name = "contactName", description = "联络员姓名")
    private String contactName;


    @Schema(name = "contactTelephone", description = "联络员电话")
    private String contactTelephone;


    @Schema(name = "parentRegNo", description = "总机构（隶属企业）注册号")
    private String parentRegNo;


    @Schema(name = "parentName", description = "总机构（隶属企业）名称")
    private String parentName;


    @Schema(name = "parentUniScId", description = "总机构（隶属企业）统一社会信用代码")
    private String parentUniScId;


    @Schema(name = "totalInvestment", description = "投资总额")
    private String totalInvestment;


    @Schema(name = "bizType", description = "登记类型")
    private String bizType;


    @Schema(name = "levySubUnit", description = "征管分局")
    private String levySubUnit;


    @Schema(name = "processResult", description = "处理结果")
    private String processResult;


    @Schema(name = "processDate", description = "办理日期")
    private String processDate;


    @Schema(name = "clearTaxResult", description = "清税结果")
    private String clearTaxResult;


    @Schema(name = "clearTaxDate", description = "清税日期")
    private String clearTaxDate;


    @Schema(name = "taxStatus", description = "税务登记状态")
    private String taxStatus;


    @Schema(name = "updTime", description = "更新时间")
    private String updTime;


    @Schema(name = "refBdId", description = "REF_BD_ID")
    private String refBdId;


    @Schema(name = "jhptUpdateTime", description = "JHPT_UPDATE_TIME")
    private String jhptUpdateTime;


    @Schema(name = "dsjzxTaskid", description = "批次号")
    private String dsjzxTaskid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorpInfoId() {
        return corpInfoId;
    }

    public void setCorpInfoId(String corpInfoId) {
        this.corpInfoId = corpInfoId;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getProLoc() {
        return proLoc;
    }

    public void setProLoc(String proLoc) {
        this.proLoc = proLoc;
    }

    public String getCalcMethod() {
        return calcMethod;
    }

    public void setCalcMethod(String calcMethod) {
        this.calcMethod = calcMethod;
    }

    public String getFinanceName() {
        return financeName;
    }

    public void setFinanceName(String financeName) {
        this.financeName = financeName;
    }

    public String getCerType() {
        return cerType;
    }

    public void setCerType(String cerType) {
        this.cerType = cerType;
    }

    public String getCerNo() {
        return cerNo;
    }

    public void setCerNo(String cerNo) {
        this.cerNo = cerNo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMobTel() {
        return mobTel;
    }

    public void setMobTel(String mobTel) {
        this.mobTel = mobTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getTrdStartDate() {
        return trdStartDate;
    }

    public void setTrdStartDate(String trdStartDate) {
        this.trdStartDate = trdStartDate;
    }

    public String getTrdEndDate() {
        return trdEndDate;
    }

    public void setTrdEndDate(String trdEndDate) {
        this.trdEndDate = trdEndDate;
    }

    public String getRegOrgan() {
        return regOrgan;
    }

    public void setRegOrgan(String regOrgan) {
        this.regOrgan = regOrgan;
    }

    public String getRevokeDate() {
        return revokeDate;
    }

    public void setRevokeDate(String revokeDate) {
        this.revokeDate = revokeDate;
    }

    public String getEtpsType() {
        return etpsType;
    }

    public void setEtpsType(String etpsType) {
        this.etpsType = etpsType;
    }

    public String getParentLocationType() {
        return parentLocationType;
    }

    public void setParentLocationType(String parentLocationType) {
        this.parentLocationType = parentLocationType;
    }

    public String getPersonTelephone() {
        return personTelephone;
    }

    public void setPersonTelephone(String personTelephone) {
        this.personTelephone = personTelephone;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTelephone() {
        return contactTelephone;
    }

    public void setContactTelephone(String contactTelephone) {
        this.contactTelephone = contactTelephone;
    }

    public String getParentRegNo() {
        return parentRegNo;
    }

    public void setParentRegNo(String parentRegNo) {
        this.parentRegNo = parentRegNo;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentUniScId() {
        return parentUniScId;
    }

    public void setParentUniScId(String parentUniScId) {
        this.parentUniScId = parentUniScId;
    }

    public String getTotalInvestment() {
        return totalInvestment;
    }

    public void setTotalInvestment(String totalInvestment) {
        this.totalInvestment = totalInvestment;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getLevySubUnit() {
        return levySubUnit;
    }

    public void setLevySubUnit(String levySubUnit) {
        this.levySubUnit = levySubUnit;
    }

    public String getProcessResult() {
        return processResult;
    }

    public void setProcessResult(String processResult) {
        this.processResult = processResult;
    }

    public String getProcessDate() {
        return processDate;
    }

    public void setProcessDate(String processDate) {
        this.processDate = processDate;
    }

    public String getClearTaxResult() {
        return clearTaxResult;
    }

    public void setClearTaxResult(String clearTaxResult) {
        this.clearTaxResult = clearTaxResult;
    }

    public String getClearTaxDate() {
        return clearTaxDate;
    }

    public void setClearTaxDate(String clearTaxDate) {
        this.clearTaxDate = clearTaxDate;
    }

    public String getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }

    public String getUpdTime() {
        return updTime;
    }

    public void setUpdTime(String updTime) {
        this.updTime = updTime;
    }

    public String getRefBdId() {
        return refBdId;
    }

    public void setRefBdId(String refBdId) {
        this.refBdId = refBdId;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
