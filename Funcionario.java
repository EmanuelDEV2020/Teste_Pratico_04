package Teste_04;

import java.util.List;
import java.util.ArrayList;

public class Funcionario {

    private String nome;
    private String cargo;
    private String dataContratacao;
    private double salarioBase;
    private double beneficioFixo;
    private double percentualBeneficio;

    public Funcionario(String nome, String cargo, String dataContratacao, double salarioBase, double beneficioFixo, double percentualBeneficio) {
        this.nome = nome;
        this.cargo = cargo;
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.beneficioFixo = beneficioFixo;
        this.percentualBeneficio = percentualBeneficio;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public double calcularSalarioBeneficio(String mesAno) {
        if (!dataContratacao.endsWith(mesAno)) {
            return 0.0;
        }

        double salarioTotal = salarioBase;
        if (cargo.equals("Secretário") || cargo.equals("Vendedor")) {
            int anosContratado = 2024 - Integer.parseInt(dataContratacao.split("/")[1]);
            salarioTotal += beneficioFixo + (anosContratado * 1000);
            if (cargo.equals("Vendedor")) {
                salarioTotal *= 1.3;
            }
        }

        return salarioTotal;
    }
}

