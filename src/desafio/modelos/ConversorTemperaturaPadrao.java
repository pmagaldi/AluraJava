package desafio.modelos;

import desafio.interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double temperatura) {
        double resultado = (temperatura * 9/5) +32;
        System.out.println("Temperatura: " + temperatura + "ºC em Fahrenheit: "+resultado);
    }

    @Override
    public void fahrenheitParaCelsius(double temperatura) {
        double resultado = ((temperatura*5) - (32 * 5))/9;
        System.out.println("Temperatura: " + temperatura + "ªF em Celcius: "+resultado);
    }
}
