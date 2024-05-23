package modelos;

public class Audio {
    private String titulo;
    private int duracao = 0;
    private int totalReproducoes = 0;
    private int totalCurtidas = 0;
    private double classificacao = 1;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        this.totalCurtidas += 1;
    }

    public void reproduzir(){
        this.totalReproducoes += 1;
    }

    public void classificar(int nota){
        this.classificacao = nota;
    }

    public void descricao(){}
}
