import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.print("Digite a temperatura: ");
        double temp = scanner.nextDouble();

        System.out.print("Digite a unidade da temperatura original (C, F ou K): ");
        String origem = scanner.next().toUpperCase();

        System.out.print("Digite a unidade para converter (C, F ou K): ");
        String destino = scanner.next().toUpperCase();

        double resultado = converterTemperatura(temp, origem, destino);

        if (Double.isNaN(resultado)) {
            System.out.println("Conversão inválida. Verifique as unidades.");
        } else {
            System.out.printf("%.2f %s equivalem a %.2f %s%n", temp, origem, resultado, destino);
        }

        scanner.close();
    }

    public static double converterTemperatura(double temp, String origem, String destino) {
        double tempEmCelsius;

        // Primeiro converte qualquer unidade para Celsius
        switch (origem) {
            case "C":
                tempEmCelsius = temp;
                break;
            case "F":
                tempEmCelsius = (temp - 32) * 5 / 9;
                break;
            case "K":
                tempEmCelsius = temp - 273.15;
                break;
            default:
                return Double.NaN; // Unidade inválida
        }

        // Depois converte de Celsius para a unidade destino
        switch (destino) {
            case "C":
                return tempEmCelsius;
            case "F":
                return tempEmCelsius * 9 / 5 + 32;
            case "K":
                return tempEmCelsius + 273.15;
            default:
                return Double.NaN; // Unidade inválida
        }
    }
}
