package co.com.primerreto;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Romeo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romeo);
    }
    MediaPlayer mediaPlayer = new MediaPlayer();

    public void playromeo(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.farsante);
        mediaPlayer.start();
    }
    public void stopromeo(View view) {
        mediaPlayer.stop();
    }
}