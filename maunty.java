package maunty;

import java.util.Random;
public class maunty{
	public static void printDoors(int[] doors)
	{
		 for (int i = 0; i < 3; i++) {
	        	System.out.println(doors[i]);
	        	}	
	}
    public static void main(String[] args){	
    	Random gen = new Random();
    	System.out.println("Let's try the optimal strategy.");
    	int winOptCnt = 0;
    	int losOptCnt = 0;
        int[] doors = {0,0,0};
        for (int i = 0; i < 1000; i++)
        {
	        doors[gen.nextInt(3)] = 1; //set a car as 1 and goats as 0
	        int choise = gen.nextInt(3);//set player's choise
	        int shown = 0;
	        while ((shown == choise) | (doors[shown] == 1)) //set shown door
	        {
	        	shown = gen.nextInt(3);
	        }
	        int offer = 0;
	        while ((offer == choise) | (offer == shown)) //set Maunty's offer
	        {
	        	offer = gen.nextInt(3);
	        } //We accept Maunty's offer because of optimal strategy
	        if (doors[offer] == 1)
	        	 {
	        	winOptCnt = winOptCnt + 1;
	        	 }
	        else
	        {
	        	losOptCnt = losOptCnt + 1;
	        }
	        for (int j = 0; j < 3; j++) {
	        	doors[j] = 0;
	        	}
        }
        System.out.println("Wins: " + winOptCnt + " of 1000.");
        System.out.println("Fails: " + losOptCnt + " of 1000.");
        System.out.println("Now let's try the random strategy.");
        for (int j = 0; j < 3; j++) {
        	doors[j] = 0;
        	}
        int winRandCnt = 0;
    	int losRandCnt = 0;
        for (int i = 0; i < 1000; i++)
        {
	        doors[gen.nextInt(3)] = 1; //set a car as 1 and goats as 0
	        int choise = gen.nextInt(3);//set player's choise
	        int shown = 0;
	        while ((shown == choise) | (doors[shown] == 1)) //set shown door
	        {
	        	shown = gen.nextInt(3);
	        }
	        int offer = 0;
	        while ((offer == choise) | (offer == shown)) //set Maunty's offer
	        {
	        	offer = gen.nextInt(3);
	        } 
	        int decision = gen.nextInt(2);
	        if (decision == 0)
	        {
	        	decision = choise;
	        }
	        else
	        {
	        	decision = offer;
	        }
	        if (doors[decision] == 1)
	        	 {
	        	winRandCnt = winRandCnt + 1;
	        	 }
	        else
	        {
	        	losRandCnt = losRandCnt + 1;
	        }
	        for (int j = 0; j < 3; j++) {
	        	doors[j] = 0;
	        	}
        }
        System.out.println("Wins: " + winRandCnt + " of 1000.");
        System.out.println("Fails: " + losRandCnt + " of 1000.");
    }
}
    