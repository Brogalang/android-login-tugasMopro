package com.example.tugasmopro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText UserName;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5;


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        UserName = (EditText)findViewById(R.id.InUserName);
        Password = (EditText)findViewById(R.id.InPassword);
        Info =(TextView) findViewById(R.id.InfoText);
        textView = (TextView)findViewById(R.id.Lupa);
        Login = (Button)findViewById(R.id.InBtnMasuk);

        Info.setText("Selamat datang di aplikasi GOBS");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(UserName.getText().toString(), Password.getText().toString());
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LupaPassword.class);
                startActivity(intent);
            }
        });

    }

    private void validate(String userName, String userPassword){
        if((userName.equals("Tedi"))&&(userPassword.equals("1167050156"))){
            Intent intent = new Intent(MainActivity.this, Menu.class);
            startActivity(intent);
        }
        else {
            counter--;
            Info.setText("Maaf user name atau password Salah. Sisa kesempatan: " + String.valueOf(counter));
            if (counter == 0){
                Login.setEnabled(false);
                Info.setText("Jika anda melupakan user name atau password anda silahkan masuk ke halaman pengganti password dibawah.");
            }

        }
    }
}
