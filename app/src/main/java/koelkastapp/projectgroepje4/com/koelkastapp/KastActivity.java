package koelkastapp.projectgroepje4.com.koelkastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KastActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kast);

        button = (Button) findViewById(R.id.button);
        // Add OnclickListener to views
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent to go to AddtoKoelkastActivity. (new Intent(From activity, To activity);)
                Intent intent = new Intent(KastActivity.this, AddToKoelkastActivity.class);
                // Start the activity
                startActivity(intent);
            }
        });
    }
}