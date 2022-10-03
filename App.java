import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Insira o valor do raio do circulo: ");
        double raio = scanner.nextDouble();
        scanner.close();
        double area = Math.PI * Math.pow(raio, 2);

        System.out.print("A area do circulo é: " + area);

    }
}