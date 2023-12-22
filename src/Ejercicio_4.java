import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double C1, C2, C3, Examen = 0;
        boolean Flag = true;
        System.out.print("C1: ");
        while (Flag == true) {
            C1 = sc.nextDouble();
            System.out.print("C2: ");
            C2 = sc.nextDouble();
            if (C1 < 2.0 && C2 < 2.0){
                System.out.println("Reprobado");
                break;
            }else if(C1 > 9.0 && C2 > 9.0){
                System.out.println("Aprobado");
                break;
            }
            System.out.print("C3: ");
            C3 = sc.nextDouble();
            if((C1 + C2 + C3)/3 < 3.0){
                System.out.println("Reprobado");
                break;
            }else if((C1 + C2 + C3)/3 > 7.0){
                System.out.println("Aprobado");
                break;
            }else{
                System.out.print("Examen: ");
                Examen = sc.nextDouble();
                if(Examen >= 5.0){
                    System.out.println("Aprobado");
                    break;
                }else{
                    System.out.println("Reprobado");
                    break;
                }
            }
        }
    }
}
