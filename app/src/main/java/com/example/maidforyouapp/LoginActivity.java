package com.example.maidforyouapp;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    Button signupbutton,gobutton,forgotpass;
    ImageView logoimage;
    TextView welcometitle,signintext;
    TextInputLayout username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        signupbutton = findViewById(R.id.signupbutton);
        gobutton = findViewById(R.id.gobutton);
        logoimage = findViewById(R.id.logoimage);
        welcometitle = findViewById(R.id.welcometitle);
        signintext=findViewById(R.id.signintext);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);


        signupbutton.setOnClickListener((view)-> {
                Intent intent = new Intent(LoginActivity.this,SignUpActivity.class);

                Pair[] pairs = new Pair[6];

                pairs[0] = new Pair<View,String>(logoimage,"logo_image");
                pairs[1] = new Pair<View,String>(welcometitle,"logo_text");
                pairs[2] = new Pair<View,String>(username,"useranimation");
                pairs[3] = new Pair<View,String>(password,"passwordanimation");
                pairs[4] = new Pair<View,String>(gobutton,"goanim");
                pairs[5] = new Pair<View,String>(signupbutton,"newuseranim");

            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(LoginActivity.this,pairs);
            startActivity(intent, options.toBundle());
        });


    }
}