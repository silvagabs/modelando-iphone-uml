import Apps.AparelhoTelefonico;
import Apps.Navegador;
import Apps.ReprodutorMusical;

public class Iphone{
public static void main(String[] args) {

    AparelhoTelefonico aTelefonico= new AparelhoTelefonico();
    aTelefonico.ligar();
    aTelefonico.atender();
    aTelefonico.iniciarCorreioVoz();

    ReprodutorMusical rMusical= new ReprodutorMusical();
    rMusical.selecionarMusica();
    rMusical.tocarMusica();
    rMusical.pausarMusica();

    Navegador navegador= new Navegador();
    navegador.exibirPagina();
    navegador.adicionarNovaAba();
    navegador.atualizarPagina();
}

}