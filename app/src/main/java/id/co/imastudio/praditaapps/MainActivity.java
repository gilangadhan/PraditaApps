package id.co.imastudio.praditaapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //kenalin
    Button ya;
    Button tidak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hubungin
        ya = findViewById(R.id.btnYa);
        tidak = findViewById(R.id.btnTidak);

        //ngapain
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //panggil toast
                Toast.makeText(MainActivity.this, "Ini pesan Ya", Toast.LENGTH_SHORT).show();
            }
        });
        tidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent
                Intent pindah = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(pindah);
            }
        });
    }
}
