package com.winchampion.model.response.dwdPhjrDjxx20;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdPhjrDjxx20 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_phjr_djxx_20数据对象")
public class DwdPhjrDjxx20Result {
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


    @Schema(name = "shxydm", description = "社会信用代码")
    private String shxydm;


    @Schema(name = "nsrmc", description = "纳税人名称")
    private String nsrmc;


    @Schema(name = "djzclxDm", description = "登记注册类型代码")
    private String djzclxDm;


    @Schema(name = "djzclxmc", description = "登记注册类型名称")
    private String djzclxmc;


    @Schema(name = "hyDm", description = "行业代码")
    private String hyDm;


    @Schema(name = "hymc", description = "行业名称")
    private String hymc;


    @Schema(name = "djrq", description = "登记日期")
    private String djrq;


    @Schema(name = "zcdz", description = "注册地址")
    private String zcdz;


    @Schema(name = "scjydz", description = "经营地址")
    private String scjydz;


    @Schema(name = "nsrztDm", description = "纳税人状态代码")
    private String nsrztDm;


    @Schema(name = "nsrztmc", description = "纳税人状态名称")
    private String nsrztmc;


    @Schema(name = "swjgDm", description = "税务机关代码")
    private String swjgDm;


    @Schema(name = "swjgmc", description = "税务机关名称")
    private String swjgmc;


    @Schema(name = "fddbrxm", description = "法定代表人姓名")
    private String fddbrxm;


    @Schema(name = "fddbrsfzjlxId", description = "法定代表人身份证类型ID")
    private String fddbrsfzjlxId;


    @Schema(name = "frsfzjlxmc", description = "法定代表人身份证件类型名称")
    private String frsfzjlxmc;


    @Schema(name = "fddbrsfzjhm", description = "法定代表人身份证件号码")
    private String fddbrsfzjhm;


    @Schema(name = "fddbrgddh", description = "法定代表人固定电话")
    private String fddbrgddh;


    @Schema(name = "fddbryddh", description = "法定代表人移动电话")
    private String fddbryddh;


    @Schema(name = "cwfzrxm", description = "财务负责人姓名")
    private String cwfzrxm;


    @Schema(name = "cwfzrsfzjlxId", description = "财务负责人证件类型ID")
    private String cwfzrsfzjlxId;


    @Schema(name = "cwsfzjlxmc", description = "财务身份证类型名称")
    private String cwsfzjlxmc;


    @Schema(name = "cwfzrsfzjhm", description = "财务负责人身份证件号码")
    private String cwfzrsfzjhm;


    @Schema(name = "cwfzrgddh", description = "财务负责人固定电话")
    private String cwfzrgddh;


    @Schema(name = "cwfzryddh", description = "财务负责人移动电话")
    private String cwfzryddh;


    @Schema(name = "sjjcsj", description = "数据集成时间")
    private String sjjcsj;


    @Schema(name = "zzjgdm", description = "组织机构代码")
    private String zzjgdm;


    @Schema(name = "cyrs", description = "从业人员")
    private String cyrs;


    @Schema(name = "jyfw", description = "经营范围")
    private String jyfw;


    @Schema(name = "zzsnsrlx", description = "增值税纳税类型")
    private String zzsnsrlx;


    @Schema(name = "nsxydj", description = "纳税信用等级")
    private String nsxydj;


    @Schema(name = "pjSj", description = "纳税信用评价时间")
    private String pjSj;


    @Schema(name = "zzsnsrlxDm", description = "增值税纳税类型代码")
    private String zzsnsrlxDm;


    @Schema(name = "zzsnsrbz", description = "增值税纳税人类型")
    private String zzsnsrbz;


    @Schema(name = "zczb", description = "注册资本")
    private String zczb;


    @Schema(name = "hbmc", description = "货币名称")
    private String hbmc;


    @Schema(name = "kjzdzzId", description = "适用会计制度代码")
    private String kjzdzzId;


    @Schema(name = "kjzdzzmc", description = "适用会计制度名称")
    private String kjzdzzmc;


    @Schema(name = "qygmDm", description = "企业规模代码")
    private String qygmDm;


    @Schema(name = "qygmmc", description = "企业规模")
    private String qygmmc;


    @Schema(name = "nsrsbh", description = "纳税人识别号")
    private String nsrsbh;


    @Schema(name = "jhptUpdateTime", description = "数据更新时间")
    private String jhptUpdateTime;


    @Schema(name = "jhptDelete", description = "删除标志")
    private String jhptDelete;


    @Schema(name = "dsjzxTaskid", description = "批次")
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

    public String getDjzclxDm() {
        return djzclxDm;
    }

    public void setDjzclxDm(String djzclxDm) {
        this.djzclxDm = djzclxDm;
    }

    public String getDjzclxmc() {
        return djzclxmc;
    }

    public void setDjzclxmc(String djzclxmc) {
        this.djzclxmc = djzclxmc;
    }

    public String getHyDm() {
        return hyDm;
    }

    public void setHyDm(String hyDm) {
        this.hyDm = hyDm;
    }

    public String getHymc() {
        return hymc;
    }

    public void setHymc(String hymc) {
        this.hymc = hymc;
    }

    public String getDjrq() {
        return djrq;
    }

    public void setDjrq(String djrq) {
        this.djrq = djrq;
    }

    public String getZcdz() {
        return zcdz;
    }

    public void setZcdz(String zcdz) {
        this.zcdz = zcdz;
    }

    public String getScjydz() {
        return scjydz;
    }

    public void setScjydz(String scjydz) {
        this.scjydz = scjydz;
    }

    public String getNsrztDm() {
        return nsrztDm;
    }

