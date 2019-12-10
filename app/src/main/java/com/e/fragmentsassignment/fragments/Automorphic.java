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
public class Automorphic extends Fragment implements View.OnClickListener {
    EditText etAuto;
    Button btnAuto;
    TextView tvAuto;

    public Automorphic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);
        etAuto = view.findViewById(R.id.etAuto);
        btnAuto = view.findViewById(R.id.btnAuto);
        tvAuto = view.findViewById(R.id.tvAuto);
        btnAuto.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int num = Integer.parseInt(etAuto.getText().toString());
        int i, d = 1;

        for (i = num; i > 0; i = i / 10) {
            d = d * 10;
        }
        if ((num * num) % d == num) {
            tvAuto.setText("Automorphic Number");
        } else {
            tvAuto.setText("Not Automorphic");

        }
    }
}
