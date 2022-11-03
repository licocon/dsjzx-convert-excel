package com.winchampion.model.response.fusionTranswarpGuitujuT2;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 不动产登记他项信息(融合)
 *
 * @author licocon
 */
@SuppressWarnings("SpellCheckingInspection")
@Data
public class FusionTranswarpGuitujuT2Result {

    /**
     * 主键ID
     */
    @Schema(name = "customizeId", description = "主键ID")
    private Long customizeId;

    /**
     * 批次数据id
     */
    @Schema(name = "dataBatchId", description = "批次数据id")
    private Long dataBatchId;

    /**
     * 建筑面积
     */
    @Schema(name = "buildingarea", description = "建筑面积")
    private String buildingarea;

    /**
     * 土地宗地号
     */
    @Schema(name = "lotcode", description = "土地宗地号")
    private String lotcode;

    /**
     * 债权金额
     */
    @Schema(name = "loanyuanvalue", description = "债权金额")
    private String loanyuanvalue;

    /**
     * 房屋结构
     */
    @Schema(name = "housearch", description = "房屋结构")
    private String housearch;

    /**
     * 土地用途
     */
    @Schema(name = "permitusage", description = "土地用途")
    private String permitusage;

    /**
     * 他项核准日期
     */
    @Schema(name = "passdateOther", description = "他项核准日期")
    private String passdateOther;

    /**
     * 房屋坐落
     */
    @Schema(name = "locationHouse", description = "房屋坐落")
    private String locationHouse;

    /**
     * 宗地（丘）面积
     */
    @Schema(name = "blockarea", description = "宗地（丘）面积")
    private String blockarea;

    /**
     * 其中地下建筑面积
     */
    @Schema(name = "cellarArea", description = "其中地下建筑面积")
    private String cellarArea;

    /**
     * 使用权面积
     */
    @Schema(name = "landarea", description = "使用权面积")
    private String landarea;

    /**
     * 使用期限(起始）
     */
    @Schema(name = "usabledate", description = "使用期限(起始）")
    private String usabledate;

    /**
     * 他项结束日期
     */
    @Schema(name = "planenddate", description = "他项结束日期")
    private String planenddate;

    /**
     * 总层数
     */
    @Schema(name = "totalfloors", description = "总层数")
    private String totalfloors;

    /**
     * 他项受理日期
     */
    @Schema(name = "startdateOther", description = "他项受理日期")
    private String startdateOther;

    /**
     * 他项备注
     */
    @Schema(name = "memo", description = "他项备注")
    private String memo;

    /**
     * 权利人名称
     */
    @Schema(name = "rightownername", description = "权利人名称")
    private String rightownername;

    /**
     * 房屋类型
     */
    @Schema(name = "housetype", description = "房屋类型")
    private String housetype;

    /**
     * 使用权取得方式
     */
    @Schema(name = "landsource", description = "使用权取得方式")
    private String landsource;

    /**
     * 他项证号
     */
    @Schema(name = "otherrightno", description = "他项证号")
    private String otherrightno;

    /**
     * 部位
     */
    @Schema(name = "part", description = "部位")
    private String part;

    /**
     * 户编号
     */
    @Schema(name = "houseId", description = "户编号")
    private String houseId;

    /**
     * 使用期限(终止）
     */
    @Schema(name = "enddate", description = "使用期限(终止）")
    private String enddate;

    /**
     * 他项权利类型
     */
    @Schema(name = "otherrighttypeid", description = "他项权利类型")
    private String otherrighttypeid;

    /**
     * 幢号
     */
    @Schema(name = "doornum", description = "幢号")
    private String doornum;

    /**
     * 他项房产坐落
     */
    @Schema(name = "otherrightpart", description = "他项房产坐落")
    private String otherrightpart;

    /**
     * 他项设定日期
     */
    @Schema(name = "planstartdate", description = "他项设定日期")
    private String planstartdate;

    /**
     * 区县代码
     */
    @Schema(name = "districtid", description = "区县代码")
    private String districtid;
}

