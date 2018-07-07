public class ArrayTwo {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[][] = new String[3][0];
		array[0] = new String[2];
		array[1] = new String[3];
		array[2] = new String[4];
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				array[i][j] = " 我的位置是："+i+","+j;
				System.out.println(array[i][j]);
			}
			System.out.println(" ");
		}
	}
 
}
