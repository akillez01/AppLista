package devandroid.achillessouza.applista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.achillessouza.applista.R;
import devandroid.achillessouza.applista.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String getDadosPessoa;

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

        dadosPessoa = " Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();


        int parada = 0;


    }
}