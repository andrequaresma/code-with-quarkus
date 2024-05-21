package operacoes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import construcao.ConstroiCadastro;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import utils.InfoCadastro;

@Path("/cadastro")
public class ExibeCadastro {

    @Inject
    ConstroiCadastro constroiCadastro;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response teste() {

        return Response.status(Response.Status.OK).entity(constroiCadastro.cadastro()).build();

    }
}