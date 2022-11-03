package com.winchampion.model.response.dwdTSsQianfeixx;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdTSsQianfeixx 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_t_ss_qianfeixx数据对象")
public class DwdTSsQianfeixxResult {
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


    @Schema(name = "nWeiyueje", description = "违约金额")
    private String nWeiyueje;


    @Schema(name = "sFuwudbh", description = "服务点编号")
    private String sFuwudbh;


    @Schema(name = "nPaishuifzje", description = "排水总费用")
    private String nPaishuifzje;


    @Schema(name = "nQianfeizje", description = "欠费总金额")
    private String nQianfeizje;


    @Schema(name = "taskid", description = "数据日期")
    private String taskid;


    @Schema(name = "nShuifeizje", description = "水费总金额")
    private String nShuifeizje;


    @Schema(name = "sXitongly", description = "系统来源")
    private String sXitongly;


    @Schema(name = "sZhanghao", description = "账号")
    private String sZhanghao;


    @Schema(name = "sYongshuidz", description = "用水地址")
    private String sYongshuidz;


    @Schema(name = "jhptUpdateTime", description = "更新时间")
    private String jhptUpdateTime;


    @Schema(name = "jhptDelete", description = "删除标识")
    private String jhptDelete;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getnWeiyueje() {
        return nWeiyueje;
    }

    public void setnWeiyueje(String nWeiyueje) {
        this.nWeiyueje = nWeiyueje;
    }

    public String getsFuwudbh() {
        return sFuwudbh;
    }

    public void setsFuwudbh(String sFuwudbh) {
        this.sFuwudbh = sFuwudbh;
    }

    public String getnPaishuifzje() {
        return nPaishuifzje;
    }

    public void setnPaishuifzje(String nPaishuifzje) {
        this.nPaishuifzje = nPaishuifzje;
    }

    public String getnQianfeizje() {
        return nQianfeizje;
    }

    public void setnQianfeizje(String nQianfeizje) {
        this.nQianfeizje = nQianfeizje;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getnShuifeizje() {
        return nShuifeizje;
    }

    public void setnShuifeizje(String nShuifeizje) {
        this.nShuifeizje = nShuifeizje;
    }

    public String getsXitongly() {
        return sXitongly;
    }

    public void setsXitongly(String sXitongly) {
        this.sXitongly = sXitongly;
    }

    public String getsZhanghao() {
        return sZhanghao;
    }

    public void setsZhanghao(String sZhanghao) {
        this.sZhanghao = sZhanghao;
    }

    public String getsYongshuidz() {
        return sYongshuidz;
    }

    public void setsYongshuidz(String sYongshuidz) {
        this.sYongshuidz = sYongshuidz;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getJhptDelete() {
        return jhptDelete;
    }

    public void setJhptDelete(String jhptDelete) {
        this.jhptDelete = jhptDelete;
    }
}
