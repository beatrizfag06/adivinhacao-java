import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;

        System.out.println("Adivinhe qual o número de 0 à 50!");
        System.out.println("Qual seu palpite? ");
        int num = sc.nextInt();
        int aleatorio = (int) (Math.random() * 51);

        while (num != aleatorio){
            if (num > aleatorio){
                System.out.println("Chute um número menor!");
            }else if (num < aleatorio){
                System.out.println("Chute um número maior!");
            }
            System.out.println("Novo chute: ");
            num = sc.nextInt();
            cont++;
        }
        System.out.println("Parabéns, você ganhou!!");
        System.out.println("Número de chutes: "+(cont+1));
    }
}