package estudos.dio.application;

import estudos.dio.service.IphoneService;

public class Main {
	public static void main(String[] args) {
		System.setProperty("file.encoding", "UTF-8");
		IphoneService iPhone = new IphoneService();
		iPhone.acoes();
		}
}
