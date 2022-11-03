package com.winchampion.model.response.dwdTWbKgKehuxx;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdTWbKgKehuxx 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_t_wb_kg_kehuxx数据对象")
public class DwdTWbKgKehuxxResult {
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

    @Schema(name = "uuid", description = "uuid")
    private String uuid;


    @Schema(name = "sJuzhudz", description = "地址")
    private String sJuzhudz;


    @Schema(name = "jhptUpdateTime", description = "更新时间")
    private String jhptUpdateTime;


    @Schema(name = "sXitongly", description = "系统来源")
    private String sXitongly;


    @Schema(name = "sRenyuanbs", description = "人员编号")
    private String sRenyuanbs;


    @Schema(name = "sYonghumc", description = "用户名称")
    private String sYonghumc;


    @Schema(name = "jhptDelete", description = "删除标识")
    private String jhptDelete;


    @Schema(name = "sFuwudbh", description = "服务编号")
    private String sFuwudbh;


    @Schema(name = "sShenfenzh", description = "身份证号")
    private String sShenfenzh;


    @Schema(name = "sKehulx", description = "客户联系")
    private String sKehulx;


    @Schema(name = "sZhanghao", description = "账号")
    private String sZhanghao;


    @Schema(name = "sDianhuahm", description = "电话")
    private String sDianhuahm;


    @Schema(name = "taskid", description = "数据日期")
    private String taskid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getsJuzhudz() {
        return sJuzhudz;
    }

    public void setsJuzhudz(String sJuzhudz) {
        this.sJuzhudz = sJuzhudz;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getsXitongly() {
        return sXitongly;
    }

    public void setsXitongly(String sXitongly) {
        this.sXitongly = sXitongly;
    }

    public String getsRenyuanbs() {
        return sRenyuanbs;
    }

    public void setsRenyuanbs(String sRenyuanbs) {
        this.sRenyuanbs = sRenyuanbs;
    }

    public String getsYonghumc() {
        return sYonghumc;
    }

    public void setsYonghumc(String sYonghumc) {
        this.sYonghumc = sYonghumc;
    }

    public String getJhptDelete() {
        return jhptDelete;
    }

    public void setJhptDelete(String jhptDelete) {
        this.jhptDelete = jhptDelete;
    }

    public String getsFuwudbh() {
        return sFuwudbh;
    }

    public void setsFuwudbh(String sFuwudbh) {
        this.sFuwudbh = sFuwudbh;
    }

    public String getsShenfenzh() {
        return sShenfenzh;
    }

    public void setsShenfenzh(String sShenfenzh) {
        this.sShenfenzh = sShenfenzh;
    }

    public String getsKehulx() {
        return sKehulx;
    }

    public void setsKehulx(String sKehulx) {
        this.sKehulx = sKehulx;
    }

    public String getsZhanghao() {
        return sZhanghao;
    }

    public void setsZhanghao(String sZhanghao) {
        this.sZhanghao = sZhanghao;
    }

    public String getsDianhuahm() {
        return sDianhuahm;
    }

    public void setsDianhuahm(String sDianhuahm) {
        this.sDianhuahm = sDianhuahm;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }
}
