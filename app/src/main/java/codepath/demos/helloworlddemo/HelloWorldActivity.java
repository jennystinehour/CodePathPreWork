package codepath.demos.helloworlddemo;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class HelloWorldActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_world);
		Button button = (Button) findViewById(R.id.helloButton);
		Context ctx = getApplicationContext();
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Do something in response to button click
				Toast.makeText(ctx,getGreeting(), Toast.LENGTH_SHORT).show();
				Log.v("hello world", "button clicked");
			}
		});

	}

	private String getGreeting() {
		ArrayList<String> greetings = new ArrayList<>();
		greetings.add("Snoopy waves back");
		greetings.add("Snoopy wishes you a happy early holiday (always one coming)");
		greetings.add("Happy holidays!");
		greetings.add("Snoopy says, \"Be yourself!\"");
		Random rand = new Random();
		int randInd = rand.nextInt(greetings.size());
		return greetings.get(randInd);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_hello_world, menu);
		return true;
	}

}
