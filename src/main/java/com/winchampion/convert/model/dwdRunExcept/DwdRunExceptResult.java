package com.winchampion.model.response.dwdRunExcept;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdRunExcept 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_run_except数据对象")
public class DwdRunExceptResult {
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

    @Schema(name = "exceptId", description = "名录ID")
    private String exceptId;


    @Schema(name = "entType", description = "主体类型")
    private String entType;


    @Schema(name = "etpsId", description = "企业标识")
    private String etpsId;


    @Schema(name = "etpsName", description = "企业名称")
    private String etpsName;


    @Schema(name = "regNo", description = "注册号")
    private String regNo;


    @Schema(name = "leaderName", description = "主体身份代码")
    private String leaderName;


    @Schema(name = "address", description = "住址")
    private String address;


    @Schema(name = "unannlYear", description = "未年检年度")
    private String unannlYear;


    @Schema(name = "letterReason", description = "发函原因")
    private String letterReason;


    @Schema(name = "unpublicInfoType", description = "未公示信息类型")
    private String unpublicInfoType;


    @Schema(name = "moveInDate", description = "列入日期")
    private String moveInDate;


    @Schema(name = "moveInReason", description = "列入原因")
    private String moveInReason;


    @Schema(name = "moveInUserId", description = "列入人员")
    private String moveInUserId;


    @Schema(name = "moveInUserName", description = "列入人员姓名")
    private String moveInUserName;


    @Schema(name = "moveInOrganId", description = "列入机关")
    private String moveInOrganId;


    @Schema(name = "undoDate", description = "移出日期")
    private String undoDate;


    @Schema(name = "undoReason", description = "移出原因")
    private String undoReason;


    @Schema(name = "undoReasonExt", description = "移出原因补充")
    private String undoReasonExt;


    @Schema(name = "undoUserId", description = "移出人员")
    private String undoUserId;


    @Schema(name = "undoUserName", description = "移出人员姓名")
    private String undoUserName;


    @Schema(name = "undoOrganId", description = "移出机关")
    private String undoOrganId;


    @Schema(name = "status", description = "状态")
    private String status;


    @Schema(name = "inBatchId", description = "列入主键")
    private String inBatchId;


    @Schema(name = "outBatchId", description = "移出主键")
    private String outBatchId;


    @Schema(name = "dataSource", description = "载入数据来源")
    private String dataSource;


    @Schema(name = "uniScid", description = "统一社会信用代码")
    private String uniScid;


    @Schema(name = "valid", description = "有效性")
    private String valid;


    @Schema(name = "priPid", description = "主体身份代码")
    private String priPid;


    @Schema(name = "revokeInAppSource", description = "撤销列入申请来源")
    private String revokeInAppSource;


    @Schema(name = "revokeInReason", description = "撤销列入理由")
    private String revokeInReason;


    @Schema(name = "revokeInCause", description = "撤销列入事由")
    private String revokeInCause;


    @Schema(name = "revokeInDate", description = "撤销列入日期")
    private String revokeInDate;


    @Schema(name = "revokeInExceptPerson", description = "撤销列入公示机关")
    private String revokeInExceptPerson;


    @Schema(name = "revokeInOrganId", description = "撤销列入公示批次")
    private String revokeInOrganId;


    @Schema(name = "revokeInBatchId", description = "撤销移出申请来源")
    private String revokeInBatchId;


    @Schema(name = "revokeUndoAppSource", description = "撤销移出理由")
    private String revokeUndoAppSource;


    @Schema(name = "revokeUndoReason", description = "撤销移出事由")
    private String revokeUndoReason;


    @Schema(name = "revokeUndoCause", description = "撤销移出日期")
    private String revokeUndoCause;


    @Schema(name = "revokeUndoDate", description = "撤销移出公示机关")
    private String revokeUndoDate;


    @Schema(name = "revokeUndoExceptPerson", description = "撤销移出公示批次")
    private String revokeUndoExceptPerson;


    @Schema(name = "revokeUndoOrganId", description = "撤销移出机关")
    private String revokeUndoOrganId;


    @Schema(name = "revokeUndoBatchId", description = "撤销移出主键")
    private String revokeUndoBatchId;


    @Schema(name = "moveInAppOrganId", description = "列入申请机关")
    private String moveInAppOrganId;


    @Schema(name = "undoAppOrganId", description = "移出申请机关")
    private String undoAppOrganId;


    @Schema(name = "updateTime", description = "更新时间")
    private String updateTime;


    @Schema(name = "isAutoIn", description = "是否自动列入")
    private String isAutoIn;


    @Schema(name = "isAutoOut", description = "是否自动移出")
    private String isAutoOut;


    @Schema(name = "jhptUpdateFlag", description = "修改标志位")
    private String jhptUpdateFlag;


    @Schema(name = "jhptDelete", description = "逻辑删除位")
    private String jhptDelete;


    @Schema(name = "jhptUpdateTime", description = "时间戳")
    private String jhptUpdateTime;


    @Schema(name = "dsjzxTaskid", description = "数据日期")
    private String dsjzxTaskid;

