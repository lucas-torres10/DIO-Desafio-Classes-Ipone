package org.example;

public class SmartPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
    ///

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }


    public void iniciarCorreioVoz() {
        System.out.println("Abrindo correio de voz...");
    }

    ///


    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta no navegador.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página atual...");
    }
}
