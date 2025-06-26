package aparelho;

import funcionabilidades.AparelhoTelefonico;
import funcionabilidades.NavegarInternet;
import funcionabilidades.ReprodutorMusica;

public abstract class Iphone implements NavegarInternet,ReprodutorMusica,AparelhoTelefonico{

    public static void main(String[] args) {
        String url = "www.dio.me";
        Iphone iphone = new Iphone() {
            @Override
            public void tocar() {
                System.out.println("Tocando...");
            }

            @Override
            public void pausar() {
                System.out.println("Pausando musica...");
            }

            @Override
            public void selecionarMusica() {
                System.out.println("Selecionando musica...");
            }

            @Override
            public void exibirPagina(String url) {

                System.out.println("Exibindo pagina...");
            }

            @Override
            public void adicionarNovaAba() {
                System.out.println("Adicionando nova aba...");
            }

            @Override
            public void atualizarPagina() {
                System.out.println("Atualizando pagina...");
            }

            @Override
            public void ligar() {
                System.out.println("Ligando...");
            }

            @Override
            public void atender() {
                System.out.println("Atendendo...");
            }

            @Override
            public void iniciarCorreioVoz() {
                System.out.println("Iniciando correio de voz...");
            }
        };


        iphone.tocar();
        iphone.atender();
        iphone.adicionarNovaAba();
        iphone.ligar();
        iphone.exibirPagina(url);
        iphone.selecionarMusica();
        iphone.pausar();
        iphone.iniciarCorreioVoz();
        iphone.atualizarPagina();


    }
}