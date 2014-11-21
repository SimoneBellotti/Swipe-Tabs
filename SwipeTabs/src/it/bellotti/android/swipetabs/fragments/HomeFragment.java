package it.bellotti.android.swipetabs.fragments;

import it.bellotti.android.swipetabs.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
    
//    @Override
//    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
//        InputConnection connection = super.onCreateInputConnection(outAttrs);
//        int imeActions = outAttrs.imeOptions&EditorInfo.IME_MASK_ACTION;
//        if ((imeActions&EditorInfo.IME_ACTION_DONE) != 0) {
//            // clear the existing action
//            outAttrs.imeOptions ^= imeActions;
//            // set the DONE action
//            outAttrs.imeOptions |= EditorInfo.IME_ACTION_DONE;
//        }
//        if ((outAttrs.imeOptions&EditorInfo.IME_FLAG_NO_ENTER_ACTION) != 0) {
//            outAttrs.imeOptions &= ~EditorInfo.IME_FLAG_NO_ENTER_ACTION;
//        }
//        return connection;
//    }

}
