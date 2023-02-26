package com.stefanini.Utils;

import java.util.Base64;

public final class Crypto {
    public static String criptografar(String password) {
        return new String(Base64.getEncoder().encode(password.getBytes()));
    }

    public static String decriptografar(String encryptPassword) {
        return new String(Base64.getDecoder().decode(encryptPassword.getBytes()));
    }
}
