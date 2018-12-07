package com.quootta.mdate.engine.media;

import com.quootta.mdate.base.StringForJsonRequest;
import com.quootta.mdate.constant.LocalUrl;
import com.quootta.mdate.utils.LogUtil;
import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONObject;

import java.util.Map;

/**
 * Created by Ryon on 2016/6/29/0029.
 */
public class CallCountRequest extends StringForJsonRequest {
    public CallCountRequest(Map<String, String> paramsMap, Response.Listener<JSONObject> listener) {
        super(Method.POST, LocalUrl.POST_CALL_COUNT, paramsMap, listener, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                LogUtil.e("CallCountRequest", "Error:" + error.toString());
            }
        });
    }
}
