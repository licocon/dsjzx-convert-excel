package com.winchampion.model.response.dwdWgzl;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdWgzl 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_wgzl数据对象")
public class DwdWgzlResult {
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

    @Schema(name = "id", description = "事项主键")
    private String id;


    @Schema(name = "pnum", description = "专利号")
    private String pnum;


    @Schema(name = "pn", description = "公开号")
    private String pn;


    @Schema(name = "pd", description = "公告日")
    private String pd;


    @Schema(name = "ad", description = "申请日")
    private String ad;


    @Schema(name = "au", description = "发明人")
    private String au;


    @Schema(name = "pa", description = "申请人")
    private String pa;


    @Schema(name = "ic1", description = "主分类号")
    private String ic1;


    @Schema(name = "ic2", description = "分类号")
    private String ic2;


    @Schema(name = "ti", description = "名称")
    private String ti;


    @Schema(name = "ab", description = "文摘")
    private String ab;


    @Schema(name = "country", description = "省市")
    private String country;


    @Schema(name = "addr", description = "地址")
    private String addr;


    @Schema(name = "pType", description = "专利类型")
    private String pType;


    @Schema(name = "agent", description = "代理人")
    private String agent;


    @Schema(name = "agentc", description = "代理机构")
    private String agentc;


    @Schema(name = "jhptUpdateTime", description = "时间戳")
    private String jhptUpdateTime;


    @Schema(name = "jhptUpdateFlag", description = "标志位")
    private String jhptUpdateFlag;


    @Schema(name = "jhptDelete", description = "删除标")
    private String jhptDelete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPnum() {
        return pnum;
    }

    public void setPnum(String pnum) {
        this.pnum = pnum;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getPd() {
        return pd;
    }

    public void setPd(String pd) {
        this.pd = pd;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAu() {
        return au;
    }

    public void setAu(String au) {
        this.au = au;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    public String getIc1() {
        return ic1;
    }

    public void setIc1(String ic1) {
        this.ic1 = ic1;
    }

    public String getIc2() {
        return ic2;
    }

    public void setIc2(String ic2) {
        this.ic2 = ic2;
    }

    public String getTi() {
        return ti;
    }

    public void setTi(String ti) {
        this.ti = ti;
    }

    public String getAb() {
        return ab;
    }

    public void setAb(String ab) {
        this.ab = ab;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getAgentc() {
        return agentc;
    }

    public void setAgentc(String agentc) {
        this.agentc = agentc;
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

    public String getJhptDelete() {
        return jhptDelete;
    }

    public void setJhptDelete(String jhptDelete) {
        this.jhptDelete = jhptDelete;
    }
}
