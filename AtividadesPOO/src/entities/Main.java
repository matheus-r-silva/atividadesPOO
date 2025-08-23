public class Main {
	public static void main(String[] args) {
		var carro = new Carro("Roxinho", "Chevete");
		var aviao = new Aviao("Crocodillo", "anfibio");
		var barco = new Barco("Azulao", "Qualquer um");
		
		carro.mover();
		aviao.mover();
		barco.mover();
	}
}
