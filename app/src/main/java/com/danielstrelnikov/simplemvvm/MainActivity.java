package com.danielstrelnikov.simplemvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.danielstrelnikov.simplemvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = new User();
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(user);

    }

    public void minusAge(View view) {
        user.setAge(user.getAge() - 1);
    }

    public void plusAge(View view) {
        user.setAge(user.getAge() + 1);
    }
}
