package me.hao0.wepay.model.pay;

import java.io.Serializable;

/**
 * 获取沙箱密钥响应对象
 * Author: DanRui
 * Email: 1101718534@qq.com
 * Date: 2018/08/25
 */
public class GetSignKeyResponse implements Serializable {

    private static final long serialVersionUID = 2540820967097836895L;

    /**
     * 微信APPID
     */
    private String appId;

    /**
     * 商户Id
     */
    private String mchId;

    /**
     * 签名
     */
    private String sandboxSignkey;

    public GetSignKeyResponse(String appId, String mchId, String sandboxSignkey) {
        this.appId = appId;
        this.mchId = mchId;
        this.sandboxSignkey = sandboxSignkey;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getSandboxSignkey() {
        return sandboxSignkey;
    }

    public void setSandboxSignkey(String sandboxSignkey) {
        this.sandboxSignkey = sandboxSignkey;
    }

    @Override
    public String toString() {
        return "AppPayResponse{" +
                "appId='" + appId + '\'' +
                ", mchId='" + mchId + '\'' +
                ", sandboxSignkey='" + sandboxSignkey + '\'' +
                '}';
    }
}
