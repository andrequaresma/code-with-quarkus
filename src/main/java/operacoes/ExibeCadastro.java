package operacoes;

import construcao.ConstroiCadastro;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import utils.InfoCadastro;

@Path("/cadastro")
public class ExibeCadastro {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String teste(){
        ConstroiCadastro constroiCadastro = new ConstroiCadastro();
//        return constroiCadastro.cadastro();
        String teste = "Deu certo!";
    return teste;
    }
}