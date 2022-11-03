package com.winchampion.model.response.dwdTOnewinxEdiHead;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdTOnewinxEdiHead 数据对象返回类
 *
 * @author licocon
 * @since 2022-08-16
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "DWD_T_ONEWINX_EDI_HEAD数据对象")
public class DwdTOnewinxEdiHeadResult {
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

    @Schema(name = "id", description = "物理主键,自增长ID")
    private String id;


    @Schema(name = "preEntryId", description = "报关单号")
    private String preEntryId;


    @Schema(name = "entryType", description = "报关单类型")
    private String entryType;


    @Schema(name = "iEFlag", description = "进出口标志")
    private String iEFlag;


    @Schema(name = "declPort", description = "主管海关（申报地海关）")
    private String declPort;


    @Schema(name = "iEPort", description = "进出口岸")
    private String iEPort;


    @Schema(name = "iEDate", description = "进出口日期")
    private String iEDate;


    @Schema(name = "dDate", description = "申报日期")
    private String dDate;


    @Schema(name = "destinationPort", description = "经停港/指运港")
    private String destinationPort;


    @Schema(name = "trafMode", description = "运输方式")
    private String trafMode;


    @Schema(name = "trafName", description = "运输工具代码及名称")
    private String trafName;


    @Schema(name = "voyageNo", description = "航班号")
    private String voyageNo;


    @Schema(name = "billNo", description = "提运单号")
    private String billNo;


    @Schema(name = "tradeCo", description = "境内收发货人编号")
    private String tradeCo;


    @Schema(name = "tradeName", description = "境内收发货人名称")
    private String tradeName;


    @Schema(name = "ownerCode", description = "货主代码(消费使用单位/生产销售单位代码)")
    private String ownerCode;


    @Schema(name = "ownerName", description = "货主名称(消费使用单位/生产销售单位名称)")
    private String ownerName;


    @Schema(name = "agentCode", description = "申报单位代码")
    private String agentCode;


    @Schema(name = "agentName", description = "申报单位")
    private String agentName;


    @Schema(name = "contrNo", description = "合同号")
    private String contrNo;


    @Schema(name = "tradeCountry", description = "启运国/运抵国（地区）")
    private String tradeCountry;


    @Schema(name = "tradeMode", description = "监管方式")
    private String tradeMode;


    @Schema(name = "cutMode", description = "征免性质")
    private String cutMode;


    @Schema(name = "transMode", description = "成交方式")
    private String transMode;


    @Schema(name = "payWay", description = "收结汇方式")
    private String payWay;


    @Schema(name = "feeMark", description = "运费标记")
    private String feeMark;


    @Schema(name = "feeCurr", description = "运费币制")
    private String feeCurr;


    @Schema(name = "feeRate", description = "运费／率")
    private String feeRate;


    @Schema(name = "insurMark", description = "保险费标记")
    private String insurMark;


    @Schema(name = "insurCurr", description = "保险费币制")
    private String insurCurr;


    @Schema(name = "insurRate", description = "保险费／率")
    private String insurRate;


    @Schema(name = "otherMark", description = "杂费标记代码")
    private String otherMark;


    @Schema(name = "otherCurr", description = "杂费币制")
    private String otherCurr;


    @Schema(name = "otherRate", description = "杂费／率")
    private String otherRate;


    @Schema(name = "packNo", description = "包装件数")
    private String packNo;


    @Schema(name = "grossWt", description = "毛重")
    private String grossWt;


    @Schema(name = "netWt", description = "净重")
    private String netWt;


    @Schema(name = "wrapType", description = "包装种类")
    private String wrapType;


    @Schema(name = "licenseNo", description = "许可证编号")
    private String licenseNo;


    @Schema(name = "apprNo", description = "批准文号")
    private String apprNo;


    @Schema(name = "manualNo", description = "备案号")
    private String manualNo;


    @Schema(name = "relativeId", description = "关联报关单号")
    private String relativeId;


    @Schema(name = "relativeManualNo", description = "关联备案号")
    private String relativeManualNo;


    @Schema(name = "bondedNo", description = "保税/监管场所")
    private String bondedNo;


    @Schema(name = "customsField", description = "货场代码")
    private String customsField;


    @Schema(name = "ediId", description = "报关标志")
    private String ediId;


    @Schema(name = "ediRemark", description = "EDI申报备注")
    private String ediRemark;


