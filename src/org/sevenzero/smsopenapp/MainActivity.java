package org.sevenzero.smsopenapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Intent intent = getIntent();
		String scheme = intent.getScheme();
		Uri uri = intent.getData();
		System.out.println("scheme:" + scheme);
		if (uri != null) {
			String host = uri.getHost();
			String dataString = intent.getDataString();
			String id = uri.getQueryParameter("args");
			String b = uri.getQueryParameter("a");
			String path = uri.getPath();
			String path1 = uri.getEncodedPath();
			String queryString = uri.getQuery();
			
			System.out.println("host:" + host);
			System.out.println("dataString:" + dataString);
			System.out.println("id:" + id + ", b: " + b);
			System.out.println("path:" + path);
			System.out.println("path1:" + path1);
			System.out.println("queryString:" + queryString);
		}
		
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
