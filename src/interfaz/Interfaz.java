package interfaz;
import mates.Matematicas;
import java.util.Scanner;
import java.util.ArrayList;

public class Interfaz {
    private Scanner sc;

    public Interfaz() {
        this.sc = new Scanner(System.in);
    }

    public String[] instruccion() {
        String instruccion = sc.nextLine();
        return instruccion.split(",");
    }
    public void menu(){
        help();
        boolean continuar = true;
        while(continuar == true){
            System.out.print("\nEscriba la instrucción: ");
            String[] instr = instruccion();

            switch (instr[0].toLowerCase()) {
                case "1":
                    int n = Integer.parseInt(instr[1]);
                    System.out.println(Matematicas.suma1n(n));
                    break;
                case "2":
                    int aa = Integer.parseInt(instr[1]);
                    System.out.println(Matematicas.factorial(aa));
                    break;
                case "3":
                    int ab = Integer.parseInt(instr[1]);
                    int ac = Integer.parseInt(instr[2]);
                    System.out.println(Matematicas.potencia(ab,ac));
                    break;
                case "4":
                    int ba = instr.length;
                    int [] comandos = new int[ba];
                    for (int i = 1; i < ba; i++) {
                        comandos[i] = Integer.parseInt(instr[i]);
                    }
                    System.out.println(Matematicas.sumaLista(comandos));
                    break;
                case "5":
                    int bb = instr.length;
                    int [] comandos1 = new int[bb];
                    for (int i = 1; i < bb; i++) {
                        comandos1[i] = Integer.parseInt(instr[i]);
                    }
                    System.out.println(Matematicas.mediaLista(comandos1));
                    break;
                case "6":
                    int bc = instr.length;
                    double [] comandos2 = new double[bc];
                    for (int i = 1; i < bc; i++) {
                        comandos2[i] = Integer.parseInt(instr[i]);
                    }
                    System.out.println(Matematicas.desviacionLista(comandos2));
                    break;
                case "7":
                    int ad = Integer.parseInt(instr[1]);
                    System.out.println(Matematicas.sumaPares(ad));
                    break;
                case "8":
                    int bd = instr.length;
                    int [] comandos3 = new int[bd];
                    for (int i = 1; i < bd; i++) {
                        comandos3[i] = Integer.parseInt(instr[i]);
                    }
                    System.out.println(Matematicas.sumaParesLista(comandos3));
                    break;
                case "9":
                    int be = instr.length;
                    int [] comandos4 = new int[be];
                    for (int i = 1; i < be; i++) {
                        comandos4[i] = Integer.parseInt(instr[i]);
                    }
                    int [] resultado = Matematicas.obtenerParesLista(comandos4);
                    for (int i = 0; i < resultado.length; i++) {
                        if (resultado[i] != 0) {
                            System.out.print(resultado[i] + ",");
                        }
                    }
                    break;
                case "10":
                    int ae = Integer.parseInt(instr[1]);
                    int [] resultado1 = Matematicas.numerosParesLista(ae);
                    for (int i = 0; i < resultado1.length; i++) {
                        if (resultado1[i] != 0) {
                            System.out.print(resultado1[i] + ",");
                        }
                    }
                    break;
                case "11":
                    int [] comandos5 = new int[3];
                    int [] comandos6 = new int[3];
                    comandos5[0]=Integer.parseInt(instr[1]);
                    comandos5[1]=Integer.parseInt(instr[2]);
                    comandos5[2]=Integer.parseInt(instr[3]);
                    comandos6[0]=Integer.parseInt(instr[4]);
                    comandos6[1]=Integer.parseInt(instr[5]);
                    comandos6[2]=Integer.parseInt(instr[6]);
                    System.out.println(Matematicas.productoEscalar(comandos5, comandos6));
                    break;
                case "0":
                    System.out.println("Saliendo");
                    continuar = false;
                    break;
                default:
                    System.out.println("\nInstruccion no valida\n");
                    help();
                    break;
            }
        }
    }
    public void help(){
        System.out.println("Instrucciones disponibles (1-11):\n" +
                "Ej.1: Suma de 1 a n\n" +
                "Ej.2: Factorial de n\n" +
                "Ej.3: Potencia de un número (n^p)\n" +
                "Ej.4: Suma de numeros en una lista\n" +
                "Ej.5: Media aritmetica de una lista\n" +
                "Ej.6: Desviación típica de una lista\n" +
                "Ej.7: Suma pares hasta n\n" +
                "Ej.8: Suma pares de una lista\n" +
                "Ej.9: Sacar lista de numeros pares de otra lista\n" +
                "Ej.10: Lista de primeros numeros pares de n>=2\n" +
                "Ej.11: Producto escalar de dos listas\n" +
                "0 = salir del programa\n");
    }
}