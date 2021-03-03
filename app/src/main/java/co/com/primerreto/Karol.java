package co.com.primerreto;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Karol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karol);
    }
    MediaPlayer mediaPlayer = new MediaPlayer();

    public void playkarol(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.bichota);
        mediaPlayer.start();
    }
    public void stopkarol(View view) {
        mediaPlayer.stop();
    }

}