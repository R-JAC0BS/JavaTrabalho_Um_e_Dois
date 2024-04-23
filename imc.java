import java.util.Scanner;

public class imc{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sexo (M/F):");
        String sexo = scanner.nextLine();
        char sexoLetra = sexo.charAt(0);

        System.out.println("Digite sua altura (em metros):");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso (em quilogramas):");
        double peso = scanner.nextDouble();

        double imc = peso / (Math.pow(altura, 2));
        System.out.println(nome + ", seu IMC é de " + imc);

        if (sexoLetra == 'M' || sexoLetra == 'm') {
            if (imc >= 40) {
                System.out.println("Você está com obesidade mórbida.");
            } else if (imc >= 30 && imc <= 39.9) {
                System.out.println("Você está com obesidade moderada.");
            } else if (imc >= 25 && imc <= 29.9) {
                System.out.println("Você está com obesidade leve.");
            } else if (imc >= 20 && imc <= 24.9) {
                System.out.println("Seu peso está normal.");
            } else {
                System.out.println("Seu peso está abaixo do normal.");
            }
        } else if (sexoLetra == 'F' || sexoLetra == 'f') {
            if (imc >= 39) {
                System.out.println("Você está com obesidade mórbida.");
            } else if (imc >= 29 && imc <= 38.9) {
                System.out.println("Você está com obesidade moderada.");
            } else if (imc >= 24 && imc <= 28.9) {
                System.out.println("Você está com obesidade leve.");
            } else if (imc >= 19 && imc <= 23.9) {
                System.out.println("Seu peso está normal.");
            } else {
                System.out.println("Seu peso está abaixo do normal.");
            }
        } else {
            System.out.println("Sexo inválido.");
        }

        scanner.close();
    }
}