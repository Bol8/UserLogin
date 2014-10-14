package activities;

import com.example.userlogin.R;
import codigo.*;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	private static final String LOGTAG = "MainActivity";
	EditText login, password;
	Button btn;
	UserLogin user;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Obtenemos una referencia a los controles de la interfaz
		login = (EditText) findViewById(R.id.editLogin);
		password = (EditText) findViewById(R.id.editPassword);
		btn = (Button) findViewById(R.id.button1);

	}

	public void onButtonClickCaptarDatos(View view) {
		String log, pass;

		try {
			// Obtenemos los datos
			log = login.getText().toString();
			pass = password.getText().toString();
			// Creamos objeto si los datos son correctos
			user = new UserLogin(log, pass);
			// Llamamos al método encargado de llamar a "activity_login"
			llamadaLogIN(user);
		} catch (UserLoginException e) {
			llamadaLogOut();
			//Log.e(LOGTAG, e.getMessage());

		} catch (Exception e) {
			Log.e(LOGTAG, e.getMessage());
		}

	}

	private void llamadaLogIN(UserLogin user) {
		// Creamos el intent indicandole a que Activity debe llamar y desde
		// donde
		Intent intent = new Intent(this, LogInActivity.class);
		// Le añadimo al intent el objeto a pasar y le ponemos una etiqueta
		intent.putExtra("Objeto", user);
		// Inciamos la activity correspondiente enviandole el intent
		startActivity(intent);

	}

	private void llamadaLogOut() {
		// Creamos el intent indicandole a que Activity debe llamar y desde
		// donde
		Intent intent = new Intent(this, LogOutActivity.class);
		// Inciamos la activity correspondiente enviandole el intent
		startActivity(intent);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

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
