/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaodeimoveisdeturismo;

/**
 *
 * @author Diogo Rolo
 */
public enum Avaliacao {
    
    
    FRACO("Fraco"),MEDIO("Médio"),MUITOBOM("Muito Bom"),EXCELENTE("Excelente");
    
    private String avaliacao;

    private Avaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getAvaliacao() {
        return avaliacao;
    }
    
    
    
}
