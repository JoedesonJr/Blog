package br.ufsm.csi.model;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    private long idUsuario;
    private String login;
    private String nome;
    private byte[] senha;
    private boolean administrador;
    private int tentativasLogin;
    private boolean ativo;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    @SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario")
    @Column(name = "idUsuario")
    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Column(name = "login", length = 50, unique = true)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "nome", length = 50)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "senha", length = 20)
    public byte[] getSenha() {
        return senha;
    }

    public void setSenha(byte[] senha) {
        this.senha = senha;
    }

    @Column(name = "administrador")
    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    @Column(name = "tentativasLogin")
    public int getTentativasLogin() {
        return tentativasLogin;
    }

    public void setTentativasLogin(int tentativasLogin) {
        this.tentativasLogin = tentativasLogin;
    }

    @Column(name = "ativo")
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
