package com.quootta.mdate.domain;

import java.util.List;

/**
 * Created by Ryon on 2016/3/8.
 * email:para.ryon@foxmail.com
 */
public class InviteMeList {

    public List<dates> dates;

    public static class dates {
        public String _id;
        public From from;
        public boolean has_gift;
        public String create_time;
        public String status;

        public class From {
            public String nick_name;
            public String avatar;
            public String _id;

        }
    }
}

//{
//        msg: "获取邀请列表成功",
//                data : {
//        dates:[
//        {
//            _id: "",
//                    from: {
//            _id: "",
//                    avatar: "",
//                    nick_name: "",
//        },
//            has_gift: false,
//                    create_time: 1449848722819,
//                status: "", // ["undo"，"accept", "reject", "cancel"]  ["未处理"，"已接受", "已拒绝", "已撤回"]
//        }
//        ]
//    }
//    }