package com.example.newprojectcovi;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;



public class bloodbank extends AppCompatActivity implements View.OnClickListener {
    private CardView card1, card2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bloodbank);
        TextView t4,t5;
        t4= (TextView) findViewById(R.id.t4);
        t5 = (TextView) findViewById(R.id.t5);

        card1 = (CardView) findViewById(R.id.c1);
        card2 = (CardView) findViewById(R.id.c2);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.c1:
                i = new Intent(this, blooddonorregistration.class);
                startActivity(i);
                break;

            case R.id.c2:
                i = new Intent(this, bloodseekerregistration.class);
                startActivity(i);
                break;

            default:
                break;

        }
    }

}