package koelkastapp.projectgroepje4.com.koelkastapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class KoelkastActivity extends AppCompatActivity {

    // Add view variables
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koelkast);

        // Import views
        Toolbar toolbar = findViewById(R.id.toolbar);

        // Back button onClickListener
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KoelkastActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        // Initialize view variables
        addButton = findViewById(R.id.addButton);

        // Add OnclickListener to views
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent to go to AddtoKoelkastActivity. (new Intent(From activity, To activity);)
                Intent intent = new Intent(KoelkastActivity.this, AddToKoelkastActivity.class);
                // Start the activity
                startActivity(intent);
            }
        });
    }
}
