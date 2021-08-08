package com.example.messengerclient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.messengerclient.databinding.ActivityLoginBinding;
import com.example.messengerclient.databinding.ActivityMainBinding;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        String username, password;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            username = extras.getString("username");
            password = extras.getString("password");
        }
        else {
            username = (String) savedInstanceState.getSerializable("username");
            password = (String) savedInstanceState.getSerializable("password");
        }

        binding.textView.setText(String.format(Locale.US, "%s, %s", username, password));
    }
}