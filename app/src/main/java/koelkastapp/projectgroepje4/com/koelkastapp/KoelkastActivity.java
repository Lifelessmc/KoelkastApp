package koelkastapp.projectgroepje4.com.koelkastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class KoelkastActivity extends AppCompatActivity {

    // Views
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koelkast);

        // Views
        addButton = findViewById(R.id.addButton);

        // OnclickListener
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KoelkastActivity.this, AddToKoelkastActivity.class);
                startActivity(intent);
            }
        });
    }
}
