package com.example.gamis214.custom_keyboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener, View.OnClickListener{

    private EditText editText;
    private LinearLayout container_keyboard;
    private Animation keyboard_show,keyboard_hide;
    private TextView txtAceptar,txtClean;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.edit_text);
        txtAceptar = (TextView) findViewById(R.id.txtAceptar);
        txtClean = (TextView) findViewById(R.id.txtClean);
        container_keyboard = (LinearLayout) findViewById(R.id.container_keyboard);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10 = (Button) findViewById(R.id.btn10);

        keyboard_show = AnimationUtils.loadAnimation(this,R.anim.scale_up);
        keyboard_hide = AnimationUtils.loadAnimation(this,R.anim.scale_down);

        keyboard_show.setAnimationListener(this);
        keyboard_hide.setAnimationListener(this);

        txtAceptar.setOnClickListener(this);
        txtClean.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);

        editText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                container_keyboard.setVisibility(View.VISIBLE);
                container_keyboard.startAnimation(keyboard_show);
                return false;
            }
        });
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        if(animation == keyboard_show){

        }else if (animation == keyboard_hide){
           container_keyboard.setVisibility(View.GONE);
        }
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.txtAceptar:
                container_keyboard.startAnimation(keyboard_hide);
                break;
            case R.id.txtClean:
                editText.setText("");
                break;
            case R.id.btn1:
                editText.append("1");
                break;
            case R.id.btn2:
                editText.append("2");
                break;
            case R.id.btn3:
                editText.append("3");
                break;
            case R.id.btn4:
                editText.append("4");
                break;
            case R.id.btn5:
                editText.append("5");
                break;
            case R.id.btn6:
                editText.append("6");
                break;
            case R.id.btn7:
                editText.append("7");
                break;
            case R.id.btn8:
                editText.append("8");
                break;
            case R.id.btn9:
                editText.append("9");
                break;
            case R.id.btn10:
                editText.append("0");
                break;
        }
    }
}
