package com.winchampion.model.response.dwdcorpinfo;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdCorpInfo 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_corp_info数据对象")
public class DwdCorpInfoResult {
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

    @Schema(name = "corpInfoId", description = "CORP_INFO_ID")
    private String corpInfoId;


    @Schema(name = "organCode", description = "ORGAN_CODE")
    private String organCode;


    @Schema(name = "entityId", description = "ENTITY_ID")
    private String entityId;


    @Schema(name = "corpName", description = "CORP_NAME")
    private String corpName;


    @Schema(name = "corpType", description = "CORP_TYPE")
    private String corpType;


    @Schema(name = "personName", description = "PERSON_NAME")
    private String personName;


    @Schema(name = "address", description = "ADDRESS")
    private String address;


    @Schema(name = "areaCode", description = "AREA_CODE")
    private String areaCode;


    @Schema(name = "zip", description = "ZIP")
    private String zip;


    @Schema(name = "telephone", description = "TELEPHONE")
    private String telephone;


    @Schema(name = "establishDate", description = "ESTABLISH_DATE")
    private String establishDate;


    @Schema(name = "currency", description = "CURRENCY")
    private String currency;


    @Schema(name = "businessScope", description = "BUSINESS_SCOPE")
    private String businessScope;


    @Schema(name = "personCertType", description = "PERSON_CERT_TYPE")
    private String personCertType;


    @Schema(name = "personCertCode", description = "PERSON_CERT_CODE")
    private String personCertCode;


    @Schema(name = "industryCode", description = "INDUSTRY_CODE")
    private String industryCode;


    @Schema(name = "organizers", description = "ORGANIZERS")
    private String organizers;


    @Schema(name = "fundingSrc", description = "FUNDING_SRC")
    private String fundingSrc;


    @Schema(name = "regNo", description = "REG_NO")
    private String regNo;


    @Schema(name = "receivingOrgan", description = "RECEIVING_ORGAN")
    private String receivingOrgan;


    @Schema(name = "repealReason", description = "REPEAL_REASON")
    private String repealReason;


    @Schema(name = "repealDate", description = "REPEAL_DATE")
    private String repealDate;


    @Schema(name = "changeDate", description = "CHANGE_DATE")
    private String changeDate;


    @Schema(name = "changeItem", description = "CHANGE_ITEM")
    private String changeItem;


    @Schema(name = "repealOrgan", description = "REPEAL_ORGAN")
    private String repealOrgan;


    @Schema(name = "branchNum", description = "BRANCH_NUM")
    private String branchNum;


    @Schema(name = "representNum", description = "REPRESENT_NUM")
    private String representNum;


    @Schema(name = "regUpdDate", description = "REG_UPD_DATE")
    private String regUpdDate;


    @Schema(name = "taxpayersCode", description = "TAXPAYERS_CODE")
    private String taxpayersCode;


    @Schema(name = "taxCode", description = "TAX_CODE")
    private String taxCode;


    @Schema(name = "taxRegDate", description = "TAX_REG_DATE")
    private String taxRegDate;


    @Schema(name = "taxChgeContent", description = "TAX_CHGE_CONTENT")
    private String taxChgeContent;


    @Schema(name = "taxChgeDate", description = "TAX_CHGE_DATE")
    private String taxChgeDate;


    @Schema(name = "taxRepealReason", description = "TAX_REPEAL_REASON")
    private String taxRepealReason;


    @Schema(name = "taxRepealDate", description = "TAX_REPEAL_DATE")
    private String taxRepealDate;


    @Schema(name = "taxRepealOrgan", description = "TAX_REPEAL_ORGAN")
    private String taxRepealOrgan;


    @Schema(name = "businessAddress", description = "BUSINESS_ADDRESS")
    private String businessAddress;


    @Schema(name = "taxUpdDate", description = "TAX_UPD_DATE")
    private String taxUpdDate;


    @Schema(name = "organcodeDate", description = "ORGANCODE_DATE")
    private String organcodeDate;


    @Schema(name = "orgcodeChgdate", description = "ORGCODE_CHGDATE")
    private String orgcodeChgdate;


    @Schema(name = "orgcodeRepealdate", description = "ORGCODE_REPEALDATE")
    private String orgcodeRepealdate;


    @Schema(name = "qsUpdDate", description = "QS_UPD_DATE")
    private String qsUpdDate;


    @Schema(name = "bdResult", description = "BD_RESULT")
    private String bdResult;


