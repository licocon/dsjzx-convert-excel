package com.winchampion.model.response.dwdEntBlack;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdEntBlack 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_ent_black数据对象")
public class DwdEntBlackResult {
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

    @Schema(name = "uuid", description = "主键")
    private String uuid;


    @Schema(name = "entType", description = "违法类型")
    private String entType;


    @Schema(name = "etpsId", description = "企业标识")
    private String etpsId;


    @Schema(name = "etpsName", description = "企业名称")
    private String etpsName;


    @Schema(name = "regNo", description = "注册号")
    private String regNo;


    @Schema(name = "uniScid", description = "统一社会信用代码")
    private String uniScid;


    @Schema(name = "abnRes", description = "列入原因")
    private String abnRes;


    @Schema(name = "abnAppTime", description = "列入申请时间")
    private String abnAppTime;


    @Schema(name = "abnOrgan", description = "列入机关")
    private String abnOrgan;


    @Schema(name = "abnOrganName", description = "列入机关名称")
    private String abnOrganName;


    @Schema(name = "abnDesTime", description = "列入决定日期")
    private String abnDesTime;


    @Schema(name = "abnDesNum", description = "列入决定书文号")
    private String abnDesNum;


    @Schema(name = "lerep", description = "法定代表人姓名")
    private String lerep;


    @Schema(name = "cerNo", description = "法定代表人证件号码")
    private String cerNo;


    @Schema(name = "cerType", description = "法定代表人证件类型")
    private String cerType;


    @Schema(name = "remAppTime", description = "移出申请日期")
    private String remAppTime;


    @Schema(name = "remRes", description = "移出原因")
    private String remRes;


    @Schema(name = "remOrgan", description = "移出机关")
    private String remOrgan;


    @Schema(name = "remOrganName", description = "移出机关名称")
    private String remOrganName;


    @Schema(name = "remDesNum", description = "移出决定书文号")
    private String remDesNum;


    @Schema(name = "remDesTime", description = "移出决定时间")
    private String remDesTime;


    @Schema(name = "appNo", description = "申请编号")
    private String appNo;


    @Schema(name = "abnAppOrgan", description = "列入申请机关")
    private String abnAppOrgan;


    @Schema(name = "remAppOrgan", description = "移出申请机关")
    private String remAppOrgan;


    @Schema(name = "status", description = "状态")
    private String status;


    @Schema(name = "valid", description = "有限性")
    private String valid;


    @Schema(name = "updateTime", description = "更新时间")
    private String updateTime;


    @Schema(name = "isAutoIn", description = "是否自动列入")
    private String isAutoIn;


    @Schema(name = "isAutoOut", description = "是否自动移出")
    private String isAutoOut;


    @Schema(name = "revokeInAppSource", description = "撤销列入申请来源")
    private String revokeInAppSource;


    @Schema(name = "revokeInReason", description = "撤销列入理由")
    private String revokeInReason;


    @Schema(name = "revokeInCause", description = "撤销列入事由")
    private String revokeInCause;


    @Schema(name = "revokeInDate", description = "撤销列入日期")
    private String revokeInDate;


    @Schema(name = "revokeInOrganId", description = "撤销列入公示机关")
    private String revokeInOrganId;


    @Schema(name = "revokeInBatchId", description = "撤销列入公示批次")
    private String revokeInBatchId;


    @Schema(name = "revokeOutAppSource", description = "撤销移出申请来源")
    private String revokeOutAppSource;


    @Schema(name = "revokeOutReason", description = "撤销移出理由")
    private String revokeOutReason;


    @Schema(name = "revokeOutCause", description = "撤销移出事由")
    private String revokeOutCause;


    @Schema(name = "revokeOutDate", description = "撤销移出日期")
    private String revokeOutDate;


    @Schema(name = "revokeOutOrganId", description = "撤销移出公示机关")
    private String revokeOutOrganId;


    @Schema(name = "revokeOutBatchId", description = "撤销移出公示批次")
    private String revokeOutBatchId;


    @Schema(name = "inBatchId", description = "列入公示批次主键")
    private String inBatchId;


    @Schema(name = "outBatchId", description = "移出公示批次主键")
    private String outBatchId;


