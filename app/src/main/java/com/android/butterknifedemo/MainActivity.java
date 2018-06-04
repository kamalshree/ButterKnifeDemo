package com.android.butterknifedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edittext_et) EditText myEditText;
    @BindView(R.id.button_bn) Button myButton;
    @BindView(R.id.change_button_bn) Button changeButton;
    @BindView(R.id.textview_tv) TextView myTextView;

    String myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button_bn,R.id.change_button_bn})
    public void buttonClick(View v){
        switch(v.getId()){

            case R.id.button_bn:
                myText=myEditText.getText().toString();
                myTextView.setText(myText);
                break;
            case R.id.change_button_bn:
                myTextView.setAllCaps(true);
                break;

        }
    }

}
