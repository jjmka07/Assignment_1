package edu.montclair.mobilecomputing.m_alrajab.assignment_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationPage extends AppCompatActivity {

    private EditText usrname, your_name, major, msuemail, passwd, confirmPass;
    private Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);
        reg = (Button) findViewById(R.id.btn_Reg);
        usrname = (EditText) findViewById(R.id.Reg_UserName);
        your_name = (EditText) findViewById(R.id.Reg_SName);
        major = (EditText) findViewById(R.id.Reg_SMajor);
        msuemail = (EditText) findViewById(R.id.Reg_Email);
        passwd = (EditText) findViewById(R.id.Reg_pass1);
        confirmPass = (EditText) findViewById(R.id.Reg_pass2);


    }

    public boolean isPasswordMatching(String passwd, String confirmPass){
        Pattern pattern = Pattern.compile(passwd, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(confirmPass);

        if (!matcher.matches()){
            return false;
        }
        return true;
    }
}
