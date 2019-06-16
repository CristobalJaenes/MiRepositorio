package personas1;

import java.util.Scanner;

public class Personas1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Datos p1 = new Datos("Juan", 27, 180, 70);
        Datos p2 = new Datos("Pedro", 15, 160, 46);
        Datos p3 = new Datos("Antonio", 32, 197, 96);
        int aux, aux1;
        System.out.println("1.Crecer");
        System.out.println("2.Engordar");
        System.out.println("3.Cumplir año");
        System.out.println("4.Mostrar datos");
        System.out.print("Introduce una opción: ");
        int menu = s.nextInt();

        while (menu != 5) {
            switch (menu) {
                case 1:
                    System.out.print("¿Quien ha crecido?: ");
                    aux = s.nextInt();
                    System.out.print("¿Cuanto ha crecido?: ");
                    aux1 = s.nextInt();
                    switch (aux) {
                        case 1:
                            p1.setAltura(p1.getAltura() + aux1);
                            break;
                        case 2:
                            p2.setAltura(p2.getAltura() + aux1);
                            break;
                        case 3:
                            p3.setAltura(p3.getAltura() + aux1);
                            break;
                    }
                    break;
                case 2:
                    System.out.print("¿Quien ha engordado?: ");
                    aux = s.nextInt();
                    System.out.print("¿Cuanto ha engordado?: ");
                    aux1 = s.nextInt();
                    switch (aux) {
                        case 1:
                            p1.setPeso(p1.getPeso() + aux1);
                            break;
                        case 2:
                            p2.setPeso(p2.getPeso() + aux1);
                            break;
                        case 3:
                            p3.setPeso(p3.getPeso() + aux1);
                            break;
                    }
                    break;
                case 3:
                    System.out.print("¿Quien ha cumplido?: ");
                    aux = s.nextInt();

                    switch (aux) {
                        case 1:
                            p1.setEdad(p1.getEdad() + 1);
                            break;
                        case 2:
                            p2.setEdad(p2.getEdad() + 1);
                            break;
                        case 3:
                            p3.setEdad(p3.getEdad() + 1);
                            break;
                    }
                    break;
                case 4:
                    System.out.println(p1.toString());
                    System.out.println(p2.toString());
                    System.out.println(p3.toString());
                    break;

            }
            System.out.println("1.Crecer");
            System.out.println("2.Engordar");
            System.out.println("3.Cumplir año");
            System.out.println("4.Mostrar datos");
            System.out.print("Introduce una opción:");
            menu = s.nextInt();
        }
        System.out.println("Saliste");

    }

}
