package com.example.greetingann;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Angel Negron
 *
 */
public class languages extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);

        //Tv text
        TextView tvLang = view.findViewById(R.id.textView_Lang);

        //Holds value of language passed from welcome screen
        String lang = languagesArgs.fromBundle(requireArguments()).getTransLang();
        tvLang.setText(lang);



        return view;
    }
}