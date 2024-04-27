import java.util.Scanner;
import java.util.Random;
public class adv {
    public static void main(String[] args) {
        Random random = new Random();
        int number_aleatrio = random.nextInt(1,100);
        int randomNumer = number_aleatrio;
        var inicio = true;
        int tentativas = 0;
        while (inicio) {
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
            }
            System.out.print("\033[H\033[2J");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um numero de 1 a 100");
            int numero = scanner.nextInt();
            tentativas ++;
            int calculaNumero = Math.abs(randomNumer - numero);

            if (numero == randomNumer){
                System.out.println("parabéns você ganhou o numero era "  + randomNumer + "você precisou de " + tentativas + "tentantivas ");
                break;

            }
            else  {
                if (calculaNumero <= 10){
                    System.out.println("esta quente");

                }
                else if (calculaNumero <= 20){
                    System.out.println("esta morno");

                }
                else if (calculaNumero >= 21){
                    System.out.println("esta frio");

                }
                
                else if (tentativas >= 9){
                    System.out.println("você perdeu");
                    break;
                }
                continue;
            }
            
        }

        
    }
    
}