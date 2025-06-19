import java.util.Random;
import java.util.Scanner;

public class CondicionalesYCiclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Ejercicio 1
        int nota1 = 8, nota2 = 6, nota3 = 7;
        double promedio = (nota1 + nota2 + nota3) / 3.0;
        if (promedio >= 7) System.out.println("Aprobado");
        else System.out.println("Reprobado");

        // Ejercicio 2
        int numero = 7;
        if (numero % 2 == 0) System.out.println("Par");
        else System.out.println("Impar");

        // Ejercicio 3
        String mes = "febrero";
        if (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre"))
            System.out.println(mes + " tiene 30 días");
        else if (mes.equals("febrero"))
            System.out.println(mes + " tiene 28 días");
        else
            System.out.println(mes + " tiene 31 días");

        // Ejercicio 4
        char categoria = 'b';
        if (categoria == 'a') System.out.println("hijo");
        else if (categoria == 'b') System.out.println("padres");
        else if (categoria == 'c') System.out.println("abuelos");

        // Ejercicio 5
        int puesto = 4;
        if (puesto == 1) System.out.println("Medalla de oro");
        else if (puesto == 2) System.out.println("Medalla de plata");
        else if (puesto == 3) System.out.println("Medalla de bronce");
        else System.out.println("Siga participando");

        // Ejercicio 6
        int curso = 8;
        if (curso == 0) System.out.println("Jardín de infantes");
        else if (curso >= 1 && curso <= 6) System.out.println("Primaria");
        else if (curso >= 7 && curso <= 12) System.out.println("Secundaria");

        // Ejercicio 7
        int a = 5, b = 9, c = 3;
        if (a >= b && a >= c) System.out.println("Mayor: " + a);
        else if (b >= a && b >= c) System.out.println("Mayor: " + b);
        else System.out.println("Mayor: " + c);

        // Ejercicio 8
        int jug1 = 0, jug2 = 1; // piedra, papel
        if (jug1 == jug2) System.out.println("Empate");
        else if ((jug1 == 0 && jug2 == 2) || (jug1 == 1 && jug2 == 0) || (jug1 == 2 && jug2 == 1))
            System.out.println("Jugador 1 gana");
        else System.out.println("Jugador 2 gana");

        // Ejercicio 11
        char letra = 'e';
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
            System.out.println("Es vocal");
        else
            System.out.println("No es vocal");

        // Ejercicio 12
        int valor = 14;
        if (valor >= 1 && valor <= 12) System.out.println("Primera docena");
        else if (valor >= 13 && valor <= 24) System.out.println("Segunda docena");
        else if (valor >= 25 && valor <= 36) System.out.println("Tercera docena");
        else System.out.println("El número " + valor + " está fuera de rango");

        // Ejercicio 13
        mes = "abril";
        switch (mes) {
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println("30 días"); break;
            case "febrero":
                System.out.println("28 días"); break;
            default:
                System.out.println("31 días");
        }

        // Ejercicio 14
        switch (puesto) {
            case 1: System.out.println("Oro"); break;
            case 2: System.out.println("Plata"); break;
            case 3: System.out.println("Bronce"); break;
            default: System.out.println("Siga participando");
        }

        // Ejercicio 15
        categoria = 'c';
        switch (categoria) {
            case 'a': System.out.println("4 ruedas y motor"); break;
            case 'b': System.out.println("4 ruedas, motor, cierre centralizado y aire"); break;
            case 'c': System.out.println("4 ruedas, motor, cierre centralizado, aire y airbag"); break;
        }

        // Ejercicio 16
        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        // Ejercicio 17a
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) suma += i;
        }
        System.out.println("Suma de pares: " + suma);

        // Ejercicio 17b
        suma = 0;
        for (int i = 2; i <= 10; i += 2) suma += i;
        System.out.println("Suma sin if: " + suma);

        // Ejercicio 18
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("---");
        }

        // Ejercicio 19
        suma = 0;
        for (int i = 0; i < 10; i++) {
            int aleatorio = random.nextInt(100) + 1;
            System.out.println(aleatorio);
            suma += aleatorio;
        }
        System.out.println("Suma: " + suma + " Promedio: " + (suma / 10.0));

        // Ejercicio 20
        int count = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        do {
            int num = random.nextInt(100) + 1;
            System.out.println(num);
            if (num > max) max = num;
            if (num < min) min = num;
            count++;
        } while (count < 10);
        System.out.println("Máximo: " + max + " Mínimo: " + min);

        // Ejercicio 21 y 22
        int i = 0;
        while (i < 10) {
            categoria = "ABC".charAt(random.nextInt(3));
            int antiguedad = random.nextInt(20) + 1;
            int sueldo = random.nextInt(70001) + 30000;

            double aumento = 0;
            if (antiguedad >= 1 && antiguedad <= 5) aumento = sueldo * 0.05;
            else if (antiguedad >= 6 && antiguedad <= 10) aumento = sueldo * 0.10;
            else aumento = sueldo * 0.30;

            int plus = switch (categoria) {
                case 'A' -> 1000;
                case 'B' -> 2000;
                case 'C' -> 3000;
                default -> 0;
            };

            double sueldoNeto = sueldo + aumento + plus;
            System.out.println("Empleado " + (i+1) + " - Categoría: " + categoria + ", Antigüedad: " + antiguedad + ", Sueldo bruto: " + sueldo + ", Sueldo neto: " + sueldoNeto);
            i++;
        }
    }
}
