package it.bellotti.android.swipetabs.fragments;

import it.bellotti.android.swipetabs.R;
import it.bellotti.android.swipetabs.R.layout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TabThree extends Fragment {
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View fRootView = inflater.inflate(R.layout.fragment_tab_three, container, false);
         
        return fRootView;
    }

}
