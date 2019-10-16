package camera.filters.hdresult.myclockwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AnalogClock analogWidget;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  analogWidget = findViewById(R.id.simpleAnalogClock);
        analogWidget.setBackgroundColor(Color.GRAY);
        analogWidget.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Analog Clock", Toast.LENGTH_SHORT).show();
            }
        });

       */


    }
}
