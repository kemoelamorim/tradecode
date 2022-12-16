package br.com.tradecode.usuario.model;

public class User {
  private String username;
  private String email;
  private String senha;
  private String confirmaSenha;
  private String telefone;
  private String status;
  
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }
  public String getConfirmaSenha() {
    return confirmaSenha;
  }
  public void setConfirmaSenha(String confirmaSenha) {
    this.confirmaSenha = confirmaSenha;
  }
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
}