    public String getExceptId() {
        return exceptId;
    }

    public void setExceptId(String exceptId) {
        this.exceptId = exceptId;
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

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUnannlYear() {
        return unannlYear;
    }

    public void setUnannlYear(String unannlYear) {
        this.unannlYear = unannlYear;
    }

    public String getLetterReason() {
        return letterReason;
    }

    public void setLetterReason(String letterReason) {
        this.letterReason = letterReason;
    }

    public String getUnpublicInfoType() {
        return unpublicInfoType;
    }

    public void setUnpublicInfoType(String unpublicInfoType) {
        this.unpublicInfoType = unpublicInfoType;
    }

    public String getMoveInDate() {
        return moveInDate;
    }

    public void setMoveInDate(String moveInDate) {
        this.moveInDate = moveInDate;
    }

    public String getMoveInReason() {
        return moveInReason;
    }

    public void setMoveInReason(String moveInReason) {
        this.moveInReason = moveInReason;
    }

    public String getMoveInUserId() {
        return moveInUserId;
    }

    public void setMoveInUserId(String moveInUserId) {
        this.moveInUserId = moveInUserId;
    }

    public String getMoveInUserName() {
        return moveInUserName;
    }

    public void setMoveInUserName(String moveInUserName) {
        this.moveInUserName = moveInUserName;
    }

    public String getMoveInOrganId() {
        return moveInOrganId;
    }

    public void setMoveInOrganId(String moveInOrganId) {
        this.moveInOrganId = moveInOrganId;
    }

    public String getUndoDate() {
        return undoDate;
    }

    public void setUndoDate(String undoDate) {
        this.undoDate = undoDate;
    }

    public String getUndoReason() {
        return undoReason;
    }

    public void setUndoReason(String undoReason) {
        this.undoReason = undoReason;
    }

    public String getUndoReasonExt() {
        return undoReasonExt;
    }

    public void setUndoReasonExt(String undoReasonExt) {
        this.undoReasonExt = undoReasonExt;
    }

    public String getUndoUserId() {
        return undoUserId;
    }

    public void setUndoUserId(String undoUserId) {
        this.undoUserId = undoUserId;
    }

    public String getUndoUserName() {
        return undoUserName;
    }

    public void setUndoUserName(String undoUserName) {
        this.undoUserName = undoUserName;
    }

    public String getUndoOrganId() {
        return undoOrganId;
    }

    public void setUndoOrganId(String undoOrganId) {
        this.undoOrganId = undoOrganId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getUniScid() {
        return uniScid;
    }

    public void setUniScid(String uniScid) {
        this.uniScid = uniScid;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getPriPid() {
        return priPid;
    }

    public void setPriPid(String priPid) {
        this.priPid = priPid;
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

    public String getRevokeInExceptPerson() {
        return revokeInExceptPerson;
    }

    public void setRevokeInExceptPerson(String revokeInExceptPerson) {
        this.revokeInExceptPerson = revokeInExceptPerson;
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

    public String getRevokeUndoAppSource() {
        return revokeUndoAppSource;
    }

    public void setRevokeUndoAppSource(String revokeUndoAppSource) {
        this.revokeUndoAppSource = revokeUndoAppSource;
    }

    public String getRevokeUndoReason() {
        return revokeUndoReason;
    }

    public void setRevokeUndoReason(String revokeUndoReason) {
        this.revokeUndoReason = revokeUndoReason;
    }

    public String getRevokeUndoCause() {
        return revokeUndoCause;
    }

    public void setRevokeUndoCause(String revokeUndoCause) {
        this.revokeUndoCause = revokeUndoCause;
    }

    public String getRevokeUndoDate() {
        return revokeUndoDate;
    }

    public void setRevokeUndoDate(String revokeUndoDate) {
        this.revokeUndoDate = revokeUndoDate;
    }

    public String getRevokeUndoExceptPerson() {
        return revokeUndoExceptPerson;
    }

    public void setRevokeUndoExceptPerson(String revokeUndoExceptPerson) {
        this.revokeUndoExceptPerson = revokeUndoExceptPerson;
    }

    public String getRevokeUndoOrganId() {
        return revokeUndoOrganId;
    }

    public void setRevokeUndoOrganId(String revokeUndoOrganId) {
        this.revokeUndoOrganId = revokeUndoOrganId;
    }

    public String getRevokeUndoBatchId() {
        return revokeUndoBatchId;
    }

    public void setRevokeUndoBatchId(String revokeUndoBatchId) {
        this.revokeUndoBatchId = revokeUndoBatchId;
    }

    public String getMoveInAppOrganId() {
        return moveInAppOrganId;
    }

    public void setMoveInAppOrganId(String moveInAppOrganId) {
        this.moveInAppOrganId = moveInAppOrganId;
    }

    public String getUndoAppOrganId() {
        return undoAppOrganId;
    }

    public void setUndoAppOrganId(String undoAppOrganId) {
        this.undoAppOrganId = undoAppOrganId;
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
