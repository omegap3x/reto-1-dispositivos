package co.com.primerreto;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Fonsi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fonsi);
    }

    MediaPlayer mediaPlayer = new MediaPlayer();

    public void playfonsi(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.despacito);
        mediaPlayer.start();
    }
    public void stopfonsi(View view) {
        mediaPlayer.stop();
    }
}