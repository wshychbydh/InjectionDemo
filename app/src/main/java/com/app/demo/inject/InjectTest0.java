package com.app.demo.inject;

import android.view.View;

/**
 * Created by cool on 2018/3/30.
 */
@Inject
public abstract class InjectTest0 implements View.OnClickListener {

    public void onClick(View value) {
        //默认这里不会注入代码,因为该类是抽象的，
        // 但是该类上面添加了Inject，所以此处会注入代码
    }
}
