package com.zaky.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText id_name, id_npm, id_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id_name = findViewById(R.id.id_name);
        id_npm = findViewById(R.id.id_npm);
        id_password = findViewById(R.id.id_password);



    }

    public void tombolKirim(View view) {
        String nama = id_name.getText().toString();
        String npm = id_npm.getText().toString();
        String password = id_password.getText().toString();

//        Log.d("MainActivity", "Nama: " + nama + ", npm: " + npm + " password: "+ password);
        //   toast
        Context context = getApplicationContext();
        CharSequence text = "Anda mengirim nama: " + nama + " ,Npm: " + npm + " , Password: " + password;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();



    }

}