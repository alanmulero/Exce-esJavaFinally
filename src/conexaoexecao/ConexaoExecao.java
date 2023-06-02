/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexaoexecao;

/**
 *
 * @author alan
 */
public class ConexaoExecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancia Executa codigo.
        
        
        try(Conexao conexao = new Conexao()){
           conexao.leDados();
        }catch(Exception ex){
            System.out.println("Um erro na conexão.");
            
        }
        
        
        
        
    }
    
}
