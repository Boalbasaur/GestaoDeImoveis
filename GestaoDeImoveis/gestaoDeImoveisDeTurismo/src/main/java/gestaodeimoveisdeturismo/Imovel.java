/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaodeimoveisdeturismo;

import java.util.ArrayList;

/**
 *
 * @author Diogo Rolo
 */
public abstract class Imovel implements Comparable<Imovel>{
    
    private String rua;
    
    private int nQuartos;
    
    private ArrayList<Comentario> listaDeComentarios;
    
    private int nLigaresGaragem;
    
    final float custoQuartos = 500f;
      
    final float custoLugaresGaragem1 = 500f;

    final float custoLugaresGaragem2 = 550f;
    
    final float custoPiscina = 300f;
      

    public Imovel(String rua, int nQuartos, ArrayList<Comentario> listaDeComentarios, int nLugaresGaragem) {
        this.rua = rua;
        this.nQuartos = nQuartos;
        this.listaDeComentarios = listaDeComentarios;
        this.nLigaresGaragem = nLugaresGaragem;
    }
    
    public Imovel() {
    }

    public String getRua() {
        return rua;
    }

    public int getnQuartos() {
        return nQuartos;
    }

    public ArrayList<Comentario> getListaDeComentarios() {
        return listaDeComentarios;
    }

    public int getnLugaresGaragem() {
        return nLigaresGaragem;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setnQuartos(int nQuartos) {
        this.nQuartos = nQuartos;
    }

    public void setListaDeComentarios(ArrayList<Comentario> listaDeComentarios) {
        this.listaDeComentarios = listaDeComentarios;
    }

    public void setnLigaresGaragem(int nLigaresGaragem) {
        this.nLigaresGaragem = nLigaresGaragem;
    }
    
    public abstract float getcustoTotal();
    
    

    
}
