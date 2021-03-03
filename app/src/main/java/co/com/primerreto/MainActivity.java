package co.com.primerreto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void goToListArtista(View view) {
        Intent intent = new Intent(this, VistaListarArtista.class);
        startActivity(intent);
    }
    public void goToHojaDeVida(View view) {
        Intent intent = new Intent(this, VistaHojaDeVida.class);
        startActivity(intent);
    }
    public void goToArtista(View view) {
        Intent intent = new Intent(this, VistaListarArtista.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}