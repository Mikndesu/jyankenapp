package com.example.myapplicationjyanken;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView player, result;
    ImageView cpu;
    String otherhand_1 = "敵の手はグーです",
           otherhand_2 = "敵の手はチョキです",
           otherhand_3 = "敵の手はパーです",
           //btofresult = Battle of Result
           btofresult_1 = "あなたの勝ちです",
           btofresult_2 = "引き分けです",
           btofresult_3 = "あなたの負けです";

    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player = (TextView)findViewById(R.id.player);
        cpu = (ImageView)findViewById(R.id.cpu);
        result = (TextView)findViewById(R.id.result);
    }

    public void goo (View v) {
        player.setText("あなたの手はグーです");
        Random random = new Random();
        number = random.nextInt(3);

        switch (number) {

            case 1:
                cpu.setImageResource(R.drawable.goo);
                result.setText(btofresult_2);
                result.setTextColor(Color.rgb(255, 0, 0));
                break;

            case 2:
                cpu.setImageResource(R.drawable.choki);
                result.setText(btofresult_1);
                result.setTextColor(Color.rgb(255, 0, 0));
                break;

            case 3:
                cpu.setImageResource(R.drawable.paa);
                result.setText(btofresult_3);
                result.setTextColor(Color.rgb(255, 0, 0));
                break;

            default:
                break;
        }

        }

    public void choki (View v) {

        player.setText("あなたの手はチョキです");
        Random random = new Random();
        number = random.nextInt(3);

        switch (number) {

            case 1:
                cpu.setImageResource(R.drawable.goo);
                result.setText(btofresult_3);
                result.setTextColor(Color.rgb(255, 0, 0));
                break;

            case 2:
                cpu.setImageResource(R.drawable.choki);
                result.setText(btofresult_2);
                result.setTextColor(Color.rgb(255, 0, 0));
                break;

            case 3:
                cpu.setImageResource(R.drawable.paa);
                result.setText(btofresult_1);
                result.setTextColor(Color.rgb(255, 0, 0));
                break;

            default:
                break;
        }

    }

    public void paa (View v) {

        player.setText("あなたの手はパーです");
        Random random = new Random();
        number = random.nextInt(3);

        switch (number) {

            case 1:
                cpu.setImageResource(R.drawable.goo);
                result.setText(btofresult_1);
                result.setTextColor(Color.rgb(255, 0, 0));
                break;

            case 2:
                cpu.setImageResource(R.drawable.choki);
                result.setText(btofresult_3);
                result.setTextColor(Color.rgb(255, 0, 0));
                break;
            case 3:
                cpu.setImageResource(R.drawable.paa);
                result.setText(btofresult_2);
                result.setTextColor(Color.rgb(255, 0, 0));
                break;

            default:
                break;
        }


    }
}
