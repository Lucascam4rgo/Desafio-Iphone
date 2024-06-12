package usuario;

import celular.Iphone;
import internet.Browser;
import internet.NavegadorInternet;
import reprodutor.Ipod;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;
import telefone.Telefone;

public class Usuario {
	public static void main(String[] args) {
		
		Iphone celular = new Iphone();
		
		NavegadorInternet browser = new Browser();
		ReprodutorMusical ipod = new Ipod();
		AparelhoTelefonico tel = new Telefone();
		
		browser.adicionarNovaAba();
		ipod.selecionarMusica("Darkside - Bring Me The Horizon");
		tel.ligar("99876-5432");
		
		System.out.println("10 segundos depois");
		
		browser.atualizarPagina();
		ipod.pausar();
		tel.atender();
		
		
		
	}
}
