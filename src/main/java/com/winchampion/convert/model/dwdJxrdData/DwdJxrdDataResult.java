package com.winchampion.model.response.dwdJxrdData;


import io.swagger.v3.oas.annotations.media.Schema;


/**
 * DwdJxrdData 数据对象返回类
 *
 * @author licocon
 * @since 2022-07-29
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaClassNamingShouldBeCamel"})
@Schema(name = "dwd_jxrd_data数据对象")
public class DwdJxrdDataResult {
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


    @Schema(name = "chinesename", description = "中文名称")
    private String chinesename;


    @Schema(name = "unicreditcode", description = "统一社会信用代码")
    private String unicreditcode;


    @Schema(name = "orgcode", description = "机构代码")
    private String orgcode;


    @Schema(name = "taxno", description = "税务登记号")
    private String taxno;


    @Schema(name = "registrtime", description = "注册类型")
    private String registrtime;


    @Schema(name = "islisted", description = "企业是否上市")
    private String islisted;


    @Schema(name = "listedcode", description = "企业上市代码")
    private String listedcode;


    @Schema(name = "emloyeeno", description = "职工人数")
    private String emloyeeno;


    @Schema(name = "manager", description = "管理人员")
    private String manager;


    @Schema(name = "researcher", description = "从事研究开发人员数")
    private String researcher;


    @Schema(name = "overseas", description = "留学归国人员数")
    private String overseas;


    @Schema(name = "junioruner", description = "大专人数")
    private String junioruner;


    @Schema(name = "bachelor", description = "本科人数")
    private String bachelor;


    @Schema(name = "master", description = "硕士人数")
    private String master;


    @Schema(name = "doctor", description = "博士人数")
    private String doctor;


    @Schema(name = "senior", description = "按技术职称高级")
    private String senior;


    @Schema(name = "middle", description = " 按技术职称中级")
    private String middle;


    @Schema(name = "primaryno", description = "按技术职称初级")
    private String primaryno;


    @Schema(name = "year", description = "年度")
    private String year;


    @Schema(name = "totalvalue", description = "总产值")
    private String totalvalue;


    @Schema(name = "totalprofit", description = "利润总额")
    private String totalprofit;


    @Schema(name = "income1", description = "去年销售收入")
    private String income1;


    @Schema(name = "income2", description = "前年销售收入")
    private String income2;


    @Schema(name = "income3", description = "大前年销售收入")
    private String income3;


    @Schema(name = "tax", description = "税金")
    private String tax;


    @Schema(name = "totalassets1", description = "去年总资产")
    private String totalassets1;


    @Schema(name = "totalassets2", description = "前年总资产")
    private String totalassets2;


    @Schema(name = "totalassets3", description = "大前年总资产")
    private String totalassets3;


    @Schema(name = "rdcodes", description = "rdcodes")
    private String rdcodes;


    @Schema(name = "registeredcapital", description = "注册资本")
    private String registeredcapital;


    @Schema(name = "fname", description = "企业法定代表人")
    private String fname;


    @Schema(name = "fmobile", description = "手机（企业法定代表人）")
    private String fmobile;


    @Schema(name = "fnumber", description = "身份证号（企业法定代表人）")
    private String fnumber;


    @Schema(name = "femail", description = "电邮（企业法定代表人）")
    private String femail;


    @Schema(name = "lname", description = "联系人")
    private String lname;


    @Schema(name = "lmobile", description = "联系人电话")
    private String lmobile;


    @Schema(name = "lemail", description = "联系人传真")
    private String lemail;


    @Schema(name = "mainproduce", description = "主营产品（服务）")
    private String mainproduce;


    @Schema(name = "technicalfield", description = "技术领域")
    private String technicalfield;


    @Schema(name = "registertype", description = "注册类型")
    private String registertype;


    @Schema(name = "taxdepartment", description = "税务主管部门")
    private String taxdepartment;


    @Schema(name = "managerper", description = "管理人员占职工总数百分比")
    private String managerper;


    @Schema(name = "juniorunerper", description = "大专占职工总数百分比")
    private String juniorunerper;


    @Schema(name = "bachelorper", description = "本科占职工总数百分比")
    private String bachelorper;


    @Schema(name = "masterper", description = "硕士占职工总数百分比")
    private String masterper;


    @Schema(name = "doctorper", description = "博士占职工总数百分比")
    private String doctorper;


    @Schema(name = "seniorper", description = "高级技术职称占职工总数百分比")
    private String seniorper;


    @Schema(name = "middleper", description = "中级技术职称占职工总数百分比")
    private String middleper;


    @Schema(name = "primaryper", description = "初级技术职称占职工总数百分比")
    private String primaryper;


    @Schema(name = "investmentoutper", description = "外方投资额占比")
    private String investmentoutper;


    @Schema(name = "submittime", description = "提交时间")
    private String submittime;


    @Schema(name = "projectname", description = "项目名称")
    private String projectname;


    @Schema(name = "companyname", description = "申报单位")
    private String companyname;


    @Schema(name = "companyaddress", description = "通信地址")
    private String companyaddress;


    @Schema(name = "status", description = "审核状态")
    private String status;


    @Schema(name = "certificatenum", description = "证书编号")
    private String certificatenum;


    @Schema(name = "jhptUpdateTime", description = "更新时间")
    private String jhptUpdateTime;


    @Schema(name = "jhptDelete", description = "删除标志")
    private String jhptDelete;


    @Schema(name = "projectid", description = "项目id")
    private String projectid;


    @Schema(name = "optime", description = "业务时间")
    private String optime;


    @Schema(name = "dsjzxTaskid", description = "批次号")
    private String dsjzxTaskid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChinesename() {
        return chinesename;
    }

    public void setChinesename(String chinesename) {
        this.chinesename = chinesename;
    }

    public String getUnicreditcode() {
        return unicreditcode;
    }

    public void setUnicreditcode(String unicreditcode) {
        this.unicreditcode = unicreditcode;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getTaxno() {
        return taxno;
    }

    public void setTaxno(String taxno) {
        this.taxno = taxno;
    }

    public String getRegistrtime() {
        return registrtime;
    }

    public void setRegistrtime(String registrtime) {
        this.registrtime = registrtime;
    }

    public String getIslisted() {
        return islisted;
    }

    public void setIslisted(String islisted) {
        this.islisted = islisted;
    }

    public String getListedcode() {
        return listedcode;
    }

    public void setListedcode(String listedcode) {
        this.listedcode = listedcode;
    }

    public String getEmloyeeno() {
        return emloyeeno;
    }

    public void setEmloyeeno(String emloyeeno) {
        this.emloyeeno = emloyeeno;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getResearcher() {
        return researcher;
    }

    public void setResearcher(String researcher) {
        this.researcher = researcher;
    }

    public String getOverseas() {
        return overseas;
    }

    public void setOverseas(String overseas) {
        this.overseas = overseas;
    }

    public String getJunioruner() {
        return junioruner;
    }

    public void setJunioruner(String junioruner) {
        this.junioruner = junioruner;
    }

    public String getBachelor() {
        return bachelor;
    }

    public void setBachelor(String bachelor) {
        this.bachelor = bachelor;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getSenior() {
        return senior;
    }

    public void setSenior(String senior) {
        this.senior = senior;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getPrimaryno() {
        return primaryno;
    }

    public void setPrimaryno(String primaryno) {
        this.primaryno = primaryno;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTotalvalue() {
        return totalvalue;
    }

    public void setTotalvalue(String totalvalue) {
        this.totalvalue = totalvalue;
    }

    public String getTotalprofit() {
        return totalprofit;
    }

    public void setTotalprofit(String totalprofit) {
        this.totalprofit = totalprofit;
    }

    public String getIncome1() {
        return income1;
    }

    public void setIncome1(String income1) {
        this.income1 = income1;
    }

    public String getIncome2() {
        return income2;
    }

    public void setIncome2(String income2) {
        this.income2 = income2;
    }

    public String getIncome3() {
        return income3;
    }

    public void setIncome3(String income3) {
        this.income3 = income3;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getTotalassets1() {
        return totalassets1;
    }

    public void setTotalassets1(String totalassets1) {
        this.totalassets1 = totalassets1;
    }

    public String getTotalassets2() {
        return totalassets2;
    }

    public void setTotalassets2(String totalassets2) {
        this.totalassets2 = totalassets2;
    }

    public String getTotalassets3() {
        return totalassets3;
    }

    public void setTotalassets3(String totalassets3) {
        this.totalassets3 = totalassets3;
    }

    public String getRdcodes() {
        return rdcodes;
    }

    public void setRdcodes(String rdcodes) {
        this.rdcodes = rdcodes;
    }

    public String getRegisteredcapital() {
        return registeredcapital;
    }

    public void setRegisteredcapital(String registeredcapital) {
        this.registeredcapital = registeredcapital;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFmobile() {
        return fmobile;
    }

    public void setFmobile(String fmobile) {
        this.fmobile = fmobile;
    }

    public String getFnumber() {
        return fnumber;
    }

    public void setFnumber(String fnumber) {
        this.fnumber = fnumber;
    }

    public String getFemail() {
        return femail;
    }

    public void setFemail(String femail) {
        this.femail = femail;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLmobile() {
        return lmobile;
    }

    public void setLmobile(String lmobile) {
        this.lmobile = lmobile;
    }

    public String getLemail() {
        return lemail;
    }

    public void setLemail(String lemail) {
        this.lemail = lemail;
    }

    public String getMainproduce() {
        return mainproduce;
    }

    public void setMainproduce(String mainproduce) {
        this.mainproduce = mainproduce;
    }

    public String getTechnicalfield() {
        return technicalfield;
    }

    public void setTechnicalfield(String technicalfield) {
        this.technicalfield = technicalfield;
    }

    public String getRegistertype() {
        return registertype;
    }

    public void setRegistertype(String registertype) {
        this.registertype = registertype;
    }

    public String getTaxdepartment() {
        return taxdepartment;
    }

    public void setTaxdepartment(String taxdepartment) {
        this.taxdepartment = taxdepartment;
    }

    public String getManagerper() {
        return managerper;
    }

    public void setManagerper(String managerper) {
        this.managerper = managerper;
    }

    public String getJuniorunerper() {
        return juniorunerper;
    }

    public void setJuniorunerper(String juniorunerper) {
        this.juniorunerper = juniorunerper;
    }

    public String getBachelorper() {
        return bachelorper;
    }

    public void setBachelorper(String bachelorper) {
        this.bachelorper = bachelorper;
    }

    public String getMasterper() {
        return masterper;
    }

    public void setMasterper(String masterper) {
        this.masterper = masterper;
    }

    public String getDoctorper() {
        return doctorper;
    }

    public void setDoctorper(String doctorper) {
        this.doctorper = doctorper;
    }

    public String getSeniorper() {
        return seniorper;
    }

    public void setSeniorper(String seniorper) {
        this.seniorper = seniorper;
    }

    public String getMiddleper() {
        return middleper;
    }

    public void setMiddleper(String middleper) {
        this.middleper = middleper;
    }

    public String getPrimaryper() {
        return primaryper;
    }

    public void setPrimaryper(String primaryper) {
        this.primaryper = primaryper;
    }

    public String getInvestmentoutper() {
        return investmentoutper;
    }

    public void setInvestmentoutper(String investmentoutper) {
        this.investmentoutper = investmentoutper;
    }

    public String getSubmittime() {
        return submittime;
    }

    public void setSubmittime(String submittime) {
        this.submittime = submittime;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getCompanyaddress() {
        return companyaddress;
    }

    public void setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCertificatenum() {
        return certificatenum;
    }

    public void setCertificatenum(String certificatenum) {
        this.certificatenum = certificatenum;
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

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public String getOptime() {
        return optime;
    }

    public void setOptime(String optime) {
        this.optime = optime;
    }

    public String getDsjzxTaskid() {
        return dsjzxTaskid;
    }

    public void setDsjzxTaskid(String dsjzxTaskid) {
        this.dsjzxTaskid = dsjzxTaskid;
    }
}
