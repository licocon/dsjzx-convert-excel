package com.winchampion.model.response.dwdPhjrTzfxx20;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdPhjrTzfxx20 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_phjr_tzfxx_20数据对象")
public class DwdPhjrTzfxx20Result {
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


    @Schema(name = "tzfhhhrmc", description = "投资方名称")
    private String tzfhhhrmc;


    @Schema(name = "tzfjjxzDm", description = "投资方经济性质代码")
    private String tzfjjxzDm;


    @Schema(name = "tzfjjxz", description = "投资方经济性质")
    private String tzfjjxz;


    @Schema(name = "tzfhhhrzjzlDm", description = "投资方证件代码")
    private String tzfhhhrzjzlDm;


    @Schema(name = "tzfhhhrzjhm", description = "投资方证件号码")
    private String tzfhhhrzjhm;


    @Schema(name = "tzbl", description = "投资比例")
    private String tzbl;


    @Schema(name = "sjjcsj", description = "数据集成时间")
    private String sjjcsj;


    @Schema(name = "tzfhhhrzjzlmc", description = "投资方证件类型名称")
    private String tzfhhhrzjzlmc;


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

    public String getShxydm() {
        return shxydm;
    }

    public void setShxydm(String shxydm) {
        this.shxydm = shxydm;
    }

    public String getTzfhhhrmc() {
        return tzfhhhrmc;
    }

    public void setTzfhhhrmc(String tzfhhhrmc) {
        this.tzfhhhrmc = tzfhhhrmc;
    }

    public String getTzfjjxzDm() {
        return tzfjjxzDm;
    }

    public void setTzfjjxzDm(String tzfjjxzDm) {
        this.tzfjjxzDm = tzfjjxzDm;
    }

    public String getTzfjjxz() {
        return tzfjjxz;
    }

    public void setTzfjjxz(String tzfjjxz) {
        this.tzfjjxz = tzfjjxz;
    }

    public String getTzfhhhrzjzlDm() {
        return tzfhhhrzjzlDm;
    }

    public void setTzfhhhrzjzlDm(String tzfhhhrzjzlDm) {
        this.tzfhhhrzjzlDm = tzfhhhrzjzlDm;
    }

    public String getTzfhhhrzjhm() {
        return tzfhhhrzjhm;
    }

    public void setTzfhhhrzjhm(String tzfhhhrzjhm) {
        this.tzfhhhrzjhm = tzfhhhrzjhm;
    }

    public String getTzbl() {
        return tzbl;
    }

    public void setTzbl(String tzbl) {
        this.tzbl = tzbl;
    }

    public String getSjjcsj() {
        return sjjcsj;
    }

    public void setSjjcsj(String sjjcsj) {
        this.sjjcsj = sjjcsj;
    }

    public String getTzfhhhrzjzlmc() {
        return tzfhhhrzjzlmc;
    }

    public void setTzfhhhrzjzlmc(String tzfhhhrzjzlmc) {
        this.tzfhhhrzjzlmc = tzfhhhrzjzlmc;
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
