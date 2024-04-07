package sweap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinesweeperGUI extends JFrame {
    private JButton[][] buttons;
    private int[][] board;
    private boolean[][] revealed;
    private int rows;
    private int cols;
    private int mines;
    private boolean gameOver;

    public MinesweeperGUI(int rows, int cols, int mines) {
        this.rows = rows;
        this.cols = cols;
        this.mines = mines;
        this.gameOver = false;

        setTitle("Minesweeper");
        setSize(40 * cols, 40 * rows);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(rows, cols));
        initializeBoard();
        setVisible(true);
    }

    private void initializeBoard() {
        buttons = new JButton[rows][cols];
        board = new int[rows][cols];
        revealed = new boolean[rows][cols];

        // Create buttons and add them to the frame
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                buttons[i][j] = new JButton();
                final int row = i, col = j;
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        revealCell(row, col);
                    }
                });
                add(buttons[i][j]);
            }
        }

        // Place mines randomly
        int minesToPlace = mines;
        while (minesToPlace > 0) {
            int randRow = (int) (Math.random() * rows);
            int randCol = (int) (Math.random() * cols);
            if (board[randRow][randCol] != -1) {
                board[randRow][randCol] = -1;
                minesToPlace--;
            }
        }

        // Update numbers around mines
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == -1) {
                    updateNeighbours(i, j);
                }
            }
        }
    }

    private void revealCell(int row, int col) {
        if (gameOver || revealed[row][col]) return;

        revealed[row][col] = true;
        buttons[row][col].setEnabled(false);

        if (board[row][col] == -1) {
            gameOver = true;
            JOptionPane.showMessageDialog(this, "Game Over! You hit a mine!");
            revealMines();
        } else if (board[row][col] == 0) {
            revealNeighbours(row, col);
        }

        if (checkWin()) {
            gameOver = true;
            JOptionPane.showMessageDialog(this, "Congratulations! You win!");
        }
    }

    private void revealNeighbours(int row, int col) {
        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        for (int[] dir : dirs) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && !revealed[newRow][newCol]) {
                revealCell(newRow, newCol);
            }
        }
    }

    private void updateNeighbours(int row, int col) {
        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        for (int[] dir : dirs) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && board[newRow][newCol] != -1) {
                board[newRow][newCol]++;
            }
        }
    }

    private void revealMines() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == -1) {
                    revealed[i][j] = true;
                    buttons[i][j].setEnabled(false);
                    buttons[i][j].setText("*");
                }
            }
        }
    }

    private boolean checkWin() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!revealed[i][j] && board[i][j] != -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MinesweeperGUI game = new MinesweeperGUI(10, 10, 10); // 10x10 board with 10 mines
        });
    }
}
