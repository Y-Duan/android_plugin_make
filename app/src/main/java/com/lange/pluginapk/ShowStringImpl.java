package com.lange.pluginapk;

import com.lange.jnimake.Testjni;
import com.lange.pluginlib.IShowString;

/**
 * 插件的实现
 * Created by lange on 2018/5/17.
 */

public class ShowStringImpl implements IShowString {
    @Override
    public String showString(String str1, String str2) {
        //Testjni 是lib.jar里面的类
        Testjni testjni = new Testjni();
        return testjni.getString()+str1+str2;
    }
}
