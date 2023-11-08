package br.com.fiap.soat1.t32.models;

import java.time.LocalDateTime;

public class TokenDTO {

    private String document;
    private LocalDateTime expiresAt;

    public String getDocument() {
        return document;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }
}
