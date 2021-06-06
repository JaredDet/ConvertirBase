public class convertirBase {

    public static void main(String[] args) {

        System.out.println(baseNaBaseB("255", 10, 2));
    }

    public static String baseNaBaseB(String numero, int baseN, int baseB) {

        int numeroN = baseNaBase10(numero, baseN);
        return base10aBaseN(numeroN, baseB);
    }

    private static String base10aBaseN(int numero, int baseN) {

        StringBuilder resultado = new StringBuilder();
        int resto;
        String simbolos = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstvwxyz";

        while (numero != 0) {

            resto = numero % baseN;
            numero = numero / baseN;
            resultado.append(simbolos.charAt(resto));
        }
        return resultado.reverse().toString();
    }

    private static int baseNaBase10(String numero, int baseN) {

        int resultado = 0;
        String simbolos = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstvwxyz";

        for (int i = 0; i < numero.length(); i++) {

            resultado += simbolos.indexOf(numero.charAt(i)) * Math.pow(baseN, numero.length() - (i + 1));
        }
        return resultado;
    }
}
