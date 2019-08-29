package com.devyk.android_dp_code;

import com.devyk.android_dp_code.singleton.DaoManager;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test(){
        String dao = DaoManager.getInstance().toString();
        String dao1 = DaoManager.getInstance().toString();
        String dao2 = DaoManager.getInstance().toString();
        String dao3 = DaoManager.getInstance().toString();


        System.out.println(dao);
        System.out.println(dao1);
        System.out.println(dao2);
        System.out.println(dao3);
    }
}