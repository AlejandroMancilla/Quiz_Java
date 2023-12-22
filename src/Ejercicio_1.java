import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int Dias;
        double Precio_Dia,  Precio_Anterior = 0.0, Mayor = 0, Alza = 0;
        System.out.print("¿Cuantós días? ");
        Dias = sc.nextInt();
        for(int i = 0; i < Dias; i++) {
            System.out.print("Precio del día " + (i + 1) + ": ");
            Precio_Dia = sc.nextDouble();
            if(i > 0){
                Alza = Precio_Dia - Precio_Anterior;
                if(Alza > Mayor){
                    Mayor = Alza;
                }
            }
            Precio_Anterior = Precio_Dia;
        }
        if (Mayor > 0) {
            
            System.out.printf("La mayor alza fue de %.2f pesos", Mayor);
        }else{
            System.out.println("No hubo alzas");
        }
    }
}
