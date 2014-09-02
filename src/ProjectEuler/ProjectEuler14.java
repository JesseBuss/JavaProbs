package ProjectEuler;

public class ProjectEuler14 {
	public static void main(String[] args){
		int maxLength = 0;
		int start = 0;
		for(int i = 13; i < 1000000; i++){
			long n = i;
			int size = 0;
			while (n!= 1){
				if(n%2 == 0)
					n = n/2;
				else
					n = 3*n+1;
				size++;
				
			}
			if (size > maxLength){
				maxLength = size;
				start = i;
			}
		}
		System.out.print(start);
	}
}
