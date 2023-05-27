package devandroid.achillessouza.applista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.achillessouza.applista.R;
import devandroid.achillessouza.applista.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String getDadosPessoa;

    EditText editPrimeiroNome;
    EditText editSobreNomeAluno;
    EditText editNomeDoCurso;
    EditText editTelefoneContato;

    Button btnLimppar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        // Atribuir conteúdo, dados, valores para o Objeto
        // Comforme o seu MODELO, TEMPLATE
        pessoa.setPrimeiroNome("Achilles");
        pessoa.setSobreNome("Souza");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("92-993742692");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome(" Luiz ");
        outraPessoa.setSobreNome(" Alves ");
        outraPessoa.setCursoDesejado(" Java ");
        outraPessoa.setTelefoneContato("92-999999999");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobreNomeAluno = findViewById(R.id.editSobreNomeAluno);
        editNomeDoCurso = findViewById(R.id.editNomeDoCurso);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        btnLimppar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobreNomeAluno.setText(pessoa.getSobreNome());
        editNomeDoCurso.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());

        btnLimppar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editPrimeiroNome.setText("");
                editSobreNomeAluno.setText("");
                editNomeDoCurso.setText("");
                editTelefoneContato.setText("");

            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Volte sempre",Toast.LENGTH_LONG).show();
               finish();

            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobreNomeAluno.getText().toString());
                pessoa.setCursoDesejado(editNomeDoCurso.getText().toString());
                pessoa.setTelefoneContato(editTelefoneContato.getText().toString());

                Toast.makeText(MainActivity.this,"Salvo"+pessoa.toString(),Toast.LENGTH_LONG).show();
                finish();

            }
        });


        Log.i("POOAndroid",pessoa.toString());
        Log.i("POOAndroid",outraPessoa.toString());Log.i("POOAndroid",pessoa.toString());


    }
}