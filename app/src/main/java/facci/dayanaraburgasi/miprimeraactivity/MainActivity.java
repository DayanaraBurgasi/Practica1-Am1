package facci.dayanaraburgasi.miprimeraactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("error", "Dayanara Yamileth Burgasi Rovayo ");
        String idioma = Locale.getDefault().getLanguage();
        if(idioma=="es") {
            setContentView(R.layout.activity_main2);
        }else{
            setContentView(R.layout.activity_main3);
        }

    }
    public void paginaDos(View view){
        Intent i= new Intent(this,MainActivity2.class);
        startActivity(i);
    }
}