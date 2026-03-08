# jogo_de_turnos

A simple **turn-based console game developed in Java** where players control territories and battle each other using dice rolls.

Um **jogo simples baseado em turnos desenvolvido em Java**, executado no terminal, onde jogadores controlam territórios e batalham usando rolagem de dados.

---

# 🇺🇸 English

## Overview

**jogo_de_turnos** is a small turn-based strategy game created as a programming practice project.

Players control territories and fight each other using a simple **dice-based combat system**.
The objective of the game is to eliminate all other players and be the last one remaining.

The game supports **2 to 4 players**.

---

## How the Game Works

When the game starts:

1. The program asks how many players will participate.
2. Each player enters:

    * Player name
    * Territory name
3. Each player starts with a number of troops based on the number of players.

### Initial Troops

The number of starting troops is calculated as:

```
troops = numberOfPlayers * 3
```

Example:

| Players | Troops |
| ------- | ------ |
| 2       | 6      |
| 3       | 9      |
| 4       | 12     |

---

## Turn System

Players take turns during the game.

Each turn the player must choose between:

```
ATTACK
SKIP
```

---

## Attack System

If the player chooses **ATTACK**, they must select another player as the defender.

Both players roll a **virtual dice (1–6)**.

### Combat Result

| Condition                     | Result                 |
| ----------------------------- | ---------------------- |
| Attacker roll > Defender roll | Defender loses 1 troop |
| Defender roll > Attacker roll | Attacker loses 1 troop |
| Draw                          | Attacker loses 1 troop |

---

## Player Elimination

If a player's troops reach **0**, that player is removed from the game.

The game continues until **only one player remains**.

That player is declared the **winner**.

---

## Skip System

Players can also choose to **skip their turn**.

If all players skip their turns **three times in a row**, the game ends automatically to prevent the game from running indefinitely.

---

## Project Structure

```
src
│
├── Main.java
│
└── game
    ├── Battle.java
    ├── Territories.java
    └── GameStatus.java
```

---

## File Responsibilities

### Main.java

Entry point of the application.

Responsible for:

* Displaying the game title
* Asking how many players will participate
* Generating territories
* Starting the battle system

---

### Battle.java

Contains the **main game logic**, including:

* Turn system
* Attack mechanics
* Dice rolling
* Troop loss calculation
* Player elimination
* Victory detection

---

### Territories.java

Represents the **territories and players**.

Stores:

* Player name
* Territory name
* Number of troops

It also contains the method responsible for **creating the territories at the start of the game**.

---

### GameStatus.java

Responsible for printing the **current game state** after each turn.

It displays:

* Player name
* Territory
* Remaining troops

---

## How to Run the Project

Compile the project:

```
javac Main.java game/*.java
```

Run the game:

```
java Main
```

---

## Technologies Used

* Java
* Object-Oriented Programming
* ArrayList
* Random
* Scanner

---

## AI Assistance

During the development of this project, **Artificial Intelligence tools were used as support for learning and coding assistance**.

AI was used to help with:

* Understanding programming concepts
* Debugging logic issues
* Suggesting small improvements during development

The project was created mainly as a **learning exercise while studying Java programming**.

---

# 🇧🇷 Português

## Visão Geral

**jogo_de_turnos** é um pequeno jogo de estratégia baseado em turnos desenvolvido em **Java** e executado diretamente no **terminal**.

Cada jogador controla um território e batalha contra os outros utilizando um sistema simples de **rolagem de dados**.

O objetivo é eliminar todos os oponentes e ser o último jogador restante.

O jogo suporta **2 a 4 jogadores**.

---

## Funcionamento do Jogo

Quando o jogo começa:

1. O programa pergunta quantos jogadores irão participar.
2. Cada jogador informa:

    * Nome do jogador
    * Nome do território
3. Cada jogador começa com uma quantidade inicial de tropas.

### Tropas Iniciais

A quantidade de tropas é calculada da seguinte forma:

```
tropas = numeroDeJogadores * 3
```

---

## Sistema de Turnos

Os jogadores jogam em sequência.

Durante o turno, o jogador pode escolher:

```
ATTACK
SKIP
```

---

## Sistema de Ataque

Se o jogador escolher **ATTACK**, ele seleciona outro jogador para atacar.

Ambos rolam um **dado virtual (1 a 6)**.

O resultado determina quem perde uma tropa.

---

## Eliminação

Quando as tropas de um jogador chegam a **0**, ele é removido da partida.

O jogo continua até restar **apenas um jogador**, que será declarado **vencedor**.

---

## Estrutura do Projeto

```
src
│
├── Main.java
│
└── game
    ├── Battle.java
    ├── Territories.java
    └── GameStatus.java
```

---

## Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos
* ArrayList
* Random
* Scanner

---

## Uso de Inteligência Artificial

Durante o desenvolvimento deste projeto foram utilizadas **ferramentas de Inteligência Artificial como suporte ao aprendizado**.

A IA foi utilizada principalmente para:

* Explicar conceitos de programação
* Auxiliar na depuração de lógica
* Ajudar durante o processo de desenvolvimento

Este projeto foi desenvolvido como parte de um **processo de estudo e prática em programação Java**.

---

## Autor

desenvolvido por Luiz!

Projeto desenvolvido para estudo e prática de **Java e lógica de programação**.
