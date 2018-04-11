package com.app.demo.inject;

import android.view.View;

/**
 * Created by cool on 2018/4/8.
 */
public class InjectTest3 extends InjectTest0 {

    @Override
    public void onClick(View value) {
        //默认这里会注入代码,因为该类的父类实现了View.OnClickListener，
        super.onClick(value);
    }
}
