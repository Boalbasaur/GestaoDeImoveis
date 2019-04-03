/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaodeimoveisdeturismo;

import java.util.Objects;

/**
 *
 * @author Diogo Rolo
 */
public class Comentario {
    
    private String descricao;
    
    private Avaliacao avaliacao;

    public Comentario(String classificacao, Avaliacao avaliacao) {
        this.descricao = classificacao;
        this.avaliacao = avaliacao;
    }

    public Comentario() {
    }

     public Comentario(Comentario outroComentario) {
         this.avaliacao=outroComentario.avaliacao;
         this.descricao=outroComentario.descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setDescricao(String descricao) {
        if(descricao.trim().isEmpty()){
            throw new IllegalArgumentException("Descricao inválida.");
        }
        this.descricao = descricao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "Comentario{" + "classificacao=" + descricao + ", avaliacao=" + avaliacao + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Comentario other = (Comentario) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (this.avaliacao != other.avaliacao) {
            return false;
        }
        return true;
    }
    
    
    
}