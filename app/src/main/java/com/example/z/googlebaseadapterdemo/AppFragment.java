package com.example.z.googlebaseadapterdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by z on 2017/12/10.
 */

public class AppFragment extends BaseFragment {

    private View mInflate;
    private ListView mLv;
    private ListAdapter mbase;
    private ArrayList<String> mAl = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        mInflate = inflater.inflate(R.layout.app_fragment_layout, null);
        mLv = (ListView) mInflate.findViewById(R.id.app_list);
        mbase = new AppBaseAdapter(mAl);
        mockData();
        mLv.setAdapter(mbase);
        return mInflate;
    }


    public void mockData() {
        for (int i = 0; i < 100; i++) {
            mAl.add("我是第 " + i + " 个元素");
        }
    }

    private class AppBaseAdapter extends SuperBaseAdapter<String> {

        /**
         * 通过构造传递 数据
         *
         * @param data
         */
        public AppBaseAdapter(List<String> data) {
            super(data);
        }

        @Override
        protected SuperBaseHolder getBaseHolder() {
            return new AppViewHolder();
        }
    }

    private class AppViewHolder extends SuperBaseHolder<String> {

        private View mConvertView;
        private Button mButton;

        @Override
        public View initLayout() {
            mConvertView = View.inflate(getContext(), R.layout.new_item_layout, null);
            return mConvertView;
        }

        @Override
        public void findID() {
            mButton = (Button) mConvertView.findViewById(R.id.news_text);
        }

        @Override
        public void setData(String data) {
            mButton.setText(data);
        }
    }
}