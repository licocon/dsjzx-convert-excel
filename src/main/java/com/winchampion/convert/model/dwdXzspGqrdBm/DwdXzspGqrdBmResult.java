package com.winchampion.model.response.dwdXzspGqrdBm;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdXzspGqrdBm 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_xzsp_gqrd_bm数据对象")
public class DwdXzspGqrdBmResult {
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

    @Schema(name = "id", description = "id")
    private String id;


    @Schema(name = "optime", description = "业务时间")
    private String optime;


    @Schema(name = "jhptUpdateTime", description = "更新时间")
    private String jhptUpdateTime;


    @Schema(name = "companyName", description = "企业名称")
    private String companyName;


    @Schema(name = "certificationNumber", description = "证书编号")
    private String certificationNumber;


    @Schema(name = "rdDate", description = "认定时间")
    private String rdDate;


    @Schema(name = "years", description = "有效期")
    private String years;


    @Schema(name = "orgCode", description = "统一社会信用代码")
    private String orgCode;


    @Schema(name = "dsjzxTaskid", description = "批次号")
    private String dsjzxTaskid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOptime() {
        return optime;
    }

    public void setOptime(String optime) {
        this.optime = optime;
    }

    public String getJhptUpdateTime() {
        return jhptUpdateTime;
    }

    public void setJhptUpdateTime(String jhptUpdateTime) {
        this.jhptUpdateTime = jhptUpdateTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCertificationNumber() {
        return certificationNumber;
    }

    public void setCertificationNumber(String certificationNumber) {
        this.certificationNumber = certificationNumber;
    }

    public String getRdDate() {
        return rdDate;
    }

    public void setRdDate(String rdDate) {
        this.rdDate = rdDate;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
