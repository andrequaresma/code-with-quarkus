package ArqHexagonalApplication;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ValidaEntrada {

    @Inject Entrada entrada;

    public boolean validar(){

        if (entrada.getNome().equals("nome") && entrada.getNumero() == 123){
            return true;
        }
        return false;
    }
}
