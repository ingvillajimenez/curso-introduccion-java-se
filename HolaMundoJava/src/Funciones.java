public class Funciones {

    /*
    * Linea 1
    * Linea 2
    * */
    /**
     *
     * */
    public static void main(String[] args) {
        double y = 3;
        // Area de un circulo
        // PI * r2
        circleArea(y);

        // Area de una esfera
        // 4 * PI * r2
        sphereArea(y);

        // Volumen de una esfera
        // (4/3) * PI * r3
        sphereVolume(y);

        System.out.println("Pesos a dolares: " + convertToDollar(1000, "COP"));
    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double sphereVolume(double r) {
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     * */
    public static double convertToDollar(double quantity, String currency) {
        // MXN COP
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }

        return quantity;
    }
}
