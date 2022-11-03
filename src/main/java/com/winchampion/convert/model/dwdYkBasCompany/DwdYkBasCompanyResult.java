package com.winchampion.model.response.dwdYkBasCompany;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdYkBasCompany 数据对象返回类
 *
 * @author licocon
 * @since 2022-08-16
 */
@SuppressWarnings("SpellCheckingInspection")
@Schema(name = "DWD_YK_BAS_COMPANY数据对象")
public class DwdYkBasCompanyResult {
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

    @Schema(name = "companyId", description = "合作社ID")
    private String companyId;


    @Schema(name = "companyCode", description = "公司编号")
    private String companyCode;


    @Schema(name = "name", description = "名称")
    private String name;


    @Schema(name = "qu", description = "区")
    private String qu;


    @Schema(name = "shortName", description = "简称")
    private String shortName;


    @Schema(name = "addr1", description = "注册地址")
    private String addr1;


    @Schema(name = "addr2", description = "经营地址")
    private String addr2;


    @Schema(name = "areano", description = "邮编")
    private String areano;


    @Schema(name = "man1", description = "法人")
    private String man1;


    @Schema(name = "man2", description = "负责人")
    private String man2;


    @Schema(name = "type", description = "类型")
    private String type;


    @Schema(name = "buildupdate", description = "建立日期")
    private String buildupdate;


    @Schema(name = "products", description = "经营范围")
    private String products;


    @Schema(name = "iso9000", description = "无公害认证")
    private String iso9000;


    @Schema(name = "haccp", description = "有机认证")
    private String haccp;


    @Schema(name = "iso14000", description = "绿色认证")
    private String iso14000;


    @Schema(name = "obsId", description = "obs追溯id")
    private String obsId;


    @Schema(name = "ownid", description = "所有者ID")
    private String ownid;


    @Schema(name = "operaredate", description = "操作日期")
    private String operaredate;


    @Schema(name = "plotarea", description = "合作社面积")
    private String plotarea;


    @Schema(name = "investmoney", description = "注册资本")
    private String investmoney;


    @Schema(name = "remark", description = "备注")
    private String remark;


    @Schema(name = "ordId", description = "顺序")
    private Long ordId;


    @Schema(name = "creditCode", description = "信用代码")
    private String creditCode;


    @Schema(name = "transtime", description = "操作时间")
    private String transtime;


    @Schema(name = "jhptDelete", description = "交换平台删除标识")
    private String jhptDelete;


    @Schema(name = "jhptUpdateFlag", description = "交换平台更新标识")
    private String jhptUpdateFlag;


    @Schema(name = "jhptUpdateTime", description = "交换平台更新时间")
    private String jhptUpdateTime;


    @Schema(name = "dsjzxTaskid", description = "批次号")
    private String dsjzxTaskid;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getAreano() {
        return areano;
    }

    public void setAreano(String areano) {
        this.areano = areano;
    }

    public String getMan1() {
        return man1;
    }

    public void setMan1(String man1) {
        this.man1 = man1;
    }

    public String getMan2() {
        return man2;
    }

    public void setMan2(String man2) {
        this.man2 = man2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBuildupdate() {
        return buildupdate;
    }

    public void setBuildupdate(String buildupdate) {
        this.buildupdate = buildupdate;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getIso9000() {
        return iso9000;
    }

    public void setIso9000(String iso9000) {
        this.iso9000 = iso9000;
    }

    public String getHaccp() {
        return haccp;
    }

    public void setHaccp(String haccp) {
        this.haccp = haccp;
    }

    public String getIso14000() {
        return iso14000;
    }

    public void setIso14000(String iso14000) {
        this.iso14000 = iso14000;
    }

    public String getObsId() {
        return obsId;
    }

    public void setObsId(String obsId) {
        this.obsId = obsId;
    }

    public String getOwnid() {
        return ownid;
    }

    public void setOwnid(String ownid) {
        this.ownid = ownid;
    }

    public String getOperaredate() {
        return operaredate;
    }

    public void setOperaredate(String operaredate) {
        this.operaredate = operaredate;
    }

    public String getPlotarea() {
        return plotarea;
    }

    public void setPlotarea(String plotarea) {
        this.plotarea = plotarea;
    }

    public String getInvestmoney() {
        return investmoney;
    }

    public void setInvestmoney(String investmoney) {
        this.investmoney = investmoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getOrdId() {
        return ordId;
    }

    public void setOrdId(Long ordId) {
        this.ordId = ordId;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public String getTranstime() {
        return transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
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

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
