package com.winchampion.model.response.fusionGyTabXxzxjhMszxSxbzxr;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * FusionGyTabXxzxjhMszxSxbzxr 数据对象返回类
 *
 * @author winchampion
 * @since 2022-08-17
 */
@SuppressWarnings("SpellCheckingInspection")
@Schema(name = "FUSION_GY_TAB_XXZXJH_MSZX_SXBZXR数据对象")
public class FusionGyTabXxzxjhMszxSxbzxrResult {
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


    @Schema(name = "ah", description = "执行案号")
    private String ah;


    @Schema(name = "bzxrmc", description = "被执行人")
    private String bzxrmc;


    @Schema(name = "bzxrlx", description = "被执行人类型")
    private String bzxrlx;


    @Schema(name = "zjlx", description = "被执行人证件类型")
    private String zjlx;


    @Schema(name = "sfz", description = "被执行人身份证号")
    private String sfz;


    @Schema(name = "qybh", description = "被执行人机构代码")
    private String qybh;


    @Schema(name = "fr", description = "法定代表人或负责人")
    private String fr;


    @Schema(name = "zxfy", description = "执行法院")
    private String zxfy;


    @Schema(name = "xxzt", description = "信息状态")
    private String xxzt;


    @Schema(name = "frzjhm", description = "组织机构负责人姓名证件号码")
    private String frzjhm;


    @Schema(name = "sxrid", description = "失信人id")
    private String sxrid;


    @Schema(name = "id", description = "id")
    private String id;


    @Schema(name = "jhptDelete", description = "jhpt_delete")
    private String jhptDelete;


    @Schema(name = "jhptUpdateTime", description = "jhpt_update_time")
    private String jhptUpdateTime;


    @Schema(name = "taskid", description = "调度任务id")
    private String taskid;

    public String getUnifiedSocialCreditCode() {
        return unifiedSocialCreditCode;
    }

    public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
        this.unifiedSocialCreditCode = unifiedSocialCreditCode;
    }

    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    public String getBzxrmc() {
        return bzxrmc;
    }

    public void setBzxrmc(String bzxrmc) {
        this.bzxrmc = bzxrmc;
    }

    public String getBzxrlx() {
        return bzxrlx;
    }

    public void setBzxrlx(String bzxrlx) {
        this.bzxrlx = bzxrlx;
    }

    public String getZjlx() {
        return zjlx;
    }

    public void setZjlx(String zjlx) {
        this.zjlx = zjlx;
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    public String getQybh() {
        return qybh;
    }

    public void setQybh(String qybh) {
        this.qybh = qybh;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getZxfy() {
        return zxfy;
    }

    public void setZxfy(String zxfy) {
        this.zxfy = zxfy;
    }

    public String getXxzt() {
        return xxzt;
    }

    public void setXxzt(String xxzt) {
        this.xxzt = xxzt;
    }

    public String getFrzjhm() {
        return frzjhm;
    }

    public void setFrzjhm(String frzjhm) {
        this.frzjhm = frzjhm;
    }

    public String getSxrid() {
        return sxrid;
    }

    public void setSxrid(String sxrid) {
        this.sxrid = sxrid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }
}
