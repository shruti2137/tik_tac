package com.example.tik_tac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int t = 0,cnt=0,cnt1=0;
    TextView t1,t2,t3;
//    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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

    }
    void win()
    {
        if(b1.getText().toString().equals("0") && b2.getText().toString().equals("0") && b3.getText().toString().equals("0"))
        {
            t1.setText("0 is win");
        }
        if(b4.getText().toString().equals("0") && b5.getText().toString().equals("0") && b6.getText().toString().equals("0"))
        {
            t1.setText("0 is win");
        }
        if(b7.getText().toString().equals("0") && b8.getText().toString().equals("0") && b9.getText().toString().equals("0"))
        {
            t1.setText("0 is win");
        }
        if(b1.getText().toString().equals("0") && b4.getText().toString().equals("0") && b7.getText().toString().equals("0"))
        {
            t1.setText("0 is win");
        }
        if(b2.getText().toString().equals("0") && b5.getText().toString().equals("0") && b8.getText().toString().equals("0"))
        {
            t1.setText("0 is win");
        }
        if(b3.getText().toString().equals("0") && b6.getText().toString().equals("0") && b9.getText().toString().equals("0"))
        {
            t1.setText("0 is win");
        }
        if(b1.getText().toString().equals("0") && b5.getText().toString().equals("0") && b9.getText().toString().equals("0"))
        {
            t1.setText("0 is win");
        }
        if(b7.getText().toString().equals("0") && b5.getText().toString().equals("0") && b3.getText().toString().equals("0"))
        {
            t1.setText("0 is win");
        }
//
        if(b1.getText().toString().equals("X") && b2.getText().toString().equals("X") && b3.getText().toString().equals("X"))
        {
            t1.setText("X is win");
        }
        if(b4.getText().toString().equals("X") && b5.getText().toString().equals("X") && b6.getText().toString().equals("X"))
        {
            t1.setText("X is win");
        }
        if(b7.getText().toString().equals("X") && b8.getText().toString().equals("X") && b9.getText().toString().equals("X"))
        {
            t1.setText("X is win");
        }
        if(b1.getText().toString().equals("X") && b4.getText().toString().equals("X") && b7.getText().toString().equals("X"))
        {
            t1.setText("X is win");
        }
        if(b2.getText().toString().equals("X") && b5.getText().toString().equals("X") && b8.getText().toString().equals("X"))
        {
            t1.setText("X is win");
        }
        if(b3.getText().toString().equals("X") && b6.getText().toString().equals("X") && b9.getText().toString().equals("X"))
        {
            t1.setText("X is win");
        }
        if(b1.getText().toString().equals("X") && b5.getText().toString().equals("X") && b9.getText().toString().equals("X"))
        {
            t1.setText("X is win");
        }
        if(b7.getText().toString().equals("X") && b5.getText().toString().equals("X") && b3.getText().toString().equals("X"))
        {
            t1.setText("X is win");
        }
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.b1) {
            if (b1.getText().toString().isEmpty()) {
                if (t % 2 == 0) {
                    b1.setText("0");
                    t2.setText(""+cnt);
                    cnt++;
                } else {
                    b1.setText("X");
                    t3.setText(""+cnt1);
                    cnt1++;
                }
                t++;

            }
            win();
            System.out.println("b1");

        }
        if (v.getId() == R.id.b2)
        {
            if (b2.getText().toString().isEmpty())
            {
                if (t % 2 == 0)
                {
                    b2.setText("0");
                    t2.setText(""+cnt);
                    cnt++;
                }
                else
                {
                    b2.setText("X");
                    t3.setText(""+cnt1);
                    cnt1++;
                }
                t++;
            }
            win();
            System.out.println("b2");
        }

        if (v.getId() == R.id.b3)
        {
            if (b3.getText().toString().isEmpty())
            {
                if (t % 2 == 0)
                {
                    b3.setText("0");
                    t2.setText(""+cnt);
                    cnt++;
                }
                else
                {
                    b3.setText("X");
                    t3.setText(""+cnt1);
                    cnt1++;
                }
                t++;
            }
            win();
            System.out.println("b3");
        }

        if (v.getId() == R.id.b4)
        {
            if (b4.getText().toString().isEmpty())
            {
                if (t % 2 == 0)
                {
                    b4.setText("0");
                    t2.setText(""+cnt);
                    cnt++;
                }
                else
                {
                    b4.setText("X");
                    t3.setText(""+cnt1);
                    cnt1++;
                }
                t++;
            }
            win();
            System.out.println("b4");
        }
        if (v.getId() == R.id.b5)
        {
            if (b5.getText().toString().isEmpty())
            {
                if (t % 2 == 0)
                {
                    b5.setText("0");
                    t2.setText(""+cnt);
                    cnt++;
                }
                else
                {
                    b5.setText("X");
                    t3.setText(""+cnt1);
                    cnt1++;
                }
                t++;
            }
            win();
            System.out.println("b5");
        }
        if (v.getId() == R.id.b6)
        {
            if (b6.getText().toString().isEmpty())
            {
                if (t % 2 == 0)
                {
                    b6.setText("0");
                    t2.setText(""+cnt);
                    cnt++;
                }
                else
                {
                    b6.setText("X");
                    t3.setText(""+cnt1);
                    cnt1++;
                }
                t++;
            }
            win();
            System.out.println("b6");
        }
        if (v.getId() == R.id.b7)
        {
            if (b7.getText().toString().isEmpty())
            {
                if (t % 2 == 0)
                {
                    b7.setText("0");
                    t2.setText(""+cnt);
                    cnt++;
                }
                else
                {
                    b7.setText("X");
                    t3.setText(""+cnt1);
                    cnt1++;
                }
                t++;
            }
            win();
            System.out.println("b7");
        }
        if (v.getId() == R.id.b8)
        {
            if (b8.getText().toString().isEmpty())
            {
                if (t % 2 == 0)
                {
                    b8.setText("0");
                    t2.setText(""+cnt);
                    cnt++;
                }
                else
                {
                    b8.setText("X");
                    t3.setText(""+cnt1);
                    cnt1++;
                }
                t++;
            }
            win();
            System.out.println("b8");
        }
        if (v.getId() == R.id.b9)
        {
            if (b9.getText().toString().isEmpty())
            {
                if (t % 2 == 0)
                {
                    b9.setText("0");
                    t2.setText(""+cnt);
                    cnt++;
                }
                else
                {
                    b9.setText("X");
                    t3.setText(""+cnt1);
                    cnt1++;
                }
                t++;
            }
            win();
            System.out.println("b9");
        }
    }
     
    }
