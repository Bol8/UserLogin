package activities;

import android.app.Activity;
import com.example.userlogin.R;
import codigo.*;
import android.os.Bundle;
import android.widget.TextView;

public class LogInActivity extends Activity {
	TextView usuario, contrasena;
	UserLogin user;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		usuario = (TextView) findViewById(R.id.textUsuario);
		contrasena = (TextView) findViewById(R.id.textContrasena);
		user = (UserLogin) getIntent().getExtras().getSerializable("Objeto");
		usuario.setText(user.getLogin());
		contrasena.setText(user.getPassword());
		
	}

}

