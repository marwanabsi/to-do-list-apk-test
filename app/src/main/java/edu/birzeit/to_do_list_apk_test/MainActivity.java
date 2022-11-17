package edu.birzeit.to_do_list_apk_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText topic;
    private Button show;
    private RadioGroup radioGroup;
    private Spinner toDoSpinner;
    private TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onSetup();
    }

    private void onSetup() {
        topic = findViewById(R.id.topic);
        show = findViewById(R.id.show);
        radioGroup = findViewById(R.id.level);
        toDoSpinner=findViewById(R.id.toDoSpinner);
        result=findViewById(R.id.result);

    }

    public void showData(View view) {
        String msg = topic.getText().toString();
        int id = radioGroup.getCheckedRadioButtonId();
        RadioButton rd = findViewById(id);

        String level ="";
        if (id != -1 ){
            level = rd.getText().toString();
        }

        String spinner = toDoSpinner.getSelectedItem().toString();


        String resltt = msg +" and ur level "+ level +" and type is : "+ spinner;
        result.setVisibility(View.VISIBLE);
        result.setText(resltt);



    }
}