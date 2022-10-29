package ViewModel;

import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableField;

import Model.Mail;
import latihan.myapp.BR;

public class MyHandler extends BaseObservable {

    private boolean isEnabled;
    private String error;

    public void setIsEnabled(boolean enabled){
        isEnabled = enabled;
        notifyPropertyChanged(BR.isEnabled);
    }
    @Bindable
    public boolean getIsEnabled(){
        return isEnabled;
    }

    public void setError(String error) {
        this.error = error;
        notifyPropertyChanged(BR.error);
    }
    @Bindable
    public String getError() {
        return error;
    }

    private String toastMessage;
    private Mail mail;

    public MyHandler(Mail mail){
        this.mail = mail;
    }

    public void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }
    @Bindable
    public String getToastMessage() {
        return toastMessage;
    }

    public void onSend(View view){
        if (isSucces()){
            setIsEnabled(false);
            setError("");
            setToastMessage("succes !!!");
        }else{
            setIsEnabled(true);
            setError("tidak boleh kosong");
            setToastMessage("invalid !!!");
        }

    }

    @BindingAdapter("toast")
    public static void setToast(View view, String message){
        if (message != null){
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isSucces(){
        return !TextUtils.isEmpty(mail.getMailFrom()) && !TextUtils.isEmpty(mail.getMailTo());
    }
}
