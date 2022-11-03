package com.winchampion.model.response.dwdPhjrLrxx20;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdPhjrLrxx20 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_phjr_lrxx_20数据对象")
public class DwdPhjrLrxx20Result {
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


    @Schema(name = "bbsqq", description = "报表所属期起")
    private String bbsqq;


    @Schema(name = "bbsqz", description = "报表所属期止")
    private String bbsqz;


    @Schema(name = "zbDl", description = "指标度量")
    private String zbDl;


    @Schema(name = "swjgDm", description = "税务机关")
    private String swjgDm;


    @Schema(name = "yysr", description = "营业收入")
    private String yysr;


    @Schema(name = "yycb", description = "营业成本")
    private String yycb;


    @Schema(name = "xsfy", description = "销售费用")
    private String xsfy;


    @Schema(name = "glfy", description = "管理费用")
    private String glfy;


    @Schema(name = "cwfy", description = "财务费用")
    private String cwfy;


    @Schema(name = "tzsy", description = "投资收益")
    private String tzsy;


    @Schema(name = "yylr", description = "营业利润")
    private String yylr;


    @Schema(name = "yywsr", description = "营业外收入")
    private String yywsr;


    @Schema(name = "zfbuBtsr", description = "政府补助")
    private String zfbuBtsr;


    @Schema(name = "yywzc", description = "营业外支出")
    private String yywzc;


    @Schema(name = "lrze", description = "利润总额")
    private String lrze;


    @Schema(name = "sdsfy", description = "所得税费用")
    private String sdsfy;


    @Schema(name = "jlr", description = "净利润")
    private String jlr;


    @Schema(name = "sjjcsj", description = "数据集成时间")
    private String sjjcsj;


    @Schema(name = "sbrq", description = "申报日期")
    private String sbrq;


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

    public String getBbsqq() {
        return bbsqq;
    }

    public void setBbsqq(String bbsqq) {
        this.bbsqq = bbsqq;
    }

    public String getBbsqz() {
        return bbsqz;
    }

    public void setBbsqz(String bbsqz) {
        this.bbsqz = bbsqz;
    }

    public String getZbDl() {
        return zbDl;
    }

    public void setZbDl(String zbDl) {
        this.zbDl = zbDl;
    }

    public String getSwjgDm() {
        return swjgDm;
    }

    public void setSwjgDm(String swjgDm) {
        this.swjgDm = swjgDm;
    }

    public String getYysr() {
        return yysr;
    }

    public void setYysr(String yysr) {
        this.yysr = yysr;
    }

    public String getYycb() {
        return yycb;
    }

    public void setYycb(String yycb) {
        this.yycb = yycb;
    }

    public String getXsfy() {
        return xsfy;
    }

    public void setXsfy(String xsfy) {
        this.xsfy = xsfy;
    }

    public String getGlfy() {
        return glfy;
    }

    public void setGlfy(String glfy) {
        this.glfy = glfy;
    }

    public String getCwfy() {
        return cwfy;
    }

    public void setCwfy(String cwfy) {
        this.cwfy = cwfy;
    }

    public String getTzsy() {
        return tzsy;
    }

    public void setTzsy(String tzsy) {
        this.tzsy = tzsy;
    }

    public String getYylr() {
        return yylr;
    }

    public void setYylr(String yylr) {
        this.yylr = yylr;
    }

    public String getYywsr() {
        return yywsr;
    }

    public void setYywsr(String yywsr) {
        this.yywsr = yywsr;
    }

    public String getZfbuBtsr() {
        return zfbuBtsr;
    }

    public void setZfbuBtsr(String zfbuBtsr) {
        this.zfbuBtsr = zfbuBtsr;
    }

    public String getYywzc() {
        return yywzc;
    }

    public void setYywzc(String yywzc) {
        this.yywzc = yywzc;
    }

    public String getLrze() {
        return lrze;
    }

    public void setLrze(String lrze) {
        this.lrze = lrze;
    }

    public String getSdsfy() {
        return sdsfy;
    }

    public void setSdsfy(String sdsfy) {
        this.sdsfy = sdsfy;
    }

    public String getJlr() {
        return jlr;
    }

    public void setJlr(String jlr) {
        this.jlr = jlr;
    }

    public String getSjjcsj() {
        return sjjcsj;
    }

    public void setSjjcsj(String sjjcsj) {
        this.sjjcsj = sjjcsj;
    }

    public String getSbrq() {
        return sbrq;
    }

    public void setSbrq(String sbrq) {
        this.sbrq = sbrq;
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
