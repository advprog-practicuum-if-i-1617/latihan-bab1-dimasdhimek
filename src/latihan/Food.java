/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
/**
 * last modification : Mar 14, 2017 10:23:11 AM
 * @author Dimas Setiawan
 */
public class Food {
        private char[][] food = new char[10][10];

    public char[][] startFood() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 1 && j == 2 || i == 2 && j == 4 || i == 3 && j == 3 || i == 4 && j == 5 || i == 5 && j == 5) {
                    food[i][j] = '*';
                }
            }
        }
        return food;
    }
    public char getFood(int x, int y) {
        return food[x][y];
    }
    public void setFood(int x, int y) {
        food[x][y]=' ';
    }
}
