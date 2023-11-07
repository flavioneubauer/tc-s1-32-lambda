package br.com.fiap.soat1.t32.models;

public class TokenDTO {

    private String document;
    private String expiresAt;

    public String getDocument() {
        return document;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }
}
