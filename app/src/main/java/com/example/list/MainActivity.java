package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvProgram;
    String[] programName = {"Islamabad", "Karachi", "Lahore", "Multan", "Peshawar", "Quetta",
            "Islamabad", "Karachi", "Lahore", "Multan", "Peshawar", "Quetta"};
    String[] programDescription = {"Islamabad United", "Karachi Kings", "Lahore Qalandar", "Multan Sultan", "Peshawar Zalmi", "Quetta Gladiators",
            "Islamabad United", "Karachi Kings", "Lahore Qalandar", "Multan Sultan", "Peshawar Zalmi", "Quetta Gladiators"};

    int[] programImages = {R.drawable.isl,R.drawable.kara, R.drawable.laho, R.drawable.mult,R.drawable.pesh,R.drawable.quet,
            R.drawable.isl,R.drawable.kara, R.drawable.laho, R.drawable.mult,R.drawable.pesh,R.drawable.quet};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProgram = findViewById(R.id.lvprogram);
        ProgramAdapter programAdapter = new ProgramAdapter(this,
                programName, programImages, programDescription);
        lvProgram.setAdapter(programAdapter);
    }
}