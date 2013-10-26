package com.example.proba;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	Button buttonHr, buttonEn;
	public static final String TOAST_MESSAGE = "svasta nesto";

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImageView imgView;
		Drawable drawable;

		buttonHr = (Button) findViewById(R.id.button_hr);
		buttonHr.setOnClickListener(this);
		// buttonHr.setClickable(false);
		// buttonHr.setEnabled(false);


		
		buttonEn = (Button) findViewById(R.id.button_eng);
		buttonEn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Toast toast;

		switch (v.getId()) {
		case R.id.button_hr:
			toast = Toast.makeText(this, TOAST_MESSAGE, Toast.LENGTH_SHORT);
			toast.show();
			// textNaziv.setBackgroundColor(Color.GREEN);
			// textNaziv.setTextColor(Color.WHITE);
			buttonHr.setEnabled(false);
			buttonEn.setEnabled(true);
			break;
		case R.id.button_eng:
			toast = Toast.makeText(this, TOAST_MESSAGE, Toast.LENGTH_SHORT);
			toast.show();
			buttonEn.setEnabled(false);
			buttonHr.setEnabled(true);
			// textNaziv.setBackgroundColor(Color.RED);s
			// textNaziv.setTextColor(Color.WHITE);
			break;

		}
	}
}
