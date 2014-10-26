package com.example.servicemp3;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService extends Service {
	MediaPlayer mp;

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		mp = MediaPlayer.create(getApplicationContext(), R.raw.test1);

	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		mp.start();
		return 0;
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		mp.release();
		super.onDestroy();

	}

}
