package me.hao0.wepay.demo.controller;

import me.hao0.wepay.demo.support.WepaySupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 支付订单查询
 * Author: DanRui
 * Email: 1101718534@qq.com
 * Date: 2018/08/26
 */
@Controller
@RequestMapping("/querys/")
public class Querys {

    private static final Logger log = LoggerFactory.getLogger(Pays.class);

    @Autowired
    private WepaySupport wepaySupport;

    /**
     * 通过商户订单号查询支付结果
     * @param orderNumber 商户订单号
     */
    @RequestMapping(value = "/outtradeno")
    public void outTradeNo(
            @RequestParam("orderNumber") String orderNumber,
            HttpServletResponse response){
        try {
            wepaySupport.queryOrderByOutTradeNo(orderNumber);
        } catch (Exception e) {
            log.error("failed to query order by out trade no(orderNumber={}), cause: {}",
                    orderNumber, e.getMessage());
        }
    }
}
