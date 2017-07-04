package br.ufsm.csi.model;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post")
public class Post {

    private long idPost;
    private String titulo;
    private String post;
    private Date dataHora;
    private Usuario usuario;
    private boolean ativo;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")
    @SequenceGenerator(name = "seq_post", sequenceName = "seq_post")
    @Column(name = "idPost")
    public long getIdPost() {
        return idPost;
    }

    public void setIdPost(long idPost) {
        this.idPost = idPost;
    }

    @Column(name = "titulo", length = 50)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Column(name = "post", columnDefinition = "TEXT")
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Column(name = "dataHora")
    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Column(name = "ativo")
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
