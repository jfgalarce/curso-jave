public class hola {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        // tipo de datos
        // entero
        byte num1 = 1;
        short num2 = 2;
        int num3 = 3;
        long num4 = 5;

        // flot
        float decima1 = 4.9f;
        double decimal2 = 9.99d;

        // caracter
        char caracter1 = 'a';

        // booleans
        boolean verdadero = true;
        boolean falso = false;

        // text
        String nombre = "juan";

        holaMundo(nombre);

        System.out.println(num1);
        System.out.println(name());
    }

    private static void holaMundo(String txt) {
        System.out.println("prueba funcion " + txt);
        System.out.println("prueba funcion 2" + txt);
    }

    private static String name() {
        return "otro tipo";
    }
}
