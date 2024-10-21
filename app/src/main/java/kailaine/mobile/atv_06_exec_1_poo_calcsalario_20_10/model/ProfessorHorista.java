package kailaine.mobile.atv_06_exec_1_poo_calcsalario_20_10.model;

public class ProfessorHorista extends Professor {
    private int horasAula;
    private double valorHoraAula;

    public ProfessorHorista() {
        super();
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public double calcSalario() {
        return horasAula * valorHoraAula;
    }
}


