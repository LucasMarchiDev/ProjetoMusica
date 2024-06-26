package br.com.minhasmusicas.principal;

import br.com.minhasmusicas.modelo.MinhasPreferidas;
import br.com.minhasmusicas.modelo.Musica;
import br.com.minhasmusicas.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Nutshell");
        minhaMusica.setArtista("Alice in Chains");
        minhaMusica.setAlbum("Jar Of Flies");
        minhaMusica.setGenero("Rock");


        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 800; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setApresentador("Hipster");
        meuPodcast.setTitulo("Metodos ageis");

        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 100; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
            preferidas.inclui(meuPodcast);
            preferidas.inclui(minhaMusica);
    }



}
