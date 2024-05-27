package desafio.modelos;

import desafio.interfaces.Calculavel;

public class Livro implements Calculavel {

    private double percentualDesconto = 0.1;

    public Livro(){}

    public Livro(double percentualDesconto){
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcularPrecoFinal(double valor) {
        return valor - (valor * this.percentualDesconto);
    }
}
