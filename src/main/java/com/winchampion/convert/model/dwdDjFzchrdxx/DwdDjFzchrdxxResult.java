package com.winchampion.model.response.dwdDjFzchrdxx;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdDjFzchrdxx 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_dj_fzchrdxx数据对象")
public class DwdDjFzchrdxxResult {
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

    @Schema(name = "fzchrduuid", description = "非正常认定uuid")
    private String fzchrduuid;


    @Schema(name = "djxh", description = "登记序号")
    private String djxh;


    @Schema(name = "rdrq", description = "认定日期")
    private String rdrq;


    @Schema(name = "jhptUpdateTime", description = "更新日期")
    private String jhptUpdateTime;


    @Schema(name = "lrrq", description = "录入日期")
    private String lrrq;


    @Schema(name = "jhptDelete", description = "删除标志")
    private String jhptDelete;


    @Schema(name = "taskid", description = "批次号")
    private String taskid;

    public String getFzchrduuid() {
        return fzchrduuid;
    }

    public void setFzchrduuid(String fzchrduuid) {
        this.fzchrduuid = fzchrduuid;
    }

    public String getDjxh() {
        return djxh;
    }

    public void setDjxh(String djxh) {
        this.djxh = djxh;
    }

    public String getRdrq() {
        return rdrq;
    }

    public void setRdrq(String rdrq) {
        this.rdrq = rdrq;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getLrrq() {
        return lrrq;
    }

    public void setLrrq(String lrrq) {
        this.lrrq = lrrq;
    }

    public String getJhptDelete() {
        return jhptDelete;
    }

    public void setJhptDelete(String jhptDelete) {
        this.jhptDelete = jhptDelete;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }
}
