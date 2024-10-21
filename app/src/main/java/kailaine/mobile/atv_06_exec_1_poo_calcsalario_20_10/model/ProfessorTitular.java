package kailaine.mobile.atv_06_exec_1_poo_calcsalario_20_10.model;
/*
 *@author:<Kailaine Almeida de Souza RA: 1110482313026>
 */
public class ProfessorTitular extends Professor{
    private int anosInstituicao;
    private double salario;

    public ProfessorTitular() {
        super();
    }

    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcSalario() {

        double anos = (anosInstituicao / 5) * 0.05;
        return salario + (salario * anos);
    }
}
