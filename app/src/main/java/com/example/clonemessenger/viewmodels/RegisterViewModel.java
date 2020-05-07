package com.example.clonemessenger.viewmodels;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.clonemessenger.BR;
import com.example.clonemessenger.Models.User;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterViewModel extends BaseObservable {
    private User user;
    @Bindable
    private String password;

    @Bindable
    private String password2;

    // FireBase
    FirebaseAuth mAuth;



    private String successMessage = "Register Successful";
    private String failedMessage = "Register failed";

    @Bindable
    private String toastMessage = null;

    public RegisterViewModel() {
        user = new User("", "", "", "", "");
        password = "";
        password2 = "";
        mAuth = FirebaseAuth.getInstance();

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
            setToastMessage("Register completed");
        }
    }


}
