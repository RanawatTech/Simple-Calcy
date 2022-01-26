package com.ranawat.simplecalcy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText First,etSecond;
    TextView tvAns;
    Button btnAdd,btnSub,btnMul,btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();


        First=findViewById(R.id.etFirst);
        etSecond=findViewById(R.id.etSecond);

        tvAns=findViewById(R.id.tvAns);


        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);


       btnAdd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               double n1, n2, results;

               n1=Double.parseDouble(First.getText().toString());
               n2=Double.parseDouble(etSecond.getText().toString());

               results=n1+n2;

               tvAns.setText("Sum are : "+ results );



           }
       });

       btnSub.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               double n1, n2, results;

               n1=Double.parseDouble(First.getText().toString());
               n2=Double.parseDouble(etSecond.getText().toString());

               results=n1-n2;

               tvAns.setText("Minus are : "+ results );


           }
       });

       btnMul.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               double n1, n2, results;

               n1=Double.parseDouble(First.getText().toString());
               n2=Double.parseDouble(etSecond.getText().toString());

               results=n1*n2;

               tvAns.setText("Multiplication are : "+ results );
           }
       });

       btnDiv.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               double n1, n2, results;

               n1=Double.parseDouble(First.getText().toString());
               n2=Double.parseDouble(etSecond.getText().toString());

               results=n1/n2;

               tvAns.setText("Division are : "+ results );
           }
       });



    }
}