package kailaine.mobile.atv_06_exec_1_poo_calcsalario_20_10.model;
/*
 *@author:<Kailaine Almeida de Souza RA: 1110482313026>
 */
public abstract class Professor {
    private String nome;
    private String matricula;
    private int idade;

    public Professor() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract double calcSalario();
}

