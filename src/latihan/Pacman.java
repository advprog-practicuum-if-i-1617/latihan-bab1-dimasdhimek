/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
/**
 * last modification : Mar 14, 2017 05:55:21 PM
 * @author Dimas Setiawan
 */
public class Pacman {
    private int x = 1;
    private int y = 1;
    private int move = 0;
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getMove(){
        return move;
    }
    public void move(String input){
        if ("w".equals(input)){
            int yUp=y;
            yUp--;
            if (yUp==0||yUp==9||yUp==2&&x<=2||yUp==3&&x>=4||yUp==5&&x>=2&&x<=4||yUp==5&&x==7||yUp==7&&x>=3)
                yUp++;
            else {
                y--;
                move++;
            }
        }
        else if ("s".equals(input)){
            int yDown = y;
            yDown++;
            if (yDown==0||yDown==9||yDown==2&&x<=2||yDown==3&&x>=4||yDown==5&&x>=2&&x<=4||yDown==5&&x==7||yDown==7&&x>=3)
                yDown--;
            else {
                y++;
                move++;
            }    
        }
        else if ("a".equals(input)){
            int xLeft = x;
            xLeft--;
            if (y==0||y==9||y==2&&xLeft<=2||y==3&&xLeft>=4||y==5&&xLeft>=2&&xLeft<=4||y==5&&xLeft==7||y==7&&xLeft>=3)
                xLeft++;
            else {
                x--;
                move++;
            }
        }
        else if ("d".equals(input)){
            int xRight = x;
            xRight++;
            if (y==0||y==9||y==2&&xRight<=2||y==3&&xRight>=4||y==5&&xRight>=2&&xRight<=4||y==5&&xRight==7||y==7&&xRight>=3)
                xRight--;
            else {
                x++;
                move++;
            }
        }
    }
}
