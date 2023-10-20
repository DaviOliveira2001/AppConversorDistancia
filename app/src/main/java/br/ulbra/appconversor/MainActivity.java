package br.ulbra.appconversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtM, edtP;
    TextView txtResult, txtResultado;
    Button btnMP;
    double v1, v2, calculo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtP = (EditText)findViewById(R.id.edtP);
        edtM = (EditText)findViewById(R.id.edtM);
        btnMP = (Button)findViewById(R.id.btnMP);
        txtResultado = (TextView)findViewById(R.id.txtResposta);
        txtResult = (TextView)findViewById(R.id.txtResult);

        btnMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtM.getText().toString().equals("")){
                    v2 = Double.parseDouble(edtP.getText().toString());
                    calculo = v2 * 3.28084;
                    txtResult.setText( v2+" pés em Metros é "+calculo);
                }else{
                    v1 = Double.parseDouble(edtM.getText().toString());
                    calculo = v1 / 3.28084;
                    txtResult.setText(String.format( v1 + " metros em Pés é " + calculo));
                }
            }
        });


    }
}