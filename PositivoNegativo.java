public class PositivoNegativo {
    public static void main(String[] args) {
        
        String r;

        do {
        System.out.println("Dime un número: ");
        int n = Integer.parseInt(System.console().readLine());
        if (n > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }

        System.out.println("¿Quieres introducir otro número? (s/n)");
        r = System.console().readLine();

        } while (r != "s");
        
    }
}