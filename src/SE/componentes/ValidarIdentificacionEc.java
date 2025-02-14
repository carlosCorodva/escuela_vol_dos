/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.componentes;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author carlos
 */
public class ValidarIdentificacionEc {

    public static boolean validarCedula(String numero) throws Exception {
        try {
            validarInicial(numero, 10);
            validarCodigoProvincia(numero.substring(0, 2));
            validarTercerDigito(String.valueOf(numero.charAt(2)), TipoDocumento.getTipoCedula());
            algoritmoModulo10(numero, Integer.parseInt(String.valueOf(numero.charAt(9))));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    /**
     * @param numero de ruc persona natural
     * @return true si es un documento v&aacutelido
     * @throws Exception
     */
    public static boolean validarRucPersonaNatural(String numero) throws Exception {
        try {
            validarInicial(numero, 13);
            validarCodigoProvincia(numero.substring(0, 2));
            validarTercerDigito(String.valueOf(numero.charAt(2)), TipoDocumento.getTipoRucNatural());
            validarCodigoEstablecimiento(numero.substring(10, 13));
            algoritmoModulo10(numero.substring(0, 9), Integer.parseInt(String.valueOf(numero.charAt(9))));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    /**
     *
     * @param numero ruc empresa privada
     * @return
     * @throws Exception
     */
    public static boolean validarRucSociedadPrivada(String numero) throws Exception {

        // validaciones
        try {
            validarInicial(numero, 13);
            validarCodigoProvincia(numero.substring(0, 2));
            validarTercerDigito(String.valueOf(numero.charAt(2)), TipoDocumento.getRucPrivada());
            validarCodigoEstablecimiento(numero.substring(10, 13));
            algoritmoModulo11(numero.substring(0, 9), Integer.parseInt(String.valueOf(numero.charAt(9))), TipoDocumento.getRucPrivada());
            
//            String x = 
//            System.out.println();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    /**
     * @param numero
     * @param caracteres
     * @return
     * @throws Exception
     */
    protected static boolean validarInicial(String numero, int caracteres) throws Exception {
        if (StringUtils.isEmpty(numero)) {
            throw new Exception("Valor no puede estar vacio");
//            System.out.println("Valor no puede estar vacio");
        }

        if (!NumberUtils.isDigits(numero)) {
            throw new Exception("Valor ingresado solo puede tener dígitos");
//            System.out.println("Valor ingresado solo puede tener dígitos");
        }

        if (numero.length() != caracteres) {
            throw new Exception("Valor ingresado debe tener " + caracteres + " caracteres");
//            System.out.println("Valor ingresado debe tener " + caracteres + " caracteres");
        }

        return true;
    }

    protected static boolean validarCodigoProvincia(String numero) throws Exception {
        if (Integer.parseInt(numero) < 0 || Integer.parseInt(numero) > 24) {
            throw new Exception("Codigo de Provincia (dos primeros dígitos) no deben ser mayor a 24 ni menores a 0");
//            System.out.println("dos primeros dígitos) no deben ser mayor a 24 ni menores a 0");
        }

        return true;
    }

    /**
     * @param numero
     * @param tipo de documento cedula, ruc
     * @return
     * @throws Exception
     */
    protected static boolean validarTercerDigito(String numero, Integer tipo) throws Exception {
        switch (tipo) {
            case 1:
            case 2:

                if (Integer.parseInt(numero) < 0 || Integer.parseInt(numero) > 5) {
                    throw new Exception("Tercer dígito debe ser mayor o igual a 0 y menor a 6 para cédulas y RUC de persona natural ... permitidos de 0 a 5");
//                    System.out.println("Tercer dígito debe ser mayor o igual a 0 y menor a 6 para cédulas y RUC de persona natural ... permitidos de 0 a 5");
                }
                break;
            case 3:
                if (Integer.parseInt(numero) != 9) {
                    throw new Exception("Tercer dígito debe ser igual a 9 para sociedades privadas");
//                    System.out.println("Tercer dígito debe ser igual a 9 para sociedades privadas");
                }
                break;

            case 4:
                if (Integer.parseInt(numero) != 6) {
                    throw new Exception("Tercer dígito debe ser igual a 6 para sociedades públicas");
//                    System.out.println("Tercer dígito debe ser igual a 6 para sociedades públicas");
                }
                break;
            default:
                throw new Exception("Tipo de Identificacion no existe.");
//                System.out.println("Tipo de Identificacion no existe.");
        }

        return true;
    }

    /**
     * @param digitosIniciales
     * @param digitoVerificador
     * @return
     * @throws Exception
     */
    protected static boolean algoritmoModulo10(String digitosIniciales, int digitoVerificador) throws Exception {
        Integer[] arrayCoeficientes = new Integer[]{2, 1, 2, 1, 2, 1, 2, 1, 2};

        Integer[] digitosInicialesTMP = new Integer[digitosIniciales.length()];
        int indice = 0;
        for (char valorPosicion : digitosIniciales.toCharArray()) {
            digitosInicialesTMP[indice] = NumberUtils.createInteger(String.valueOf(valorPosicion));
            indice++;
        }

        int total = 0;
        int key = 0;
        for (Integer valorPosicion : digitosInicialesTMP) {
            if (key < arrayCoeficientes.length) {
                valorPosicion = (digitosInicialesTMP[key] * arrayCoeficientes[key]);

                if (valorPosicion >= 10) {
                    char[] valorPosicionSplit = String.valueOf(valorPosicion).toCharArray();
                    valorPosicion = (Integer.parseInt(String.valueOf(valorPosicionSplit[0]))) + (Integer.parseInt(String.valueOf(valorPosicionSplit[1])));

                }
                total = total + valorPosicion;
            }

            key++;
        }
        int residuo = total % 10;
        int resultado;

        if (residuo == 0) {
            resultado = 0;
        } else {
            resultado = 10 - residuo;
        }

        if (resultado != digitoVerificador) {
            throw new Exception("Dígitos iniciales no validan contra Dígito Idenficador");
//            System.out.println("Dígitos iniciales no validan contra Dígito Idenficador");
        }

        return true;
    }

    /**
     * @param numero
     * @return
     * @throws Exception
     */
    protected static boolean validarCodigoEstablecimiento(String numero) throws Exception {
        if (Integer.parseInt(numero) < 1) {
            throw new Exception("Código de establecimiento no puede ser 0");
//            System.out.println("Código de establecimiento no puede ser 0");
        }
        return true;
    }

    /**
     * @param digitosIniciales
     * @param digitoVerificador
     * @param tipo
     * @return
     * @throws Exception
     */
    protected static boolean algoritmoModulo11(String digitosIniciales, int digitoVerificador, Integer tipo) throws Exception {
        Integer[] arrayCoeficientes = null;

        switch (tipo) {

            case 3:
                arrayCoeficientes = new Integer[]{4, 3, 2, 7, 6, 5, 4, 3, 2};
                break;
            case 4:
                arrayCoeficientes = new Integer[]{3, 2, 7, 6, 5, 4, 3, 2};
                break;
            default:
                throw new Exception("Tipo de Identificacion no existe.");
//                System.out.println("Tipo de Identificacion no existe.");
        }

        Integer[] digitosInicialesTMP = new Integer[digitosIniciales.length()];
        int indice = 0;
        for (char valorPosicion : digitosIniciales.toCharArray()) {
            digitosInicialesTMP[indice] = NumberUtils.createInteger(String.valueOf(valorPosicion));
            indice++;
        }

        int total = 0;
        int key = 0;
        for (Integer valorPosicion : digitosInicialesTMP) {
            if (key < arrayCoeficientes.length) {
                valorPosicion = (digitosInicialesTMP[key] * arrayCoeficientes[key]);

                if (valorPosicion >= 10) {
                    char[] valorPosicionSplit = String.valueOf(valorPosicion).toCharArray();
                    valorPosicion = (Integer.parseInt(String.valueOf(valorPosicionSplit[0]))) + (Integer.parseInt(String.valueOf(valorPosicionSplit[1])));
                    //System.out.println(valorPosicion);
                }
                total = total + valorPosicion;
            }

            key++;
        }

        int residuo = total % 11;
        int resultado;

        if (residuo == 0) {
            resultado = 0;
        } else {
            resultado = (11 - residuo);
        }

        if (resultado != digitoVerificador) {
            throw new Exception("Dígitos iniciales no validan contra Dígito Idenficador");
//            System.out.println("Dígitos iniciales no validan contra Dígito Idenficador");
        }

        return true;
    }

    public static void main(String[] args) throws Exception {

        String c = String.valueOf(validarCedula("0950963058"));
        System.out.println(c);

        String pn = String.valueOf(validarRucPersonaNatural("0950963058001"));
        System.out.println(pn);
        
        String pj = String.valueOf(validarRucSociedadPrivada("0296537341001"));
        System.out.println(pj);
    }
}
