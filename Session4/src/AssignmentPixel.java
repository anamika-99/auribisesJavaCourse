
public class AssignmentPixel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pixel1 = {255, 0, 0}; // Red
		int[] pixel2 = {0, 255, 0}; // Green
		int[] pixel3 = {0, 0, 255}; // Blue
		
		int[] pixel4 = {125, 111, 255};
		int[] pixel5 = {225, 211, 155};
		int[] pixel6 = {135, 101, 25};
		
		int[] pixel7 = {15, 11, 125};
		int[] pixel8 = {25, 11, 205};
		int[] pixel9 = {12, 11, 115};
		
		int[][][] image = {
				{pixel1, pixel2, pixel3},
				{pixel4, pixel5, pixel6},
				{pixel7, pixel8, pixel9},
		};
		int N = image.length;

		for(int[][] i:image) {
			for(int[] j:i) {
				for(int k:j) {
					System.out.print(k+" ");
				}
				System.out.print("  ");
				
			}
			System.out.println();
		}
		//Grey Scale the pixels of an image
		
		System.out.println();
		System.out.println("Grey scale  :--");

		
		
				for(int i=0;i<N;i++) {
					for(int j=0;j<N;j++) {
						int sum=0;
						for(int k=0;k<3;k++) {
							sum=sum+image[i][j][k];
						}
						int avg=sum/3;
						for(int k=0;k<3;k++) {
							image[i][j][k]=avg;
						}
						
					}
				}
				for(int[][] i:image) {
					for(int[] j:i) {
						for(int k:j) {
							System.out.print(k+" ");
						}
						System.out.print("  ");
						
					}
					System.out.println();
				}
				System.out.println();

		System.out.println("90 degree rotated array");
		

		// Transpose the matrix
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				for(int k=0;k<3;k++) {
				int temp = image[i][j][k];
				image[i][j][k] = image[j][i][k];
				image[j][i][k] = temp;
				}
			}
		}

		// swap columns
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N / 2; j++) {
				for(int k=0;k<3;k++) {

				int temp = image[i][j][k];
				image[i][j][k] = image[i][N - j - 1][k];
				image[i][N - j - 1][k] = temp;
				}
			}
		}
		for(int[][] i:image) {
			for(int[] j:i) {
				for(int k:j) {
					System.out.print(k+" ");
				}
				System.out.print("  ");
				
			}
			System.out.println();
		}
		
		
		
		

	}

}
