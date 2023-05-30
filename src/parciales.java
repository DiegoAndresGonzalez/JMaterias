import java.util.Scanner;
public class parciales {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido aprendiz, para conocer la calificación final ingrese los siguientes datos a continuación: ");
        Scanner p1 = new Scanner(System.in);
        Scanner p2 = new Scanner(System.in);
        Scanner p3 = new Scanner(System.in);
        System.out.println("Ingrese las notas de sus calificaciones parciales: ");
        System.out.println("Parcial n°1: ");
        Double x1 = p1.nextDouble();
        System.out.println("Parcial n°2: ");
        Double x2 = p2.nextDouble();
        System.out.println("Parcial n°3: ");
        Double x3 = p3.nextDouble();
        Double pmed = (x1+x2+x3)/3;
        Double pmt = (pmed*55)/100;
        Scanner nf = new Scanner(System.in);
        System.out.println("Nota del exámen final: ");
        Double nf1 = nf.nextDouble();
        Double ntf = (nf1*30)/100;
        System.out.println("Nota del proyecto final: ");
        Scanner pf = new Scanner(System.in);
        Double pf1 = pf.nextDouble();
        Double pft = (pf1*15)/100;
        Double fnl = pmt + ntf + pft;
        System.out.println("Su nota máxima final es de: " + fnl);
        p1.close();
        p2.close();
        p3.close();
        nf.close();
        pf.close();
    }
}
