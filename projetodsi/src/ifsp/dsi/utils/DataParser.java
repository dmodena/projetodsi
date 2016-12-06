/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.utils;

/**
 *
 * @author Doug Modena
 */
public class DataParser {
    public static int boolToInt(boolean b) {
        return b ? 1 : 0;
    }
    
    public static boolean intToBool(int i) {
        return i == 1;
    }
}
