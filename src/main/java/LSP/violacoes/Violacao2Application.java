package LSP.violacoes;

/** Lançando uma exceção inesperada...*/
class MusicPlay {
    public void play(String file)
    {
        System.out.println("tocando: ".concat(file));
    }
}

class Mp3MusicPlay extends MusicPlay {
    public void play(String file) {
        if (!file.contains(".mp3")) {
            throw new RuntimeException("file não é do tipo MP3.");
        }

        System.out.println("\ntocando: ".concat(file));
    }
}

public class Violacao2Application {
    public static void main(String[] args) {
        var mp3 = new Mp3MusicPlay();
        mp3.play("musica1.mp3");
        mp3.play("musica2.mp4");
    }
}
