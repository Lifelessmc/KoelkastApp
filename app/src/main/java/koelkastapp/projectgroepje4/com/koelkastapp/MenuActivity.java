package koelkastapp.projectgroepje4.com.koelkastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    // Views
    private TextView koelkastMenuItem;
    private TextView vriezerMenuItem;
    private TextView kastMenuItem;
    private TextView boodschappenlijstMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        // Import views
        koelkastMenuItem = findViewById(R.id.koelkastMenuItem);
        vriezerMenuItem = findViewById(R.id.vriezerMenuItem);
        kastMenuItem = findViewById(R.id.kastMenuItem);
        boodschappenlijstMenuItem = findViewById(R.id.boodschappenlijstMenuItem);


        // OnClickListeners
        koelkastMenuItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, KoelkastActivity.class);
                startActivity(intent);
            }
        });

        vriezerMenuItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, VriezerActivity.class);
                startActivity(intent);
            }
        });

        kastMenuItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, KastActivity.class);
                startActivity(intent);
            }
        });

        boodschappenlijstMenuItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, BoodschappenlijstActivity.class);
                startActivity(intent);
            }
        });
    }
}
