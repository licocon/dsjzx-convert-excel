package com.winchampion.model.response.dwdCorpInfoInvestor;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdCorpInfoInvestor 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_corp_info_investor数据对象")
public class DwdCorpInfoInvestorResult {
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


    @Schema(name = "corpInfoExtId", description = "法人登记拓展信息表主键")
    private String corpInfoExtId;


    @Schema(name = "entityId", description = "工商提供法人登记信息唯一标示")
    private String entityId;


    @Schema(name = "investor", description = "股东姓名")
    private String investor;


    @Schema(name = "cerType", description = "证件类型")
    private String cerType;


    @Schema(name = "cerNo", description = "证件号码")
    private String cerNo;


    @Schema(name = "entName", description = "名称")
    private String entName;


    @Schema(name = "blictype", description = "证照类型")
    private String blictype;


    @Schema(name = "blicno", description = "证照号码")
    private String blicno;


    @Schema(name = "subconam3", description = "认缴出资额")
    private String subconam3;


    @Schema(name = "condate", description = "认缴出资时间")
    private String condate;


    @Schema(name = "conform", description = "认缴出资方式")
    private String conform;


    @Schema(name = "subconprop", description = "认缴出资比例")
    private String subconprop;


    @Schema(name = "validity", description = "是否有效")
    private String validity;


    @Schema(name = "investorNationality", description = "INVESTOR_NATIONALITY")
    private String investorNationality;


    @Schema(name = "actconam", description = "实缴出资额")
    private String actconam;


    @Schema(name = "refBdId", description = "REF_BD_ID")
    private String refBdId;


    @Schema(name = "subconam", description = "SUBCONAM")
    private String subconam;


    @Schema(name = "investorType", description = "股东/发起人/合伙人类型")
    private String investorType;


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

    public String getCorpInfoExtId() {
        return corpInfoExtId;
    }

    public void setCorpInfoExtId(String corpInfoExtId) {
        this.corpInfoExtId = corpInfoExtId;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getInvestor() {
        return investor;
    }

    public void setInvestor(String investor) {
        this.investor = investor;
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

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getBlictype() {
        return blictype;
    }

    public void setBlictype(String blictype) {
        this.blictype = blictype;
    }

    public String getBlicno() {
        return blicno;
    }

    public void setBlicno(String blicno) {
        this.blicno = blicno;
    }

    public String getSubconam3() {
        return subconam3;
    }

    public void setSubconam3(String subconam3) {
        this.subconam3 = subconam3;
    }

    public String getCondate() {
        return condate;
    }

    public void setCondate(String condate) {
        this.condate = condate;
    }

    public String getConform() {
        return conform;
    }

    public void setConform(String conform) {
        this.conform = conform;
    }

    public String getSubconprop() {
        return subconprop;
    }

    public void setSubconprop(String subconprop) {
        this.subconprop = subconprop;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getInvestorNationality() {
        return investorNationality;
    }

    public void setInvestorNationality(String investorNationality) {
        this.investorNationality = investorNationality;
    }

    public String getActconam() {
        return actconam;
    }

    public void setActconam(String actconam) {
        this.actconam = actconam;
    }

    public String getRefBdId() {
        return refBdId;
    }

    public void setRefBdId(String refBdId) {
        this.refBdId = refBdId;
    }

    public String getSubconam() {
        return subconam;
    }

    public void setSubconam(String subconam) {
        this.subconam = subconam;
    }

    public String getInvestorType() {
        return investorType;
    }

    public void setInvestorType(String investorType) {
        this.investorType = investorType;
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
