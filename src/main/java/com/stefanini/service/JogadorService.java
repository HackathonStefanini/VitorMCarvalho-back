package com.stefanini.service;

import com.stefanini.Utils.Crypto;
import com.stefanini.entity.Jogador;
import com.stefanini.exceptions.RegraDeNegocioException;
import com.stefanini.exceptions.UsuarioException;
import com.stefanini.repository.JogadorRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Objects;

@ApplicationScoped
public class JogadorService {
    @Inject
    JogadorRepository jogadorRepository;

    public void salvar(Jogador jogador) {
        if(Objects.nonNull(jogadorRepository.findByName(jogador.getNickname()))){
            throw new UsuarioException("Id de jogador ja existe!!!");
        }
        jogador.setPassword(Crypto.decriptografar(jogador.getPassword()));
        if(jogador.getPassword().length() < 4 || jogador.getPassword().length() > 10){
            throw new UsuarioException("tamanho de senha incompativel com o exigido!");
        }
        if(Objects.isNull(jogador.getStefamons())){
            throw new UsuarioException("lista de stefamons vazia!!!");
        }
        jogadorRepository.save(jogador);
    }

    public Jogador pegarPorId(Long id) {
        var jogador = jogadorRepository.findById(id);
        if(Objects.isNull(jogador)) {
            throw new RegraDeNegocioException("Ocorreu um erro ao buscar o Jogador de id " + id, Response.Status.NOT_FOUND);
        }
        return jogador;
    }

    public void alterar(Jogador jogador) {
        jogadorRepository.update(jogador);
    }

    public void deletar(Long id) {
        jogadorRepository.delete(id);
    }

    public List<Jogador> listarTodos() {
        return jogadorRepository.listAll();
    }
}
