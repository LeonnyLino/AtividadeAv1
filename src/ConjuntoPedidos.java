import java.util.Scanner;
public class ConjuntoPedidos {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		byte numPedido = 0;
		String dataPedido;
		float precoUnitario;
		byte quantidade;
		
		do{
			System.out.println("1 - Numero do Pedido: ");
			numPedido = teclado.nextByte();
			System.out.println("2 - Data do pedido: ");
			dataPedido = teclado.nextLine();
			dataPedido = teclado.nextLine();
			System.out.println("3 - Preço Unitário: ");
			precoUnitario = teclado.nextFloat();
			System.out.println("4 -Quantidade: ");
			quantidade = teclado.nextByte();
			
			System.out.println("1 - "+numPedido+"\n2 - "+dataPedido+"\n3 - "+precoUnitario+"\n4 - "+quantidade);
		}while(numPedido != 0);
	}
}
