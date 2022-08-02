package ug.ac.utamu.map;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    //global variables
    TextView txt_welcome;
    EditText edtx_username, edtx_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //new codes
        //make reference to the widget
        edtx_username =  findViewById(R.id.edx_username);
        txt_welcome = findViewById(R.id.txv_welcome);

        //trying to set text in a textview widget
        String welcome_two = "New welcome from UTAMU.";
        txt_welcome.setText(welcome_two);

    }
}