/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaodeimoveisdeturismo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Diogo Rolo
 */
public class ListaImoveis {

    private ArrayList<Imovel> imoveis;

    public ListaImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = new ArrayList<>();
    }

    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }

    public ArrayList<Imovel> removerImovel(ArrayList<Imovel> lista) {
        imoveis.removeAll(lista);
        return imoveis;
    }
    
    
    
    public ArrayList<Imovel> obterImoveisComGaragem(){
        ArrayList<Imovel> imoveisComGaragem =  new ArrayList<>();
        for(Imovel i : imoveisComGaragem){
            if( i instanceof Garagem){
                imoveisComGaragem.add(i);
            }
        }
        Collections.sort(imoveisComGaragem);
        Collections.reverse(imoveisComGaragem);
        return imoveisComGaragem;
    }

    public boolean armazenarEmBinario(String filename){
        try{
          ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
             out.writeObject(imoveis);
             out.close();
             return true;
        } catch ( IOException ex ){
            return false;
        }
    }	
}
