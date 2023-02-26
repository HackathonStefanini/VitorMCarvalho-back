package com.stefanini.entity;

import com.stefanini.dto.StefamonDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_stefamon")
public class Stefamon {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Integer vida;

    @Column(nullable = false)
    private Integer ataque;

    @Column(nullable = false)
    private Integer defesa;

    @Column(nullable = false)
    private Integer inteligencia;

    @Column(nullable = false)
    private Integer poder;

    @Column(nullable = false)
    private Integer velocidade;

    @Column(nullable = false)
    private String urlFoto;

    public Stefamon(StefamonDTO dto) {
        this.id = dto.getId();
        this.nome = dto.getNome();
        this.vida = dto.getVida();
        this.ataque = dto.getVida();
        this.defesa =dto.getDefesa();
        this.ataque = dto.getAtaque();
        this.inteligencia = dto.getInteligencia();
        this.poder = dto.getPoder();
        this.velocidade =dto.getVelocidade();
        this.urlFoto = dto.getUrlFoto();
    }
}
