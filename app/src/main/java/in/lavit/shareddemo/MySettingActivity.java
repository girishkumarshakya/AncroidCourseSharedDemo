package in.lavit.shareddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MySettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_setting);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.setting_container, new MySettingFragment())
                .commit();
    }
}
