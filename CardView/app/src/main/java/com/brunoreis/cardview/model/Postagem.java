package com.brunoreis.cardview.model;

public class Postagem {
    private String textNome;
    private String textPostagem;
    private Integer imageView;


    public Postagem(String textNome, String textPostagem, Integer imageView) {
        this.textNome = textNome;
        this.textPostagem = textPostagem;
        this.imageView = imageView;
    }

    public String getTextNome() {
        return textNome;
    }

    public void setTextNome(String textNome) {
        this.textNome = textNome;
    }

    public String getTextPostagem() {
        return textPostagem;
    }

    public void setTextPostagem(String textPostagem) {
        this.textPostagem = textPostagem;
    }

    public Integer getImageView() {
        return imageView;
    }

    public void setImageView(Integer imageView) {
        this.imageView = imageView;
    }
}
