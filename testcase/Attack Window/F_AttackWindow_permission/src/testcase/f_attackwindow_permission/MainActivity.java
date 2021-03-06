package testcase.f_attackwindow_permission;

import testcase.t_attackwindow.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		IntentFilter mIntentFilter = new IntentFilter();
		mIntentFilter.addAction("com.example.testAction");
		MyReceiver myReceiver = new MyReceiver();
		this.registerReceiver(myReceiver, mIntentFilter,"com.example.mypermission2",null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
