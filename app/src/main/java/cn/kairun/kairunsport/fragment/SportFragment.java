package cn.kairun.kairunsport.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.kairun.kairunsport.R;
import cn.kairun.kairunsport.myview.SportCustomView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SportFragment extends Fragment {

    private SportCustomView sportCustomView;


    public void startDraw(){

        sportCustomView.startDraw();
    }

    public void initDraw(){
        sportCustomView.initDraw();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sport, container, false);
        sportCustomView = (SportCustomView)view.findViewById(R.id.cks_myview);
        return view ;
    }

}
