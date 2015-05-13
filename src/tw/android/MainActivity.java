package tw.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText etWrite;
	private Button btWrite;
	private Write write = new Write(MainActivity.this);

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		etWrite = (EditText) findViewById(R.id.etWrite);
		btWrite = (Button) findViewById(R.id.btWrite);

		btWrite.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {

				write.WriteFileExample(etWrite.getText().toString()); // 寫入輸入文字
			}
		});

	}
}