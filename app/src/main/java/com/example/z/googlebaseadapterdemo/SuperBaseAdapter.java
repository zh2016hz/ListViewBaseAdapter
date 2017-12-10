package com.example.z.googlebaseadapterdemo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by z on 2017/12/10.
 */

public abstract class SuperBaseAdapter<T> extends BaseAdapter {
    private List<T> mAl = new ArrayList<>();

    /**
     * 通过构造传递 数据
     *
     * @param data
     */
    public SuperBaseAdapter(List<T> data) {
        mAl = data;
    }

    @Override
    public int getCount() {
        return mAl.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, android.view.View convertView, ViewGroup parent) {
//        AppViewHolder  holder;
        SuperBaseHolder holder;
        if (convertView == null) {
            //1.创建不同的holder
//            holder = new AppViewHolder();
            holder = getBaseHolder();
            //2.找对应的布局
//            convertView  = View.inflate(getContext(),R.layout.app_item_layout,null);
            //因为每个Adapter 对应的布局不同。
            convertView = holder.initLayout();
            //3.找对应的ID
//            holder.tv = (TextView) convertView.findViewById(R.id.app_text);
            holder.findID();
            //4.绑定相应的控制器
            convertView.setTag(holder);

        } else {
            holder = (SuperBaseHolder) convertView.getTag();
        }
        //5.设置数据
        T t = mAl.get(position);
//        holder.tv.setText();
        holder.setData(t);
        return convertView;
    }

    /**
     * 不同的holder 这里也要抽取一个基类的holder
     */
    protected abstract SuperBaseHolder getBaseHolder();

}



