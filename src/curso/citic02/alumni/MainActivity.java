package curso.citic02.alumni;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * Main Activity
 * 
 * @author pablo
 */
public class MainActivity extends Activity {
	
	private static Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		context= this;
		//Sets layout for the activity
		setContentView(R.layout.activity_main);
		
		// Preparing onClick action for hello btn
		Button btn = (Button)findViewById(R.id.btnHello);
		btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Toast.makeText(context, getResources().getString(R.string.welcome), Toast.LENGTH_LONG).show();				
			}
		});
		
		Button btnCreate = (Button)findViewById(R.id.btnCreate);
		btnCreate.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, CreateAlumni.class);
				startActivity(i);
			}
		});		
		
		Button btnList = (Button)findViewById(R.id.btnOpenList);
		btnList.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, AlumniList.class);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
