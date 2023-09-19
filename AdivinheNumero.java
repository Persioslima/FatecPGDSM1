import java.util.Random;
import java.util.Scanner;
public class AdivinheNumero
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		Random rand = new Random();
		int nSorteado = rand.nextInt(100);
		int nDigitado = -1;

		while(nDigitado != nSorteado){

			System.out.print("Digite um número de 0 a 100: ");
			nDigitado = input.nextInt();

			if(nDigitado > nSorteado){
				System.out.println("O número digitado é maior que o sorteado!");
			}
			else{
				System.out.println("O número digitado é menor que o sorteado!");
			}
		}

		System.out.print("Parabéns!!");
	}
}