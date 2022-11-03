package com.winchampion.model.response.dwdPhjrSbxx20;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdPhjrSbxx20 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_phjr_sbxx_20数据对象")
public class DwdPhjrSbxx20Result {
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


    @Schema(name = "djxh", description = "登记序号")
    private String djxh;


    @Schema(name = "nsrsbh", description = "纳税人识别号")
    private String nsrsbh;


    @Schema(name = "shxydm", description = "社会信用代码")
    private String shxydm;


    @Schema(name = "nsrmc", description = "纳税人名称")
    private String nsrmc;


    @Schema(name = "skssqq", description = "税款所属期起")
    private String skssqq;


    @Schema(name = "skssqz", description = "税款所属期止")
    private String skssqz;


    @Schema(name = "zsxmDm", description = "征收项目代码")
    private String zsxmDm;


    @Schema(name = "zsxmmc", description = "征收项目名称")
    private String zsxmmc;


    @Schema(name = "zspmDm", description = "征收品目代码")
    private String zspmDm;


    @Schema(name = "zspmmc", description = "征收品目名称")
    private String zspmmc;


    @Schema(name = "nssbrq", description = "纳税申报日期")
    private String nssbrq;


    @Schema(name = "sbqx", description = "申报期限")
    private String sbqx;


    @Schema(name = "ysx", description = "应税限")
    private String ysx;


    @Schema(name = "ynse", description = "应纳税额")
    private String ynse;


    @Schema(name = "jsyj", description = "交税应缴")
    private String jsyj;


    @Schema(name = "ybtse", description = "应退纳税额")
    private String ybtse;


    @Schema(name = "gzlxDm1", description = "更正类型代码")
    private String gzlxDm1;


    @Schema(name = "gzlxmc", description = "更正类型名称")
    private String gzlxmc;


    @Schema(name = "sjjcsj", description = "数据集成时间")
    private String sjjcsj;


    @Schema(name = "jhptUpdateTime", description = "数据更新时间")
    private String jhptUpdateTime;


    @Schema(name = "jhptDelete", description = "删除标志")
    private String jhptDelete;


    @Schema(name = "dsjzxTaskid", description = "批次号")
    private String dsjzxTaskid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDjxh() {
        return djxh;
    }

    public void setDjxh(String djxh) {
        this.djxh = djxh;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getShxydm() {
        return shxydm;
    }

    public void setShxydm(String shxydm) {
        this.shxydm = shxydm;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getSkssqq() {
        return skssqq;
    }

    public void setSkssqq(String skssqq) {
        this.skssqq = skssqq;
    }

    public String getSkssqz() {
        return skssqz;
    }

    public void setSkssqz(String skssqz) {
        this.skssqz = skssqz;
    }

    public String getZsxmDm() {
        return zsxmDm;
    }

    public void setZsxmDm(String zsxmDm) {
        this.zsxmDm = zsxmDm;
    }

    public String getZsxmmc() {
        return zsxmmc;
    }

    public void setZsxmmc(String zsxmmc) {
        this.zsxmmc = zsxmmc;
    }

    public String getZspmDm() {
        return zspmDm;
    }

    public void setZspmDm(String zspmDm) {
        this.zspmDm = zspmDm;
    }

    public String getZspmmc() {
        return zspmmc;
    }

    public void setZspmmc(String zspmmc) {
        this.zspmmc = zspmmc;
    }

    public String getNssbrq() {
        return nssbrq;
    }

    public void setNssbrq(String nssbrq) {
        this.nssbrq = nssbrq;
    }

    public String getSbqx() {
        return sbqx;
    }

    public void setSbqx(String sbqx) {
        this.sbqx = sbqx;
    }

    public String getYsx() {
        return ysx;
    }

    public void setYsx(String ysx) {
        this.ysx = ysx;
    }

    public String getYnse() {
        return ynse;
    }

    public void setYnse(String ynse) {
        this.ynse = ynse;
    }

    public String getJsyj() {
        return jsyj;
    }

    public void setJsyj(String jsyj) {
        this.jsyj = jsyj;
    }

    public String getYbtse() {
        return ybtse;
    }

    public void setYbtse(String ybtse) {
        this.ybtse = ybtse;
    }

    public String getGzlxDm1() {
        return gzlxDm1;
    }

    public void setGzlxDm1(String gzlxDm1) {
        this.gzlxDm1 = gzlxDm1;
    }

    public String getGzlxmc() {
        return gzlxmc;
    }

    public void setGzlxmc(String gzlxmc) {
        this.gzlxmc = gzlxmc;
    }

    public String getSjjcsj() {
        return sjjcsj;
    }

    public void setSjjcsj(String sjjcsj) {
        this.sjjcsj = sjjcsj;
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

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
