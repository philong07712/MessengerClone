package com.example.clonemessenger.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.clonemessenger.R;
import com.example.clonemessenger.viewmodels.RegisterViewModel;
import com.example.clonemessenger.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_register);
        ActivityRegisterBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_register);
        binding.setViewModel(new RegisterViewModel());
        binding.executePendingBindings();
    }

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message)
    {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }

}
