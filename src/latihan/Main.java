/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 * last modification : Mar 14, 2017 10:22:27 AM
 * @author Dimas Setiawan
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Maze maze = new Maze();
        maze.startMaze();
        Food food = new Food();
        food.startFood();
        Pacman pacman = new Pacman();
        char input='x';
        do {
            int point = 5;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (maze.getMaze(i,j)=='#')
                        System.out.print("#");
                    else if (pacman.getX()==j&&pacman.getY()==i){
                        System.out.print("@");
                        food.setFood(i,j);
                    }
                    else if (food.getFood(i, j)=='*')
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if(food.getFood(i, j)=='*')
                        point--;
                }
            }
            System.out.println("Point\t: "+point);
            System.out.println("Move\t: "+pacman.getMove());
            if (pacman.getMove()<10){
                System.out.print("Input w, a, s, d to move : ");
                pacman.move(in.next());
            }
            else {
                if (point==5){
                    System.out.println("You Win!");
                    input='q';
                }
                else{
                    System.out.println("You Lose!");
                    input='q';
                }
            }
        } while (input!='q');
    }

}