package controleFluxo;
import java.util.Scanner;
import java.util.Random;

public class Contador {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int parametroUm = 0;
		System.out.println("Digite o primeiro parâmetro: ");
		parametroUm = sc.nextInt();
		int parametroDois = 0;
		System.out.println("Digite o segundo parâmetro: ");
		parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException exception) {
			System.out.println("Erro: " + exception.getMessage());
		}
	}
	class ParametrosInvalidosException extends Exception {
	    public ParametrosInvalidosException(String mensagem) {
	        super(mensagem);
	    }
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		int contagem = parametroDois - parametroUm;
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}else {
			//realizar o for para imprimir os números com base na variável contagem
			for(contagem = 0; contagem<parametroDois; contagem++) {
				System.out.println("Imprimindo o número: " + contagem);
			}
		}				
	}
}
