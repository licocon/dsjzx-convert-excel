package com.winchampion.model.response.dwdZwyZgjfqkMd;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdZwyZgjfqkMd 数据对象返回类
 *
 * @author licocon
 * @since 2022-08-16
 */
@SuppressWarnings("SpellCheckingInspection")
@Schema(name = "DWD_ZWY_ZGJFQK_MD数据对象")
public class DwdZwyZgjfqkMdResult {
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

    @Schema(name = "zjlx", description = "证件类型")
    private String zjlx;


    @Schema(name = "gjId", description = "国籍")
    private String gjId;


    @Schema(name = "zjhm", description = "证件号码")
    private String zjhm;


    @Schema(name = "xm", description = "姓名")
    private String xm;


    @Schema(name = "tyxym", description = "统一社会信用代码")
    private String tyxym;


    @Schema(name = "jndwmc", description = "缴纳单位名称")
    private String jndwmc;


    @Schema(name = "jnnd", description = "缴纳年度")
    private String jnnd;


    @Schema(name = "jnsj", description = "缴纳时间")
    private String jnsj;


    @Schema(name = "jnlx", description = "缴纳类型")
    private String jnlx;


    @Schema(name = "jfjs", description = "缴费基数")
    private String jfjs;


    @Schema(name = "mdjnje", description = "医疗金缴纳金额")
    private String mdjnje;


    @Schema(name = "ljjfys", description = "累计缴费月数")
    private String ljjfys;


    @Schema(name = "zxsjny", description = "最新缴纳年月")
    private String zxsjny;


    @Schema(name = "jhptUpdateTime", description = "更新时间戳")
    private String jhptUpdateTime;


    @Schema(name = "jhptDelete", description = "删除标志")
    private String jhptDelete;

    public String getZjlx() {
        return zjlx;
    }

    public void setZjlx(String zjlx) {
        this.zjlx = zjlx;
    }

    public String getGjId() {
        return gjId;
    }

    public void setGjId(String gjId) {
        this.gjId = gjId;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getTyxym() {
        return tyxym;
    }

    public void setTyxym(String tyxym) {
        this.tyxym = tyxym;
    }

    public String getJndwmc() {
        return jndwmc;
    }

    public void setJndwmc(String jndwmc) {
        this.jndwmc = jndwmc;
    }

    public String getJnnd() {
        return jnnd;
    }

    public void setJnnd(String jnnd) {
        this.jnnd = jnnd;
    }

    public String getJnsj() {
        return jnsj;
    }

    public void setJnsj(String jnsj) {
        this.jnsj = jnsj;
    }

    public String getJnlx() {
        return jnlx;
    }

    public void setJnlx(String jnlx) {
        this.jnlx = jnlx;
    }

    public String getJfjs() {
        return jfjs;
    }

    public void setJfjs(String jfjs) {
        this.jfjs = jfjs;
    }

    public String getMdjnje() {
        return mdjnje;
    }

    public void setMdjnje(String mdjnje) {
        this.mdjnje = mdjnje;
    }

    public String getLjjfys() {
        return ljjfys;
    }

    public void setLjjfys(String ljjfys) {
        this.ljjfys = ljjfys;
    }

    public String getZxsjny() {
        return zxsjny;
    }

    public void setZxsjny(String zxsjny) {
        this.zxsjny = zxsjny;
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
