package com.bl.OopsProgram;
/*
 * @uthor:amod
 * Shuffle the card using random method 
 */
import java.util.HashSet;
import java.util.Set;

public class DeckOfCards {
	public static void main(String[] args) {
		String[][] cardCombo = new String[4][13];
		String[][]players = new String[4][9];
		Set<String>card = new HashSet();
		int start = 0, end = 12, i = 0, j= 0, number =1, option,k=0, l=0, m=0, n=0;
		// shuffle the card
		String[] ranks = {"2","3","4","5","6","7","8","9","10","jack","Queen","King","Ace"};
		String[] suits = {"Clubs","Dimonds","Hearts","Spades"};
		//distribute the card
		for(i=0; i<4;i++) {
			for(j = start; j<= end; j++) {
				cardCombo[i][j]=suits[i] + ranks [j];
			}
		}
		//use random function
		while(number <= 36) {
			int randomSuits = (int)Math.floor((Math.random()*10) % 4);
			int randomRanks = (int)Math.floor((Math.random())*10 % 13);
			if(card.add(cardCombo[randomSuits][randomRanks])){
				option = number % 4;
				switch(option) {
				case 0 :
					players[option][k++] = cardCombo[randomSuits][randomRanks];
				break;
				case 1 :
					players[option][l++] = cardCombo[randomSuits][randomRanks];
					break;
				case 2 :
					players[option][m++] = cardCombo[randomSuits][randomRanks];
					break;
				case 3 :
					players[option][n++] = cardCombo[randomSuits][randomRanks];
				}
				number++;
			}
		}
		for (i=0; i<4; i++) {
			System.out.print("player"+(i+1)+ " : ");
			for (j=0; j<9; j++) {
				System.out.print(players[i][j]+" ");
			}
			System.out.println();
		}
	}
}
