package edu.pk.iba.interfrag;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity implements Communicator{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public void respond(String data) {
	
		FragmentManager fm= getFragmentManager();
		FragmentB fb=(FragmentB)fm.findFragmentById(R.id.fragment2);
		fb.changeText(data);
		
	}
}
