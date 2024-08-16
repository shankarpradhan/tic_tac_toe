
# Tic-Tac-Toe Game

A simple GUI-based two-player Tic-Tac-Toe game developed using Java and the AWT toolkit. The game allows two players to take turns marking "0" and "X" on a 3x3 grid, aiming to align their marks across a row, column, or diagonal to win.

## Overview

- **Language:** Java
- **GUI Toolkit:** AWT (Abstract Window Toolkit)
- **IDE:** VS Code, Eclipse, IntelliJ IDEA
- **Java Version:** 1.4 or higher

## Game Rules

- **Two Players:** 
  - Player 1: Marks "0"
  - Player 2: Marks "X"
- **Win Condition:** A player wins by aligning their symbol in a row, column, or diagonal.
- **Draw Condition:** The game ends in a draw if all grid spaces are filled without any player meeting the win condition.

## Implementation Steps

### 1. Create the GUI Layout

- Use AWT components like `Frame`, `Button`, and `Label` to create the game grid (typically a 3x3 grid).
- Each grid cell is represented by a button that players can click to place their mark.

### 2. Event Handling

- Implement `ActionListener` to handle button clicks.
- When a player clicks a button, the button label changes to the player's symbol ("0" or "X").
- Alternate the turn between players after each click.

### 3. Win Condition Check

- After each move, the game checks if the current player has won by examining the rows, columns, and diagonals.
- If a player wins, a message is displayed and further moves are disabled.

### 4. Restart or Exit

- Provide options to restart the game or exit after a win, loss, or draw.

## How to Run the Game

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/shankarpradhan/tic_tac_toe.git
