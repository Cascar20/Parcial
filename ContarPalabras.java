public class ContarPalabras {
    public static void main(String[] args) {
        String texto = "  Hola,   este es un   ejemplo de cadena.  ";  // Ejemplo de cadena
        int cantidadPalabras = contarPalabras(texto);
        System.out.println("La cadena tiene " + cantidadPalabras + " palabras.");
    }

    // Método para contar las palabras en una cadena
    public static int contarPalabras(String texto) {
        // Eliminar espacios al inicio y final de la cadena
        texto = texto.trim();

        // Si la cadena está vacía, no tiene palabras
        if (texto.isEmpty()) {
            return 0;
        }

        // Dividir la cadena en palabras usando espacios como separador
        String[] palabras = texto.split("\\s+");  // \\s+ significa uno o más espacios

        // Devolver el número de palabras
        return palabras.length;
    }
}
