/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.componentes;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author carlos
 */
public class FormatoNumeros {

    public static String formato_numero(String valor) {   ////////////////   1

        
        DecimalFormat formato = new DecimalFormat("0.###");
        String valorFormateado = formato.format(Double.parseDouble(valor));

        if (valorFormateado.charAt(0) == '.') {
            String h = "0" + valorFormateado;
            valorFormateado = h;
        }
        return valorFormateado.replace(",", ".");
    }

    public static String removeScientificNotation(String value) {
        return new BigDecimal(value).toPlainString();
    }

    
}
