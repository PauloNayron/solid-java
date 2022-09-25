package ISP.before;

public class Pinguim implements Aves{
    @Override
    public void setLocalizacao(String longitude, String latitude) {
        // faz alguma coisa
    }

    /**
     * A Interface Aves está forçando a Classe Pinguim a implementar esse método.
     * Isso viola o príncipio ISP
     * */
    @Override
    public void setAltitude(String altitude) {
        // Não faz nada...  Pinguins são aves que não voam!
    }

    @Override
    public void renderizar() {
        // faz alguma coisa
    }
}
