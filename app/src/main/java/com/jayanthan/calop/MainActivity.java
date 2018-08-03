package com.jayanthan.calop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    TextView textcalc;
    public String curval="";
    public String curopr="";
    int sum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textcalc=(TextView)findViewById(R.id.text);
        Button b1=(Button)findViewById(R.id.button);
        Button b2=(Button)findViewById(R.id.button2);
        Button b3=(Button)findViewById(R.id.button3);
        Button b4=(Button)findViewById(R.id.button4);
        Button b5=(Button)findViewById(R.id.button5);
        Button b6=(Button)findViewById(R.id.button6);
        Button b7=(Button)findViewById(R.id.button7);
        Button b8=(Button)findViewById(R.id.button8);
        Button b9=(Button)findViewById(R.id.button9);
        Button b0=(Button)findViewById(R.id.button0);
        Button badd=(Button)findViewById(R.id.buttonplus);
        Button bsub=(Button)findViewById(R.id.buttonsub);
        Button bmul=(Button)findViewById(R.id.buttonmul);
        Button bdiv=(Button)findViewById(R.id.buttondiv);
        Button bclr=(Button)findViewById(R.id.buttonclr);
        Button beq=(Button)findViewById(R.id.buttoneq);
        View.OnClickListener one=new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String i=((Button)view).getText().toString();
                curval=textcalc.getText().toString();
                curval=curval+i;
                textcalc.setText(curval);
            }
        };
        View.OnClickListener two=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                curopr=((Button)view).getText().toString().trim();
                if((view.getId()==R.id.buttonclr)){
                    curval="";
                    curopr="";
                    sum=0;
                    textcalc.setText("");
                }
                else if(view.getId()!=R.id.buttoneq)
                {
                    textcalc.setText("");
                }
            }
        };
        b1.setOnClickListener(one);
        b2.setOnClickListener(one);
        b3.setOnClickListener(one);
        b4.setOnClickListener(one);
        b5.setOnClickListener(one);
        b6.setOnClickListener(one);
        b7.setOnClickListener(one);
        b8.setOnClickListener(one);
        b9.setOnClickListener(one);
        b0.setOnClickListener(one);
        badd.setOnClickListener(two);
        bsub.setOnClickListener(two);
        bmul.setOnClickListener(two);
        bdiv.setOnClickListener(two);
        bclr.setOnClickListener(two);
        beq.setOnClickListener(two);
    }
        public void compute()
        {
            int num=Integer.parseInt(curval);
            curval="0";
            switch (curopr){
                case "+":
                    sum+=num;
                    break;
                case "-":
                    sum-=num;
                    break;
                case "*":
                    sum*=num;
                    break;
                case "/":
                    sum/=num;
                    break;
                case "":
                    sum=num;
                    break;
            }
        textcalc.setText(String.valueOf(sum));
        }
}