package edu.montclair.mobilecomputing.m_alrajab.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import edu.montclair.mobilecomputing.m_alrajab.assignment_1.Utils.Utils;

public class MainActivity extends AppCompatActivity {
    private EditText usr, pass;
    private Button forgotPass, register;
    private View lastview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usr = (EditText) findViewById(R.id.Reg_UserName);
        pass = (EditText) findViewById(R.id.Reg_pass1);
        forgotPass = (Button) findViewById(R.id.btn_forgetpassword_MA);
        register = (Button) findViewById(R.id.btn_register_MA);
        forgotPass.setOnClickListener(new MyLstnr());
        register.setOnClickListener(new MyLstnr());

        lastview = null;
    }
    
    class MyLstnr implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, RegistrationPage.class);
            intent.putExtra(Utils.MSG_KEY_INTENT, "Enter Your Username " + usr.getText());
            intent.putExtra(Utils.MSG_KEY_2, "Enter Your Password " + pass.getText());
            startActivity(intent);
        }
    }
}
