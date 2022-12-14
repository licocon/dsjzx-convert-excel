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
 * ????????????????????????dto
 *
 * @author licocon
 * @since 2022/7/30 14:35
 */
@SuppressWarnings({"SpellCheckingInspection", "AlibabaLowerCamelCaseVariableNaming"})
@Data
public class EnterpriseDataResultDto {

    /**
     * ????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdCorpInfoResult> dwdCorpInfoList = new ArrayList<>();

    /**
     * ?????????????????? true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdCorpInfoExtResult> dwdCorpInfoExtList = new ArrayList<>();

    /**
     * ?????????????????? true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdCorpInfoChangeResult> dwdCorpInfoChangeList = new ArrayList<>();

    /**
     * ?????????????????? true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdCorpInfoInvestorResult> dwdCorpInfoInvestorList = new ArrayList<>();

    /**
     * ?????????????????? true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdRunExceptResult> dwdRunExceptList = new ArrayList<>();

    /**
     * ?????????????????????????????? true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdEntBlackResult> dwdEntBlackList = new ArrayList<>();


    /**
     * ??????-???????????? true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrNsxx20Result> dwdPhjrNsxx20List = new ArrayList<>();

    /**
     * ??????-???????????? tru
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrDjxx20Result> dwdPhjrDjxx20List = new ArrayList<>();

    /**
     * ??????-???????????? true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrLrxx20Result> dwdPhjrLrxx20List = new ArrayList<>();

    /**
     * ??????-?????????????????? true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrBgdjxx20Result> dwdPhjrBgdjxx20List = new ArrayList<>();

    /**
     * ??????-????????????  true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrFzxx20Result> dwdPhjrFzxx20List = new ArrayList<>();


    /**
     * ??????-??????????????? true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrTzfxx20Result> dwdPhjrTzfxx20List = new ArrayList<>();


    /**
     * ??????-??????????????????    true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrDjgsrs20Result> dwdPhjrDjgsrs20List = new ArrayList<>();


    /**
     * ??????-????????????  true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrJcxx20Result> dwdPhjrJcxx20List = new ArrayList<>();

    /**
     * ??????-??????????????????    true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrZcfzxx20Result> dwdPhjrZcfzxx20List = new ArrayList<>();

    /**
     * ??????-????????????  true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrSbxx20Result> dwdPhjrSbxx20List = new ArrayList<>();


    /**
     * ??????-????????????      true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdPhjrFpsj20Result> dwdPhjrFpsj20List = new ArrayList<>();

    /**
     * ?????????????????????  true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdTTycxQjsknsrmdQyResult> dwdTTycxQjsknsrmdQyList = new ArrayList<>();

    /**
     * ???????????????????????? true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdDjFzchrdxxResult> dwdDjFzchrdxxList = new ArrayList<>();

    /**
     * ?????????????????? true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdZwyCompPayXxbResult> dwdZwyCompPayXxbList = new ArrayList<>();

    /**
     * true
     * ??????????????????????????????????????????????????????????????????????????????????????????????????????????????? rensheju_ods.t_yrdwwaszejnshbxfjz
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdShsrlzyhshbzjTYrdwwaszejnshbxfjzResult> dwdShsrlzyhshbzjTYrdwwaszejnshbxfjzList = new ArrayList<>();


    /**
     * ?????????_???????????? true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdGjjDwjcNewResult> dwdGjjDwjcNewList = new ArrayList<>();

    /**
     * ??????????????????????????????_?????? zhujianwei_ods ????????? true
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdShszfhcxjsglwyhTFrDwbjhsjgjjResult> dwdShszfhcxjsglwyhTFrDwbjhsjgjjList = new ArrayList<>();


    /**
     * ???????????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<FusionTranswarpGuitujuT1Result> fusionTranswarpGuitujuT1List = new ArrayList<>();

    /**
     * ???????????????????????????(??????)
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<FusionTranswarpGuitujuT2Result> fusionTranswarpGuitujuT2List = new ArrayList<>();

    /**
     * ???????????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdRightRealTResult> dwdRightRealTList = new ArrayList<>();

    /**
     * ??????????????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdRightRealOwnerTResult> dwdRightRealOwnerTList = new ArrayList<>();

    /**
     * ???????????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdCurrentcerLandTResult> dwdCurrentcerLandTList = new ArrayList<>();

    /**
     * ??????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdBuildingHouseFlatInfoResult> dwdBuildingHouseFlatInfoList = new ArrayList<>();

    /**
     * ???????????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdCurrentcerHouseTResult> dwdCurrentcerHouseTList = new ArrayList<>();

    /**
     * ??????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdXzspGqrdBmResult> dwdXzspGqrdBmList = new ArrayList<>();

    /**
     * ???????????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdXzspJxrdBmResult> dwdXzspJxrdBmList = new ArrayList<>();

    /**
     * ????????????-????????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdJxrdDataResult> dwdJxrdDataList = new ArrayList<>();

    /**
     * ????????????-????????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdGqrdDataResult> dwdGqrdDataList = new ArrayList<>();

    /**
     * ???????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdTOnewinxEdiHeadResult> dwdTOnewinxEdiHeadList = new ArrayList<>();

    /**
     * ?????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdTOnewinxEdiResultResult> dwdTOnewinxEdiResultList = new ArrayList<>();


    /**
     * ????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdFmzlResult> dwdFmzlList = new ArrayList<>();

    /**
     * ??????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdFmsqResult> dwdFmsqList = new ArrayList<>();

    /**
     * ??????????????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdSyxxResult> dwdSyxxList = new ArrayList<>();

    /**
     * ??????????????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdWgzlResult> dwdWgzlList = new ArrayList<>();

    /**
     * ??????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<FusionGsjTmBaseinfoResult> fusionGsjTmBaseinfoList = new ArrayList<>();

    /**
     * ?????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdYkBasCompanyResult> dwdYkBasCompanyList = new ArrayList<>();

    /**
     * ??????????????????????????????????????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdSnwGlnybtffqkQyResult> dwdSnwGlnybtffqkQyList = new ArrayList<>();


    /**
     * ????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdTWbKgKehuxxResult> dwdTWbKgKehuxxList = new ArrayList<>();

    /**
     * ????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdTSsChaobiaoxxResult> dwdTSsChaobiaoxxList = new ArrayList<>();

    /**
     * ????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdTSsBiaokaxxResult> dwdTSsBiaokaxxList = new ArrayList<>();

    /**
     * ????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdTSsQianfeixxResult> dwdTSsQianfeixxList = new ArrayList<>();

    /**
     * ???????????????????????????????????????????????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdGdcConsLoseCreditResult> dwdGdcConsLoseCreditList = new ArrayList<>();

    /**
     * ????????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdGdcConsOweCorpResult> dwdGdcConsOweCorpList = new ArrayList<>();

    /**
     * ?????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdZwFjmkaizhangxxResult> dwdZwFjmkaizhangxxList = new ArrayList<>();

    /**
     * ????????????????????????????????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DwdZwQianfeixxResult> dwdZwQianfeixxList = new ArrayList<>();


    /**
     * ????????????????????????
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<FusionGyTabXxzxjhMszxSxbzxrResult> fusionGyTabXxzxjhMszxSxbzxrList = new ArrayList<>();


}
