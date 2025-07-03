
import java.util.Random;
import java.util.Scanner;

public class CondicionalesYCiclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int opcion;

        do {
            System.out.println("\n--- MENÚ DE EJERCICIOS ---");
            System.out.println("1. Promedio de 3 notas");
            System.out.println("2. Par o impar");
            System.out.println("3. Días del mes");
            System.out.println("4. Categoría familiar");
            System.out.println("5. Puesto en competencia");
            System.out.println("6. Nivel educativo");
            System.out.println("7. Mayor de tres números");
            System.out.println("8. Piedra, papel o tijera");
            System.out.println("9. Vocal o consonante");
            System.out.println("10. Docenas (1 a 36)");
            System.out.println("11. Tablas de multiplicar");
            System.out.println("12. Suma de pares del 1 al 10");
            System.out.println("13. Tabla completa del 1 al 10");
            System.out.println("14. Números aleatorios y promedio");
            System.out.println("15. Máximo y mínimo de aleatorios");
            System.out.println("16. Sueldo neto de empleados");
            System.out.println("0. Salir");
            System.out.print("Elegí una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresá tres notas: ");
                    int n1 = scanner.nextInt();
                    int n2 = scanner.nextInt();
                    int n3 = scanner.nextInt();
                    double promedio = (n1 + n2 + n3) / 3.0;
                    System.out.println(promedio >= 7 ? "Aprobado" : "Reprobado");
                    break;

                case 2:
                    System.out.print("Ingresá un número: ");
                    int num = scanner.nextInt();
                    System.out.println(num % 2 == 0 ? "Par" : "Impar");
                    break;

                case 3:
                    System.out.print("Ingresá un mes en minúscula (ej: enero): ");
                    scanner.nextLine(); // limpiar buffer
                    String mes = scanner.nextLine();
                    if (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre"))
                        System.out.println(mes + " tiene 30 días");
                    else if (mes.equals("febrero"))
                        System.out.println(mes + " tiene 28 días");
                    else
                        System.out.println(mes + " tiene 31 días");
                    break;

                case 4:
                    System.out.print("Ingresá categoría (a, b o c): ");
                    char cat = scanner.next().charAt(0);
                    switch (cat) {
                        case 'a':
                            System.out.println("Hijo");
                            break;
                        case 'b':
                            System.out.println("Padres");
                            break;
                        case 'c':
                            System.out.println("Abuelos");
                            break;
                        default:
                            System.out.println("Categoría inválida");
                            break;
                    }
                    break;

                case 5:
                    System.out.print("Ingresá el puesto (número): ");
                    int puesto = scanner.nextInt();
                    switch (puesto) {
                        case 1:
                            System.out.println("Medalla de oro");
                            break;
                        case 2:
                            System.out.println("Medalla de plata");
                            break;
                        case 3:
                            System.out.println("Medalla de bronce");
                            break;
                        default:
                            System.out.println("Siga participando");
                            break;
                    }
                    break;

                case 6:
                    System.out.print("Ingresá el curso (0 a 12): ");
                    int curso = scanner.nextInt();
                    if (curso == 0)
                        System.out.println("Jardín de infantes");
                    else if (curso >= 1 && curso <= 6)
                        System.out.println("Primaria");
                    else if (curso >= 7 && curso <= 12)
                        System.out.println("Secundaria");
                    else
                        System.out.println("Nivel no reconocido");
                    break;

                case 7:
                    System.out.print("Ingresá tres números: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();
                    int mayor = (a >= b && a >= c) ? a : (b >= a && b >= c) ? b : c;
                    System.out.println("El mayor es: " + mayor);
                    break;

                case 8:
                    System.out.println("0 = piedra, 1 = papel, 2 = tijera");
                    System.out.print("Jugador 1: ");
                    int j1 = scanner.nextInt();
                    System.out.print("Jugador 2: ");
                    int j2 = scanner.nextInt();
                    if (j1 == j2)
                        System.out.println("Empate");
                    else if ((j1 == 0 && j2 == 2) || (j1 == 1 && j2 == 0) || (j1 == 2 && j2 == 1))
                        System.out.println("Jugador 1 gana");
                    else
                        System.out.println("Jugador 2 gana");
                    break;

                case 9:
                    System.out.print("Ingresá una letra: ");
                    char letra = scanner.next().toLowerCase().charAt(0);
                    if ("aeiou".indexOf(letra) != -1)
                        System.out.println("Es vocal");
                    else
                        System.out.println("No es vocal");
                    break;

                case 10:
                    System.out.print("Ingresá un número (1-36): ");
                    int val = scanner.nextInt();
                    if (val >= 1 && val <= 12)
                        System.out.println("Primera docena");
                    else if (val >= 13 && val <= 24)
                        System.out.println("Segunda docena");
                    else if (val >= 25 && val <= 36)
                        System.out.println("Tercera docena");
                    else
                        System.out.println("Número fuera de rango");
                    break;

                case 11:
                    System.out.print("Ingresá un número para la tabla: ");
                    int n = scanner.nextInt();
                    for (int i = 1; i <= 10; i++)
                        System.out.println(n + " x " + i + " = " + (n * i));
                    break;

                case 12:
                    int suma = 0;
                    for (int i = 2; i <= 10; i += 2)
                        suma += i;
                    System.out.println("Suma de pares del 1 al 10: " + suma);
                    break;

                case 13:
                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++)
                            System.out.println(i + " x " + j + " = " + (i * j));
                        System.out.println("-----");
                    }
                    break;

                case 14:
                    int suma14 = 0;
                    for (int i = 0; i < 10; i++) {
                        int aleatorio = random.nextInt(100) + 1;
                        System.out.println("Número: " + aleatorio);
                        suma14 += aleatorio;
                    }
                    System.out.printf("Suma: %d - Promedio: %.2f%n", suma14, suma14 / 10.0);
                    break;

                case 15:
                    int max = Integer.MIN_VALUE;
                    int min = Integer.MAX_VALUE;
                    for (int i = 0; i < 10; i++) {
                        int numero = random.nextInt(100) + 1;
                        System.out.println("Número: " + numero);
                        if (numero > max) max = numero;
                        if (numero < min) min = numero;
                    }
                    System.out.println("Máximo: " + max + ", Mínimo: " + min);
                    break;

                case 16:
                    for (int i = 1; i <= 10; i++) {
                        char categoria = "ABC".charAt(random.nextInt(3));
                        int antiguedad = random.nextInt(20) + 1;
                        int sueldo = random.nextInt(70001) + 30000;

                        double aumento;
                        if (antiguedad <= 5) aumento = sueldo * 0.05;
                        else if (antiguedad <= 10) aumento = sueldo * 0.10;
                        else aumento = sueldo * 0.30;

                        int plus = 0;
                        switch (categoria) {
                            case 'A':
                                plus = 1000;
                                break;
                            case 'B':
                                plus = 2000;
                                break;
                            case 'C':
                                plus = 3000;
                                break;
                        }

                        double neto = sueldo + aumento + plus;

                        System.out.println("Empleado " + i + " - Categoría: " + categoria +
                                ", Antigüedad: " + antiguedad +
                                ", Sueldo bruto: " + sueldo +
                                ", Sueldo neto: " + neto);
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 0);
    }
}
