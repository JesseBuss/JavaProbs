package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ColorfulRoad {
	public static void main(String[] args){
		System.out.println(getMin("RGGGB"));
		System.out.println(getMin("RGBRGBRGB"));
		System.out.println(getMin("RBBGGGRR"));
		System.out.println(getMin("RBRRBGGGBBBBR"));
		System.out.println(getMin("RG"));
		System.out.println(getMin("RBRGBGBGGBGRGGG"));
	}
	
	public static int getMin(String road){
		ArrayList<Integer> scores = new ArrayList<Integer>();
		HashMap<Character,Character> getNext = new HashMap<Character,Character>();
		getNext.put('R', 'G');
		getNext.put('G', 'B');
		getNext.put('B', 'R');
		
		getScores(getNext, road, 0, 0, scores);
		
		int min = Integer.MAX_VALUE;
		for (int i : scores){
			if (i < min)
				min = i;
		}
		if (min == Integer.MAX_VALUE)
			min = -1;
		return min;
	}
	
	public static void getScores(HashMap<Character,Character> next, String road, int pos, int score, ArrayList<Integer> scores){
		//System.out.println("pos = " + pos + ", score = " + score);
		if (pos == road.length()-1){
			scores.add(score);
			return;
		}
		char c = next.get(road.charAt(pos));
		List<Integer> positions = new ArrayList<Integer>();
		for (int i = pos+1; i < road.length(); i++){
			if (road.charAt(i) == c)
			{
				positions.add(i);
			}
		}
		if (positions.size() == 0)
		{
			return;
		}
		for (int i : positions){
			int newScore = score + (i-pos)*(i-pos);
			getScores(next, road, i, newScore, scores);
		}
	}
}
