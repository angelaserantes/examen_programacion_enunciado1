import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double contador = 0;

        Scanner valor =new Scanner(System.in);
        System.out.println("Bienvenido ¿qué número quieres añadir al contador?");
        double numero = valor.nextInt();
        int salir;
        int opcion;
        do {

            System.out.println(" Pulsa 1 para seguir jugando o pulsa 4 si quieres salir ");
            salir = valor.nextInt();

            if (salir == 4) {

                opcion = 4;

            } else {

                opcion = (int) (Math.random() * 4);
            }





            switch (opcion) {
                case 0:

                    contador = Sumar(contador, numero);
                    System.out.println(" La suma es " + contador);
                    break;
                case 1:

                    contador = Restar(contador, numero);
                    System.out.println(" El resultado de la resta es " + contador);
                    break;
                case 2:

                    contador = Multiplicar(contador, numero);
                    System.out.println(" La multiplicación es " + contador);
                    break;
                case 3:

                    contador = Restablecer(contador);
                    System.out.println(" El valor se ha borrado " + contador);
                    break;

                case 4:
                    System.out.println("Has salido");
                    break;
                default:  System.out.println(" La opción elegida no está disponible");
            }
        }
        while (opcion != 4);
    }



    public static double Sumar(double contador, double numero){
        contador = contador + numero + numero;
        return contador;
    }

    public  static double Restar(double contador, double numero){
        contador = contador - (numero/2);
        return contador;
    }

    public static double Multiplicar(double contador, double numero){
        contador = contador * numero;
        return contador;
    }

    public  static double Restablecer(double contador){
        contador = 0;
        return contador;
    }
}