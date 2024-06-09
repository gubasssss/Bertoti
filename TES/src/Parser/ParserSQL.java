/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parser;

public class ParserSQL {
    public String parseCommand(String command) {
        command = command.toLowerCase();
        if (command.contains("listar todos os jogos")) {
            return "SELECT * FROM jogos;";
        }else if (command.contains("me de as informaçoes sobre o ")){
            String nomeJogo = command.replace("me de as informaçoes sobre o","").trim();
            return "SELECT * FROM jogos WHERE Nome='"+ nomeJogo + "';";
        }else if (command.contains("mostre todos os jogos do genero")){
            String generoJogo=command.replace("mostre todos os jogos do genero","").trim();
            return "SELECT * FROM jogos WHERE Genero='"+ generoJogo +"';";
        }else if (command.contains("encontrar jogos até o preço de")){
            String precoJogo=command.replace("encontrar jogos até o preço de","").trim();
            return "SELECT * FROM jogos WHERE Preco <="+precoJogo+";";
       }

        return null;
    }
 }     