package edu.pk.iba.interfrag;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {
	private View view;
String data;
TextView tv;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
	view= inflater.inflate(R.layout.fragment_b, container, false);
	return view;
	}
	
	
	public void changeText(String data){
	this.data=data;
		tv.setText(data);
		
	}


	@Override
	public void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
	outState.putString("value", data);
	}


	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
	
	 tv=(TextView)view.findViewById(R.id.textView1);
		
		if(savedInstanceState==null){
			
		}else{
	data=savedInstanceState.getString("value");
	tv.setText(data);
		}
	}
}
