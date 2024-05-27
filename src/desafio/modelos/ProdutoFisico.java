package desafio.modelos;

import desafio.interfaces.Calculavel;

public class ProdutoFisico implements Calculavel {

    private double percentualDesconto = 0.15;

    public ProdutoFisico(){}

    public ProdutoFisico(double percentualDesconto){
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcularPrecoFinal(double valor) {
        return valor - (valor * this.percentualDesconto);
    }
}
