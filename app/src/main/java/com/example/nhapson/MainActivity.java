package com.example.nhapson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText editText1;
    Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1);
        btnAdd = (Button) findViewById(R.id.btnhienthi);
    }



    public void  Show(View v)
    {
        if(editText1.getText().toString().trim() != "" )
        {
            int n = Integer.parseInt(editText1.getText().toString()) ;
            String s = "";

            for(int i=1; i<=n ; i++)
                if(i%2!=0)
                    s += i + " ";


            Intent intent = new Intent(this, Activity2.class);
            intent.putExtra("SoLe",s);
            startActivity(intent);
            editText1.setText("");
        }
        else
            Toast.makeText(MainActivity.this, "Hãy nhập số n", Toast.LENGTH_SHORT).show();
    }

}