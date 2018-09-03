package me.hao0.wepay;

import me.hao0.wepay.util.Maps;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Map;

public class MapsTest {

    @Test
    public void testMapsToXml() {
        String xml = "<xml>\n" +
                "  <openid><![CDATA[sandboxopenid]]></openid>\n" +
                "  <trade_type><![CDATA[APP]]></trade_type>\n" +
                "  <cash_fee_type><![CDATA[CNY]]></cash_fee_type>\n" +
                "  <nonce_str><![CDATA[xrb16l9e4t3h81cm]]></nonce_str>\n" +
                "  <time_end><![CDATA[20180827115540]]></time_end>\n" +
                "  <err_code_des><![CDATA[SUCCESS]]></err_code_des>\n" +
                "  <return_code><![CDATA[SUCCESS]]></return_code>\n" +
                "  <mch_id><![CDATA[1511857521]]></mch_id>\n" +
                "  <settlement_total_fee><![CDATA[201]]></settlement_total_fee>\n" +
                "  <sign><![CDATA[FD7A1080BE8BDE7471CCB90D9E2EC4BD]]></sign>\n" +
                "  <cash_fee><![CDATA[201]]></cash_fee>\n" +
                "  <is_subscribe><![CDATA[Y]]></is_subscribe>\n" +
                "  <return_msg><![CDATA[OK]]></return_msg>\n" +
                "  <fee_type><![CDATA[CNY]]></fee_type>\n" +
                "  <bank_type><![CDATA[CMC]]></bank_type>\n" +
                "  <attach><![CDATA[1]]></attach>\n" +
                "  <device_info><![CDATA[sandbox]]></device_info>\n" +
                "  <out_trade_no><![CDATA[BTHWX1201808271155319772604492]]></out_trade_no>\n" +
                "  <result_code><![CDATA[SUCCESS]]></result_code>\n" +
                "  <total_fee><![CDATA[201]]></total_fee>\n" +
                "  <appid><![CDATA[wx446fba6f8b4f9c14]]></appid>\n" +
                "  <transaction_id><![CDATA[4996362522320180827115540619435]]></transaction_id>\n" +
                "  <err_code><![CDATA[SUCCESS]]></err_code>\n" +
                "</xml>";

        Map<String, Object> map = Maps.toMap(xml);
        System.out.println(map);
        assertNotNull(map);
    }

}
