package facci.dayanaraburgasi.miprimeraactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button convertir=null;
    EditText cantidad=null;
    TextView resultado=null;
    Spinner spincl=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        convertir =(Button) findViewById(R.id.buttonConv);
        cantidad=(EditText) findViewById(R.id.cant);
        resultado =(TextView) findViewById(R.id.result);
        spincl =(Spinner) findViewById(R.id.spin);

        String[] op={"Seleccione una opcion","°C a °F","°F a °C  "};

        ArrayAdapter<String> adapter = new
                ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,op);
        spincl.setAdapter(adapter);

        convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cantidad.getText().toString().equals("")){
                    Toast msg=Toast.makeText(getApplicationContext(),"Escriba uan cantidad ",Toast.LENGTH_SHORT);
                    msg.show();
                }else{
                    Double c=Double.parseDouble(cantidad.getText().toString());
                    Double res=null;
                    int select=spincl.getSelectedItemPosition();

                    switch (select){
                        case 0:
                            res=0.0;
                            Toast.makeText(getApplicationContext(),"Seleccione una opcion",Toast.LENGTH_SHORT).show();
                            break;
                        case 1:
                            res=1.8 * c + 32;
                            break;
                        case 2:
                            res=(c-32)/1.8;
                            break;
                    }
                    resultado.setText(res.toString());
                }
            }
        });
    }
}