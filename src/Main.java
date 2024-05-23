import modelos.Musica;

public class Main {
    public static void main(String[] args) {
        Musica byob = new Musica();
        byob.setTitulo("B.Y.O.B");
        byob.setAlbum("Mezmerize");
        byob.setGenero("Rock");
        byob.setArtista("System of a Down");
        byob.setDuracao(263);
        byob.classificar(5);
        byob.reproduzir();
        byob.curtir();
        byob.descricao();
    }
}