package conf;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    private Connection conexao;
        
    public Conexao() {        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/biblioteca", 
                    "root", 
                    "");
            
            System.out.println("Conexão efetuada com sucesso!!!");
        }
        catch ( Exception e ){
            System.out.println("Falha na conexão");
            e.printStackTrace();
        }
    }
    
    public Connection getConexao(){
        return conexao;
    } 

    public static void main(String[] args) {
        Conexao c = new Conexao();
    }    
}