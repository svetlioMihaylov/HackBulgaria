package hack;

public class MagicSquare {
	int[][] matrix;

	public MagicSquare(int[][] arg) {
		matrix = arg;
	}
	
	public boolean check() {

		int sumDS = 0, sumDF = 0, sumLine = 0, sumRow = 0, sumLastRow = 0, sumLastLine = 0;
		int size = matrix.length;
		for (int i = size, j = 0; i != 0 && j <= size; i--, j++)

		{
			sumDS =sum(this.matrix,i-1,j,sumDS);
			sumDF= sum(this.matrix,j,j,sumDF);
		}
		for (int i = 0; i < size; i++) {
			sumRow = sum(this.matrix,i,0,sumRow);
			sumLastRow +=sum(this.matrix,i,size-1,sumLastRow);
		}
		for (int j = 0; j < size; j++) {
			sumLine = sum(this.matrix,0,j,sumLine);
			sumLastLine = sum(this.matrix,size-1,j,sumLastLine);
		}
		if ((sumDF == sumDS) && (sumLine == sumLastLine)
				&& (sumRow == sumLastRow))
			return true;
		else
			return false;
	}
	public int getSizeLine()
	{
		return matrix[0].length;
	}
	public int getSizeRow()
	{
		return matrix.length;
	}
	private int sum(int [][] matrix,int i,int j,int result)
	{
		return result+matrix[i][j];
	}
	public static void main(String[] args) {

		int prob[][] = { { 16, 23, 17 }, { 78, 32, 21 }, { 17, 16, 15 } };
		MagicSquare test = new MagicSquare(prob);
		System.out.println(test.check());
	}
}