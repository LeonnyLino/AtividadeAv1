import java.util.Scanner;
public class Teste3 {
	public static void main(String[] args){
		Calculadora calc = new Calculadora();
		Scanner teclado = new Scanner(System.in);
		calc.numero1 = 5;
		calc.numero2 = 10;
		int chamaMetodo;
		
		
		System.out.println("O valor da soma: " + calc.retornaSomaAtributos());
		System.out.println("O valor da Multiplicação: " + calc.retornaMultiplicacaoAtributos());
		
		System.out.println("Digite dois valores para ser exibido: ");
		calc.numero1 = teclado.nextInt();
		calc.numero2 = teclado.nextInt();
		
		calc.insereValoresAtributos(calc.numero1, calc.numero2);
		
		
		
	}
}
