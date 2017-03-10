/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 * last modification : Mar 10, 2017 2:33:51 PM
 * @author Dimas Setiawan
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Maze maze = new Maze();
        Food food = new Food();
        food.startFood();
        Pacman pacman = new Pacman();
        int move=0;
        do {
            maze.setMaze();
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (pacman.getX()==j&&pacman.getY()==i){
                        System.out.print('@');
                        food.setFood(i, j);
                    }
                    else if (food.getFood(i, j)=='*')
                        System.out.print('*');
                    else
                        System.out.print(maze.getMaze(i, j));
                }
                System.out.println();
            }
            System.out.println("Move left : "+(10-move));
            System.out.print("Input w, a, s, d to move : ");
            pacman.move(in.next());
        }while (move <= 10);
    }

}