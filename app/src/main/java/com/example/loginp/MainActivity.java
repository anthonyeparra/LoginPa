package com.example.loginp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText pass;
    String emailv;
    String passv;
    RadioButton rd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* getSupportActionBar().setTitle(Html.fromHtml("<p align=center>Log in</p>"));
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        //getSupportActionBar().setCustomView(R.layout.abs_layout);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/
       email=findViewById(R.id.editmai);
       pass=findViewById(R.id.editpass);
       rd=findViewById(R.id.rdshowPass);
        //nomostrarcontraseña();

    }

    public void getRecuros(String message){
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
    public void login(View view){
        //Toast.makeText(this,"Entro",Toast.LENGTH_SHORT);
        emailv= email.getText().toString();
        passv= pass.getText().toString();

        if(emailv.equalsIgnoreCase("Anthony")&&passv.equals("123")) {
            Intent login = new Intent(this, contenido.class);
            startActivity(login);
            getRecuros(getString(R.string.Contraseñacorrecta));
            //rd.setChecked(true);
            pass.setText("");
        }else{
            getRecuros(getString(R.string.Contraseñaincorrecta));
            pass.setText("");
        }


    }
    public void toastface(View view){
        Intent login = new Intent(this, contenido.class);
        startActivity(login);
        getRecuros(getString(R.string.ToastFacebook));
    }
    public void toastgoogle(View view){
        Intent login = new Intent(this, contenido.class);
        startActivity(login);
        getRecuros(getString(R.string.ToastGoogle));
    }
    public void onRadioButtonClicked(View view) {
        //boolean checked = ((RadioButton) view).isChecked();
        boolean checked=rd.isChecked()==true;
        switch (view.getId()) {
            case R.id.rdshowPass:
                if (checked) {
                    mostrarcontraseña();
                    //getRecuros(getString(R.string.rdshowPass));
                    //rd.setChecked(false);
                }
                break;
            default:
                break;
        }
    }
    public void mostrarcontraseña(){
      //pass.setTransformationMethod(PasswordTransformationMethod.getInstance());
        if(!(pass.getText().toString().isEmpty())) {
            //mostrarC = pass.getText().toString();
            pass.setInputType(InputType.TYPE_CLASS_NUMBER);
            pass.setText(pass.getText().toString());
        }else{
            Toast.makeText(this, "El campo contraseña esta vacio", Toast.LENGTH_SHORT).show();
        }
    }
    public void nomostrarcontraseña(){
        //pass.setTransformationMethod(PasswordTransformationMethod.getInstance());
        if(!(pass.getText().toString().isEmpty())) {
            //mostrarC = pass.getText().toString();
            pass.setText(pass.getText().toString());
            rd.setChecked(false);
        }
    }



}
