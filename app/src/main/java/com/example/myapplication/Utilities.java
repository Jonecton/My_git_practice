package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class Utilities extends AppCompatActivity {

    Button btnInternet;
    Button btnElectricity;
    Button btnWater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utilities);

        btnInternet = findViewById(R.id.btn_internet);
        btnElectricity = findViewById(R.id.btn_electricity);
        btnWater = findViewById(R.id.btn_water);

        btnInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Utilities.this, Internet.class);
                startActivity(intent);
            }
        });

        btnElectricity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Utilities.this, Electricity.class);
                startActivity(intent);
            }
        });

        btnWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Utilities.this, Water.class);
                startActivity(intent);
            }
        });
    }
}
