package kailaine.mobile.atv_06_exec_1_poo_calcsalario_20_10;
/*
 *@author:<Kailaine Almeida de Souza RA: 1110482313026>
 */
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import kailaine.mobile.atv_06_exec_1_poo_calcsalario_20_10.model.Professor;
import kailaine.mobile.atv_06_exec_1_poo_calcsalario_20_10.model.ProfessorHorista;
import kailaine.mobile.atv_06_exec_1_poo_calcsalario_20_10.model.ProfessorTitular;

public class MainActivity extends AppCompatActivity {

    private EditText etHoraSal, etValorAnos;
    private TextView tvTexto1, tvTexto2, tvEscolha, tvResultado;
    private RadioButton rbHorista, rbTitular;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        etHoraSal = findViewById(R.id.etHoraSal);
        etValorAnos = findViewById(R.id.etValorAnos);
        tvTexto1 = findViewById(R.id.tvTexto1);
        tvTexto2 = findViewById(R.id.tvTexto2);
        tvEscolha = findViewById(R.id.tvEscolha);
        tvResultado = findViewById(R.id.tvResultado);
        rbHorista = findViewById(R.id.rbHorista);
        rbHorista.setChecked(true);
        rbTitular = findViewById(R.id.rbTitular);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(op -> calc());
    }

    private void calc() {
        int horasSalario = Integer.parseInt(etHoraSal.getText().toString());
        int valorAnos = Integer.parseInt(etValorAnos.getText().toString());

        double sal;

        if (rbHorista.isChecked()) {
            ProfessorHorista professorHorista = new ProfessorHorista();
            professorHorista.setHorasAula(horasSalario);
            professorHorista.setValorHoraAula(valorAnos);
            sal = professorHorista.calcSalario();
        } else {
            ProfessorTitular professorTitular = new ProfessorTitular();
            professorTitular.setSalario(horasSalario);
            professorTitular.setAnosInstituicao(valorAnos);
            sal = professorTitular.calcSalario();
        }

        tvResultado.setText(String.format("Salário: %.2f", sal));
        etValorAnos.setText("");
        etHoraSal.setText("");
    }
}