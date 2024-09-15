package pe.edu.cibertec.app_clienterest_avanzado.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app_clienterest_avanzado.restclient.placeholder.iclientservice.UserClient;
import pe.edu.cibertec.app_clienterest_avanzado.restclient.placeholder.model.User;

//@AllArgsConstructor
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserClient userClient;

    public User obtenerUsuarioXid(Long id){
        return userClient.obtenerUsuarioXid(id,
                "Bearer aqui_token");
    }
}
