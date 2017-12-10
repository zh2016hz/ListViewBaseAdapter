package com.example.z.googlebaseadapterdemo;

import android.view.View;

/**
 * Created by z on 2017/12/10.
 */

public  abstract  class SuperBaseHolder<T> {

    public abstract View initLayout();

    public abstract void findID();

    public abstract  void setData(T data);

}