    @Schema(name = "pDate", description = "打印日期")
    private String pDate;


    @Schema(name = "noteS", description = "备注")
    private String noteS;


    @Schema(name = "chkSurety", description = "担保验放标志")
    private String chkSurety;


    @Schema(name = "billType", description = "备案清单类型")
    private String billType;


    @Schema(name = "tradeCoScc", description = "收发货人统一编码")
    private String tradeCoScc;


    @Schema(name = "agentCodeScc", description = "申报代码统一编码")
    private String agentCodeScc;


    @Schema(name = "ownerCodeScc", description = "消费使用/生产销售单位单位统一编码")
    private String ownerCodeScc;


    @Schema(name = "promiseItmes", description = "承诺事项")
    private String promiseItmes;


    @Schema(name = "tradeAreaCode", description = "贸易国别")
    private String tradeAreaCode;


    @Schema(name = "ediRemark2", description = "EDI申报备注2")
    private String ediRemark2;


    @Schema(name = "billSeqNo", description = "对应清单统一编号")
    private String billSeqNo;


    @Schema(name = "decno", description = "报关员编号")
    private String decno;


    @Schema(name = "typeEr", description = "属地申报，口岸验放")
    private String typeEr;


    @Schema(name = "collecttax", description = "汇总征税")
    private String collecttax;


    @Schema(name = "twoAudit", description = "两单一审")
    private String twoAudit;


    @Schema(name = "paperlesstax", description = "YES否税单无纸化")
    private String paperlesstax;


    @Schema(name = "taxNo", description = "保函号")
    private String taxNo;


    @Schema(name = "overseasConsignorCode", description = "境外发货人代码")
    private String overseasConsignorCode;


    @Schema(name = "overseasConsignorEname", description = "境外发货人名称（外文）")
    private String overseasConsignorEname;


    @Schema(name = "overseasConsigneeCode", description = "境外收货人编码")
    private String overseasConsigneeCode;


    @Schema(name = "overseasConsigneeEname", description = "境外收货人名称(外文)")
    private String overseasConsigneeEname;


    @Schema(name = "markNo", description = "标记唛码")
    private String markNo;


    @Schema(name = "despPortCode", description = "启运港代码")
    private String despPortCode;


    @Schema(name = "entyPortCode", description = "入境口岸代码")
    private String entyPortCode;


    @Schema(name = "goodsPlace", description = "存放地点")
    private String goodsPlace;


    @Schema(name = "blNo", description = "B/L提货单号")
    private String blNo;


    @Schema(name = "inspOrgCode", description = "口岸检验检疫机关")
    private String inspOrgCode;


    @Schema(name = "specDeclFlag", description = "特种业务标识")
    private String specDeclFlag;


    @Schema(name = "purpOrgCode", description = "目的地检验检疫机关")
    private String purpOrgCode;


    @Schema(name = "despDate", description = "启运日期")
    private String despDate;


    @Schema(name = "cmplDschrgDt", description = "卸毕日期")
    private String cmplDschrgDt;


    @Schema(name = "correlationReasonFlag", description = "关联理由")
    private String correlationReasonFlag;


    @Schema(name = "vsaOrgCode", description = "领证机关")
    private String vsaOrgCode;


    @Schema(name = "origBoxFlag", description = "原集装箱标识")
    private String origBoxFlag;


    @Schema(name = "noOtherPack", description = "无其他包装")
    private String noOtherPack;


    @Schema(name = "orgCode", description = "组织机构代码")
    private String orgCode;


    @Schema(name = "overseasConsignorCname", description = "境外收发货人名称")
    private String overseasConsignorCname;


    @Schema(name = "overseasConsignorAddr", description = "境外收发货人地址")
    private String overseasConsignorAddr;


    @Schema(name = "domesticConsigneeEname", description = "境内收发货人名称（外文）")
    private String domesticConsigneeEname;


    @Schema(name = "correlationNo", description = "关联号码")
    private String correlationNo;


    @Schema(name = "tradeCiqCode", description = "境内收发货人检验检疫编码")
    private String tradeCiqCode;


    @Schema(name = "ownerCiqCode", description = "消费使用/生产销售单位检验检疫编码")
    private String ownerCiqCode;


    @Schema(name = "declCiqCode", description = "申报单位检验检疫编码")
    private String declCiqCode;


    @Schema(name = "checkFlow", description = "查验分流")
    private String checkFlow;