    @Schema(name = "fromNation", description = "是否总局提供名单")
    private String fromNation;


    @Schema(name = "inforType", description = "类别（总局提供名单）")
    private String inforType;


    @Schema(name = "abnResOther", description = "列入原因其它")
    private String abnResOther;


    @Schema(name = "remResOther", description = "移出原因其它")
    private String remResOther;


    @Schema(name = "memo", description = "备注")
    private String memo;


    @Schema(name = "regOrganId", description = "登记机关编码")
    private String regOrganId;


    @Schema(name = "regOrganName", description = "登记机关名称")
    private String regOrganName;


    @Schema(name = "jhptUpdateFlag", description = "修改标志位")
    private String jhptUpdateFlag;


    @Schema(name = "jhptDelete", description = "逻辑删除位")
    private String jhptDelete;


    @Schema(name = "jhptUpdateTime", description = "时间戳")
    private String jhptUpdateTime;


    @Schema(name = "dsjzxTaskid", description = "DSJZX_TASKID")
    private String dsjzxTaskid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getEntType() {
        return entType;
    }

    public void setEntType(String entType) {
        this.entType = entType;
    }

    public String getEtpsId() {
        return etpsId;
    }

    public void setEtpsId(String etpsId) {
        this.etpsId = etpsId;
    }

    public String getEtpsName() {
        return etpsName;
    }

    public void setEtpsName(String etpsName) {
        this.etpsName = etpsName;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getUniScid() {
        return uniScid;
    }

    public void setUniScid(String uniScid) {
        this.uniScid = uniScid;
    }

    public String getAbnRes() {
        return abnRes;
    }

    public void setAbnRes(String abnRes) {
        this.abnRes = abnRes;
    }

    public String getAbnAppTime() {
        return abnAppTime;
    }

    public void setAbnAppTime(String abnAppTime) {
        this.abnAppTime = abnAppTime;
    }

    public String getAbnOrgan() {
        return abnOrgan;
    }

    public void setAbnOrgan(String abnOrgan) {
        this.abnOrgan = abnOrgan;
    }

    public String getAbnOrganName() {
        return abnOrganName;
    }

    public void setAbnOrganName(String abnOrganName) {
        this.abnOrganName = abnOrganName;
    }

    public String getAbnDesTime() {
        return abnDesTime;
    }

    public void setAbnDesTime(String abnDesTime) {
        this.abnDesTime = abnDesTime;
    }

    public String getAbnDesNum() {
        return abnDesNum;
    }

    public void setAbnDesNum(String abnDesNum) {
        this.abnDesNum = abnDesNum;
    }

    public String getLerep() {
        return lerep;
    }

    public void setLerep(String lerep) {
        this.lerep = lerep;
    }

    public String getCerNo() {
        return cerNo;
    }

    public void setCerNo(String cerNo) {
        this.cerNo = cerNo;
    }

    public String getCerType() {
        return cerType;
    }

    public void setCerType(String cerType) {
        this.cerType = cerType;
    }

    public String getRemAppTime() {
        return remAppTime;
    }

    public void setRemAppTime(String remAppTime) {
        this.remAppTime = remAppTime;
    }

    public String getRemRes() {
        return remRes;
    }

    public void setRemRes(String remRes) {
        this.remRes = remRes;
    }

    public String getRemOrgan() {
        return remOrgan;
    }

    public void setRemOrgan(String remOrgan) {
        this.remOrgan = remOrgan;
    }

    public String getRemOrganName() {
        return remOrganName;
    }

    public void setRemOrganName(String remOrganName) {
        this.remOrganName = remOrganName;
    }

    public String getRemDesNum() {
        return remDesNum;
    }

    public void setRemDesNum(String remDesNum) {
        this.remDesNum = remDesNum;
    }

    public String getRemDesTime() {
        return remDesTime;
    }

    public void setRemDesTime(String remDesTime) {
        this.remDesTime = remDesTime;
    }

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo;
    }

    public String getAbnAppOrgan() {
        return abnAppOrgan;
    }

    public void setAbnAppOrgan(String abnAppOrgan) {
        this.abnAppOrgan = abnAppOrgan;
    }

