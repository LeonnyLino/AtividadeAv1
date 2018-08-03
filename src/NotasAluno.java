import java.util.Scanner;
public class NotasAluno {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		float alunos[] = new float[3];
		float n1 [] = new float[10];
		float n2 [] = new float[10];
		float n3 [] = new float[10];
		float media [] = new float[10];
		float mediaTurma;
		float acumuladorMedia = 0;
		float acumuladorMedia5 = 0;
		int c = 0;
		for(int i = 0; i < alunos.length; i++){
			System.out.println("Digite suas três notas: ");
			n1[i] = teclado.nextFloat();
			n2[i] = teclado.nextFloat();
			n3[i] = teclado.nextFloat();
		}
		
		for(int i = 0; i < alunos.length; i++){
			media[i] = (n1[i]+n2[i]+n3[i])/3;
			acumuladorMedia += media[i];
		    System.out.println("Média do aluno " + (i+1) + ": " + media[i]);
		    
		    if (media[i] >= 5){
		    	acumuladorMedia5 += media[i];
		    	c++;
		    }
		}
		
		System.out.println("Media da turma: " + acumuladorMedia/alunos.length);
		System.out.println("Percetual de Alunos com Média maior ou igual a 5: " + acumuladorMedia5/c);
		
	}

}
