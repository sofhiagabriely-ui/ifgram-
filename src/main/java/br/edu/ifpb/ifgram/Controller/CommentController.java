package br.edu.ifpb.ifgram.Controller;

import br.edu.ifpb.ifgram.DTO.CommentResponse;
import br.edu.ifpb.ifgram.Service.CommentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CommentController {

    private final CommentService commentService;

    public CommentControler(CommentService commentService) {   this.commentService = commentService;
    @PostMapping
            public CommentResponse crir (
                    @RequestBody CommentRequest request); {
                        return commentService.criar(request);
        }

    }



}
