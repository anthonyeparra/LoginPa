package com.example.loginp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class contenido extends AppCompatActivity {
    private String imagen = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Intent intent = getIntent();

       // FloatingActionButton fab = findViewById(R.id.fab);
        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
    public void toast(View view){
        Toast.makeText(this,"Estas seleccionado el boton Visit",Toast.LENGTH_LONG).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.home){
            Toast.makeText(this, "Haz presionado el icono Home, seras transmitido al Login",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }else if(id==R.id.following){
            Toast.makeText(this, "Haz presionado el icono Following",Toast.LENGTH_SHORT).show();
        }else if(id==R.id.notifciaciones){
            Toast.makeText(this, "Haz presionado el icono Notificaciones",Toast.LENGTH_SHORT).show();
        }else if(id==R.id.saved){
            if (imagen.isEmpty()) {
                Toast.makeText(this, "Seleccione la imagen",Toast.LENGTH_SHORT).show();
            }else{
                Intent intent = new Intent(this, formulario.class);
                startActivity(intent);
            }
        }


        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }
    public void Mimagen(View view) {
        Toast.makeText(this,"Seleccionaste la imagen",Toast.LENGTH_SHORT).show();
        imagen="Seleccionaste la imagen";
    }

}
