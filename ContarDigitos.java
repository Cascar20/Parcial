public class ContarDigitos {
    public static void main(String[] args) {
        int numero1 = 12345;  // Ejemplo de número1
        int cantidadDigitos1 = contarDigitos(numero1);
        System.out.println("El número " + numero1 + " tiene " + cantidadDigitos1 + " dígitos.");

        int numero2 = 987654321;  // Ejemplo de número2
        int cantidadDigitos2 = contarDigitos(numero2);
        System.out.println("El número " + numero2 + " tiene " + cantidadDigitos2 + " dígitos.");
    }

    // Método para contar los dígitos del numero
    public static int contarDigitos(int numero) {
        // Convertir el número a positivo si es negativo
        numero = Math.abs(numero);

        // Inicializar el contador de dígitos
        int contador = 0;

        // Si el número es 0, tiene 1 dígito
        if (numero == 0) {
            return 1;
        }

        // Contar los dígitos dividiendo entre 10 sucesivamente
        while (numero > 0) {
            numero /= 10;
            contador++;
        }

        return contador;
    }
}