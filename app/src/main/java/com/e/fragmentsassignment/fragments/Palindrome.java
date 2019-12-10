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
public class Palindrome extends Fragment implements View.OnClickListener {
      private   EditText etPalindrome;
       private Button btnPalindrome;
        private TextView tvPalindrome;

    public Palindrome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_palindrome, container, false);
        btnPalindrome=view.findViewById(R.id.btnPalindrome);
        etPalindrome=view.findViewById(R.id.etPalindrome);
        tvPalindrome=view.findViewById(R.id.tvPalindrome);
        btnPalindrome.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int originalNum, lastDigit, sum=0;
        int num = Integer.parseInt(etPalindrome.getText().toString());
        originalNum= num;
        while(originalNum>0)
        {

            lastDigit=originalNum%10;
            sum=(sum*10)+lastDigit;
            originalNum= originalNum/10;
        }
        if(sum==num){
            tvPalindrome.setText("the number is palindrome");

        }else{

            tvPalindrome.setText("the number is not palindrome");
        }

    }
}
