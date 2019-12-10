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
public class Swapping extends Fragment implements View.OnClickListener {

    EditText etSwap, etSwapTwo;
    Button btnSwap;
    TextView tvSwap;
    public Swapping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_swapping, container, false);
        etSwap=view.findViewById(R.id.etSwap);
        etSwapTwo=view.findViewById(R.id.etSwapTwo);
        btnSwap=view.findViewById(R.id.btnSwap);
        tvSwap=view.findViewById(R.id.tvSwap);
        btnSwap.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

            int x = Integer.parseInt(etSwap.getText().toString());
            int y = Integer.parseInt(etSwapTwo.getText().toString());

            x =x +y;
            y = x-y;
            x = x-y;

            tvSwap.setText("The numbers after swapping is "+ x + "" +y);



    }
}
