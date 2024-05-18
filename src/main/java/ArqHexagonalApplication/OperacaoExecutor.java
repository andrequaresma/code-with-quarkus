package ArqHexagonalApplication;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class OperacaoExecutor {

    @Inject ValidaEntrada validaEntrada;
    @Inject ConsultaValidadeProtocolo consultaValidadeProtocolo;
    @Inject EnriqueceToken enriqueceToken;

    public String executa(Entrada entrada){

        String resultadoProtocolo;

        if (validaEntrada.validar()){
            resultadoProtocolo = consultaValidadeProtocolo.consultaProtocolo();
            System.out.println("Protocolo válido");
        } else throw new RuntimeException("Protocolo inválido");

        if (resultadoProtocolo.equals("protocolo válido")){
            return  enriqueceToken.tokenEnriquecido(entrada);
        } else {
            throw new RuntimeException("Erro genérico - sessão inválida");
        }
    }
}
