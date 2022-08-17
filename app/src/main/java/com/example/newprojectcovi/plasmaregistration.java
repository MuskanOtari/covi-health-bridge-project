package com.example.newprojectcovi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class plasmaregistration extends AppCompatActivity {

    EditText etName, etEmail, etPassword, etAge, etAadhar, etMobile, etbldgrp, etsymptoms, etAddress;
    Button btSubmit;

     FirebaseDatabase rootnode;
     DatabaseReference reference;

    AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plasmaregistration);

        //Variables
        etName = findViewById(R.id.et_name);
        etAddress = findViewById(R.id.et_adress);
        etMobile = findViewById(R.id.et_mobile2);
        etEmail = findViewById(R.id.et_email);
        etAadhar = findViewById(R.id.et_aadhar);
        etAge = findViewById(R.id.et_age);
        etbldgrp = findViewById(R.id.bldgrp);
        etsymptoms = findViewById(R.id.symptoms);
        btSubmit = findViewById(R.id.bt_submit);
        etPassword = findViewById(R.id.et_pass3);
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);


        //Add Validation  For name
        awesomeValidation.addValidation(this, R.id.et_name,
                RegexTemplate.NOT_EMPTY, R.string.invalid_name);

        //For Mobile Number
        String s1;
        awesomeValidation.addValidation(this, R.id.et_mobile2
                , "[5-9]{1}[0-9]{9}$", R.string.invalid_mobile);

        //For Address
        awesomeValidation.addValidation(this, R.id.et_adress,
                RegexTemplate.NOT_EMPTY, R.string.invalid_adress);

        //For Email
        awesomeValidation.addValidation(this, R.id.et_email,
                "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+", R.string.invalid_email);

        //For Age
        awesomeValidation.addValidation(this, R.id.et_age
                , "[2-5]{1}[1-8]{1}$", R.string.invalid_age);

        //For Bloudgroup

        awesomeValidation.addValidation(this, R.id.bldgrp,
                RegexTemplate.NOT_EMPTY, R.string.invalid_bldgrp);

        //For Mobile Number
        awesomeValidation.addValidation(this, R.id.et_aadhar,
                RegexTemplate.NOT_EMPTY, R.string.invalid_aadhar);

        //For Mobile Number
        awesomeValidation.addValidation(this, R.id.symptoms,
                RegexTemplate.NOT_EMPTY, R.string.invalid_symptoms);
        //For Password
        String regexPassword = ".{7,}";
        awesomeValidation.addValidation(this, R.id.et_pass3, regexPassword, R.string.invalid_password);


        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Check Validation
                if (awesomeValidation.validate()) {

                    Toast.makeText(getApplicationContext()
                            , "Form Validate Successfully", Toast.LENGTH_SHORT).show();

                    rootnode = FirebaseDatabase.getInstance();
                    reference = rootnode.getReference("plasmauser");
                  //get all the values

                    String name = etName.getText().toString();
                    String password = etPassword.getText().toString();
                    String email = etEmail.getText().toString();
                    String address= etAddress.getText().toString();
                    String bldgroup = etbldgrp.getText().toString();
                    String symptoms = etsymptoms.getText().toString();
                    String age = etAge.getText().toString();
                    String mobile = etMobile.getText().toString();
                    String aadhar = etAadhar.getText().toString();


                     UserHelperClass helperClass = new UserHelperClass(name,password,email,address,symptoms,bldgroup,age,mobile,aadhar);
                    reference.child(name).setValue(helperClass);

                } else {
                    Toast.makeText(getApplicationContext()
                            , "Validation Failed", Toast.LENGTH_SHORT).show();

                }
            }

        });


    }



    }