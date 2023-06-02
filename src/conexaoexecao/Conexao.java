/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoexecao;

/**
 *
 * @author alan
 */
public class Conexao implements AutoCloseable{
    
    

    public Conexao() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
            throw new IllegalStateException();
    }

  

    @Override
    public void close() {
        System.out.println("Fechando conexao");
    }

    
}
