package com.quootta.mdate.engine.chat;

import com.quootta.mdate.base.StringForJsonRequest;
import com.quootta.mdate.constant.LocalUrl;
import com.quootta.mdate.utils.LogUtil;
import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONObject;

import java.util.Map;

public class MyInviteListRequest extends StringForJsonRequest {
    public MyInviteListRequest(Map<String, String> paramsMap, Response.Listener<JSONObject> listener) {
        super(Method.GET, LocalUrl.GET_INVITE_FROM_ME, paramsMap, listener, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                LogUtil.e("MyInviteListRequest","Error:"+error);
            }
        });
    }
}
