package com.winchampion.model.response.dwdCorpInfoChange;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdCorpInfoChange 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_corp_info_change数据对象")
public class DwdCorpInfoChangeResult {
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

    @Schema(name = "changeAfnote", description = "登记变更后内容")
    private String changeAfnote;


    @Schema(name = "changeBenote", description = "登记变更前内容")
    private String changeBenote;


    @Schema(name = "changeDate", description = "变更日期")
    private String changeDate;


    @Schema(name = "changeItem", description = "变更事项")
    private String changeItem;


    @Schema(name = "corpInfoExtId", description = "法人登记拓展信息表主键")
    private String corpInfoExtId;


    @Schema(name = "entityId", description = "工商提供法人登记信息唯一标示")
    private String entityId;


    @Schema(name = "id", description = "主键")
    private String id;


    @Schema(name = "insertTime", description = "insertTime")
    private String insertTime;


    @Schema(name = "isSend", description = "isSend")
    private String isSend;


    @Schema(name = "jhptUpdateTime", description = "jhptUpdateTime")
    private String jhptUpdateTime;


    @Schema(name = "refBdId", description = "refBdId")
    private String refBdId;


    @Schema(name = "validity", description = "是否有效")
    private String validity;


    @Schema(name = "dsjzxTaskid", description = "数据日期")
    private String dsjzxTaskid;

    public String getChangeAfnote() {
        return changeAfnote;
    }

    public void setChangeAfnote(String changeAfnote) {
        this.changeAfnote = changeAfnote;
    }

    public String getChangeBenote() {
        return changeBenote;
    }

    public void setChangeBenote(String changeBenote) {
        this.changeBenote = changeBenote;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public String getIsSend() {
        return isSend;
    }

    public void setIsSend(String isSend) {
        this.isSend = isSend;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getRefBdId() {
        return refBdId;
    }

    public void setRefBdId(String refBdId) {
        this.refBdId = refBdId;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
