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
public class Apartamento extends Imovel implements Garagem{
    
    private int numeroAndar;

    public Apartamento( String rua, int nQuartos, ArrayList<Comentario> listaDeComentarios, int nLugaresGaragem, int numeroAndar) {
        super(rua, nQuartos, listaDeComentarios, nLugaresGaragem);
        this.numeroAndar = numeroAndar;
    }

    public Apartamento(int numeroAndar) {
        super();
    }

    public int getNumeroAndar() {
        return numeroAndar;
    }

    public void setNumeroAndar(int numeroAndar) {
        this.numeroAndar = numeroAndar;
    }
    

    @Override
    public float getNumeroLugaresImovel() {
        return getnLugaresGaragem();
    }

    @Override
    public String toString() {
        return "Apartamento{" + "numeroAndar=" + numeroAndar + '}';
    }

     @Override
    public float getcustoTotal() {
        return custoLugaresGaragem1 + custoQuartos;
    }
    
    @Override
    public int compareTo(Imovel t) {
           float n1 = this.getcustoTotal();
        float n2 = t.getcustoTotal();
        
        if(n1 < n2){
            return -1;
        }else if(n1 == n2){
            return 0;
        }else{
            return 1;
        }
    }

    
   
}
