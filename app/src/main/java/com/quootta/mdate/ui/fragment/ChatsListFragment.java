package com.quootta.mdate.ui.fragment;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.quootta.mdate.R;
import com.quootta.mdate.base.BaseFragment;
import com.quootta.mdate.domain.SystemMessageList;
import com.quootta.mdate.engine.myCenter.SysMessageRequest;
import com.quootta.mdate.myListener.VolleyListener;
import com.quootta.mdate.utils.GsonUtil;
import com.quootta.mdate.utils.LogUtil;
import com.quootta.mdate.utils.ToastUtil;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import butterknife.Bind;
import io.rong.imlib.model.Conversation;

/**
 * Created by Ryon on 2016/2/18.
 */
public class ChatsListFragment extends BaseFragment {
    @Bind(R.id.tv_title_bar)
    TextView tvTitle;

    @Bind(R.id.iv_back_title_bar)
    ImageView ivBack;


    @Override
    protected int getRootView() {
        return R.layout.fragment_chats_list;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void initData(View view) {
        initChatList();
        tvTitle.setText(R.string.chats);
        ivBack.setVisibility(View.GONE);
    }

    private void initChatList() {
        MyConversationListFragment fragment = (MyConversationListFragment) getChildFragmentManager().findFragmentById(R.id.fm_chat_list_fragment);

        Uri uri = Uri.parse("rong://" + getActivity().getApplicationInfo().packageName).buildUpon()
                .appendPath("conversationlist")
                .appendQueryParameter(Conversation.ConversationType.PRIVATE.getName(), "false") //设置私聊会话是否聚合显示
                .appendQueryParameter(Conversation.ConversationType.GROUP.getName(), "false")//群组
                .appendQueryParameter(Conversation.ConversationType.DISCUSSION.getName(), "false")//讨论组
                .appendQueryParameter(Conversation.ConversationType.PUBLIC_SERVICE.getName(), "false")//公共服务号
                .appendQueryParameter(Conversation.ConversationType.APP_PUBLIC_SERVICE.getName(), "false")//公共服务号
                .appendQueryParameter(Conversation.ConversationType.SYSTEM.getName(), "false")//系统
                .build();

        fragment.setUri(uri);
        fragment.onRestoreUI();
    }

    @Override
    protected void setListener() {

    }
}
