package com.winchampion.model.response.dwdTSsBiaokaxx;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdTSsBiaokaxx 数据对象返回类
 * 表卡信息
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_t_ss_biaokaxx数据对象")
public class DwdTSsBiaokaxxResult {
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


    @Schema(name = "sTongxunsebs", description = "远传设备通讯厂商")
    private String sTongxunsebs;


    @Schema(name = "sXitongly", description = "S_XITONGLY")
    private String sXitongly;


    @Schema(name = "jhptUpdateTime", description = "更新时间")
    private String jhptUpdateTime;


    @Schema(name = "sYonghubw", description = "用户表位")
    private String sYonghubw;


    @Schema(name = "sCeben", description = "册本")
    private String sCeben;


    @Schema(name = "dLihu", description = "立户时间")
    private String dLihu;


    @Schema(name = "sZhanghao", description = "账号")
    private String sZhanghao;


    @Schema(name = "dsjzxTaskid", description = "数据日期")
    private String dsjzxTaskid;


    @Schema(name = "sSheshuidm", description = "涉水代码")
    private String sSheshuidm;


    @Schema(name = "sShebeih", description = "远传设备号")
    private String sShebeih;


    @Schema(name = "jhptDelete", description = "删除标识")
    private String jhptDelete;


    @Schema(name = "sShuibiaolxd", description = "水表类型大类")
    private String sShuibiaolxd;


    @Schema(name = "taskid", description = "数据日期")
    private String taskid;


    @Schema(name = "sGenghuansj", description = "远传设备更换时间")
    private String sGenghuansj;


    @Schema(name = "sShuibiaolxx", description = "水表类型小类")
    private String sShuibiaolxx;


    @Schema(name = "sSuo", description = "所")
    private String sSuo;


    @Schema(name = "dXiaohurq", description = "销户日期")
    private String dXiaohurq;


    @Schema(name = "sShuibiaocjmc", description = "水表厂家名称")
    private String sShuibiaocjmc;


    @Schema(name = "sShuibiaotxm", description = "水表条形码")
    private String sShuibiaotxm;


    @Schema(name = "dHuanbiao", description = "换表时间")
    private String dHuanbiao;


    @Schema(name = "sFuwudbh", description = "服务编号")
    private String sFuwudbh;


    @Schema(name = "sYonghum", description = "用户名称")
    private String sYonghum;


    @Schema(name = "sZongbiaocid", description = "总表账号")
    private String sZongbiaocid;


    @Schema(name = "sZidongcjbz", description = "自动采集标志")
    private String sZidongcjbz;


    @Schema(name = "iBiaokazt", description = "表卡状态")
    private String iBiaokazt;


    @Schema(name = "sYuanchuanbz", description = "远传验收标志")
    private String sYuanchuanbz;


    @Schema(name = "iKoujing", description = "水表口径")
    private String iKoujing;


    @Schema(name = "sDizhi", description = "地址")
    private String sDizhi;


    @Schema(name = "sZhandian", description = "站点")
    private String sZhandian;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getsTongxunsebs() {
        return sTongxunsebs;
    }

    public void setsTongxunsebs(String sTongxunsebs) {
        this.sTongxunsebs = sTongxunsebs;
    }

    public String getsXitongly() {
        return sXitongly;
    }

    public void setsXitongly(String sXitongly) {
        this.sXitongly = sXitongly;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getsYonghubw() {
        return sYonghubw;
    }

    public void setsYonghubw(String sYonghubw) {
        this.sYonghubw = sYonghubw;
    }

    public String getsCeben() {
        return sCeben;
    }

    public void setsCeben(String sCeben) {
        this.sCeben = sCeben;
    }

    public String getdLihu() {
        return dLihu;
    }

    public void setdLihu(String dLihu) {
        this.dLihu = dLihu;
    }

    public String getsZhanghao() {
        return sZhanghao;
    }

    public void setsZhanghao(String sZhanghao) {
        this.sZhanghao = sZhanghao;
    }

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }

    public String getsSheshuidm() {
        return sSheshuidm;
    }

    public void setsSheshuidm(String sSheshuidm) {
        this.sSheshuidm = sSheshuidm;
    }

    public String getsShebeih() {
        return sShebeih;
    }

    public void setsShebeih(String sShebeih) {
        this.sShebeih = sShebeih;
    }

    public String getJhptDelete() {
        return jhptDelete;
    }

    public void setJhptDelete(String jhptDelete) {
        this.jhptDelete = jhptDelete;
    }

    public String getsShuibiaolxd() {
        return sShuibiaolxd;
    }

    public void setsShuibiaolxd(String sShuibiaolxd) {
        this.sShuibiaolxd = sShuibiaolxd;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getsGenghuansj() {
        return sGenghuansj;
    }

    public void setsGenghuansj(String sGenghuansj) {
        this.sGenghuansj = sGenghuansj;
    }

    public String getsShuibiaolxx() {
        return sShuibiaolxx;
    }

    public void setsShuibiaolxx(String sShuibiaolxx) {
        this.sShuibiaolxx = sShuibiaolxx;
    }

    public String getsSuo() {
        return sSuo;
    }

    public void setsSuo(String sSuo) {
        this.sSuo = sSuo;
    }

    public String getdXiaohurq() {
        return dXiaohurq;
    }

    public void setdXiaohurq(String dXiaohurq) {
        this.dXiaohurq = dXiaohurq;
    }

    public String getsShuibiaocjmc() {
        return sShuibiaocjmc;
    }

    public void setsShuibiaocjmc(String sShuibiaocjmc) {
        this.sShuibiaocjmc = sShuibiaocjmc;
    }

    public String getsShuibiaotxm() {
        return sShuibiaotxm;
    }

    public void setsShuibiaotxm(String sShuibiaotxm) {
        this.sShuibiaotxm = sShuibiaotxm;
    }

    public String getdHuanbiao() {
        return dHuanbiao;
    }

    public void setdHuanbiao(String dHuanbiao) {
        this.dHuanbiao = dHuanbiao;
    }

    public String getsFuwudbh() {
        return sFuwudbh;
    }

    public void setsFuwudbh(String sFuwudbh) {
        this.sFuwudbh = sFuwudbh;
    }

    public String getsYonghum() {
        return sYonghum;
    }

    public void setsYonghum(String sYonghum) {
        this.sYonghum = sYonghum;
    }

    public String getsZongbiaocid() {
        return sZongbiaocid;
    }

    public void setsZongbiaocid(String sZongbiaocid) {
        this.sZongbiaocid = sZongbiaocid;
    }

    public String getsZidongcjbz() {
        return sZidongcjbz;
    }

    public void setsZidongcjbz(String sZidongcjbz) {
        this.sZidongcjbz = sZidongcjbz;
    }

    public String getiBiaokazt() {
        return iBiaokazt;
    }

    public void setiBiaokazt(String iBiaokazt) {
        this.iBiaokazt = iBiaokazt;
    }

    public String getsYuanchuanbz() {
        return sYuanchuanbz;
    }

    public void setsYuanchuanbz(String sYuanchuanbz) {
        this.sYuanchuanbz = sYuanchuanbz;
    }

    public String getiKoujing() {
        return iKoujing;
    }

    public void setiKoujing(String iKoujing) {
        this.iKoujing = iKoujing;
    }

    public String getsDizhi() {
        return sDizhi;
    }

    public void setsDizhi(String sDizhi) {
        this.sDizhi = sDizhi;
    }

    public String getsZhandian() {
        return sZhandian;
    }

    public void setsZhandian(String sZhandian) {
        this.sZhandian = sZhandian;
    }
}
