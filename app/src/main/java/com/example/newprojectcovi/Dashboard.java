package com.example.newprojectcovi;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;



public class Dashboard extends AppCompatActivity implements View.OnClickListener {
    private CardView card1, card2, card3, card4;
   ImageView myimageButton;
    ImageView logout;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dash_board);
        TextView t3,t4, t5, t6, t7;

        t3 = (TextView) findViewById(R.id.t3);
        t4 = (TextView) findViewById(R.id.t4);
        t5 = (TextView) findViewById(R.id.t5);
        t6 = (TextView) findViewById(R.id.t6);
        t7 = (TextView) findViewById(R.id.t7);

          //logout
        logout = (ImageView) findViewById(R.id.logout);
        //CardView
    card1 = (CardView) findViewById(R.id.c1);
    card2 = (CardView) findViewById(R.id.c2);
    card3 = (CardView) findViewById(R.id.c3);
    card4 = (CardView) findViewById(R.id.c4);

    myimageButton = (ImageView) findViewById(R.id.myimagebutton);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        myimageButton.setOnClickListener(this);
        logout.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent i,r,m;
        switch (v.getId()) {



            case R.id.c1:
                i = new Intent(this, plasmabank.class);
                startActivity(i);
                break;

            case R.id.c2:
                i = new Intent(this, bloodbank.class);
                startActivity(i);
                break;
            case R.id.c3:
                i = new Intent(this, covimedicine.class);
                startActivity(i);
                break;
            case R.id.c4:
                i = new Intent(this, helpline.class);
                startActivity(i);
                break;
            case R.id.myimagebutton:
                    r = new  Intent(this, List.class);
                    startActivity(r);
                break;
                case R.id.logout:
                m = new  Intent(Dashboard.this, Logout.class);
                startActivity(m);
               default:
                break;



        }
    }

}