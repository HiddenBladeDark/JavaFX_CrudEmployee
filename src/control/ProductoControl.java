/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.ProductoModelo;

/**
 *
 * @author ADSI
 */
public class ProductoControl {
    public static String mensaje="";
    public static float total=0;
    
    public static float calcular(ProductoModelo m){
        if(m.getCantidad()<0 || m.getPrecios()<0){
            mensaje="La cantidad o el precio no debe ser menor a 0(cero)";
            return 0;
        }else{
            mensaje="Operación realizada";
            total=(m.getCantidad()*m.getPrecios());
        }
        return total;
    }
   
}
