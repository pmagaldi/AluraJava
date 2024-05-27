package calculos;

import modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    public void incluir(Titulo titulo){
        System.out.println("Classe usada: " + titulo.getClass());
        System.out.println("Adicionando duração em minutos do: " + titulo.getNome());
        tempoTotal += titulo.getDuracaoEmMinuntos();
    }
}
