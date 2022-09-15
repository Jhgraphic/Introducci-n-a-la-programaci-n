public class Main {
    public static void main(String[] args) {

        int resultado;

        resultado = suma(5, 8, 2);
        System.out.println(resultado);

        coche miCoche = new coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma (int a, int b, int c) {
        return a+b+c;}
}

class coche {
    public int puertas = 4;
    public void incrementarPuertas(){
        this.puertas++;}
}