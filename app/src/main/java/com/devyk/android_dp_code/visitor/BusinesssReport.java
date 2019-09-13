package com.devyk.android_dp_code.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author  : devyk on 2019-09-13 12:32
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is BusinesssReport 员工业务报表
 * </pre>
 */
public class BusinesssReport {

    private List<Staff> mStaff = new ArrayList<>();

    public BusinesssReport(){
        mStaff.add(new Manager("DevYK 经理"));
        mStaff.add(new Engineer("IOS 工程师"));
        mStaff.add(new Engineer("Android 工程师"));
        mStaff.add(new Engineer("Java 工程师"));
        mStaff.add(new Engineer("C++ 工程师"));
    }

    /**
     * 为访问者展示报表
     */
    public void showReport(Visitor visitor){
        for (Staff staff : mStaff) {
            staff.accept(visitor);
        }
    }
}
