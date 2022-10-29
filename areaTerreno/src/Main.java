import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double baseTerreno;
        Double alturaTerreno;
        Double areaTerreno;

        System.out.println("Insira o comprimento da base em metros");
        baseTerreno = sc.nextDouble();
        System.out.println("Insira o comprimento da altura em metros");
        alturaTerreno = sc.nextDouble();
areaTerreno = baseTerreno * alturaTerreno;
System.out.print("O terreno possui = " + areaTerreno + " m² de área");
        sc.close();
    }
}