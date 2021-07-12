package com.example.project30616;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text1, text2;
    Switch chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoOreo, rdoPie, rdoQ;
    Button btnR, btnF;
    ImageView imgAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        text1 = findViewById(R.id.Text1);
        chkAgree = findViewById(R.id.ChkAgree);
        text2 = findViewById(R.id.text2);
        rGroup1= findViewById(R.id.Rgroup1);
        btnF = findViewById(R.id.BtnF);
        btnR = findViewById(R.id.BtnR);
        findViewById(R.id.Rdooreo).setOnClickListener(this);
        findViewById(R.id.Rdopie).setOnClickListener(this);
        findViewById(R.id.Rdoq).setOnClickListener(this);
        findViewById(R.id.BtnR).setOnClickListener(this);
        findViewById(R.id.BtnF).setOnClickListener(this);
        imgAndroid = findViewById(R.id.ImgAndroid);


        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkAgree.isChecked()==true){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnF.setVisibility(View.VISIBLE);
                    btnR.setVisibility(View.VISIBLE);
                    imgAndroid.setVisibility(View.VISIBLE);
                }else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    imgAndroid.setVisibility(View.INVISIBLE);
                    btnF.setVisibility(View.INVISIBLE);
                    btnR.setVisibility(View.INVISIBLE);
                }

            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Rdooreo:
                imgAndroid.setImageResource(R.drawable.oreo);
                break;
            case R.id.Rdopie:
                imgAndroid.setImageResource(R.drawable.pie);
                break;
            case R.id.Rdoq:
                imgAndroid.setImageResource(R.drawable.q10);
                break;
            case R.id.BtnF:
                finish();
                break;
            case R.id.BtnR:
                imgAndroid.setImageResource(0);
                chkAgree.setChecked(false);
                break;
        }
    }
}