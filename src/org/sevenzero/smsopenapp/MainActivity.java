package org.sevenzero.smsopenapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
//	private Button.OnClickListener button_clickListener = new Button.OnClickListener(){
//		@Override
//		public void onClick(View v) {
//			try {				
//				URL url = new URL("http://youngo.com/app/");
//				
//				intentToSms("18511115554",url.toString());
//				
//			} catch (MalformedURLException e) {
//				e.printStackTrace();
//			}
//		}
//    	
//    };
//    
//    
//    private void intentToSms(String tel, String msg){
//    	Uri uri = Uri.parse("smsto:"+tel);
//		Intent intent = new Intent(Intent.ACTION_SENDTO,uri);			
//		intent.putExtra("sms_body", msg);
//		startActivity(intent);
//    }

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