    @Schema(name = "qykId", description = "QYK_ID")
    private String qykId;


    @Schema(name = "updTime", description = "UPD_TIME")
    private String updTime;


    @Schema(name = "fundsCode", description = "FUNDS_CODE")
    private String fundsCode;


    @Schema(name = "fundsOpenDate", description = "FUNDS_OPEN_DATE")
    private String fundsOpenDate;


    @Schema(name = "fundsRepealDate", description = "FUNDS_REPEAL_DATE")
    private String fundsRepealDate;


    @Schema(name = "fundsUpdDate", description = "FUNDS_UPD_DATE")
    private String fundsUpdDate;


    @Schema(name = "fundsaddCode", description = "FUNDSADD_CODE")
    private String fundsaddCode;


    @Schema(name = "fundsaddOpenDate", description = "FUNDSADD_OPEN_DATE")
    private String fundsaddOpenDate;


    @Schema(name = "fundsaddRepealDate", description = "FUNDSADD_REPEAL_DATE")
    private String fundsaddRepealDate;


    @Schema(name = "fundsaddUpdDate", description = "FUNDSADD_UPD_DATE")
    private String fundsaddUpdDate;


    @Schema(name = "socialSecurityCode", description = "SOCIAL_SECURITY_CODE")
    private String socialSecurityCode;


    @Schema(name = "socialSecurityOpenDate", description = "SOCIAL_SECURITY_OPEN_DATE")
    private String socialSecurityOpenDate;


    @Schema(name = "socialSecurityRepealDate", description = "SOCIAL_SECURITY_REPEAL_DATE")
    private String socialSecurityRepealDate;


    @Schema(name = "socialSecurityUpdDate", description = "SOCIAL_SECURITY_UPD_DATE")
    private String socialSecurityUpdDate;


    @Schema(name = "lkStatus", description = "LK_STATUS")
    private String lkStatus;


    @Schema(name = "isZmq", description = "IS_ZMQ")
    private String isZmq;


    @Schema(name = "insertTime", description = "INSERT_TIME")
    private String insertTime;


    @Schema(name = "corpStatus", description = "CORP_STATUS")
    private String corpStatus;


    @Schema(name = "isGsl", description = "IS_GSL")
    private String isGsl;


    @Schema(name = "isRecentlyZmq", description = "IS_RECENTLY_ZMQ")
    private String isRecentlyZmq;


    @Schema(name = "isWebSend", description = "IS_WEB_SEND")
    private String isWebSend;


    @Schema(name = "uniScId", description = "社会统一代码")
    private String uniScId;


    @Schema(name = "regCapital", description = "REG_CAPITAL")
    private String regCapital;


    @Schema(name = "personEmail", description = "电子邮箱")
    private String personEmail;


    @Schema(name = "personLandlineTel", description = "固定电话")
    private String personLandlineTel;


    @Schema(name = "senderName", description = "外国（地区）企业名称")
    private String senderName;


    @Schema(name = "senderAddress", description = "住所")
    private String senderAddress;


    @Schema(name = "senderNationality", description = "国家（地区）")
    private String senderNationality;


    @Schema(name = "insuranceType", description = "保险类型")
    private String insuranceType;


    @Schema(name = "insuranceNumber", description = "保险人数")
    private String insuranceNumber;


    @Schema(name = "insuranceArea", description = "保险所属行政区划")
    private String insuranceArea;


    @Schema(name = "insuranceDate", description = "参加社会保险日期")
    private String insuranceDate;


    @Schema(name = "compForm", description = "组成形式")
    private String compForm;


    @Schema(name = "empNum", description = "从业人数")
    private String empNum;


    @Schema(name = "notNo", description = "准予设立登记通知书文号")
    private String notNo;


    @Schema(name = "personAddress", description = "经营者住所")
    private String personAddress;


    @Schema(name = "personPostcode", description = "经营者邮政编码")
    private String personPostcode;


    @Schema(name = "gthBizType", description = "个体工商户业务标识：GSXX01：开业；GSXX02：变更（换照）；GSXX03：注销")
    private String gthBizType;


    @Schema(name = "subObj", description = "企业大类")
    private String subObj;


    @Schema(name = "contactMobile", description = "工商联络员手机号码")
    private String contactMobile;


    @Schema(name = "regCustom", description = "注册海关")
    private String regCustom;


    @Schema(name = "ftBizType", description = "进出口业务类型")
    private String ftBizType;


    @Schema(name = "etpsCode", description = "企业性质")
    private String etpsCode;


