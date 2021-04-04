package com.example.avaliaoi;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEdit;
    private EditText passwordEdit;
    private Button SingInbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Procura os componentes pela Idactivity_table
        usernameEdit = findViewById(R.id.usernameEdit);
        passwordEdit = findViewById(R.id.passwordEdit);
        SingInbtn = findViewById(R.id.SingInbtn);

        SingInbtn.setOnClickListener(new View.OnClickListener() {

            /*Metodo que executa uma ação quando clicado no botão SingIn, nesse caso,
             verifica se os campos estão vazios bem como se os usuários equivalem ao
             que foi solicitado no exercicio*/
            @Override
            public void onClick(View v) {

                if (usernameEdit.getText().toString().isEmpty())
                    usernameEdit.setError("O campo não pode estar vázio!");
                else if(passwordEdit.getText().toString().isEmpty())
                    passwordEdit.setError("Preencha os campos corretamente");
                else{
                    if (usernameEdit.getText().toString().equals("Administrador")
                            && (passwordEdit.getText().toString().equals("Administrador")))
                            Toast.makeText(MainActivity.this, "Successfully loggedin!", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(MainActivity.this, "Please, verify the user and the password!", Toast.LENGTH_LONG).show();
                    if (usernameEdit.getText().toString().equals("Adm")
                            && (passwordEdit.getText().toString().equals("Adm123")))
                        Toast.makeText(MainActivity.this, "Successfully loggedin!", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(MainActivity.this, "Please, verify the user and the password!", Toast.LENGTH_LONG).show();
                    if (usernameEdit.getText().toString().equals("Administrator")
                            && (passwordEdit.getText().toString().equals("Que3B1eng4ElT0r0")))
                        Toast.makeText(MainActivity.this, "Successfully loggedin!", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(MainActivity.this, "Please, verify the user and the password!", Toast.LENGTH_LONG).show();
                    if (usernameEdit.getText().toString().equals("Root")
                            && (passwordEdit.getText().toString().equals("pr0m1uscu0")))
                        Toast.makeText(MainActivity.this, "Successfully loggedin!", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(MainActivity.this, "Please, verify the user and the password!", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}