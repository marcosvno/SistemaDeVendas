
package Classes;

public class ValidaNumero {
    
    public static boolean ValidarNumero(String num){
        for (int i = 0; i < num.length(); i++) {
            String n = Character.toString(num.charAt(i));
            if (!n.equals(".")) {
                if (!n.matches("\\d")) {
                    return false;
                }
            }
        }
        return true;
    }
}
