package ArqHexagonalApplication;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ConsultaValidadeProtocolo {

    @Inject DadosProtocolo dadosProtocolo;

    public String consultaProtocolo(){
        return dadosProtocolo.getProtocolo();
    }
}
