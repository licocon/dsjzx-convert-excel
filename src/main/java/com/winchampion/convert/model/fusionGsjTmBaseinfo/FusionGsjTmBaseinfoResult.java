package com.winchampion.model.response.fusionGsjTmBaseinfo;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * FusionGsjTmBaseinfo 数据对象返回类
 *
 * @author winchampion
 * @since 2022-08-17
 */
@SuppressWarnings("SpellCheckingInspection")
@Schema(name = "FUSION_GSJ_TM_BASEINFO数据对象")
public class FusionGsjTmBaseinfoResult {
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

    @Schema(name = "unifiedSocialCreditCode", description = "融合后统一社会信用代码")
    private String unifiedSocialCreditCode;


    @Schema(name = "tmid", description = "物理主键")
    private String tmid;


    @Schema(name = "pripid", description = "主体身份代码")
    private String pripid;


    @Schema(name = "uniscid", description = "统一社会信用代码")
    private String uniscid;


    @Schema(name = "entname", description = "企业（机构）名称")
    private String entname;


    @Schema(name = "regno", description = "注册号")
    private String regno;


    @Schema(name = "regNum", description = "商标注册号")
    private String regNum;


    @Schema(name = "intCls", description = "商标类别")
    private String intCls;


    @Schema(name = "regAnncDate", description = "注册公告日期")
    private String regAnncDate;


    @Schema(name = "regAnncIssue", description = "注册公告期号")
    private String regAnncIssue;


    @Schema(name = "propertyBgnDate", description = "商标专用权起始日期")
    private String propertyBgnDate;


    @Schema(name = "propertyEndDate", description = "商标专用权截止日期")
    private String propertyEndDate;


    @Schema(name = "coownerCnName", description = "商标共有人信息")
    private String coownerCnName;


    @Schema(name = "jhptUpdateTime", description = "jhpt_update_time")
    private String jhptUpdateTime;


    @Schema(name = "jhptUpdateFlag", description = "jhpt_update_flag")
    private String jhptUpdateFlag;


    @Schema(name = "taskid", description = "调度任务id")
    private String taskid;

    public String getUnifiedSocialCreditCode() {
        return unifiedSocialCreditCode;
    }

    public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
        this.unifiedSocialCreditCode = unifiedSocialCreditCode;
    }

    public String getTmid() {
        return tmid;
    }

    public void setTmid(String tmid) {
        this.tmid = tmid;
    }

    public String getPripid() {
        return pripid;
    }

    public void setPripid(String pripid) {
        this.pripid = pripid;
    }

    public String getUniscid() {
        return uniscid;
    }

    public void setUniscid(String uniscid) {
        this.uniscid = uniscid;
    }

    public String getEntname() {
        return entname;
    }

    public void setEntname(String entname) {
        this.entname = entname;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getIntCls() {
        return intCls;
    }

    public void setIntCls(String intCls) {
        this.intCls = intCls;
    }

    public String getRegAnncDate() {
        return regAnncDate;
    }

    public void setRegAnncDate(String regAnncDate) {
        this.regAnncDate = regAnncDate;
    }

    public String getRegAnncIssue() {
        return regAnncIssue;
    }

    public void setRegAnncIssue(String regAnncIssue) {
        this.regAnncIssue = regAnncIssue;
    }

    public String getPropertyBgnDate() {
        return propertyBgnDate;
    }

    public void setPropertyBgnDate(String propertyBgnDate) {
        this.propertyBgnDate = propertyBgnDate;
    }

    public String getPropertyEndDate() {
        return propertyEndDate;
    }

    public void setPropertyEndDate(String propertyEndDate) {
        this.propertyEndDate = propertyEndDate;
    }

    public String getCoownerCnName() {
        return coownerCnName;
    }

    public void setCoownerCnName(String coownerCnName) {
        this.coownerCnName = coownerCnName;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getJhptUpdateFlag() {
        return jhptUpdateFlag;
    }

    public void setJhptUpdateFlag(String jhptUpdateFlag) {
        this.jhptUpdateFlag = jhptUpdateFlag;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }
}
