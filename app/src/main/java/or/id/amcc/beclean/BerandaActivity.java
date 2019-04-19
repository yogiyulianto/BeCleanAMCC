package or.id.amcc.beclean;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BerandaActivity extends AppCompatActivity {
   Button btndonasi1,btndonasi2,btndonasi3,btndetail1,btndetail2,btndetail3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        btndonasi1 = findViewById(R.id.btn_donasi1);
        btndonasi2 = findViewById(R.id.btn_donasi2);
        btndonasi3 = findViewById(R.id.btn_donasi3);
        btndetail1 = findViewById(R.id.btn_detail1);
       btndetail2 = findViewById(R.id.btn_detail2);
       btndetail3 = findViewById(R.id.btn_detail3);

        btndonasi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BerandaActivity.this, FormActivity.class);
                startActivity(i);
            }
        });
        btndonasi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BerandaActivity.this, FormActivity.class);
                startActivity(i);
            }
        });
        btndonasi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BerandaActivity.this, FormActivity.class);
                startActivity(i);
            }
        });

        btndetail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BerandaActivity.this, DetailActivity.class);
                startActivity(i);
            }
        });
       btndetail2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(BerandaActivity.this, DetailActivity.class);
               startActivity(i);
            }        });
       btndetail3.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                Intent i = new Intent(BerandaActivity.this, DetailActivity.class);
                startActivity(i);
           }
       });


    }
}