# Game List

# Sobre o projeto
Game List é uma aplicação back-end construída durante a Imerção Java Spring Boot Dev Superior, evendo transmitido pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

Essa aplicação consiste em uma lista com vários jogos, onde é possível organizar cada jogo em várias posições diferentes.

OBS: O projeto não está em produção pela falta de opção gratuidade banco de dados online.

## Modelo conceitual

![Modelo conceitual](https://github.com/yurigabr25/dslist/blob/38f8717fddedefb8e707efdd3347a7a3bd9b1728/img/classDiagram.png)

# Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Postman
- Docker
- Postgresql

# Como executar o projeto

Pré-requisitos: Java 17 + Docker e uma IDE de sua preferência + Postman ou outro programa de requisição http
```bash
# clonar o repositório
git clone https://github.com/yurigabr25/dslist.git

# executar o projeto java na sua IDE

# entrar na pasta 'database' e rodar o docker
docker-compose up -d

# funções pelo Postman
filtrar jogos pelo id: http://localhost:8080/games/"id-do-jogo"

listar todos os jogos: http://localhost:8080/games

exibir todas as lias: http://localhost:8080/lists

filtrar listas por id: http://localhost:8080/lists/"id-da-lista"/games

movimentar jogos na lista: http://localhost:8080/lists/2/replacement
```

# Autor

Yuri Gabriel Ribeiro

https://www.linkedin.com/in/yurigabr25/
