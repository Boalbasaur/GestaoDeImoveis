/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaodeimoveisdeturismo;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Diogo Rolo
 */
public class Moradia extends Imovel implements Garagem {
    
   private float areaDaPiscina;

    public Moradia(String rua, int nQuartos, ArrayList<Comentario> listaDeComentarios, int nLigaresGaragem, float areaDaPiscina) {
        super(rua, nQuartos, listaDeComentarios, nLigaresGaragem);
        this.areaDaPiscina = areaDaPiscina;
    }

    public float getAreaDaPiscina() {
        return areaDaPiscina;
    }

    public void setAreaDaPiscina(float areaDaPiscina) {
        this.areaDaPiscina = areaDaPiscina;
    }

    @Override
    public float getNumeroLugaresImovel() {
        return getnLugaresGaragem();
    }

    @Override
    public String toString() {
        return "Moradia{" + "areaDaPiscina=" + areaDaPiscina + '}';
    }

    @Override
    public float getcustoTotal() {
        return custoLugaresGaragem2 + custoQuartos + custoPiscina;
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
