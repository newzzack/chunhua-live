package com.quootta.mdate.engine.invite;

import com.quootta.mdate.base.StringForJsonRequest;
import com.quootta.mdate.constant.LocalUrl;
import com.quootta.mdate.utils.LogUtil;
import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONObject;

import java.util.Map;

/**
 * Created by Ryon on 2016/3/8.
 * email:para.ryon@foxmail.com
 */
public class GiftListRequest extends StringForJsonRequest {

    public GiftListRequest(Map<String,String> giftListMap, Response.Listener<JSONObject> listener) {
        super(Method.GET, LocalUrl.GET_GIFT_LIST, giftListMap, listener, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                LogUtil.e("GiftListRequest","Error:" + error.toString());
            }
        });
    }
}
