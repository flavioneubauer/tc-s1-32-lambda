package br.com.fiap.soat1.t32.models.response;

public class SimpleAuthorizer {

    private Boolean isAuthorized;

    public SimpleAuthorizer() {
    }

    public SimpleAuthorizer(Boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    public Boolean getAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(Boolean authorized) {
        isAuthorized = authorized;
    }
}
