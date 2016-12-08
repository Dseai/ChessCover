package com.syn.chesscover;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText sizeText,xText,yText;
    private Button btnStart;

    /*
      * size:棋盘的大小
      *    x:开始被覆盖的横坐标
      *    y:开始被覆盖的纵坐标
      */
    private int size,x,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sizeText = (EditText)findViewById(R.id.size);
        xText = (EditText)findViewById(R.id.xposition);
        yText = (EditText)findViewById(R.id.yposition);
        btnStart = (Button)findViewById(R.id.start);
        btnStart.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                getData();
                Intent intent = new Intent(MainActivity.this, MaxtrixActivity.class);
                intent.putExtra("SIZE", size);
                intent.putExtra("XPOS", x);
                intent.putExtra("YPOS", y);
                startActivity(intent);
            }
        });

    }

    private void getData(){
        String sizeStr = sizeText.getText().toString();
        String xStr = xText.getText().toString();
        String yStr = yText.getText().toString();
        size = Integer.parseInt(sizeStr);
        x = Integer.parseInt(xStr);
        y = Integer.parseInt(yStr);
    }


}
