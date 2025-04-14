package br.com.temdetudo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmacaoActivity extends AppCompatActivity {

    TextView textViewNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao);

        textViewNome = findViewById(R.id.textViewNome);

        // Recebe o nome enviado pela tela anterior
        Intent intent = getIntent();
        String nome = intent.getStringExtra("nomeUsuario");

        // Exibe o nome (sem texto adicional)
        textViewNome.setText(nome);
    }

    // Quando o botão "Fechar" for clicado, volta para a MainActivity
    public void fechar(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

