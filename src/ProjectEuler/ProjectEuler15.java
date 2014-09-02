package ProjectEuler;

public class ProjectEuler15 {
	//comment 2
	public static void main(String[] args){
		double[][] matrix = new double[21][21];
		for (int i = 19; i >= 0; i--){
			matrix[i][20] = 1;
		}
		for (int i = 19; i >= 0; i--){
			matrix[20][i] = 1;
		}
		for (int y = 19; y >= 0; y--){
			for (int x = 19; x >= 0; x--){
				matrix[x][y] = matrix[x+1][y] + matrix[x][y+1];
			}
		}
		System.out.println(matrix[0][0]);
	}
}