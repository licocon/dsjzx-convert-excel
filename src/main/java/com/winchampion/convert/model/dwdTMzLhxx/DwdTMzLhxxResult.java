package com.winchampion.model.response.dwdTMzLhxx;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdTMzLhxx 数据对象返回类
 *
 * @author licocon
 * @since 2022-08-16
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "DWD_T_MZ_LHXX数据对象")
public class DwdTMzLhxxResult {
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

    /**
     * id
     */
    @Schema(description = "id")
    private String id;

    /**
     * rid
     */
    @Schema(description = "rid")
    private String rid;

    /**
     * 姓名
     */
    @Schema(description = "姓名")
    private String xm;

    /**
     * 证件号码
     */
    @Schema(description = "证件号码")
    private String zjhm;

    /**
     * 登记机关
     */
    @Schema(description = "登记机关")
    private String djjg;

    /**
     * 登记日期
     */
    @Schema(description = "登记日期")
    private String djrq;

    /**
     * 证书编号
     */
    @Schema(description = "证书编号")
    private String zsbh;

    /**
     * 原结婚证证号
     */
    @Schema(description = "原结婚证证号")
    private String yjhzzh;

    /**
     * 国籍代码
     */
    @Schema(description = "国籍代码")
    private String gjdm;

    /**
     * 国籍汉字
     */
    @Schema(description = "国籍汉字")
    private String gjhz;

    /**
     * 证件类型代码
     */
    @Schema(description = "证件类型代码")
    private String zjlxdm;

    /**
     * 证件类型汉字
     */
    @Schema(description = "证件类型汉字")
    private String zjlxhz;

    /**
     * 英文姓
     */
    @Schema(description = "英文姓")
    private String ywx;

    /**
     * 英文名
     */
    @Schema(description = "英文名")
    private String ywm;

    /**
     * 入库时间
     */
    @Schema(description = "入库时间")
    private String jlrksj;

    /**
     * 最新更新时间
     */
    @Schema(description = "最新更新时间")
    private String zxgxsj;

    /**
     * 数据来源代码
     */
    @Schema(description = "数据来源代码")
    private String sjlydm;

    /**
     * 数据来源汉字
     */
    @Schema(description = "数据来源汉字")
    private String sjlyhz;

    /**
     * 配偶rid
     */
    @Schema(description = "配偶rid")
    private String porid;

    /**
     * 配偶证件号码
     */
    @Schema(description = "配偶证件号码")
    private String pozjhm;

    /**
     * 配偶姓名
     */
    @Schema(description = "配偶姓名")
    private String poxm;

    /**
     * appno
     */
    @Schema(description = "appno")
    private String appno;

    /**
     * 上传日期
     */
    @Schema(description = "上传日期")
    private String scrq;

    /**
     * 批次号
     */
    @Schema(description = "批次号")
    private String taskid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public String getDjjg() {
        return djjg;
    }

    public void setDjjg(String djjg) {
        this.djjg = djjg;
    }

    public String getDjrq() {
        return djrq;
    }

    public void setDjrq(String djrq) {
        this.djrq = djrq;
    }

    public String getZsbh() {
        return zsbh;
    }

    public void setZsbh(String zsbh) {
        this.zsbh = zsbh;
    }

    public String getYjhzzh() {
        return yjhzzh;
    }

    public void setYjhzzh(String yjhzzh) {
        this.yjhzzh = yjhzzh;
    }

    public String getGjdm() {
        return gjdm;
    }

    public void setGjdm(String gjdm) {
        this.gjdm = gjdm;
    }

    public String getGjhz() {
        return gjhz;
    }

    public void setGjhz(String gjhz) {
        this.gjhz = gjhz;
    }

    public String getZjlxdm() {
        return zjlxdm;
    }

    public void setZjlxdm(String zjlxdm) {
        this.zjlxdm = zjlxdm;
    }

    public String getZjlxhz() {
        return zjlxhz;
    }

    public void setZjlxhz(String zjlxhz) {
        this.zjlxhz = zjlxhz;
    }

    public String getYwx() {
        return ywx;
    }

    public void setYwx(String ywx) {
        this.ywx = ywx;
    }

    public String getYwm() {
        return ywm;
    }

    public void setYwm(String ywm) {
        this.ywm = ywm;
    }

    public String getJlrksj() {
        return jlrksj;
    }

    public void setJlrksj(String jlrksj) {
        this.jlrksj = jlrksj;
    }

    public String getZxgxsj() {
        return zxgxsj;
    }

    public void setZxgxsj(String zxgxsj) {
        this.zxgxsj = zxgxsj;
    }

    public String getSjlydm() {
        return sjlydm;
    }

    public void setSjlydm(String sjlydm) {
        this.sjlydm = sjlydm;
    }

    public String getSjlyhz() {
        return sjlyhz;
    }

    public void setSjlyhz(String sjlyhz) {
        this.sjlyhz = sjlyhz;
    }

    public String getPorid() {
        return porid;
    }

    public void setPorid(String porid) {
        this.porid = porid;
    }

    public String getPozjhm() {
        return pozjhm;
    }

    public void setPozjhm(String pozjhm) {
        this.pozjhm = pozjhm;
    }

    public String getPoxm() {
        return poxm;
    }

    public void setPoxm(String poxm) {
        this.poxm = poxm;
    }

    public String getAppno() {
        return appno;
    }

    public void setAppno(String appno) {
        this.appno = appno;
    }

    public String getScrq() {
        return scrq;
    }

    public void setScrq(String scrq) {
        this.scrq = scrq;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }
}
