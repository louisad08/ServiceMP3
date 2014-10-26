package com.example.servicemp3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	Button play, stop;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		play = (Button) findViewById(R.id.btplay);
		stop = (Button) findViewById(R.id.btstop);
		play.setOnClickListener(this);
		stop.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btplay:
			Intent service = new Intent(MainActivity.this, MyService.class);
			startService(service);
			break;
		case R.id.btstop:
			Intent name = new Intent(MainActivity.this, MyService.class);
			stopService(name);

			break;

		}
	}

}
