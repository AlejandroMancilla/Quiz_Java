import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Cantidad, N;
        double Precio, Porcentaje = 0.2, Total = 0, Descuento = 0, Total_Pagar;
        System.out.print("N: ");
        N = sc.nextInt();
        System.out.print("Cantidad Productos: ");
        Cantidad = sc.nextInt();
        int Aux = Cantidad;
        for(int i = 1; i <= Cantidad; i++){
            System.out.print("Precio Producto " + i + ": ");
            Precio = sc.nextInt();
            Total += Precio;
            if(Aux / 3 >= 1){
                Descuento += Precio * Porcentaje;
            }
            if(i % N == 0){
                Porcentaje /= 2;
            }
            Aux--;
        }
        System.out.println("Total: " + Total);
        System.out.println("Descuento: " + Descuento);
        System.out.println("Por pagar: " + (Total - Descuento));
    }
}
