/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
/**
 * last modification : Mar 14, 2017 10:32:24 AM
 * @author Dimas Setiawan
 */
public class Maze {
    private char[][] maze = new char[10][10];
        public char[][] startMaze(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i==0||i==9||j==0||j==9||i==2&&j<=2||i==3&&j>=4||i==5&&j>=2&&j<=4||i==5&&j==7||i==7&&j>=3)
                    maze[i][j]='#';
            }
        }
        return maze;
    }
    public char getMaze(int x, int y){
        return maze[x][y];
    }
}
