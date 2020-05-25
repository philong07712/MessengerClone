package com.example.clonemessenger.viewmodels;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.clonemessenger.BR;
import com.example.clonemessenger.Models.User;
import com.example.clonemessenger.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterViewModel extends BaseObservable {
    private User user;
    @Bindable
    private String password;

    @Bindable
    private String password2;

    @Bindable
    private boolean isLoading;

    // FireBase
    FirebaseAuth mAuth;


    @Bindable
    private String toastMessage = null;

    public RegisterViewModel() {
        user = new User("", "", "", "", "");
        password = "";
        password2 = "";
        mAuth = FirebaseAuth.getInstance();
        isLoading = false;

    }

    public boolean isLoading()
    {
        return this.isLoading;
    }

    public void setIsLoading(boolean isLoad)
    {
        this.isLoading = isLoad;
        notifyPropertyChanged(BR.isLoading);
    }

    public String getToastMessage() {
        return toastMessage;
    }

    public void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    // password

    public void setPassword(String password)
    {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    public String getPassword()
    {
        return this.password;
    }

    // password 2
    public void setPassword2(String password2)
    {
        this.password2 = password2;
        notifyPropertyChanged(BR.password2);
    }

    public String getPassword2()
    {
        return this.password2;
    }

    public void setUserEmail(String email)
    {
        user.setEmail(email);
        notifyPropertyChanged(BR.userEmail);
    }

    @Bindable
    public String getUserEmail()
    {
        return user.getEmail();
    }

    public void setUserName(String name)
    {
        user.setName(name);
        notifyPropertyChanged(BR.userName);
    }

    @Bindable
    public String getUserName()
    {
        return user.getName();
    }

    public void onRegisterClick()
    {
        if (!this.user.getEmail().isEmpty() && this.password.equals(this.password2) && !this.getUserName().isEmpty())
        {
            registerUser(user.getName(), user.getEmail(), password);
            setIsLoading(true);
            setToastMessage(Boolean.toString(isLoading));
        }
    }

    private void registerUser(String name, String email, String password)
    {
//        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                if (task.isSuccessful())
//                {
//                    // create User successful
//                }
//            }
//        });
    }

}
