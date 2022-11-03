package com.winchampion.model.response.dwdTOnewinxEdiResult;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdTOnewinxEdiResult 数据对象返回类
 *
 * @author licocon
 * @since 2022-08-16
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel", "AlibabaLowerCamelCaseVariableNaming"})
@Schema(name = "DWD_T_ONEWINX_EDI_RESULT数据对象")
public class DwdTOnewinxEdiResultResult {
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


    @Schema(name = "entryId", description = "报关单号")
    private String entryId;


    @Schema(name = "noticeDate", description = "通知时间")
    private String noticeDate;


    @Schema(name = "channel", description = "处理结果")
    private String channel;


    @Schema(name = "note", description = "审核备注")
    private String note;


    @Schema(name = "declPort", description = "主管海关（申报地海关）")
    private String declPort;


    @Schema(name = "agentName", description = "申报单位名称")
    private String agentName;


    @Schema(name = "declareNo", description = "报关员编号")
    private String declareNo;


    @Schema(name = "tradeCo", description = "境内收发货人编号")
    private String tradeCo;


    @Schema(name = "customsField", description = "货场代码")
    private String customsField;


    @Schema(name = "bondedNo", description = "保税仓库代码")
    private String bondedNo;


    @Schema(name = "iEDate", description = "进出口日期")
    private String iEDate;


    @Schema(name = "packNo", description = "包装件数")
    private String packNo;


    @Schema(name = "billNo", description = "提运单号")
    private String billNo;


    @Schema(name = "trafMode", description = "运输方式")
    private String trafMode;


    @Schema(name = "voyageNo", description = "航班号")
    private String voyageNo;


    @Schema(name = "netWt", description = "净重")
    private String netWt;


    @Schema(name = "grossWt", description = "毛重")
    private String grossWt;


    @Schema(name = "dDate", description = "申报日期")
    private String dDate;


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

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    public String getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(String noticeDate) {
        this.noticeDate = noticeDate;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDeclPort() {
        return declPort;
    }

    public void setDeclPort(String declPort) {
        this.declPort = declPort;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getDeclareNo() {
        return declareNo;
    }

    public void setDeclareNo(String declareNo) {
        this.declareNo = declareNo;
    }

    public String getTradeCo() {
        return tradeCo;
    }

    public void setTradeCo(String tradeCo) {
        this.tradeCo = tradeCo;
    }

    public String getCustomsField() {
        return customsField;
    }

    public void setCustomsField(String customsField) {
        this.customsField = customsField;
    }

    public String getBondedNo() {
        return bondedNo;
    }

    public void setBondedNo(String bondedNo) {
        this.bondedNo = bondedNo;
    }

    public String getiEDate() {
        return iEDate;
    }

    public void setiEDate(String iEDate) {
        this.iEDate = iEDate;
    }

    public String getPackNo() {
        return packNo;
    }

    public void setPackNo(String packNo) {
        this.packNo = packNo;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getTrafMode() {
        return trafMode;
    }

    public void setTrafMode(String trafMode) {
        this.trafMode = trafMode;
    }

    public String getVoyageNo() {
        return voyageNo;
    }

    public void setVoyageNo(String voyageNo) {
        this.voyageNo = voyageNo;
    }

    public String getNetWt() {
        return netWt;
    }

    public void setNetWt(String netWt) {
        this.netWt = netWt;
    }

    public String getGrossWt() {
        return grossWt;
    }

    public void setGrossWt(String grossWt) {
        this.grossWt = grossWt;
    }

    public String getdDate() {
        return dDate;
    }

    public void setdDate(String dDate) {
        this.dDate = dDate;
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
