package org.example;

public class Main {
    public static void main(String[] args) {
        SmartPhone meuSmartphone = new SmartPhone();

        // Testando o reprodutor musical
        meuSmartphone.selecionarMusica("Bohemian Rhapsody");
        meuSmartphone.tocar();
        meuSmartphone.pausar();

        // Testando o telefone
        meuSmartphone.ligar("11999999999");
        meuSmartphone.atender();
        meuSmartphone.iniciarCorreioVoz();

        // Testando o navegador
        meuSmartphone.exibirPagina("https://openai.com");
        meuSmartphone.adicionarNovaAba();
        meuSmartphone.atualizarPagina();
    }
}
