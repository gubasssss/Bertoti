CREATE database videogames;

use videogames;

CREATE TABLE jogos(
	Id INT AUTO_INCREMENT PRIMARY KEY,
	Nome VARCHAR(255) NOT NULL,
    Genero VARCHAR(255) NOT NULL,
    Preco INT NOT NULL
    );
    
INSERT INTO jogos (Nome, Genero, Preco) VALUES
('The Witcher 3: Wild Hunt', 'RPG', 59),
('Cyberpunk 2077', 'RPG', 69),
('Red Dead Redemption 2', 'Acao', 49),
('Minecraft', 'Sandbox', 26),
('Among Us', 'Party', 5),
('Fortnite', 'Battle Royale', 0),
('FIFA 22', 'Esportes', 59),
('The Legend of Zelda: Breath of the Wild', 'Acao', 59),
('Super Mario Odyssey', 'Plataforma', 59),
('Grand Theft Auto V', 'Acao', 29),
('Dark Souls III', 'RPG', 39),
('Hades', 'Roguelike', 25),
('Celeste', 'Plataforma', 19),
('Hollow Knight', 'Metroidvania', 15),
('Stardew Valley', 'Simulacao', 14);
    
