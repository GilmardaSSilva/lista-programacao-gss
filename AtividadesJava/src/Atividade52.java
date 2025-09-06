import java.util.Scanner;
public class Atividade52 {
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double tempCelsius = scanner.nextDouble();

        double tempFahrenheit = celsiusParaFahrenheit(tempCelsius);

        System.out.printf("%.2f °C equivalem a %.2f °F.\n", tempCelsius, tempFahrenheit);

        scanner.close();
    }
}