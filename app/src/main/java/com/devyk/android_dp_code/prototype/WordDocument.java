package com.devyk.android_dp_code.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author  : devyk on 2019-09-02 23:46
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is WordDocument
 * </pre>
 */
public class WordDocument implements Cloneable {

    /**
     * 文本
     */
    private String mTxt;

    /**
     * 图片名列表
     */
    private ArrayList<String> mImagePath = new ArrayList<>();


    public String getmTxt() {
        return mTxt;
    }

    public void setmTxt(String mTxt) {
        this.mTxt = mTxt;
    }

    public List<String> getImagePath() {
        return mImagePath;
    }

    public void addImagepath(String imagepath) {
        mImagePath.add(imagepath);
    }

    /**
     * 打印文档内容
     */
    public void println(){

        System.out.println("----------------  start  ----------------\n");

        System.out.println("txt: " + mTxt);
        System.out.println("mImagePath: ");
        for (String path : mImagePath) {
            System.out.println("path: " + path);
        }

        System.out.println("-----------------  end   ----------------\n");
    }

    /**
     * 声明具备 clone 能力
     * @return clone 的对象
     */
    @Override
    public WordDocument clone()  {
        try {
            WordDocument document = (WordDocument)super.clone();
            document.mTxt = this.mTxt;
            //进行深拷贝
            document.mImagePath = (ArrayList<String>) this.mImagePath.clone();
            return document;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
