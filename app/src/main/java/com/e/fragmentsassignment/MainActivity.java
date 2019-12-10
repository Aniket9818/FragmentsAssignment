package com.e.fragmentsassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.e.fragmentsassignment.fragments.AreaOfCircle;
import com.e.fragmentsassignment.fragments.Armstrong;
import com.e.fragmentsassignment.fragments.Automorphic;
import com.e.fragmentsassignment.fragments.Palindrome;
import com.e.fragmentsassignment.fragments.SimpleIntrest;
import com.e.fragmentsassignment.fragments.Swapping;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnArmstrong;
    private Button btnFragment;
    private Button btnAuto;
    private Button btnSwapping;
    private Button btnSimpleInterest, btnPalindrome;

    private Boolean status = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAuto=findViewById(R.id.btnAuto);
        btnSimpleInterest=findViewById(R.id.btnSimpleInterest);
        btnPalindrome=findViewById(R.id.btnPalindrome);
        btnFragment=findViewById(R.id.btnFragment);
        btnArmstrong=findViewById(R.id.btnArmstrong);
        btnSwapping=findViewById(R.id.btnSwapping);
        btnSwapping.setOnClickListener(this);
        btnArmstrong.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnAuto.setOnClickListener(this);
        btnSimpleInterest.setOnClickListener(this);
        btnFragment.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();



            switch (v.getId()) {
                case R.id.btnFragment:
                   AreaOfCircle areaOfCircle = new AreaOfCircle();
                    fragmentTransaction.replace(R.id.fragmentContainer, areaOfCircle);
                    fragmentTransaction.commit();
                    break;

                case R.id.btnSimpleInterest:
                    SimpleIntrest simpleIntrest = new SimpleIntrest();
                    fragmentTransaction.replace(R.id.fragmentContainer, simpleIntrest);
                    fragmentTransaction.commit();
                    break;


                case R.id.btnPalindrome:
                    Palindrome palindrome = new Palindrome();
                    fragmentTransaction.replace(R.id.fragmentContainer, palindrome);
                    fragmentTransaction.commit();
                    break;

                case R.id.btnAuto:
                   Automorphic automorphic = new Automorphic();
                    fragmentTransaction.replace(R.id.fragmentContainer, automorphic);
                    fragmentTransaction.commit();
                    break;

                case R.id.btnArmstrong:
                    Armstrong armstrong = new Armstrong();
                    fragmentTransaction.replace(R.id.fragmentContainer, armstrong);
                    fragmentTransaction.commit();
                    break;

                case R.id.btnSwapping:
                    Swapping swapping = new Swapping();
                    fragmentTransaction.replace(R.id.fragmentContainer, swapping);
                    fragmentTransaction.commit();
                    break;






            }
                }


        }



