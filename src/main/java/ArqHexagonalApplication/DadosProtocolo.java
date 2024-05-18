package ArqHexagonalApplication;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class DadosProtocolo {

    private String protocolo = "protocolo válido";

    public String getProtocolo() {
        return protocolo;
    }
}
