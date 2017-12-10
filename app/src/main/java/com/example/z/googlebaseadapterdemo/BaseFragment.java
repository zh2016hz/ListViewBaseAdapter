package com.example.z.googlebaseadapterdemo;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by z on 2017/12/10.
 */

public abstract class BaseFragment extends Fragment {
    private View mInflate;
    private ListView mLv;
    private ListAdapter mbase;
    private ArrayList<String> mAl  = new ArrayList<>();

//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//
//        mInflate = inflater.inflate(R.layout.app_fragment_layout, null);
//        mLv = (ListView) mInflate.findViewById(R.id.app_list);
//        mbase   =new AppFragment.AppBaseAdapter();
//        mockData();
//        mLv.setAdapter(mbase);
//        return mInflate;
//    }

//    public abstract void mockData();
//
//    class AppBaseAdapter extends SuperBaseAdapter<> {
//        /**
//         * 通过构造传递 数据
//         *
//         * @param data
//         */
//        public AppBaseAdapter(List data) {
//            super(data);
//        }
//
//
//        @Override
//        protected SuperBaseHolder getBaseHolder() {
//            return null;
//        }
//
//    }
//    private  class  AppViewHolder{
//        TextView  tv ;
//    }
}
