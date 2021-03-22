package rectify.app.platformaegabimeve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.platformaegabimeve.R;

public class CardView extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);


        LinearLayout cardinfo1 = (LinearLayout )findViewById(R.id.cardinfo);
        LinearLayout cardspelling1 = (LinearLayout )findViewById(R.id.cardspelling);
        LinearLayout cardcontent1 = (LinearLayout )findViewById(R.id.cardcontent);
        LinearLayout cardviolent1 = (LinearLayout )findViewById(R.id.cardviolent);
        LinearLayout cardtranslate1 = (LinearLayout )findViewById(R.id.cardtranslate);
        LinearLayout cardother1 = (LinearLayout )findViewById(R.id.cardother);




        cardinfo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CardView.this, CardInfoActivity.class);
                startActivity(intent);
            }
        });

        cardspelling1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CardView.this, CardSpellingActivity.class);
                startActivity(intent);
            }
        });

        cardcontent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CardView.this, CardContentActivity.class);
                startActivity(intent);
            }
        });
        cardviolent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CardView.this, CardViolentActivity.class);
                startActivity(intent);
            }
        });
        cardtranslate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CardView.this, CardTranslateActivity.class);
                startActivity(intent);
            }
        });
        cardother1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CardView.this, CardOtherActivity.class);
                startActivity(intent);
            }
        });



    }
}