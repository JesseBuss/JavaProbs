package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ColorfulRoad {
	public static void main(String[] args){
		System.out.println(getMin("RGGGB")); //8
		System.out.println(getMin("RGBRGBRGB")); //8
		System.out.println(getMin("RBBGGGRR")); //-1
		System.out.println(getMin("RBRRBGGGBBBBR")); //50
		System.out.println(getMin("RG")); //1
		System.out.println(getMin("RBRGBGBGGBGRGGG")); //52
	}
	
	//Method that returns the minimum score
	public static int getMin(String road){
		//scores is a list that will store the "scores" for each
		//unique path to the end of the road
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		//helper HashMap. If we're at R, go to G. etc.
		HashMap<Character,Character> getNext = new HashMap<Character,Character>();
		getNext.put('R', 'G');
		getNext.put('G', 'B');
		getNext.put('B', 'R');
		
		//Loads up all values into our scores List.
		getScores(getNext, road, 0, 0, scores);
		
		//Find the minimum score
		int min = Integer.MAX_VALUE;
		for (int i : scores){
			if (i < min)
				min = i;
		}
		
		//If no minimum was found return -1
		if (min == Integer.MAX_VALUE)
			min = -1;
		
		return min;
	}
	
	public static void getScores(HashMap<Character,Character> next, String road, int pos, int score, ArrayList<Integer> scores){
		//if we are at the end of the road, return.
		if (pos == road.length()-1){
			scores.add(score);
			return;
		}
		
		//get the next character that we will go to.
		char c = next.get(road.charAt(pos));
		
		//new List to store the position for each of the instances of the next character
		List<Integer> positions = new ArrayList<Integer>();
		
		//for loop to add all the positions.
		for (int i = pos+1; i < road.length(); i++){
			if (road.charAt(i) == c)
			{
				positions.add(i);
			}
		}//if we found none, return.
		if (positions.size() == 0)
		{
			return;
		}
		
		//calculate new score, make the recursive call
		for (int i : positions){
			int newScore = score + (i-pos)*(i-pos);
			getScores(next, road, i, newScore, scores);
		}
	}
}
