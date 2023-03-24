package com.crowd.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailReturnVO {
    //回报信息主键
    private Integer returnId;

    //当前挡位需支付的金额
    private Integer supportMoney;

    //单笔限购，取值为0时为无限额，取值为正数时为具体限额
    private Integer signalPurchase;

    //具体限额数量
    private Integer purchase;

    //当前该挡位支持者的数量
    private Integer supporterCount;

    //运费，0为包邮
    private Integer freight;

    //众筹成功多少天发货
    private Integer returnDate;

    //回报内容
    private String content;
}
