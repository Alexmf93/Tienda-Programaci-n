import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("\u001B[41mBienvenidos a la tiendecilla de Atonio\u001B[0m ");
        System.out.println("\u001B[31m * * * * *");
        System.out.println("  *     *");
        System.out.println("   *   *");
        System.out.println("     *");
        System.out.println("     *");
        System.out.println("   *   *");
        System.out.println("  *     *");
        System.out.println(" * * * * *");
        String casco = "Casco";
        String botas = "Bota";
        String chaqueta = "Chaqueta";
        String maletas = "Maletas";
        String mochila = "Mochila";
        Scanner sc = new Scanner(System.in);
        double pcasco = 100.50;
        double pbotas = 50.60;
        double pchaqueta = 75;
        double pmaletas = 35.80;
        double pmochila = 20;
        System.out.println("\u001B[0m"+casco+"..........."+pcasco);
        System.out.println(""+botas+"............"+pbotas);
        System.out.println(""+chaqueta+"........"+pchaqueta);
        System.out.println(""+maletas+"........."+pmaletas);
        System.out.println(""+mochila+"........."+pmochila);
        System.out.println("Introduzca la cantidad de cascos que desea");
        int numcascos = sc.nextInt();
        System.out.println("Introduzca la cantidad de botas que desea");
        int numbotas = sc.nextInt();
        System.out.println("Introduzca la cantidad de chaquetas que desea");
        int numchaquetas = sc.nextInt();
        System.out.println("Introduzca la cantidad de maletas que desea");
        int nummaletas = sc.nextInt();
        System.out.println("Introduzca la cantidad de mochilas que desea");
        int nummochilas = sc.nextInt();
        System.out.println("Introduza su nombre completo");
        sc.nextLine();
        String nombrecompleto = sc.nextLine();
        int espacio = nombrecompleto.indexOf(" ");
        String primernombre = nombrecompleto.substring(0, espacio);
        String nA = primernombre.toUpperCase().charAt(0) + primernombre.substring(1, primernombre.length())  ;
        System.out.println("Sr/Sra "+nA+ " aquí tiene el resumen de la factura ");
        String nombre_mayus=nombrecompleto.toUpperCase();
        System.out.println("Nombre del cliente: "+nombre_mayus);
        System.out.println("Cascos " +numcascos);
        System.out.println("Botas " +numbotas);
        System.out.println("Chaquetas " +numchaquetas);
        System.out.println("Maletas " +nummaletas);
        System.out.println("Mochilas "+nummochilas);
        double totalsiniva = ((pcasco*numbotas) + (pbotas*numbotas) + (pchaqueta*numchaquetas) + (pmaletas*nummaletas) + (pmochila*nummochilas));
        System.out.printf("Totl sin IVA %.2f \n" ,totalsiniva);
        System.out.println("IVA aplicado 21%");
        double IVA = 0.21;
        double ivarepercutido = (totalsiniva*IVA);
        System.out.printf("IVA repercutido %.2f \n" ,ivarepercutido);
        double totalconiva = (totalsiniva + ivarepercutido);
        System.out.printf("Total con IVA %.2f \n " ,totalconiva);
        Random descuento = new Random();
        int aleatorio = descuento.nextInt(6)+5;
        System.out.println("Descuento por 1ªvez " +aleatorio);
        double valordescontado = (totalconiva * aleatorio)/100;
        System.out.printf("Valor descontado %.2f \n",valordescontado);
        double total = (totalconiva - valordescontado);
        System.out.printf("Total Final %.2f \n" ,total);
        System.out.printf("\u001B[31m GRACIAS POR SU COMPRA, ANTONIO DESEA PROFUNDAMENTE QUE HAYA QUEDADO SATISFECHO :)");
    }
}