package com.quootta.mdate.engine.myCenter;

import com.quootta.mdate.base.StringForJsonRequest;
import com.quootta.mdate.constant.LocalUrl;
import com.quootta.mdate.utils.LogUtil;
import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONObject;

import java.util.Map;

/**
 * Created by Ryon on 2016/5/16/0016.
 */
public class FriendsListRequest extends StringForJsonRequest {
    public FriendsListRequest(Map<String, String> paramsMap, Response.Listener<JSONObject> listener) {
        super(Method.GET, LocalUrl.GET_MY_LIKE_LIST, paramsMap, listener, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                LogUtil.d("FriendsListRequest", "Error: " + error);
            }
        });
    }
}
