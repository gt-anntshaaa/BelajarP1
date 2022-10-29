package latihan.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import Model.Mail;
import ViewModel.MyHandler;
import latihan.myapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Mail mail = new Mail();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding viewBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        viewBinding.setMail(mail);
        viewBinding.setHandler(new MyHandler(mail));
    }
}