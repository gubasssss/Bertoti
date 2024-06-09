package tes;

import Connection.Conexão;
import Parser.ParserSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TES {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParserSQL parser = new ParserSQL();

        System.out.println("Digite um comando (ou 'sair' para terminar):");
        
        while (true) {
            System.out.print("> ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("sair")) {
                break;
            }

            String sqlQuery = parser.parseCommand(command);

            if (sqlQuery != null) {
                try (Connection connection = Conexão.getConnection();
                     Statement statement = connection.createStatement();
                     ResultSet resultSet = statement.executeQuery(sqlQuery)) {

                    while (resultSet.next()) {
                        System.out.println("ID: " + resultSet.getInt("Id"));
                        System.out.println("Nome: " + resultSet.getString("Nome"));
                        System.out.println("Genero: " + resultSet.getString("Genero"));
                        System.out.println("Preco: " + resultSet.getInt("Preco"));
                        System.out.println("-----------");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Comando não reconhecido.");
            }
        }

        scanner.close();
    }
}
