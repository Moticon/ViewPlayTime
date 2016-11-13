package com.moticon.viewplaytime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button testButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testButton = (Button) this.findViewById(R.id.button);
        testButton.setOnClickListener(test);
    }


    public View.OnClickListener test = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            doNothing();
        }
    };

    void doNothing(){
        float elevation = testButton.getElevation();
        if (elevation <50){
            testButton.setElevation(elevation*10);
            testButton.setTranslationZ(100);
            testButton.setText("100");
        } else {
            testButton.setElevation(elevation/10);
            testButton.setTranslationZ(elevation/10);
            testButton.setText("5");
        }

    }

}
