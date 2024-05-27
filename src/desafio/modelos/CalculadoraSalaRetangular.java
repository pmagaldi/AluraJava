package desafio.modelos;

import desafio.interfaces.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double altura, double largura) {
        double resultado = altura * largura;
        System.out.println("A área é: " + resultado);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double resultado = (altura + largura) * 2;
        System.out.println("O perímetro é: " + resultado);
    }
}
