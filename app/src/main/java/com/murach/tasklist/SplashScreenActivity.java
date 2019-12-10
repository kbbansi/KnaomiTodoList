package com.murach.tasklist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // setTheme(R.style.SplashTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        SplashLaunch splashLaunch = new SplashLaunch();
        splashLaunch.run();
    }

    private class SplashLaunch extends Thread {
        public void run() {
            try {
                sleep(4000); // will cause the screen to display for 4 sec
            } catch (InterruptedException e) {
                e.printStackTrace(); // errors will be printed in stacktrace
                e.getLocalizedMessage();
            }
            Intent intent = new Intent(SplashScreenActivity.this, TaskListActivity.class); // set start screen and next screen to move
            startActivity(intent);
            SplashScreenActivity.this.finish();
        }
    }
}
