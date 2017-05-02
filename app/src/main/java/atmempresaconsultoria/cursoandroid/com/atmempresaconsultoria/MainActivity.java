package atmempresaconsultoria.cursoandroid.com.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
    ImageView empresa;
    ImageView servico;
    ImageView cliente;
    ImageView contato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        empresa = (ImageView) findViewById(R.id.empresaId);
        servico = (ImageView) findViewById(R.id.servicoId);
        cliente = (ImageView) findViewById(R.id.clienteId);
        contato = (ImageView) findViewById(R.id.contatoId);

        empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
            }
        });
    }
}
