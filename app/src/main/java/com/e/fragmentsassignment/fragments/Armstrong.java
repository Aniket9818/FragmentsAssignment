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
public class Armstrong extends Fragment implements View.OnClickListener {
        Button btnArms;
        TextView tvArm;
        EditText etArms;


    public Armstrong() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_armstrog, container, false);
       etArms=view.findViewById(R.id.etArms);
       btnArms=view.findViewById(R.id.btnArms);
       tvArm=view.findViewById(R.id.tvArm);
       btnArms.setOnClickListener(this);
       return view;
    }

    @Override
    public void onClick(View v) {


            int number, remainder, sum=0;
            int num = Integer.parseInt(etArms.getText().toString());

            number = num;

            while (num>0){
                remainder=num%10;
                num=num/10;
                sum = sum + (remainder*remainder*remainder);
            }

            if (number == sum){
                tvArm.setText("Armstrong Number!");
            }
            else
            {
                tvArm.setText("Not Armstrong!");
            }






    }
}