    public void setNsrztDm(String nsrztDm) {
        this.nsrztDm = nsrztDm;
    }

    public String getNsrztmc() {
        return nsrztmc;
    }

    public void setNsrztmc(String nsrztmc) {
        this.nsrztmc = nsrztmc;
    }

    public String getSwjgDm() {
        return swjgDm;
    }

    public void setSwjgDm(String swjgDm) {
        this.swjgDm = swjgDm;
    }

    public String getSwjgmc() {
        return swjgmc;
    }

    public void setSwjgmc(String swjgmc) {
        this.swjgmc = swjgmc;
    }

    public String getFddbrxm() {
        return fddbrxm;
    }

    public void setFddbrxm(String fddbrxm) {
        this.fddbrxm = fddbrxm;
    }

    public String getFddbrsfzjlxId() {
        return fddbrsfzjlxId;
    }

    public void setFddbrsfzjlxId(String fddbrsfzjlxId) {
        this.fddbrsfzjlxId = fddbrsfzjlxId;
    }

    public String getFrsfzjlxmc() {
        return frsfzjlxmc;
    }

    public void setFrsfzjlxmc(String frsfzjlxmc) {
        this.frsfzjlxmc = frsfzjlxmc;
    }

    public String getFddbrsfzjhm() {
        return fddbrsfzjhm;
    }

    public void setFddbrsfzjhm(String fddbrsfzjhm) {
        this.fddbrsfzjhm = fddbrsfzjhm;
    }

    public String getFddbrgddh() {
        return fddbrgddh;
    }

    public void setFddbrgddh(String fddbrgddh) {
        this.fddbrgddh = fddbrgddh;
    }

    public String getFddbryddh() {
        return fddbryddh;
    }

    public void setFddbryddh(String fddbryddh) {
        this.fddbryddh = fddbryddh;
    }

    public String getCwfzrxm() {
        return cwfzrxm;
    }

    public void setCwfzrxm(String cwfzrxm) {
        this.cwfzrxm = cwfzrxm;
    }

    public String getCwfzrsfzjlxId() {
        return cwfzrsfzjlxId;
    }

    public void setCwfzrsfzjlxId(String cwfzrsfzjlxId) {
        this.cwfzrsfzjlxId = cwfzrsfzjlxId;
    }

    public String getCwsfzjlxmc() {
        return cwsfzjlxmc;
    }

    public void setCwsfzjlxmc(String cwsfzjlxmc) {
        this.cwsfzjlxmc = cwsfzjlxmc;
    }

    public String getCwfzrsfzjhm() {
        return cwfzrsfzjhm;
    }

    public void setCwfzrsfzjhm(String cwfzrsfzjhm) {
        this.cwfzrsfzjhm = cwfzrsfzjhm;
    }

    public String getCwfzrgddh() {
        return cwfzrgddh;
    }

    public void setCwfzrgddh(String cwfzrgddh) {
        this.cwfzrgddh = cwfzrgddh;
    }

    public String getCwfzryddh() {
        return cwfzryddh;
    }

    public void setCwfzryddh(String cwfzryddh) {
        this.cwfzryddh = cwfzryddh;
    }

    public String getSjjcsj() {
        return sjjcsj;
    }

    public void setSjjcsj(String sjjcsj) {
        this.sjjcsj = sjjcsj;
    }

    public String getZzjgdm() {
        return zzjgdm;
    }

    public void setZzjgdm(String zzjgdm) {
        this.zzjgdm = zzjgdm;
    }

    public String getCyrs() {
        return cyrs;
    }

    public void setCyrs(String cyrs) {
        this.cyrs = cyrs;
    }

    public String getJyfw() {
        return jyfw;
    }

    public void setJyfw(String jyfw) {
        this.jyfw = jyfw;
    }

    public String getZzsnsrlx() {
        return zzsnsrlx;
    }

    public void setZzsnsrlx(String zzsnsrlx) {
        this.zzsnsrlx = zzsnsrlx;
    }

    public String getNsxydj() {
        return nsxydj;
    }

    public void setNsxydj(String nsxydj) {
        this.nsxydj = nsxydj;
    }

    public String getPjSj() {
        return pjSj;
    }

    public void setPjSj(String pjSj) {
        this.pjSj = pjSj;
    }

    public String getZzsnsrlxDm() {
        return zzsnsrlxDm;
    }

    public void setZzsnsrlxDm(String zzsnsrlxDm) {
        this.zzsnsrlxDm = zzsnsrlxDm;
    }

    public String getZzsnsrbz() {
        return zzsnsrbz;
    }

    public void setZzsnsrbz(String zzsnsrbz) {
        this.zzsnsrbz = zzsnsrbz;
    }

    public String getZczb() {
        return zczb;
    }

    public void setZczb(String zczb) {
        this.zczb = zczb;
    }

    public String getHbmc() {
        return hbmc;
    }

    public void setHbmc(String hbmc) {
        this.hbmc = hbmc;
    }

    public String getKjzdzzId() {
        return kjzdzzId;
    }

    public void setKjzdzzId(String kjzdzzId) {
        this.kjzdzzId = kjzdzzId;
    }

    public String getKjzdzzmc() {
        return kjzdzzmc;
    }

    public void setKjzdzzmc(String kjzdzzmc) {
        this.kjzdzzmc = kjzdzzmc;
    }

    public String getQygmDm() {
        return qygmDm;
    }

    public void setQygmDm(String qygmDm) {
        this.qygmDm = qygmDm;
    }

    public String getQygmmc() {
        return qygmmc;
    }

    public void setQygmmc(String qygmmc) {
        this.qygmmc = qygmmc;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
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
