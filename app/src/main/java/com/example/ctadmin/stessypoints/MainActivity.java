package com.example.ctadmin.stessypoints;

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.view.View.OnClickListener;
    import android.widget.Button;
    import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        int Team1 = 0;
        int Team2 = 0;
        Button btn,btn1,btn2,btn3,btn4,btn5,btn6;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout);
            btn=(Button)findViewById(R.id.button);
            btn.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    Team1=Team1+3;
                    TextView tvw=(TextView)findViewById(R.id.textView3);
                    tvw.setText(String.valueOf(Team1));
                }
                 });
            btn1=(Button)findViewById(R.id.button2);
            btn1.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    Team2=Team2+3;
                    TextView tvw=(TextView)findViewById(R.id.textView4);
                    tvw.setText(String.valueOf(Team2));
                }
            });
            btn2=(Button)findViewById(R.id.button3);
            btn2.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    Team1=Team1+2;
                    TextView tvw=(TextView)findViewById(R.id.textView3);
                    tvw.setText(String.valueOf(Team1));
                }
            });
            btn3=(Button)findViewById(R.id.button4);
            btn3.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    Team2=Team2+2;
                    TextView tvw=(TextView)findViewById(R.id.textView4);
                    tvw.setText(String.valueOf(Team2));
                }
            });
            btn4=(Button)findViewById(R.id.button5);
            btn4.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    Team1=Team1+1;
                    TextView tvw=(TextView)findViewById(R.id.textView3);
                    tvw.setText(String.valueOf(Team1));
                }
            });
            btn5=(Button)findViewById(R.id.button6);
            btn5.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    Team2=Team2+1;
                    TextView tvw=(TextView)findViewById(R.id.textView4);
                    tvw.setText(String.valueOf(Team2));
                }
            });
            btn6=(Button)findViewById(R.id.button7);
            btn6.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    Team1=0;
                    Team2=0;
                    TextView tvw=(TextView)findViewById(R.id.textView4);
                    tvw.setText(String.valueOf(Team2));
                    TextView tvw1=(TextView)findViewById(R.id.textView3);
                    tvw1.setText(String.valueOf(Team1));
                }
            });

            }
        }

