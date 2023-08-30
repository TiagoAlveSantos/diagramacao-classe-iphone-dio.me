package estudos.dio.utils;

import estudos.dio.model.AparelhoTelefonico;
import estudos.dio.model.NavegadorNaInternet;
import estudos.dio.model.ReprodutorMusical;

public class IphoneFunctions implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical{

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a musica: " + musica);
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando a musica selecionada");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a Musica selecionada");
		
	}

	@Override
	public void exibirPagina(int idPagina) {
		System.out.println("Acessando a pagina: " + idPagina);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba.");
		
	}

	@Override
	public void atualizarPagina(int idPagina) {
		System.out.println("Atualizando a Pagina: " + idPagina);
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligacao");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
		
	}

}
