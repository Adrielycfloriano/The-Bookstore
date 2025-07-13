package com.thebookstore.controller;

import com.thebookstore.gen.api.AutorApi;
import com.thebookstore.gen.model.AutorRequestDto;
import com.thebookstore.gen.model.MensagemDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutorController implements AutorApi {

    /**
     * POST /autor/cadastrar : Cadastrar um novo Autor
     *
     * @param autorRequestDto (required)
     * @return Autor Cadastrado com sucesso (status code 200)
     * Autor já cadastrado (status code 409)
     */
    @Override
    public ResponseEntity<MensagemDto> _autorCadastrarPost(AutorRequestDto autorRequestDto) {
        return null;
    }
}
