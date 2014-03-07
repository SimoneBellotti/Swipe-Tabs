package it.bellotti.android.swipetabs.fragments;

import it.bellotti.android.swipetabs.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class HomeFragment extends Fragment {
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View fRootView = inflater.inflate(R.layout.fragment_tab_one, container, false);
        
        final EditText editText = (EditText) fRootView.findViewById(R.id.edit_text);

        editText.setOnEditorActionListener(new EditText.OnEditorActionListener() {

			@Override
			public boolean onEditorAction(TextView v, int actionId,
					KeyEvent event) {
			       if (actionId == EditorInfo.IME_ACTION_DONE) {
	                    editText.setText("ciaoooo");
	                    return true;
	                }
	                return false;
			}
        });
         
        return fRootView;
    }

}
