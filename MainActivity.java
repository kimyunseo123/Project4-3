package com.cookandroid.project4_3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd,btnSub,btnMul,btnDiv,btnTemp;
    TextView textresult;
    String num1,num2;
    Double result;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단계산기(수정)");

        edit1 = (EditText) findViewById(R.id.editText1);
        edit2 = (EditText) findViewById(R.id.editText2);
        btnadd = (Button) findViewById(R.id.button1);
        textresult = (TextView) findViewById(R.id.TextResult);

        btnsub = (Button)findViewById(R.id.button2);
        btnmul = (Button)findViewById(R.id.button3);
        btndiv = (Button)findViewById(R.id.button4);
        btntemp = (Button)findViewById(R.id.button5);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if(edit1.getText().toString().length() == 0 || edit2.getText().toString().length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    textresult.setText("계산결과: none" );
                }
                else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textresult.setText("계산결과: " + result.toString());
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.getText().toString().length() == 0 || edit2.getText().toString().length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    textresult.setText("계산결과: none" );
                }
                else {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textresult.setText("계산결과: " + result.toString());
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.getText().toString().length() == 0 || edit2.getText().toString().length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    textresult.setText("계산결과: none" );
                }
                else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textresult.setText("계산결과: " + result.toString());
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.getText().toString().length() == 0 || edit2.getText().toString().length() == 0 ||Integer.parseInt(num2)==0)
                {
                    Toast.makeText(getApplicationContext(), "계산할수없습니다.", Toast.LENGTH_SHORT).show();
                    textresult.setText("계산결과: none" );
                }
                else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    textresult.setText("계산결과: " + result.toString());
                }
            }
        });

        btnTemp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.getText().toString().length() == 0 || edit2.getText().toString().length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    textresult.setText("계산결과: none" );
                }
                else {
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    textresult.setText("계산결과: " + result.toString());
                }
            }
        });
    }
}
