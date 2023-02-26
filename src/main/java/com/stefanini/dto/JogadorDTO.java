package com.stefanini.dto;

import javax.persistence.Column;

public class JogadorDTO {

    private String nickname;

    private String password;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public JogadorDTO() {
    }

    public JogadorDTO(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
