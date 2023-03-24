package com.bridgelapbz.snake;

public class SnakeAndLadder {
      
        public static void main(String args[]) {
        	
                 System.out.println("Welcome To Snake Lader Game");
                 int position=0;
                 System.out.println("Start with Zero Position"+" " +position);
                 int die=(int)(Math.floor(Math.random())*10)%6+1;
                 System.out.println(die);
               }
}

