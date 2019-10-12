package com.brunoreis.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exibeToast(View view){

        Toast.makeText(getApplicationContext(),"Bruno",Toast.LENGTH_LONG).show();

//        ImageView imageView = new ImageView(getApplicationContext());
//        imageView.setImageResource(R.drawable.ic_launcher_background);
//
//        Toast toast = new Toast(getApplicationContext());
//        toast.setDuration(Toast.LENGTH_SHORT);
//        toast.setView(imageView);
//        toast.show();


    }


}