    @Schema(name = "taxAaminMark", description = "税收征管标记")
    private String taxAaminMark;


    @Schema(name = "seqNo", description = "数据中心统一编号")
    private String seqNo;


    @Schema(name = "jhptDelete", description = "删除标记位")
    private String jhptDelete;


    @Schema(name = "jhptUpdateTime", description = "最后更新时间")
    private String jhptUpdateTime;


    @Schema(name = "dsjzxTaskid", description = "批次")
    private String dsjzxTaskid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPreEntryId() {
        return preEntryId;
    }

    public void setPreEntryId(String preEntryId) {
        this.preEntryId = preEntryId;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    public String getiEFlag() {
        return iEFlag;
    }

    public void setiEFlag(String iEFlag) {
        this.iEFlag = iEFlag;
    }

    public String getDeclPort() {
        return declPort;
    }

    public void setDeclPort(String declPort) {
        this.declPort = declPort;
    }

    public String getiEPort() {
        return iEPort;
    }

    public void setiEPort(String iEPort) {
        this.iEPort = iEPort;
    }

    public String getiEDate() {
        return iEDate;
    }

    public void setiEDate(String iEDate) {
        this.iEDate = iEDate;
    }

    public String getdDate() {
        return dDate;
    }

    public void setdDate(String dDate) {
        this.dDate = dDate;
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public String getTrafMode() {
        return trafMode;
    }

    public void setTrafMode(String trafMode) {
        this.trafMode = trafMode;
    }

    public String getTrafName() {
        return trafName;
    }

    public void setTrafName(String trafName) {
        this.trafName = trafName;
    }

    public String getVoyageNo() {
        return voyageNo;
    }

    public void setVoyageNo(String voyageNo) {
        this.voyageNo = voyageNo;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getTradeCo() {
        return tradeCo;
    }

    public void setTradeCo(String tradeCo) {
        this.tradeCo = tradeCo;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getContrNo() {
        return contrNo;
    }

    public void setContrNo(String contrNo) {
        this.contrNo = contrNo;
    }

    public String getTradeCountry() {
        return tradeCountry;
    }

    public void setTradeCountry(String tradeCountry) {
        this.tradeCountry = tradeCountry;
    }

    public String getTradeMode() {
        return tradeMode;
    }

    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode;
    }

    public String getCutMode() {
        return cutMode;
    }

    public void setCutMode(String cutMode) {
        this.cutMode = cutMode;
    }

    public String getTransMode() {
        return transMode;
    }

    public void setTransMode(String transMode) {
        this.transMode = transMode;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getFeeMark() {
        return feeMark;
    }

    public void setFeeMark(String feeMark) {
        this.feeMark = feeMark;
    }

    public String getFeeCurr() {
        return feeCurr;
    }

    public void setFeeCurr(String feeCurr) {
        this.feeCurr = feeCurr;
    }

    public String getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(String feeRate) {
        this.feeRate = feeRate;
    }

    public String getInsurMark() {
        return insurMark;
    }

    public void setInsurMark(String insurMark) {
        this.insurMark = insurMark;
    }

    public String getInsurCurr() {
        return insurCurr;
    }

    public void setInsurCurr(String insurCurr) {
        this.insurCurr = insurCurr;
    }

    public String getInsurRate() {
        return insurRate;
    }

    public void setInsurRate(String insurRate) {
        this.insurRate = insurRate;
    }

    public String getOtherMark() {
        return otherMark;
    }

    public void setOtherMark(String otherMark) {
        this.otherMark = otherMark;
    }

    public String getOtherCurr() {
        return otherCurr;
    }

    public void setOtherCurr(String otherCurr) {
        this.otherCurr = otherCurr;
    }

    public String getOtherRate() {
        return otherRate;
    }

    public void setOtherRate(String otherRate) {
        this.otherRate = otherRate;
    }

    public String getPackNo() {
        return packNo;
    }

    public void setPackNo(String packNo) {
        this.packNo = packNo;
    }

    public String getGrossWt() {
        return grossWt;
    }

    public void setGrossWt(String grossWt) {
        this.grossWt = grossWt;
    }

    public String getNetWt() {
        return netWt;
    }

    public void setNetWt(String netWt) {
        this.netWt = netWt;
    }

    public String getWrapType() {
        return wrapType;
    }

    public void setWrapType(String wrapType) {
        this.wrapType = wrapType;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getApprNo() {
        return apprNo;
    }

    public void setApprNo(String apprNo) {
        this.apprNo = apprNo;
    }

    public String getManualNo() {
        return manualNo;
    }

    public void setManualNo(String manualNo) {
        this.manualNo = manualNo;
    }

    public String getRelativeId() {
        return relativeId;
    }

    public void setRelativeId(String relativeId) {
        this.relativeId = relativeId;
    }

    public String getRelativeManualNo() {
        return relativeManualNo;
    }

    public void setRelativeManualNo(String relativeManualNo) {
        this.relativeManualNo = relativeManualNo;
    }

    public String getBondedNo() {
        return bondedNo;
    }

    public void setBondedNo(String bondedNo) {
        this.bondedNo = bondedNo;
    }

    public String getCustomsField() {
        return customsField;
    }

    public void setCustomsField(String customsField) {
        this.customsField = customsField;
    }

    public String getEdiId() {
        return ediId;
    }

    public void setEdiId(String ediId) {
        this.ediId = ediId;
    }

    public String getEdiRemark() {
        return ediRemark;
    }

    public void setEdiRemark(String ediRemark) {
        this.ediRemark = ediRemark;
    }

    public String getpDate() {
        return pDate;
    }

    public void setpDate(String pDate) {
        this.pDate = pDate;
    }

    public String getNoteS() {
        return noteS;
    }

    public void setNoteS(String noteS) {
        this.noteS = noteS;
    }

    public String getChkSurety() {
        return chkSurety;
    }

    public void setChkSurety(String chkSurety) {
        this.chkSurety = chkSurety;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getTradeCoScc() {
        return tradeCoScc;
    }

    public void setTradeCoScc(String tradeCoScc) {
        this.tradeCoScc = tradeCoScc;
    }

    public String getAgentCodeScc() {
        return agentCodeScc;
    }

    public void setAgentCodeScc(String agentCodeScc) {
        this.agentCodeScc = agentCodeScc;
    }

    public String getOwnerCodeScc() {
        return ownerCodeScc;
    }

    public void setOwnerCodeScc(String ownerCodeScc) {
        this.ownerCodeScc = ownerCodeScc;
    }

    public String getPromiseItmes() {
        return promiseItmes;
    }

    public void setPromiseItmes(String promiseItmes) {
        this.promiseItmes = promiseItmes;
    }

    public String getTradeAreaCode() {
        return tradeAreaCode;
    }

    public void setTradeAreaCode(String tradeAreaCode) {
        this.tradeAreaCode = tradeAreaCode;
    }

    public String getEdiRemark2() {
        return ediRemark2;
    }

    public void setEdiRemark2(String ediRemark2) {
        this.ediRemark2 = ediRemark2;
    }

    public String getBillSeqNo() {
        return billSeqNo;
    }

    public void setBillSeqNo(String billSeqNo) {
        this.billSeqNo = billSeqNo;
    }

    public String getDecno() {
        return decno;
    }

    public void setDecno(String decno) {
        this.decno = decno;
    }

    public String getTypeEr() {
        return typeEr;
    }

    public void setTypeEr(String typeEr) {
        this.typeEr = typeEr;
    }

    public String getCollecttax() {
        return collecttax;
    }

    public void setCollecttax(String collecttax) {
        this.collecttax = collecttax;
    }

    public String getTwoAudit() {
        return twoAudit;
    }

    public void setTwoAudit(String twoAudit) {
        this.twoAudit = twoAudit;
    }

    public String getPaperlesstax() {
        return paperlesstax;
    }

    public void setPaperlesstax(String paperlesstax) {
        this.paperlesstax = paperlesstax;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public String getOverseasConsignorCode() {
        return overseasConsignorCode;
    }

    public void setOverseasConsignorCode(String overseasConsignorCode) {
        this.overseasConsignorCode = overseasConsignorCode;
    }

    public String getOverseasConsignorEname() {
        return overseasConsignorEname;
    }

    public void setOverseasConsignorEname(String overseasConsignorEname) {
        this.overseasConsignorEname = overseasConsignorEname;
    }

    public String getOverseasConsigneeCode() {
        return overseasConsigneeCode;
    }

    public void setOverseasConsigneeCode(String overseasConsigneeCode) {
        this.overseasConsigneeCode = overseasConsigneeCode;
    }

    public String getOverseasConsigneeEname() {
        return overseasConsigneeEname;
    }

    public void setOverseasConsigneeEname(String overseasConsigneeEname) {
        this.overseasConsigneeEname = overseasConsigneeEname;
    }

    public String getMarkNo() {
        return markNo;
    }

    public void setMarkNo(String markNo) {
        this.markNo = markNo;
    }

    public String getDespPortCode() {
        return despPortCode;
    }

    public void setDespPortCode(String despPortCode) {
        this.despPortCode = despPortCode;
    }

    public String getEntyPortCode() {
        return entyPortCode;
    }

    public void setEntyPortCode(String entyPortCode) {
        this.entyPortCode = entyPortCode;
    }

    public String getGoodsPlace() {
        return goodsPlace;
    }

    public void setGoodsPlace(String goodsPlace) {
        this.goodsPlace = goodsPlace;
    }

    public String getBlNo() {
        return blNo;
    }

    public void setBlNo(String blNo) {
        this.blNo = blNo;
    }

    public String getInspOrgCode() {
        return inspOrgCode;
    }

    public void setInspOrgCode(String inspOrgCode) {
        this.inspOrgCode = inspOrgCode;
    }

    public String getSpecDeclFlag() {
        return specDeclFlag;
    }

    public void setSpecDeclFlag(String specDeclFlag) {
        this.specDeclFlag = specDeclFlag;
    }

    public String getPurpOrgCode() {
        return purpOrgCode;
    }

    public void setPurpOrgCode(String purpOrgCode) {
        this.purpOrgCode = purpOrgCode;
    }

    public String getDespDate() {
        return despDate;
    }

    public void setDespDate(String despDate) {
        this.despDate = despDate;
    }

    public String getCmplDschrgDt() {
        return cmplDschrgDt;
    }

    public void setCmplDschrgDt(String cmplDschrgDt) {
        this.cmplDschrgDt = cmplDschrgDt;
    }

    public String getCorrelationReasonFlag() {
        return correlationReasonFlag;
    }

    public void setCorrelationReasonFlag(String correlationReasonFlag) {
        this.correlationReasonFlag = correlationReasonFlag;
    }

    public String getVsaOrgCode() {
        return vsaOrgCode;
    }

    public void setVsaOrgCode(String vsaOrgCode) {
        this.vsaOrgCode = vsaOrgCode;
    }

    public String getOrigBoxFlag() {
        return origBoxFlag;
    }

    public void setOrigBoxFlag(String origBoxFlag) {
        this.origBoxFlag = origBoxFlag;
    }

    public String getNoOtherPack() {
        return noOtherPack;
    }

    public void setNoOtherPack(String noOtherPack) {
        this.noOtherPack = noOtherPack;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOverseasConsignorCname() {
        return overseasConsignorCname;
    }

    public void setOverseasConsignorCname(String overseasConsignorCname) {
        this.overseasConsignorCname = overseasConsignorCname;
    }

    public String getOverseasConsignorAddr() {
        return overseasConsignorAddr;
    }

    public void setOverseasConsignorAddr(String overseasConsignorAddr) {
        this.overseasConsignorAddr = overseasConsignorAddr;
    }

    public String getDomesticConsigneeEname() {
        return domesticConsigneeEname;
    }

    public void setDomesticConsigneeEname(String domesticConsigneeEname) {
        this.domesticConsigneeEname = domesticConsigneeEname;
    }

    public String getCorrelationNo() {
        return correlationNo;
    }

    public void setCorrelationNo(String correlationNo) {
        this.correlationNo = correlationNo;
    }

    public String getTradeCiqCode() {
        return tradeCiqCode;
    }

    public void setTradeCiqCode(String tradeCiqCode) {
        this.tradeCiqCode = tradeCiqCode;
    }

    public String getOwnerCiqCode() {
        return ownerCiqCode;
    }

    public void setOwnerCiqCode(String ownerCiqCode) {
        this.ownerCiqCode = ownerCiqCode;
    }

    public String getDeclCiqCode() {
        return declCiqCode;
    }

    public void setDeclCiqCode(String declCiqCode) {
        this.declCiqCode = declCiqCode;
    }

    public String getCheckFlow() {
        return checkFlow;
    }

    public void setCheckFlow(String checkFlow) {
        this.checkFlow = checkFlow;
    }

    public String getTaxAaminMark() {
        return taxAaminMark;
    }

    public void setTaxAaminMark(String taxAaminMark) {
        this.taxAaminMark = taxAaminMark;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
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

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
