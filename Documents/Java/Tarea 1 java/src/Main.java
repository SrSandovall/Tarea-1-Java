
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void holaMundo() {
        System.out.println("Hola, Mundo!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    holaMundo();
                    break;

                case 2:
                    int result;

                    System.out.println("Ingrese el primer numero: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    int num2 = scanner.nextInt();
                    result = num1 + num2;

                    System.out.println("Resultado: " + result);

                    break;

                case 3:
                    System.out.println("Ingrese el un numero: ");

                    int paroimpar = scanner.nextInt();

                    if (paroimpar % 2 == 0) {

                        System.out.println("Numero es PAR");


                    } else {

                        System.out.println("Numero es IMPAR");

                    }


                case 4:
                    System.out.println("Ingrese el numero al que quiere sacarle el factorial: ");
                    int numerofac = scanner.nextInt();

                   long factorial = 1;
                    for (int z = numerofac; z >= 1; z--) {

                        factorial =  numerofac *= z;

                    }

                    System.out.println("El factorial es:" + factorial);



                    break;

                case 5:

                    for (int i = 1; i <= 10; i++) {

                        System.out.println("Tabla del " + i + ":");



                        for (int j = 1; j <= 10; j++) {
                            System.out.println(i + " x " + j + " = " + (i * j));
                            }


                        System.out.println();
                        }

                    break;

                case 6:
                                System.out.println("Saliendo del programa...");
                                break;
                            default:
                                System.out.println("Opción no válida, intenta de nuevo.");
                        }
                    }
                    while (option != 6) ;

                    scanner.close();
            }


        }

