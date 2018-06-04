package koelkastapp.projectgroepje4.com.koelkastapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AddToKoelkastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_koelkast);


        // Import views
        Toolbar toolbar = findViewById(R.id.toolbar);

        // Back button onClickListener
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddToKoelkastActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
