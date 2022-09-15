public class Main {
    public static void main(String[] args) {

        int numeroIf = 3;

        if (numeroIf > 0) {
            System.out.println("Positivo");
        } else if (numeroIf < 0) {
            System.out.println("Negativo");
        } else
            System.out.println("0");


        int numeroWhile = 2;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        } while(numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        var estacion = "Verano";

        switch (estacion) {
            case "Verano":
                System.out.println("Verano");
                break;
            case "Otoño":
                System.out.println("Otoño");
                break;
            case "Invierno":
                System.out.println("Invierno");
                break;
            case "Primerave":
                System.out.println("Primavera");
                break;
            default:
                System.out.println("NO es una estación");
        }

    }
}