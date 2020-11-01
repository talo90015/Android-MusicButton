package com.example.musicbtn;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;

import java.security.Provider;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        AudioManager audioManager = (AudioManager)getSystemService(Service.AUDIO_SERVICE);
        switch (keyCode){
            case KeyEvent.KEYCODE_VOLUME_UP:
                Log.d("T", "音量提升按鍵");
                audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, AudioManager.ADJUST_RAISE,
                        AudioManager.FLAG_SHOW_UI);
                break;
            case  KeyEvent.KEYCODE_VOLUME_DOWN:
                Log.d("T", "音量減少按鍵");
                audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, AudioManager.ADJUST_LOWER,
                        AudioManager.FLAG_SHOW_UI);
                break;
            default:
                break;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}