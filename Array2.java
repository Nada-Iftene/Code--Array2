import java.util.Scanner;
/*IFTENE NADA
*/

public class Array2{

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int tnombre [] = {2,10,8,7,1,4,6,9,1};
		int i=0;
		boolean condition = false;
		while(condition == false && i < tnombre.length){
			if(tnombre[i] < 10){
				System.out.println("la valeur de la case " + (i+1) + " est: "
			+ tnombre[i]);
				i++;
			}else{
				condition = true;
			}
		}
		System.out.println("FIN DU PRGM");
		// TODO Auto-generated method stub

	}

}
