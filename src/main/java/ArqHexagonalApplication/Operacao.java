package ArqHexagonalApplication;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
@Path("/Operacao")

@RequestScoped
public class Operacao {

    @Inject OperacaoExecutor operacaoExecutor;
    @Inject Entrada entrada;

    @GET
    public String exibir(){
        return operacaoExecutor.executa(entrada);
    }
}
