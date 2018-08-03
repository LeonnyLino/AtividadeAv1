
public class Pedido {
	
	int codigoPedido;
	String nomeCliente, descPedido;
	
	public Pedido(){
		
	}
	
	void modificaNomeCliente(String mNovoNome){
		System.out.println(nomeCliente = mNovoNome);
	}
	
	void modificaDescPedido(String mNovoPedido){
		System.out.println(descPedido = mNovoPedido); 
	}
	
	public String retornaDescPedido(String mDescPedido){
		return descPedido = mDescPedido;
	}
	
	public String retornaNomeCliente(String mNomeCliente){
		return nomeCliente = mNomeCliente;
	}
}
