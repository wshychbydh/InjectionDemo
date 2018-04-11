package com.app.demo.inject;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;


/**
 * Created by cool on 2018/4/2.
 */

public class InjectTest1 extends View implements View.OnClickListener, View.OnTouchListener,
        RadioGroup.OnCheckedChangeListener, CompoundButton.OnCheckedChangeListener {

    public InjectTest1(Context context) {
        super(context);
    }

    public void onClick(View v, View v2) {
        //这里不会注入代码
    }

    private void onClick(String str) {
        //这里不会注入代码
    }

    private void onClick(String str, Object obj) {
        //这里不会注入代码
    }

    @Ignore
    @Override
    public void onClick(View v) {
        //这里不会注入代码，因为添加@Ignore
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        //build文件中设置 INJECT_TOUCH = true 的情况下
        //这里会注入代码
        return false;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        //build文件中设置 INJECT_COMPOUNDBUTTON = true 的情况下
        //这里会注入代码
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        //build文件中设置 INJECT_RADIOGROUP = true 的情况下
        //这里会注入代码
    }
}
