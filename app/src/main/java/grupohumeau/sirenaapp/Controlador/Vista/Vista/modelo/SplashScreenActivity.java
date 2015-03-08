package grupohumeau.sirenaapp.Controlador.Vista.Vista.modelo;




import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;

import grupohumeau.sirenaapp.R;


public class SplashScreenActivity extends Activity {

    private static final long Splash_screen_duration = 3000;

    // https://amatellanes.wordpress.com/2013/08/27/android-crear-un-splash-screen-en-android/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set portrait orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //Hide title bar
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splash_screen);


        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // Start he next activity
                Intent mainIntent = new Intent().setClass(SplashScreenActivity.this, Inicio.class);
                startActivity(mainIntent);
                // Close the activity so the user won't able to go back this
                // activity pressing Back button
                finish();
            }


        };


        Timer timer = new Timer();
        timer.schedule(task, Splash_screen_duration);
    }

    }






