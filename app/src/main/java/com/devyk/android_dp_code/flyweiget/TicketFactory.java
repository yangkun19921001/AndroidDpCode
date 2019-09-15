package com.devyk.android_dp_code.flyweiget;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <pre>
 *     author  : devyk on 2019-09-15 14:54
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is TicketFactory
 * </pre>
 */
public class TicketFactory {

    static Map<String, Ticket> sTicketMap = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (sTicketMap.containsKey(key)) {
            //使用已经存在的对象
            System.out.println("使用存在的对象 = [" + from + "], to = [" + to + "]");
            return sTicketMap.get(key);
        } else {
            System.out.println("创建对象 = [" + from + "], to = [" + to + "]");
            TrainTicket trainTicket = new TrainTicket(from, to);
            sTicketMap.put(key, trainTicket);
            return trainTicket;
        }

    }
}
