package modelos;

public class Musica extends Audio{
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void classificar(int nota) {
        if(nota < 1 || nota > 10){
            throw new IllegalArgumentException("Nota não válida");
        }
        super.classificar(nota);
    }

    @Override
    public void descricao() {
        System.out.println("Titulo da música: "+this.getTitulo());
        System.out.println("Duração em segundos: "+this.getDuracao());
        System.out.println("Artista: "+this.getArtista());
        System.out.println("Album: "+this.getAlbum());
        System.out.println("Genero: "+this.getGenero());
        System.out.println("Total de reproduções: "+this.getTotalReproducoes());
        System.out.println("Total de Curtidas: "+this.getTotalCurtidas());
        System.out.println("Sua Classificação: "+this.getClassificacao());
    }
}
