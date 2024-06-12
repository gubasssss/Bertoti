package com.mycompany.sqltraductor;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class SQLTraductor {



    public static void main(String[] args) {
        ChatLanguageModel model = OllamaChatModel.builder()
                .baseUrl("http://localhost:11434/")
                .modelName("llama3")
                .temperature(0.8)
                .build();
        
      String schemaDefinition = "CREATE TABLE IF NOT EXISTS jogos (" +
            "Id INT AUTO_INCREMENT PRIMARY KEY, " +
            "Nome VARCHAR(255) NOT NULL, " +
            "Genero VARCHAR(255) NOT NULL, " +
            "Preco INT NOT NULL" +
            ");";
      
                Scanner scanner = new Scanner(System.in);
                System.out.println("Digite sua Pergunta:");
                String userQuery = scanner.nextLine();

                String resposta = model.generate("Please respond only using SQL queries. Do not use natural language in your responses" + schemaDefinition + userQuery);
                
               String SQLQuery = resposta;
            
        Connection connection = Conexao.getConnection();
        if(connection != null){
          try {
            PreparedStatement stmt = connection.prepareStatement(SQLQuery);
            System.out.println(SQLQuery);
             ResultSet rs = stmt.executeQuery();

             
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + "\t");
            }
            System.out.println();
            
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }

           } catch (SQLException e) {
                e.printStackTrace();
        }
    }
        }
    }

          


        
        
    

