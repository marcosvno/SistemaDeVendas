
package Classes;

public class Usuario {
    String login = "adm";
    String senha = "123";

    public boolean validarDados(String log, String pass){
        if (log.equals(login)&&pass.equals(senha)) {
            return true;
        }else{
            return false;
        }
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String log) {
        this.login = log;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String pass) {
        this.senha = pass;
    }
}
