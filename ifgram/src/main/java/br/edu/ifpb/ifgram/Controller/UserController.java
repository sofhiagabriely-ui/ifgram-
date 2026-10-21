package br.edu.ifpb.ifgram.Controller;

import br.edu.ifpb.ifgram.DTO.UserRequest;
import br.edu.ifpb.ifgram.DTO.UserResponse;
import br.edu.ifpb.ifgram.Service.UserService;

import java.util.List;


import org.springframework.web.bind.annotation.*;


@RestController
    @RequestMapping("user")
    public class UserController {

        public final UserService service;

        public UserController(UserService service){
            this.service = service;
        }


        @GetMapping
        public List<UserResponse> getUsers(){
            List<UserResponse> listaUsuarios = service.buscarTodosUsuarios();
            return listaUsuarios;
        }

        @PostMapping
        public UserResponse postUser(UserRequest request) throws Exception {
            UserResponse userResponse = service.criar(request);
            return userResponse;
        }
        @PutMapping
        public UserResponse UpdateUser (UserRequest request) throws Exception {
            return service.atualizarUsuario(request);
        }
        @DeleteMapping
    public void deleteUser( UserRequest request) throws Exception
    }

