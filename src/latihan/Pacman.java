/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
/**
 * last modification : Mar 10, 2017 2:35:51 PM
 * @author Dimas Setiawan
 */
public class Pacman {
    private int x = 1;
    private int y = 1;
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void move(String input){
        Maze maze = new Maze();
        if ("w".equals(input)){
            int yUp = y;
            if (maze.getMaze(x, yUp--)!='#')
                y--;
        }
        else if ("s".equals(input)){
            int yDown = y;
            if (maze.getMaze(x, yDown++)!='#')
                y++;
        }
        else if ("a".equals(input)){
            int xLeft = x;
            if (maze.getMaze(xLeft--, y)!='#')
                x--;
        }
        else if ("d".equals(input)){
            int xRight = x;
            if (maze.getMaze(xRight++, y)!='#')
                x++;
        }
    }
}
