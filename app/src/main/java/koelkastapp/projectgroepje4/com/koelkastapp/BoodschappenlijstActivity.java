package koelkastapp.projectgroepje4.com.koelkastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class BoodschappenlijstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boodschappenlijst);

        // Import views
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // Back button onClickListener
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BoodschappenlijstActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
