
package Classes;

public class ValidaNome {
    
    public static boolean ValidarNome(String nome) {
        for (int i = 0; i < nome.length(); i++) {
            String n = Character.toString(nome.charAt(i));
            if (!n.equals(" ")) {
                if (!n.matches("\\w")) {
                    return false;
                }
                if (n.matches("\\d")) {
                    return false;
                }
            }
        }
        return true;
    }
}
