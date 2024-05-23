import modelos.Musica;

public class Main {
    public static void main(String[] args) {
        Musica byob = criarMusica("B.Y.O.B","Mezmerize" ,"Rock" ,"System of a Down" , 263, 5, true, true);
    }

    private static Musica criarMusica(
            String titulo, 
            String album, 
            String genero, 
            String artista,
            int duracao,
            int classificacao,
            boolean reproduzir,
            boolean curtir){
        Musica musica = new Musica();
        musica.setTitulo(titulo);
        musica.setAlbum(album);
        musica.setGenero(genero);
        musica.setArtista(artista);
        musica.setDuracao(duracao);
        musica.classificar(classificacao);
        if(reproduzir){
            musica.reproduzir();
        }
        if(curtir){
            musica.curtir();
        }
        return musica;
    }
}