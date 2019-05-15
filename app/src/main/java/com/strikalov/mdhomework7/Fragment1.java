package com.strikalov.mdhomework7;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment1 extends Fragment {

    public static final String ARGS = "ARGS";
    public static final String NULL_TEXT = "null";

    public static Fragment1 newInstance(String text){
        Fragment1 fragment1 = new Fragment1();
        Bundle args = new Bundle();
        args.putString(ARGS, text);
        fragment1.setArguments(args);
        return fragment1;
    }

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);

        textView = view.findViewById(R.id.fragment1_text);

        if(getArguments()!= null){
            String text = getArguments().getString(ARGS, NULL_TEXT);
            textView.setText(text);
        }else {
            textView.setText(NULL_TEXT);
        }

        return view;
    }

}
