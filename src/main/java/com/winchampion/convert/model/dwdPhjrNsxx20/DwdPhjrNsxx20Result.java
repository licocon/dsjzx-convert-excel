package com.winchampion.model.response.dwdPhjrNsxx20;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdPhjrNsxx20 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_phjr_nsxx_20数据对象")
public class DwdPhjrNsxx20Result {
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


    @Schema(name = "ybtse", description = "应补退税额")
    private String ybtse;


    @Schema(name = "yjse", description = "应交金额")
    private String yjse;


    @Schema(name = "jkqx", description = "交款期限")
    private String jkqx;


    @Schema(name = "yzfsrq", description = "应交款日期")
    private String yzfsrq;


    @Schema(name = "rkrq", description = "入库日期")
    private String rkrq;


    @Schema(name = "tzlxDm", description = "调帐类型代码")
    private String tzlxDm;


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

    public String getYbtse() {
        return ybtse;
    }

    public void setYbtse(String ybtse) {
        this.ybtse = ybtse;
    }

    public String getYjse() {
        return yjse;
    }

    public void setYjse(String yjse) {
        this.yjse = yjse;
    }

    public String getJkqx() {
        return jkqx;
    }

    public void setJkqx(String jkqx) {
        this.jkqx = jkqx;
    }

    public String getYzfsrq() {
        return yzfsrq;
    }

    public void setYzfsrq(String yzfsrq) {
        this.yzfsrq = yzfsrq;
    }

    public String getRkrq() {
        return rkrq;
    }

    public void setRkrq(String rkrq) {
        this.rkrq = rkrq;
    }

    public String getTzlxDm() {
        return tzlxDm;
    }

    public void setTzlxDm(String tzlxDm) {
        this.tzlxDm = tzlxDm;
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
