package construcao;

import jakarta.enterprise.context.ApplicationScoped;
import utils.InfoCadastro;
@ApplicationScoped
public class ConstroiCadastro {

    public String cadastro(){
        InfoCadastro infoCadastro1 = new InfoCadastro();
        infoCadastro1.setNome("André Luiz");
        infoCadastro1.setIdade(39);
        return "Nome: " + infoCadastro1.getNome()
                + "\nIdade: " + infoCadastro1.getIdade();
    }
}
