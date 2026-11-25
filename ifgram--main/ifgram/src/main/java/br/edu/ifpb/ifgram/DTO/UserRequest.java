package br.edu.ifpb.ifgram.DTO;

public record UserRequest(
        @Email
        String email,

        @Size(min=3)
        @NotNull
        String nome,

        @Size(min=4)
        @NotNull
        String senha
) {}