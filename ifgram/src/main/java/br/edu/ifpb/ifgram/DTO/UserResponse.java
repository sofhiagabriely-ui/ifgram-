package br.edu.ifpb.ifgram.DTO;

import br.edu.ifpb.ifgram.Model.User; 

public class UserResponse {

    public UserResponse(Long id, String nome, String email) {
    }

    public static br.edu.ifpb.ifgram.DTO.UserResponse from(User usuarioSalvo) {
        return null;
    }

    public record UserResponse(Long id, String nome, String email) {
        public static UserResponse from(User user){
            return new UserResponse(user.getId(), user.getNome(), user.getEmail());
        }
    }




}
