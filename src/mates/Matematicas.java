package mates;

public class Matematicas{
    public static int suma1n(int n){
        int suma = 0;
        int a = 1;
        int num = n;
        for (a=1; a<=num; a++){
            suma = suma+a;
        }
        return suma;
    }
    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int potencia(int n, int p){
        int resultado = n;
        for (int i = 1; i < p; i++){
            resultado = resultado*n;
        }
        return resultado;
    }
    public static int sumaLista(int [] comandos){
        int suma = 0;
        for (int i=0;i<comandos.length;i++){
            suma = suma + comandos[i];
        }
        return suma;
    }
    public static double mediaLista(int [] comandos){
        double suma = 0;
        int elementos = comandos.length-1;
        for (int i=0;i<=elementos;i++){
            suma = suma + comandos[i];
        }
        double resultado = suma/elementos;
        return resultado;
    }
    public static double desviacionLista(double [] comandos) {
        double suma = 0;
        int elementos = comandos.length;
        for (int i = 0; i<elementos; i++) {
            suma = suma + comandos[i];
        }
        double media = suma/elementos;
        double sumaDiferenciasCuadradas = 0;
        for (double num : comandos) {
            sumaDiferenciasCuadradas += Math.pow(num - media, 2);
        }
        return Math.sqrt(sumaDiferenciasCuadradas/elementos);
    }
    public static int sumaPares(int n){
        int suma = 0;
        for (int i=n;i>=2;i--){
            if(i%2==0){
                suma = suma + i;
            }
        }
        return suma;
    }
    public static int sumaParesLista(int [] comandos){
        int suma = 0;
        for (int i=0;i<comandos.length;i++){
            if (comandos[i]%2==0){
                suma = suma + comandos[i];
            }
        }
        return suma;
    }
    public static int[] obtenerParesLista(int [] comandos){
        int [] resultado = new int[comandos.length];
        int j = 0;
        for (int i=0;i<comandos.length;i++){
            if (comandos[i]%2==0){
                resultado[j]=Integer.parseInt(String.valueOf(comandos[i]));
                j++;
            }
        }
        return resultado;
    }
    public static int[] numerosParesLista(int n){
        int [] resultado = new int[n];
        int j=0;
        for (int i=n;i>=2;i--){
            if(i%2==0){
                resultado[j]=i;
                j++;
            }
        }
        return resultado;
    }
    public static int productoEscalar(int [] comandos1, int [] comandos2){
        int suma = 0;
        for (int i=0;i<comandos1.length;i++){
            suma = suma + (comandos1[i]*comandos2[i]);
        }
        return suma;
    }
}