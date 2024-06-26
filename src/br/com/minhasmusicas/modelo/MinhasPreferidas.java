package br.com.minhasmusicas.modelo;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " - Topssimo");
        } else {
            System.out.println(audio.getTitulo() + " - Boa Escolha");
        }
    }
}
