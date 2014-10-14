package activities;

import android.app.Activity;
import android.os.Bundle;
import com.example.userlogin.R;

public class LogOutActivity extends Activity {
	private static final int TIEMPO = 2000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_logout);
		//Creamos un hilo para hacer que la pantalla se muestre 2 segundos
		// y despues se vuelva a la activtyMain
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(TIEMPO);
					finish();
				} catch (Exception e) {

				}

			}
		}).start();

	}

}
