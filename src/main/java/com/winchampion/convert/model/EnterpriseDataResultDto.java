package com.winchampion.convert.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.winchampion.convert.model.dwdCorpInfoChange.DwdCorpInfoChangeResult;
import com.winchampion.convert.model.dwdCorpInfoExt.DwdCorpInfoExtResult;
import com.winchampion.convert.model.dwdCorpInfoInvestor.DwdCorpInfoInvestorResult;
import com.winchampion.convert.model.dwdCurrentcerHouseT.DwdCurrentcerHouseTResult;
import com.winchampion.convert.model.dwdCurrentcerLandT.DwdCurrentcerLandTResult;
import com.winchampion.convert.model.dwdDjFzchrdxx.DwdDjFzchrdxxResult;
import com.winchampion.convert.model.dwdEntBlack.DwdEntBlackResult;
import com.winchampion.convert.model.dwdFmsq.DwdFmsqResult;
import com.winchampion.convert.model.dwdFmzl.DwdFmzlResult;
import com.winchampion.convert.model.dwdGdcConsLoseCredit.DwdGdcConsLoseCreditResult;
import com.winchampion.convert.model.dwdGdcConsOweCorp.DwdGdcConsOweCorpResult;
import com.winchampion.convert.model.dwdGjjDwjcNew.DwdGjjDwjcNewResult;
import com.winchampion.convert.model.dwdGqrdData.DwdGqrdDataResult;
import com.winchampion.convert.model.dwdJxrdData.DwdJxrdDataResult;
import com.winchampion.convert.model.dwdPhjrBgdjxx20.DwdPhjrBgdjxx20Result;
import com.winchampion.convert.model.dwdPhjrDjgsrs20.DwdPhjrDjgsrs20Result;
import com.winchampion.convert.model.dwdPhjrDjxx20.DwdPhjrDjxx20Result;
import com.winchampion.convert.model.dwdPhjrFpsj20.DwdPhjrFpsj20Result;
import com.winchampion.convert.model.dwdPhjrFzxx20.DwdPhjrFzxx20Result;
import com.winchampion.convert.model.dwdPhjrJcxx20.DwdPhjrJcxx20Result;
import com.winchampion.convert.model.dwdPhjrLrxx20.DwdPhjrLrxx20Result;
import com.winchampion.convert.model.dwdPhjrNsxx20.DwdPhjrNsxx20Result;
import com.winchampion.convert.model.dwdPhjrSbxx20.DwdPhjrSbxx20Result;
import com.winchampion.convert.model.dwdPhjrTzfxx20.DwdPhjrTzfxx20Result;
import com.winchampion.convert.model.dwdPhjrZcfzxx20.DwdPhjrZcfzxx20Result;
import com.winchampion.convert.model.dwdRightRealOwnerT.DwdRightRealOwnerTResult;
import com.winchampion.convert.model.dwdRightRealT.DwdRightRealTResult;
import com.winchampion.convert.model.dwdRunExcept.DwdRunExceptResult;
import com.winchampion.convert.model.dwdShsrlzyhshbzjTYrdwwaszejnshbxfjz.DwdShsrlzyhshbzjTYrdwwaszejnshbxfjzResult;
import com.winchampion.convert.model.dwdShszfhcxjsglwyhTFrDwbjhsjgjj.DwdShszfhcxjsglwyhTFrDwbjhsjgjjResult;
import com.winchampion.convert.model.dwdSnwGlnybtffqkQy.DwdSnwGlnybtffqkQyResult;
import com.winchampion.convert.model.dwdSyxx.DwdSyxxResult;
import com.winchampion.convert.model.dwdTOnewinxEdiHead.DwdTOnewinxEdiHeadResult;
import com.winchampion.convert.model.dwdTOnewinxEdiResult.DwdTOnewinxEdiResultResult;
import com.winchampion.convert.model.dwdTSsBiaokaxx.DwdTSsBiaokaxxResult;
import com.winchampion.convert.model.dwdTSsChaobiaoxx.DwdTSsChaobiaoxxResult;
import com.winchampion.convert.model.dwdTSsQianfeixx.DwdTSsQianfeixxResult;
import com.winchampion.convert.model.dwdTTycxQjsknsrmdQy.DwdTTycxQjsknsrmdQyResult;
import com.winchampion.convert.model.dwdTWbKgKehuxx.DwdTWbKgKehuxxResult;
import com.winchampion.convert.model.dwdWgzl.DwdWgzlResult;
import com.winchampion.convert.model.dwdXzspGqrdBm.DwdXzspGqrdBmResult;
import com.winchampion.convert.model.dwdXzspJxrdBm.DwdXzspJxrdBmResult;
import com.winchampion.convert.model.dwdYkBasCompany.DwdYkBasCompanyResult;
import com.winchampion.convert.model.dwdZwFjmkaizhangxx.DwdZwFjmkaizhangxxResult;
import com.winchampion.convert.model.dwdZwQianfeixx.DwdZwQianfeixxResult;
import com.winchampion.convert.model.dwdZwyCompPayXxb.DwdZwyCompPayXxbResult;
import com.winchampion.convert.model.dwdbuildinghouseflatinfo.DwdBuildingHouseFlatInfoResult;
import com.winchampion.convert.model.dwdcorpinfo.DwdCorpInfoResult;
import com.winchampion.convert.model.fusionGsjTmBaseinfo.FusionGsjTmBaseinfoResult;
import com.winchampion.convert.model.fusionGyTabXxzxjhMszxSxbzxr.FusionGyTabXxzxjhMszxSxbzxrResult;
import com.winchampion.convert.model.fusionTranswarpGuitujuT1.FusionTranswarpGuitujuT1Result;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 企业查询数据返回dto
 *
 * @author licocon
 * @since 2022/7/30 14:35
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaLowerCamelCaseVariableNaming"})
@Data
public class EnterpriseDataResultDto {

