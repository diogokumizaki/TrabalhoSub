/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unipar.br.bosing.livrodereceitas;

import javax.swing.JOptionPane;

// Diogo Massayuki Kumizaki RA: 00238909

public class LivroDeReceitas {
    private String receita;
    private String ingredientes;
    private String modoPreparo;
    
    public LivroDeReceitas(String receita, String ingredientes, String modoPreparo) {
        this.receita = receita;
        this.ingredientes = ingredientes;
        this.modoPreparo = modoPreparo;
    }
    
    public void exibirReceita() {
        String mensagem = "Receita: " + receita + "\n\nIngredientes:\n" + ingredientes + "\n\nModo de preparo:\n" + modoPreparo;
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
      
        
        
    }

    @Override
    public String toString() {
        return "LivroDeReceitas{" + "receita=" + receita + ", ingredientes=" + ingredientes + ", modoPreparo=" + modoPreparo + '}';
    }
}
