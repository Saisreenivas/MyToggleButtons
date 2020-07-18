package com.saisreenivas.inputcontrols.mytogglebuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton switchType;
    private TextView resultType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchType =(ToggleButton) findViewById(R.id.SwitchId);
        resultType = (TextView) findViewById(R.id.textView2);

        switchType.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    resultType.setVisibility(View.VISIBLE);
                }else{
                    resultType.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
