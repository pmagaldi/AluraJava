package modelos;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String direcao;

    public Filme(){}

    public Filme(String nome){
        super(nome);
    }

    public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacoes, int totalDeAvaliacoes, int duracaoEmMinuntos){
        super(nome, anoDeLancamento, incluidoNoPlano, somaDasAvaliacoes, totalDeAvaliacoes, duracaoEmMinuntos);
    }

    public Filme(String nome, String direcao){
        super(nome);
        this.direcao = direcao;
    }

    public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacoes, int totalDeAvaliacoes, int duracaoEmMinuntos, String direcao){
        super(nome, anoDeLancamento, incluidoNoPlano, somaDasAvaliacoes, totalDeAvaliacoes, duracaoEmMinuntos);
        this.direcao = direcao;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome do Filme: "+ this.getNome());
        super.exibeFichaTecnica();
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
