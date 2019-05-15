package com.strikalov.mdhomework7;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment3 extends Fragment {

    public static final String ARGS = "ARGS";
    public static final String NULL_TEXT = "null";

    public static Fragment3 newInstance(String text){
        Fragment3 fragment3 = new Fragment3();
        Bundle args = new Bundle();
        args.putString(ARGS, text);
        fragment3.setArguments(args);
        return fragment3;
    }

    private TextView textView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_fragment3, container, false);

        textView = view.findViewById(R.id.fragment3_text);

        if(getArguments()!= null){
            String text = getArguments().getString(ARGS, NULL_TEXT);
            textView.setText(text);
        }else {
            textView.setText(NULL_TEXT);
        }

        return view;
    }

}
