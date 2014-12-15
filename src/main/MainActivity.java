package main;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.testjni.R;

public class MainActivity extends Activity {

	EditText et;
	TextView tv;
	Button bt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		et = (EditText) findViewById(R.id.et);
		tv = (TextView) findViewById(R.id.tv);
		bt = (Button) findViewById(R.id.bt);
		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int nb = Integer.parseInt(et.getText().toString());
				tv.setText(Root.root(nb)+"");
			}
		});
	}
}