    @Schema(name = "checkInstitution", description = "属地检验检疫机构")
    private String checkInstitution;


    @Schema(name = "personMobile", description = "营业部负责人手机")
    private String personMobile;


    @Schema(name = "corpCountry", description = "国别（地区）")
    private String corpCountry;


    @Schema(name = "personCountry", description = "法定代表人/负责人/执行事务合伙人国别（地区）")
    private String personCountry;


    @Schema(name = "contactEmail", description = "联络员电子邮箱")
    private String contactEmail;


    @Schema(name = "contactCerType", description = "联络员证件类型")
    private String contactCerType;


    @Schema(name = "contactCerNo", description = "联络员证件号码")
    private String contactCerNo;


    @Schema(name = "corpActconam", description = "法人实缴出资额")
    private String corpActconam;


    @Schema(name = "jhptUpdateTime", description = "更新时间")
    private String jhptUpdateTime;


    @Schema(name = "agentName", description = "AGENT_NAME")
    private String agentName;


    @Schema(name = "agentCertNo", description = "AGENT_CERT_NO")
    private String agentCertNo;


    @Schema(name = "agentMobile", description = "AGENT_MOBILE")
    private String agentMobile;


    @Schema(name = "dsjzxTaskid", description = "批次号")
    private String dsjzxTaskid;

    public String getCorpInfoId() {
        return corpInfoId;
    }

