
public class Teste4 {
	public static void main(String[] args){
		
		Pedido pd1 = new Pedido();
		Pedido pd2 = new Pedido();
		
		System.out.println("Nome do Cliente: " + pd1.nomeCliente + "\nDescrição do Pedido: " + pd1.descPedido );
		
		pd1.nomeCliente = "LeonnyLino";
		pd1.descPedido = "..........";
		
		System.out.println("Modificação");
		
		System.out.println("Nome do Cliente: " + pd1.nomeCliente + "\nDescrição do Pedido: " + pd1.descPedido );
		
		
		
		pd1.retornaDescPedido(pd1.descPedido);
		pd1.retornaNomeCliente(pd1.nomeCliente);
		
		
	}
}
