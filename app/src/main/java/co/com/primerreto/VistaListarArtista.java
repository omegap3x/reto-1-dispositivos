package co.com.primerreto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class VistaListarArtista extends AppCompatActivity {

    Spinner spinner;
    AutoCompleteTextView autoComplete;
    String[] artistas = new String[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_listar_artista);
        initComponent();
        loadInformation();
        onItemSelectetSpinner();
        setInfoAutocomplete();
    }

    private void setInfoAutocomplete() {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.select_dialog_item,artistas);
        autoComplete.setAdapter(arrayAdapter);
        autoComplete.setOnClickListener(v -> {

        });
    }

    private void onItemSelectetSpinner() {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, artistas);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(getArtista(position)==getString(R.string.romeo)){
                    goToRomeo(view);
                }
                else if (getArtista(position)==getString(R.string.daddy)){
                    goToDaddy(view);
                }
                else if (getArtista(position)==getString(R.string.karol)){
                    goToKarol(view);
                }
                else if (getArtista(position)==getString(R.string.omar)){
                    goToOmar(view);
                }
                else if (getArtista(position)==getString(R.string.fonsi)){
                    goToFonsi(view);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initComponent() {
        spinner = findViewById(R.id.spinnerArtistas);
        autoComplete=findViewById(R.id.autoCompleteTextView);
    }

    private void loadInformation() {

        artistas[0]=getString(R.string.vacio);
        artistas[1]=getString(R.string.romeo);
        artistas[2]=getString(R.string.daddy);
        artistas[3]=getString(R.string.karol);
        artistas[4]=getString(R.string.omar);
        artistas[5]=getString(R.string.fonsi);
    }

    private String getArtista(int index){
        return artistas[index];
    }
    public void goToRomeo(View view) {
        Intent intent = new Intent(this, Romeo.class);
        startActivity(intent);
    }
    public void goToDaddy(View view) {
        Intent intent = new Intent(this, Daddy.class);
        startActivity(intent);
    }
    public void goToKarol(View view) {
        Intent intent = new Intent(this, Karol.class);
        startActivity(intent);
    }
    public void goToOmar(View view) {
        Intent intent = new Intent(this, Omar.class);
        startActivity(intent);
    }
    public void goToFonsi(View view) {
        Intent intent = new Intent(this, Fonsi.class);
        startActivity(intent);
    }

}