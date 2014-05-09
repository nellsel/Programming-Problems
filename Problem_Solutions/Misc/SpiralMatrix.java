//Iterative solution to the spiral matrix problem
public class SpiralMatrix {

	public static void main(String args[]) {

		int leniR = 4;
		int lenjD = 4;
		int[][] matrix = new int[leniR + 1][lenjD + 1];

		int nItems = (leniR + 1) * (lenjD + 1);

		//
		int leniL = 0;
		int lenjU = 0;
		//
		int i = 0;
		int j = 0;

		int num = 0;
		//fill the array up
		for (int k = 0; k < matrix[0].length; k++) {
			for (int n = 0; n < matrix.length; n++) {
				matrix[n][k] = num;
				num++;
			}
		}
		//this is where the magic happens
		while (nItems > 0) {

			i = leniL;
			j = lenjU;
			
			//the loop for top row
			nItems = iterateUp(leniR, matrix, nItems, i, j);

			lenjU++;

			j = lenjU;
			i = leniR;

			//the loop for rightmost row
			while (j <= lenjD) {
				System.out.println(matrix[i][j]);
				j++;
				nItems--;

			}

			leniR--;

			i = leniR;
			j = lenjD;
			//
			//the loop for hte bottom row
			//
			while (i >= leniL) {
				System.out.println(matrix[i][j]);
				i--;
				nItems--;
			}

			lenjD--;

			j = lenjD;
			i = leniL;
			//
			//the loop for leftmost row
			//
			while (j >= lenjU) {
				System.out.println(matrix[i][j]);
				j--;
				nItems--;
			}

			// increase this for next iteration

			leniL++;
			

		}
	}

	public static int iterateUp(int leniR, int[][] matrix, int nItems, int i,
			int j) {
		while (i <= leniR) {
			System.out.println(matrix[i][j]);
			i++;
			nItems--;
		}
		return nItems;
	}
}
