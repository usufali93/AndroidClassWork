package edu.pk.iba.interfrag;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentA extends Fragment {

	private View view;
	private Button btn;
Communicator comm;
int counter=0;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
	view= inflater.inflate(R.layout.fragment_a, container, false);
	return view;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		if(savedInstanceState==null){
			counter=0;
		}else{
		counter=savedInstanceState.getInt("counter",0);
		}
		}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
		outState.putInt("counter", counter);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		
		super.onActivityCreated(savedInstanceState);
		btn=(Button)view.findViewById(R.id.button1);
		comm=(Communicator)getActivity();
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			counter++;
				comm.respond("you have clicked "+counter+" times");
				
			}
		});
	}

	
	
	
	
	
}