    /**
     * 登记信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdCorpInfoResult> dwdCorpInfoList = new ArrayList<>();

    /**
     * 登记信息补充 true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdCorpInfoExtResult> dwdCorpInfoExtList = new ArrayList<>();

    /**
     * 登记变更信息 true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdCorpInfoChangeResult> dwdCorpInfoChangeList = new ArrayList<>();

    /**
     * 登记信息股东 true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdCorpInfoInvestorResult> dwdCorpInfoInvestorList = new ArrayList<>();

    /**
     * 经营异常名录 true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdRunExceptResult> dwdRunExceptList = new ArrayList<>();

    /**
     * 严重违法失信企业名单 true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdEntBlackResult> dwdEntBlackList = new ArrayList<>();


    /**
     * 税务-纳税信息 true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrNsxx20Result> dwdPhjrNsxx20List = new ArrayList<>();

    /**
     * 税务-登记信息 tru
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrDjxx20Result> dwdPhjrDjxx20List = new ArrayList<>();

    /**
     * 税务-利润信息 true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrLrxx20Result> dwdPhjrLrxx20List = new ArrayList<>();

    /**
     * 税务-变更登记信息 true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrBgdjxx20Result> dwdPhjrBgdjxx20List = new ArrayList<>();

    /**
     * 税务-法制信息  true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrFzxx20Result> dwdPhjrFzxx20List = new ArrayList<>();


    /**
     * 税务-投资方信息 true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrTzfxx20Result> dwdPhjrTzfxx20List = new ArrayList<>();


    /**
     * 税务-登记个人税收    true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrDjgsrs20Result> dwdPhjrDjgsrs20List = new ArrayList<>();


    /**
     * 税务-稽查信息  true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrJcxx20Result> dwdPhjrJcxx20List = new ArrayList<>();

    /**
     * 税务-资产负债信息    true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrZcfzxx20Result> dwdPhjrZcfzxx20List = new ArrayList<>();

    /**
     * 税务-申报信息  true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrSbxx20Result> dwdPhjrSbxx20List = new ArrayList<>();


    /**
     * 税务-发票数据      true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrFpsj20Result> dwdPhjrFpsj20List = new ArrayList<>();

    /**
     * 欠税纳税人名单  true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdTTycxQjsknsrmdQyResult> dwdTTycxQjsknsrmdQyList = new ArrayList<>();

    /**
     * 非正常户认定信息 true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdDjFzchrdxxResult> dwdDjFzchrdxxList = new ArrayList<>();

    /**
     * 单位缴纳信息 true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdZwyCompPayXxbResult> dwdZwyCompPayXxbList = new ArrayList<>();

    /**
     * true
     * 用人单位未按时足额缴纳社会保险费，经责令改正逾期仍不缴纳被处以五万以上罚款 rensheju_ods.t_yrdwwaszejnshbxfjz
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdShsrlzyhshbzjTYrdwwaszejnshbxfjzResult> dwdShsrlzyhshbzjTYrdwwaszejnshbxfjzList = new ArrayList<>();


    /**
     * 公积金_单位缴存 true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdGjjDwjcNewResult> dwdGjjDwjcNewList = new ArrayList<>();

    /**
     * 单位不缴或少缴公积金_法人 zhujianwei_ods 住建委 true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdShszfhcxjsglwyhTFrDwbjhsjgjjResult> dwdShszfhcxjsglwyhTFrDwbjhsjgjjList = new ArrayList<>();


    /**
     * 不动产登记基本信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<FusionTranswarpGuitujuT1Result> fusionTranswarpGuitujuT1List = new ArrayList<>();

    /**
     * 不动产登记他项信息(融合)
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<FusionTranswarpGuitujuT2Result> fusionTranswarpGuitujuT2List = new ArrayList<>();

    /**
     * 不动产登记产权信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdRightRealTResult> dwdRightRealTList = new ArrayList<>();

    /**
     * 不动产登记产权人信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdRightRealOwnerTResult> dwdRightRealOwnerTList = new ArrayList<>();

    /**
     * 不动产登记土地信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdCurrentcerLandTResult> dwdCurrentcerLandTList = new ArrayList<>();

    /**
     * 房屋基本信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdBuildingHouseFlatInfoResult> dwdBuildingHouseFlatInfoList = new ArrayList<>();

    /**
     * 不动产登记房屋信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdCurrentcerHouseTResult> dwdCurrentcerHouseTList = new ArrayList<>();

    /**
     * 高新技术企业
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdXzspGqrdBmResult> dwdXzspGqrdBmList = new ArrayList<>();

    /**
     * 技术先进型服务企业
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdXzspJxrdBmResult> dwdXzspJxrdBmList = new ArrayList<>();

    /**
     * 行政审批-科委技先认定信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdJxrdDataResult> dwdJxrdDataList = new ArrayList<>();

    /**
     * 行政审批-科委高企认定信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdGqrdDataResult> dwdGqrdDataList = new ArrayList<>();

    /**
     * 报关单信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdTOnewinxEdiHeadResult> dwdTOnewinxEdiHeadList = new ArrayList<>();

    /**
     * 报关单回执信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdTOnewinxEdiResultResult> dwdTOnewinxEdiResultList = new ArrayList<>();


    /**
     * 发明公开
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdFmzlResult> dwdFmzlList = new ArrayList<>();

    /**
     * 发明申请信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdFmsqResult> dwdFmsqList = new ArrayList<>();

    /**
     * 授权实用新型专利信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdSyxxResult> dwdSyxxList = new ArrayList<>();

    /**
     * 授权外观设计专利信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdWgzlResult> dwdWgzlList = new ArrayList<>();

    /**
     * 商标
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<FusionGsjTmBaseinfoResult> fusionGsjTmBaseinfoList = new ArrayList<>();

    /**
     * 合作社基本信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdYkBasCompanyResult> dwdYkBasCompanyList = new ArrayList<>();

    /**
     * 各类农业补贴发放情况（企业、合作社）
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdSnwGlnybtffqkQyResult> dwdSnwGlnybtffqkQyList = new ArrayList<>();


    /**
     * 客户信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdTWbKgKehuxxResult> dwdTWbKgKehuxxList = new ArrayList<>();

    /**
     * 抄表信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdTSsChaobiaoxxResult> dwdTSsChaobiaoxxList = new ArrayList<>();

    /**
     * 表卡信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdTSsBiaokaxxResult> dwdTSsBiaokaxxList = new ArrayList<>();

    /**
     * 欠费情况
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdTSsQianfeixxResult> dwdTSsQianfeixxList = new ArrayList<>();

    /**
     * 水电煤等公共事业欠费或其他失信行为记录信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdGdcConsLoseCreditResult> dwdGdcConsLoseCreditList = new ArrayList<>();

    /**
     * 电力法人欠费信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdGdcConsOweCorpResult> dwdGdcConsOweCorpList = new ArrayList<>();

    /**
     * 非居民开账信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdZwFjmkaizhangxxResult> dwdZwFjmkaizhangxxList = new ArrayList<>();

    /**
     * 燃气居民客户和非居民客户欠费信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdZwQianfeixxResult> dwdZwQianfeixxList = new ArrayList<>();


    /**
     * 失信被执行人信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<FusionGyTabXxzxjhMszxSxbzxrResult> fusionGyTabXxzxjhMszxSxbzxrList = new ArrayList<>();


}
