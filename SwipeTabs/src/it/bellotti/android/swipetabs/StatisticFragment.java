package it.bellotti.android.swipetabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StatisticFragment extends Fragment{
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View fRootView = inflater.inflate(R.layout.fragment_tab_two, container, false);
         
        return fRootView;
    }

}
