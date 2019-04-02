package pack;

public class ProFour {
	//Arrays
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num[] = new double[9];
		num[5]=12;
		num[1]=22;
		num[2]=35;
		for(int i =0 ;i<num.length; i++) {
			System.out.println(num[i]);
		}
		String data[][] = new String[2][2];
		data[0][0]= "msikandari";
		data[0][1]="123";
		data[1][0]="sikandaru";
		data[1][1]="123";
		int row =data.length;
		int col = data[0].length;
		System.out.println(row);
		System.out.println(col);
		for(int i =0;i<data.length;i++) {
			for(int j =0; j<data[0].length;j++) {
				System.out.print(data[i][j]+ " ");
				

			}
			System.out.println("");
		}
		
		
		
		
		
		
		

	}

}
