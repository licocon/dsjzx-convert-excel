package com.winchampion.model.response.dwdShszfhcxjsglwyhTFrDwbjhsjgjj;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdShszfhcxjsglwyhTFrDwbjhsjgjj 数据对象返回类
 *
 * @author licocon
 * @since 2022-08-16
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "DWD_SHSZFHCXJSGLWYH_T_FR_DWBJHSJGJJ数据对象")
public class DwdShszfhcxjsglwyhTFrDwbjhsjgjjResult {
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

    @Schema(name = "id", description = "标识号")
    private String id;


    @Schema(name = "xdrmc", description = "相对人名称")
    private String xdrmc;


    @Schema(name = "xdrdm", description = "相对人代码")
    private String xdrdm;


    @Schema(name = "wfss", description = "违法事实")
    private String wfss;


    @Schema(name = "zcclsj", description = "作出处理时间")
    private String zcclsj;


    @Schema(name = "cljg", description = "处理结果")
    private String cljg;


    @Schema(name = "jhptUpdateTime", description = "时间戳")
    private String jhptUpdateTime;


    @Schema(name = "jhptDelete", description = "删除位")
    private String jhptDelete;


    @Schema(name = "jhptUpdateFlag", description = "标志位")
    private String jhptUpdateFlag;


    @Schema(name = "dsjzxTaskid", description = "大数据中心批次号")
    private String dsjzxTaskid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getXdrmc() {
        return xdrmc;
    }

    public void setXdrmc(String xdrmc) {
        this.xdrmc = xdrmc;
    }

    public String getXdrdm() {
        return xdrdm;
    }

    public void setXdrdm(String xdrdm) {
        this.xdrdm = xdrdm;
    }

    public String getWfss() {
        return wfss;
    }

    public void setWfss(String wfss) {
        this.wfss = wfss;
    }

    public String getZcclsj() {
        return zcclsj;
    }

    public void setZcclsj(String zcclsj) {
        this.zcclsj = zcclsj;
    }

    public String getCljg() {
        return cljg;
    }

    public void setCljg(String cljg) {
        this.cljg = cljg;
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

    public String getJhptUpdateFlag() {
        return jhptUpdateFlag;
    }

    public void setJhptUpdateFlag(String jhptUpdateFlag) {
        this.jhptUpdateFlag = jhptUpdateFlag;
    }

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
