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
public class AreaOfCircle extends Fragment implements View.OnClickListener {
        Button btnArea;
        EditText etRadius;
        TextView tvResult;

    public AreaOfCircle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_area_of_circle,container,false);
        // Inflate the layout for this fragment
  etRadius=view.findViewById(R.id.etRadius);
  btnArea=view.findViewById(R.id.btnArea);
  tvResult=view.findViewById(R.id.tvResult);
        btnArea.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        float radius= Float.parseFloat(etRadius.getText().toString());
        float area = 3.14f*radius*radius;

        tvResult.setText("Area of circle"+area);

    }
}
