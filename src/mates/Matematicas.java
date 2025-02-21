package mates;

public class Matematicas{
    public static int suma1n(int n){
        if (n <= 0) {
            return 0;
        } else {
            return n + suma1n(n - 1);
        }
    }
    public static int factorial(int n){
        if (n <= 1) {
            return 1;
        }else {
            return n * factorial(n - 1);
        }
    }
    public static int potencia(int n, int p){
        if (p == 0){
            return 1;
        } else {
            return n*potencia(n, p-1);
        }
    }
    public static int sumaLista(int [] comandos, int n){
        if ( n == comandos.length) {
            return 0;
        }
        return comandos[n] + sumaLista(comandos, n + 1);
    }
    public static double mediaLista(int [] comandos){
        int elementos = comandos.length;
        double suma = mediaListaRecursiva(comandos, elementos-1);
        return suma/elementos;
    }
    public static double mediaListaRecursiva(int [] comandos, int elementos){
        if (elementos >= 0) {
            return comandos [elementos] + mediaListaRecursiva(comandos, elementos - 1);
        }else{
            return 0;
        }
    }
    public static double desviacionLista(double [] comandos) {
        int elementos = comandos.length;
        double suma = desviacionListaRecursiva(comandos,elementos);
        double media = suma/elementos;
        double sumaDiferenciasCuadradas = desviacionListaRecursiva1(comandos,media, elementos);
        return Math.sqrt(sumaDiferenciasCuadradas/elementos);
    }
    public static double desviacionListaRecursiva(double [] comandos,int elementos) {
        if (elementos >= 0) {
            return comandos [elementos] + desviacionListaRecursiva(comandos, elementos - 1);
        } else {
            return 0;
        }
    }
    public static double desviacionListaRecursiva1(double [] comandos, double media, int elementos) {
        if (elementos >= 0) {
            return Math.pow(comandos[elementos]-media,2) + desviacionListaRecursiva1(comandos,media,elementos - 1);
        } else {
            return 0;
        }
    }
    public static int sumaPares(int n){
        if (n>0){
            if (n%2==0){
                return n + sumaPares(n-2);
            } else {
                return sumaPares(n-1);
            }
        } else {
            return 0;
        }
    }
    public static int sumaParesLista(int [] comandos, int n){
        if (n>=0){
            if (comandos[n]%2==0){
                return comandos[n] + sumaParesLista(comandos, n-1);
            } else {
                return sumaParesLista(comandos, n-1);
            }
        } else {
            return 0;
        }
    }
}