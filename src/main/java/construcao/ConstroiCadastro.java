package construcao;

import utils.InfoCadastro;

public class ConstroiCadastro {

    public String cadastro(){
        InfoCadastro infoCadastro1 = new InfoCadastro();
        infoCadastro1.setNome("André Luiz");
        infoCadastro1.setIdade(39);
        return "Nome: " + infoCadastro1.getNome()
                + "\nIdade: " + infoCadastro1.getIdade();
    }
}
