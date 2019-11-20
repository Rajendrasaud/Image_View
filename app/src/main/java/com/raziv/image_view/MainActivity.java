package com.raziv.image_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RadioButton rdoMessi,rdoRonaldo,rdoNemar;
    ImageView imgview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdoMessi=findViewById(R.id.rdoMessi);
        rdoRonaldo=findViewById(R.id.rdoRonaldo);
        rdoNemar=findViewById(R.id.rdoNemar);
        imgview=findViewById(R.id.imgview);

        rdoMessi.setOnClickListener(this);
        rdoRonaldo.setOnClickListener(this);
        rdoNemar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rdoMessi:
                imgview.setImageResource(R.drawable.messi);
                break;
            case R.id.rdoRonaldo:
                imgview.setImageResource(R.drawable.ronaldo);
                break;

            

        }
    }
}
