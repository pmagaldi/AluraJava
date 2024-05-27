package desafio.modelos;

import desafio.interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {

    private double cotacaoDolar = 4.8;

    public ConversorMoeda(){}

    public ConversorMoeda(double cotacao){
        this.cotacaoDolar = cotacao;
    }

    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar * cotacaoDolar;
    }
}
