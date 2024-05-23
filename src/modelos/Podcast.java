package modelos;

public class Podcast extends Audio{
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void classificar(int nota){
        if(nota < 1 || nota > 5){
            throw new IllegalArgumentException("Nota não válida");
        }
        super.classificar(nota);
    }

    @Override
    public void descricao() {
        System.out.println("Titulo da música: "+this.getTitulo());
        System.out.println("Duração em segundos: "+this.getDuracao());
        System.out.println("Apresentador: "+this.getApresentador());
        System.out.println("Descrição: "+this.getDescricao());
        System.out.println("Total de reproduções: "+this.getTotalReproducoes());
        System.out.println("Total de Curtidas: "+this.getTotalCurtidas());
        System.out.println("Sua Classificação: "+this.getClassificacao());
    }
}
