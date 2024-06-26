package br.com.minhasmusicas.modelo;

public class Podcast extends Audio{

    private String apresentador;
    private String titulo;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int getClassificacao() {
        if(this.getCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }

}
