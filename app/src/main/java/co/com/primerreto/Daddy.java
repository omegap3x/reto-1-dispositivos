package co.com.primerreto;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Daddy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daddy);
    }

    MediaPlayer mediaPlayer = new MediaPlayer();
    public void playdaddy(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.llamada);
        mediaPlayer.start();
    }

    public void stopdaddy(View view) {
        mediaPlayer.stop();
    }
}