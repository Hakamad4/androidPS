package br.com.fiap.estudosps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class IndexActivity extends AppCompatActivity {

    List<CheckBox> checkBoxList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        checkBoxList.add((CheckBox) findViewById(R.id.chkLanche1));
        checkBoxList.add((CheckBox) findViewById(R.id.chkLanche2));
    }

    public void calcular(View view) {
        float total = 0;
        for(CheckBox chk : checkBoxList){
            if(chk.isChecked()){
                total += 15;
            }
        }
        Toast.makeText(this, "Voce tem "+total+" Alans Gipenes.", Toast.LENGTH_SHORT).show();
    }
}
