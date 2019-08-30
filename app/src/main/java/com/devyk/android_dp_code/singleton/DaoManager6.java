package com.devyk.android_dp_code.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     author  : devyk on 2019-08-30 23:24
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is DaoManager6
 * </pre>
 */
public class DaoManager6 {

    /**
     * 定义一个容器
     */
    private static Map<String,Object> singletonMap = new HashMap<>();

    private DaoManager6(){}

    public static void initDao(String key,Object instance){
        if (!singletonMap.containsKey(key)){
            singletonMap.put(key,instance);
        }
    }

    public static Object getDao(String key){
        return singletonMap.get(key);
    }
}
