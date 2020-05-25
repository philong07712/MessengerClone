package com.example.clonemessenger;

import android.view.View;
import android.widget.Toast;

import androidx.databinding.BindingAdapter;

public class CustomBindingAdapter {
    @BindingAdapter("visibility")
    public static void setVisibility(View view, Boolean value)
    {
        view.setVisibility(value ? View.VISIBLE : View.GONE);
        view.invalidate();
    }

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message)
    {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
