# Tic-Tac-Toe (Tris) in Java

## Description
Tic-Tac-Toe is a game developed in Java with a Swing graphical interface.  
Currently, it allows 1 vs 1 gameplay on a 3x3 board. In the future, a 1 vs CPU mode will be added.

## Main Features
- Graphical interface using **JFrame** and **JPanel**  
- 1 vs 1 gameplay (two players on the same computer)  
- Automatic winner detection (rows, columns, diagonals)  
- Tie detection when the board is full  
- Board reset after each game

## Future Features
- 1 vs CPU mode with basic AI  
- Improved graphics and animations  
- Option to choose player symbols and colors

## How to Run
1. Clone the repository:
   ```bash
   git clone <URL-of-your-repo>
2. Open the project in a Java IDE (Eclipse, IntelliJ, NetBeans)
3. Compile and run the main class `Tris.java`
4. Select the game mode and start playing

## Example

When a player wins or the game ends in a tie, a pop-up message appears:

* `"X wins!"`
* `"O wins!"`
* `"It's a tie!"`

## Project Structure

```
Tris/
│
├─ src/Tris/Tris.java       # Main class with GUI and game logic
├─ README.md                # This file
```

## Author

* Name: Alessandro
* GitHub: AlessandroSerrani
