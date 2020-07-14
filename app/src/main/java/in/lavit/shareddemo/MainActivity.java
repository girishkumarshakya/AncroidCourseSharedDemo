package in.lavit.shareddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername,editTextPassword;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextUsername = findViewById(R.id.editTextUserName);
        sharedPreferences = getSharedPreferences("mypref",MODE_PRIVATE);
        String value = sharedPreferences.getString("username","");
        editTextUsername.setText(value);

    }

    public void login(View view) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username",editTextUsername.getText().toString());
        editor.apply();
    }
}
