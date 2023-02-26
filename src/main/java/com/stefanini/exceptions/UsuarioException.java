package com.stefanini.exceptions;

import javax.ws.rs.core.Response;

public class UsuarioException extends RegraDeNegocioException{
    public UsuarioException(String message) {
        super(message);
    }

    public UsuarioException(String message, Response.Status status) {
        super(message, status);
    }
}
