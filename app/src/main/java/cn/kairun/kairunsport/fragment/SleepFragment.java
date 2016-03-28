package cn.kairun.kairunsport.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.kairun.kairunsport.R;
import cn.kairun.kairunsport.myview.SleepCustomView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SleepFragment extends Fragment {


    private SleepCustomView sleepCustomView;

    public void startDraw(){
        sleepCustomView.startDraw();
    }
    public void initDraw(){
        sleepCustomView.initDraw();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sleep, container, false);
        sleepCustomView = (SleepCustomView)view.findViewById(R.id.cks_myview);
        return view;
    }

}
