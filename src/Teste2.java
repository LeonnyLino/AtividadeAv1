
public class Teste2 {
	public static void main(String[] args){
		Carro c = new Carro();
		
		c.placa = "abc-1234";
		c.modelo = "Dobl� - O carro do amor! kkkkk";
		c.ano = 2012;
		
		System.out.println("Informa��es do Carro: " + "\nModelo: " + c.modelo + "\nAno: " + c.ano
				+ "\nPlaca: " + c.placa);
	}
}
