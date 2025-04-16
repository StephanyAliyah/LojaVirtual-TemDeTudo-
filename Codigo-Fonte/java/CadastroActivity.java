package br.com.temdetudo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CadastroActivity extends AppCompatActivity {

    EditText editTextNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastro);

        editTextNome = findViewById(R.id.editTextNome);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Botão "Avançar"
    public void avancar(View view) {
        String nomeDigitado = editTextNome.getText().toString().trim();

        if (!nomeDigitado.isEmpty()) {
            Intent intent = new Intent(this, ConfirmacaoActivity.class);
            intent.putExtra("nomeUsuario", nomeDigitado); // agora envia o nome
            startActivity(intent);
        }
        // Se o campo estiver vazio, não faz nada
    }

    // Botão "Limpar"
    public void limpar(View view) {
        editTextNome.setText("");
    }

    // Botão "Fechar"
    public void fechar(View view) {
        finish();
    }
}