    public void setCorpInfoId(String corpInfoId) {
        this.corpInfoId = corpInfoId;
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getCorpType() {
        return corpType;
    }

    public void setCorpType(String corpType) {
        this.corpType = corpType;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(String establishDate) {
        this.establishDate = establishDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public String getPersonCertType() {
        return personCertType;
    }

    public void setPersonCertType(String personCertType) {
        this.personCertType = personCertType;
    }

    public String getPersonCertCode() {
        return personCertCode;
    }

    public void setPersonCertCode(String personCertCode) {
        this.personCertCode = personCertCode;
    }

    public String getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

    public String getOrganizers() {
        return organizers;
    }

    public void setOrganizers(String organizers) {
        this.organizers = organizers;
    }

    public String getFundingSrc() {
        return fundingSrc;
    }

    public void setFundingSrc(String fundingSrc) {
        this.fundingSrc = fundingSrc;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getReceivingOrgan() {
        return receivingOrgan;
    }

    public void setReceivingOrgan(String receivingOrgan) {
        this.receivingOrgan = receivingOrgan;
    }

    public String getRepealReason() {
        return repealReason;
    }

    public void setRepealReason(String repealReason) {
        this.repealReason = repealReason;
    }

    public String getRepealDate() {
        return repealDate;
    }

    public void setRepealDate(String repealDate) {
        this.repealDate = repealDate;
    }

    public String getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }

    public String getChangeItem() {
        return changeItem;
    }

    public void setChangeItem(String changeItem) {
        this.changeItem = changeItem;
    }

    public String getRepealOrgan() {
        return repealOrgan;
    }

    public void setRepealOrgan(String repealOrgan) {
        this.repealOrgan = repealOrgan;
    }

    public String getBranchNum() {
        return branchNum;
    }

    public void setBranchNum(String branchNum) {
        this.branchNum = branchNum;
    }

    public String getRepresentNum() {
        return representNum;
    }

    public void setRepresentNum(String representNum) {
        this.representNum = representNum;
    }

    public String getRegUpdDate() {
        return regUpdDate;
    }

    public void setRegUpdDate(String regUpdDate) {
        this.regUpdDate = regUpdDate;
    }

    public String getTaxpayersCode() {
        return taxpayersCode;
    }

    public void setTaxpayersCode(String taxpayersCode) {
        this.taxpayersCode = taxpayersCode;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getTaxRegDate() {
        return taxRegDate;
    }

    public void setTaxRegDate(String taxRegDate) {
        this.taxRegDate = taxRegDate;
    }

    public String getTaxChgeContent() {
        return taxChgeContent;
    }

    public void setTaxChgeContent(String taxChgeContent) {
        this.taxChgeContent = taxChgeContent;
    }

    public String getTaxChgeDate() {
        return taxChgeDate;
    }

    public void setTaxChgeDate(String taxChgeDate) {
        this.taxChgeDate = taxChgeDate;
    }

    public String getTaxRepealReason() {
        return taxRepealReason;
    }

    public void setTaxRepealReason(String taxRepealReason) {
        this.taxRepealReason = taxRepealReason;
    }

    public String getTaxRepealDate() {
        return taxRepealDate;
    }

    public void setTaxRepealDate(String taxRepealDate) {
        this.taxRepealDate = taxRepealDate;
    }

    public String getTaxRepealOrgan() {
        return taxRepealOrgan;
    }

    public void setTaxRepealOrgan(String taxRepealOrgan) {
        this.taxRepealOrgan = taxRepealOrgan;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getTaxUpdDate() {
        return taxUpdDate;
    }

    public void setTaxUpdDate(String taxUpdDate) {
        this.taxUpdDate = taxUpdDate;
    }

    public String getOrgancodeDate() {
        return organcodeDate;
    }

    public void setOrgancodeDate(String organcodeDate) {
        this.organcodeDate = organcodeDate;
    }

    public String getOrgcodeChgdate() {
        return orgcodeChgdate;
    }

    public void setOrgcodeChgdate(String orgcodeChgdate) {
        this.orgcodeChgdate = orgcodeChgdate;
    }

    public String getOrgcodeRepealdate() {
        return orgcodeRepealdate;
    }

    public void setOrgcodeRepealdate(String orgcodeRepealdate) {
        this.orgcodeRepealdate = orgcodeRepealdate;
    }

    public String getQsUpdDate() {
        return qsUpdDate;
    }

    public void setQsUpdDate(String qsUpdDate) {
        this.qsUpdDate = qsUpdDate;
    }

    public String getBdResult() {
        return bdResult;
    }

    public void setBdResult(String bdResult) {
        this.bdResult = bdResult;
    }

    public String getQykId() {
        return qykId;
    }

    public void setQykId(String qykId) {
        this.qykId = qykId;
    }

    public String getUpdTime() {
        return updTime;
    }

    public void setUpdTime(String updTime) {
        this.updTime = updTime;
    }

    public String getFundsCode() {
        return fundsCode;
    }

    public void setFundsCode(String fundsCode) {
        this.fundsCode = fundsCode;
    }

    public String getFundsOpenDate() {
        return fundsOpenDate;
    }

    public void setFundsOpenDate(String fundsOpenDate) {
        this.fundsOpenDate = fundsOpenDate;
    }

    public String getFundsRepealDate() {
        return fundsRepealDate;
    }

    public void setFundsRepealDate(String fundsRepealDate) {
        this.fundsRepealDate = fundsRepealDate;
    }

    public String getFundsUpdDate() {
        return fundsUpdDate;
    }

    public void setFundsUpdDate(String fundsUpdDate) {
        this.fundsUpdDate = fundsUpdDate;
    }

    public String getFundsaddCode() {
        return fundsaddCode;
    }

    public void setFundsaddCode(String fundsaddCode) {
        this.fundsaddCode = fundsaddCode;
    }

    public String getFundsaddOpenDate() {
        return fundsaddOpenDate;
    }

    public void setFundsaddOpenDate(String fundsaddOpenDate) {
        this.fundsaddOpenDate = fundsaddOpenDate;
    }

    public String getFundsaddRepealDate() {
        return fundsaddRepealDate;
    }

    public void setFundsaddRepealDate(String fundsaddRepealDate) {
        this.fundsaddRepealDate = fundsaddRepealDate;
    }

    public String getFundsaddUpdDate() {
        return fundsaddUpdDate;
    }

    public void setFundsaddUpdDate(String fundsaddUpdDate) {
        this.fundsaddUpdDate = fundsaddUpdDate;
    }

    public String getSocialSecurityCode() {
        return socialSecurityCode;
    }

    public void setSocialSecurityCode(String socialSecurityCode) {
        this.socialSecurityCode = socialSecurityCode;
    }

    public String getSocialSecurityOpenDate() {
        return socialSecurityOpenDate;
    }

    public void setSocialSecurityOpenDate(String socialSecurityOpenDate) {
        this.socialSecurityOpenDate = socialSecurityOpenDate;
    }

    public String getSocialSecurityRepealDate() {
        return socialSecurityRepealDate;
    }

    public void setSocialSecurityRepealDate(String socialSecurityRepealDate) {
        this.socialSecurityRepealDate = socialSecurityRepealDate;
    }

    public String getSocialSecurityUpdDate() {
        return socialSecurityUpdDate;
    }

    public void setSocialSecurityUpdDate(String socialSecurityUpdDate) {
        this.socialSecurityUpdDate = socialSecurityUpdDate;
    }

    public String getLkStatus() {
        return lkStatus;
    }

    public void setLkStatus(String lkStatus) {
        this.lkStatus = lkStatus;
    }

    public String getIsZmq() {
        return isZmq;
    }

    public void setIsZmq(String isZmq) {
        this.isZmq = isZmq;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public String getCorpStatus() {
        return corpStatus;
    }

    public void setCorpStatus(String corpStatus) {
        this.corpStatus = corpStatus;
    }

    public String getIsGsl() {
        return isGsl;
    }

    public void setIsGsl(String isGsl) {
        this.isGsl = isGsl;
    }

    public String getIsRecentlyZmq() {
        return isRecentlyZmq;
    }

    public void setIsRecentlyZmq(String isRecentlyZmq) {
        this.isRecentlyZmq = isRecentlyZmq;
    }

    public String getIsWebSend() {
        return isWebSend;
    }

    public void setIsWebSend(String isWebSend) {
        this.isWebSend = isWebSend;
    }

    public String getUniScId() {
        return uniScId;
    }

    public void setUniScId(String uniScId) {
        this.uniScId = uniScId;
    }

    public String getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String getPersonLandlineTel() {
        return personLandlineTel;
    }

    public void setPersonLandlineTel(String personLandlineTel) {
        this.personLandlineTel = personLandlineTel;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderNationality() {
        return senderNationality;
    }

    public void setSenderNationality(String senderNationality) {
        this.senderNationality = senderNationality;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getInsuranceArea() {
        return insuranceArea;
    }

    public void setInsuranceArea(String insuranceArea) {
        this.insuranceArea = insuranceArea;
    }

    public String getInsuranceDate() {
        return insuranceDate;
    }

    public void setInsuranceDate(String insuranceDate) {
        this.insuranceDate = insuranceDate;
    }

    public String getCompForm() {
        return compForm;
    }

    public void setCompForm(String compForm) {
        this.compForm = compForm;
    }

    public String getEmpNum() {
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    public String getNotNo() {
        return notNo;
    }

    public void setNotNo(String notNo) {
        this.notNo = notNo;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public String getPersonPostcode() {
        return personPostcode;
    }

    public void setPersonPostcode(String personPostcode) {
        this.personPostcode = personPostcode;
    }

    public String getGthBizType() {
        return gthBizType;
    }

    public void setGthBizType(String gthBizType) {
        this.gthBizType = gthBizType;
    }

    public String getSubObj() {
        return subObj;
    }

    public void setSubObj(String subObj) {
        this.subObj = subObj;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getRegCustom() {
        return regCustom;
    }

    public void setRegCustom(String regCustom) {
        this.regCustom = regCustom;
    }

    public String getFtBizType() {
        return ftBizType;
    }

    public void setFtBizType(String ftBizType) {
        this.ftBizType = ftBizType;
    }

    public String getEtpsCode() {
        return etpsCode;
    }

    public void setEtpsCode(String etpsCode) {
        this.etpsCode = etpsCode;
    }

    public String getCheckInstitution() {
        return checkInstitution;
    }

    public void setCheckInstitution(String checkInstitution) {
        this.checkInstitution = checkInstitution;
    }

    public String getPersonMobile() {
        return personMobile;
    }

    public void setPersonMobile(String personMobile) {
        this.personMobile = personMobile;
    }

    public String getCorpCountry() {
        return corpCountry;
    }

    public void setCorpCountry(String corpCountry) {
        this.corpCountry = corpCountry;
    }

    public String getPersonCountry() {
        return personCountry;
    }

    public void setPersonCountry(String personCountry) {
        this.personCountry = personCountry;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactCerType() {
        return contactCerType;
    }

    public void setContactCerType(String contactCerType) {
        this.contactCerType = contactCerType;
    }

    public String getContactCerNo() {
        return contactCerNo;
    }

    public void setContactCerNo(String contactCerNo) {
        this.contactCerNo = contactCerNo;
    }

    public String getCorpActconam() {
        return corpActconam;
    }

    public void setCorpActconam(String corpActconam) {
        this.corpActconam = corpActconam;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentCertNo() {
        return agentCertNo;
    }

    public void setAgentCertNo(String agentCertNo) {
        this.agentCertNo = agentCertNo;
    }

    public String getAgentMobile() {
        return agentMobile;
    }

    public void setAgentMobile(String agentMobile) {
        this.agentMobile = agentMobile;
    }

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
