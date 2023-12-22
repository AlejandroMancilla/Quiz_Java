import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Precio = 0, Moneda, Cambio, Suma = 0;
        String Tipo = "";
        System.out.print("Elija Producto (A, B, C): ");
        Tipo = sc.nextLine();
        switch (Tipo) {
            case "A":
                Precio = 270;
                break;
            case "B":
                Precio = 340;
                break;
            case "C":
                Precio = 390;
                break;
            default:
                break;
        }
        if (Precio > 0) {
            System.out.println("Ingrese Monedas");
            do{
                Moneda = sc.nextInt();
                if (Moneda == 100 || Moneda == 50 || Moneda == 10){
                    Suma += Moneda;
                }else {
                    System.out.println("Moneda no valida");
                }    
            }while(Suma < Precio);
            Cambio = Suma - Precio;
            if (Cambio > 0){
                System.out.println("Su vuelto: ");
                while(Cambio != 0){
                    if (Cambio >= 100) {
                        System.out.println("100");
                        Cambio -= 100;
                    }else if (Cambio >= 50) {
                        System.out.println("50");
                        Cambio -= 50;
                    }else{
                        System.out.println("10");
                        Cambio -= 10;
                    }
                }
            }else{
                System.out.println("No hay vueltos");
            }
        }else{
            System.out.println("Producto no Valido");
        }
    }
}