    public String getRemAppOrgan() {
        return remAppOrgan;
    }

    public void setRemAppOrgan(String remAppOrgan) {
        this.remAppOrgan = remAppOrgan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsAutoIn() {
        return isAutoIn;
    }

    public void setIsAutoIn(String isAutoIn) {
        this.isAutoIn = isAutoIn;
    }

    public String getIsAutoOut() {
        return isAutoOut;
    }

    public void setIsAutoOut(String isAutoOut) {
        this.isAutoOut = isAutoOut;
    }

    public String getRevokeInAppSource() {
        return revokeInAppSource;
    }

    public void setRevokeInAppSource(String revokeInAppSource) {
        this.revokeInAppSource = revokeInAppSource;
    }

    public String getRevokeInReason() {
        return revokeInReason;
    }

    public void setRevokeInReason(String revokeInReason) {
        this.revokeInReason = revokeInReason;
    }

    public String getRevokeInCause() {
        return revokeInCause;
    }

    public void setRevokeInCause(String revokeInCause) {
        this.revokeInCause = revokeInCause;
    }

    public String getRevokeInDate() {
        return revokeInDate;
    }

    public void setRevokeInDate(String revokeInDate) {
        this.revokeInDate = revokeInDate;
    }

    public String getRevokeInOrganId() {
        return revokeInOrganId;
    }

    public void setRevokeInOrganId(String revokeInOrganId) {
        this.revokeInOrganId = revokeInOrganId;
    }

    public String getRevokeInBatchId() {
        return revokeInBatchId;
    }

    public void setRevokeInBatchId(String revokeInBatchId) {
        this.revokeInBatchId = revokeInBatchId;
    }

    public String getRevokeOutAppSource() {
        return revokeOutAppSource;
    }

    public void setRevokeOutAppSource(String revokeOutAppSource) {
        this.revokeOutAppSource = revokeOutAppSource;
    }

    public String getRevokeOutReason() {
        return revokeOutReason;
    }

    public void setRevokeOutReason(String revokeOutReason) {
        this.revokeOutReason = revokeOutReason;
    }

    public String getRevokeOutCause() {
        return revokeOutCause;
    }

    public void setRevokeOutCause(String revokeOutCause) {
        this.revokeOutCause = revokeOutCause;
    }

    public String getRevokeOutDate() {
        return revokeOutDate;
    }

    public void setRevokeOutDate(String revokeOutDate) {
        this.revokeOutDate = revokeOutDate;
    }

    public String getRevokeOutOrganId() {
        return revokeOutOrganId;
    }

    public void setRevokeOutOrganId(String revokeOutOrganId) {
        this.revokeOutOrganId = revokeOutOrganId;
    }

    public String getRevokeOutBatchId() {
        return revokeOutBatchId;
    }

    public void setRevokeOutBatchId(String revokeOutBatchId) {
        this.revokeOutBatchId = revokeOutBatchId;
    }

    public String getInBatchId() {
        return inBatchId;
    }

    public void setInBatchId(String inBatchId) {
        this.inBatchId = inBatchId;
    }

    public String getOutBatchId() {
        return outBatchId;
    }

    public void setOutBatchId(String outBatchId) {
        this.outBatchId = outBatchId;
    }

    public String getFromNation() {
        return fromNation;
    }

    public void setFromNation(String fromNation) {
        this.fromNation = fromNation;
    }

    public String getInforType() {
        return inforType;
    }

    public void setInforType(String inforType) {
        this.inforType = inforType;
    }

    public String getAbnResOther() {
        return abnResOther;
    }

    public void setAbnResOther(String abnResOther) {
        this.abnResOther = abnResOther;
    }

    public String getRemResOther() {
        return remResOther;
    }

    public void setRemResOther(String remResOther) {
        this.remResOther = remResOther;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getRegOrganId() {
        return regOrganId;
    }

    public void setRegOrganId(String regOrganId) {
        this.regOrganId = regOrganId;
    }

    public String getRegOrganName() {
        return regOrganName;
    }

    public void setRegOrganName(String regOrganName) {
        this.regOrganName = regOrganName;
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
