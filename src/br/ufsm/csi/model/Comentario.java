package br.ufsm.csi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comentario")
public class Comentario {

    private long idComentario;
    private String comentario;
    private Date dataHora;
    private Post post;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comentario")
    @SequenceGenerator(name = "seq_comentario", sequenceName = "seq_comentario")
    @Column(name = "idComentario")
    public long getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(long idComentario) {
        this.idComentario = idComentario;
    }

    @Column(name = "comentario", columnDefinition = "text")
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Column(name = "dataHora")
    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    @ManyToOne
    @JoinColumn(name = "idPost")
    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
