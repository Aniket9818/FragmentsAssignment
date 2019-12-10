package com.e.fragmentsassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.e.fragmentsassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleIntrest extends Fragment implements View.OnClickListener {
        EditText etPrinciple, etTime, etRate;
        Button btnSimpleInterest;
        TextView tvSimpleInterest;

    public SimpleIntrest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_intrest, container, false);
        etPrinciple=view.findViewById(R.id.etPrincipal);
        etRate=view.findViewById(R.id.etRate);
        etTime=view.findViewById(R.id.etTime);
        btnSimpleInterest=view.findViewById(R.id.btnSimpleInterest);
        tvSimpleInterest=view.findViewById(R.id.tvSimpleInterest);
        btnSimpleInterest.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {

        float p,t,r, SI;

        p =Float.parseFloat(etPrinciple.getText().toString());
        t=Float.parseFloat(etRate.getText().toString());
        r=Float.parseFloat(etTime.getText().toString());
        SI=(p*t*r)/100;
        tvSimpleInterest.setText("simple interest:"+SI);
    }
}
