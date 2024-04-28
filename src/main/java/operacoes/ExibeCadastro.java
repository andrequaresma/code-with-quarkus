package operacoes;

import construcao.ConstroiCadastro;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import utils.InfoCadastro;

@Path("/cadastro")
public class ExibeCadastro {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String teste(){
        ConstroiCadastro constroiCadastro = new ConstroiCadastro();
        return constroiCadastro.cadastro();
    }
}