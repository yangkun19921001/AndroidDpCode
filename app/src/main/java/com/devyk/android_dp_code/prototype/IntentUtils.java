package com.devyk.android_dp_code.prototype;

import android.content.Intent;
import android.net.Uri;

/**
 * <pre>
 *     author  : devyk on 2019-09-03 21:40
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is IntentUtils
 * </pre>
 */
public class IntentUtils {

    public static Intent toSMS(){
        Uri uri = Uri.parse("smsto:11202");

        Intent preIntent = new Intent(Intent.ACTION_SENDTO,uri);
        preIntent.putExtra("sms_body","test");

        //clone
        return (Intent) preIntent.clone();

    }
}
