
package com.ghome.smart.util;


/**
 * 字符串公共类<br>
 * 
 */
public final class StringUtil  {

    private StringUtil() {
    }

    /**
     * null判断.
     * @param str 实行判断的字符串
     * @return boolean
     */
    public static boolean isNull(String str) {
        return str == null;
    }
    
    /**
     * null或者空字符串判断.
     * @param str 实行判断的字符串
     * @return boolean
     */
    public static boolean isEmpty(String str) {
        if (str == null) {
            return true;
        } else {
            return str.length() == 0;
        }
    }
}
