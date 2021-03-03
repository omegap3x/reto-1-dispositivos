package co.com.primerreto;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Omar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omar);
    }
    MediaPlayer mediaPlayer = new MediaPlayer();

    public void playomar(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.taboo);
        mediaPlayer.start();
    }
    public void stopomar(View view) {
        mediaPlayer.stop();
    }
}