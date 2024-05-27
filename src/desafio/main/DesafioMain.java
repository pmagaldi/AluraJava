package desafio.main;

import desafio.modelos.*;

public class DesafioMain {
    public static void main(String[] args){
        ConversorMoeda conversor = new ConversorMoeda();
        System.out.println("O valor em reais é: R$" + conversor.converterDolarParaReal(10));

        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        calculadoraSalaRetangular.calcularArea(10,5);
        calculadoraSalaRetangular.calcularPerimetro(10, 5);

        TabuadaMultiplicacao multiplicacao = new TabuadaMultiplicacao();
        multiplicacao.mostrarTabuada(5);

        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        conversorTemperaturaPadrao.celsiusParaFahrenheit(25);
        conversorTemperaturaPadrao.fahrenheitParaCelsius(75);

        Livro livro1 = new Livro();
        ProdutoFisico produto = new ProdutoFisico();
        System.out.println("Valor do livro: R$"+livro1.calcularPrecoFinal(10));
        System.out.println("Valor do produto fisico: R$"+produto.calcularPrecoFinal(10));
    }
}
