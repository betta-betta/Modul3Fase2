import java.util.Scanner;
import java.util.Arrays;
public class Modul3Fase2 {

	public static void main(String[] args) {
		
		String ciutat1;
		String ciutat2;
		String ciutat3;
		String ciutat4;
		String ciutat5;
		String ciutat6;
		Scanner  nomCiutat = new Scanner(System.in);

	    System.out.println("Introduiex el nom de la 1� ciutat ");
	    ciutat1 = nomCiutat.nextLine();
	    System.out.println("Introduiex el nom de la 2� ciutat");
	    ciutat2 = nomCiutat.nextLine();
	    System.out.println("Introduiex el nom de la 3� ciutat");
	    ciutat3 = nomCiutat.nextLine();
	    System.out.println("Introduiex el nom de la 4� ciutat");
	    ciutat4 = nomCiutat.nextLine();
	    System.out.println("Introduiex el nom de la 5� ciutat");
	    ciutat5 = nomCiutat.nextLine();
	    System.out.println("Introduiex el nom de la 6� ciutat");
	    ciutat6 = nomCiutat.nextLine();
	    nomCiutat.close();
	    System.out.println(" "); 
	    System.out.println("Les ciutats s�n: "+ciutat1+" "+ciutat2+" "+ciutat3+" "+ciutat4+" "+ciutat5+" "+ciutat6);
		
	    System.out.println(" "); 
	    String [] arrayCiutat = {ciutat1,ciutat2,ciutat3,ciutat4,ciutat5,ciutat6};
	    for (int i=0;i<arrayCiutat.length;i++) {
	    	System.out.println("La ciutat que est� a la posici� "+(i+1)+" al array �s : "+arrayCiutat[i]);
	    	}
	    System.out.println(" "); 
	    Arrays.sort(arrayCiutat);
	    for (int i=0;i<arrayCiutat.length;i++) {
	    	System.out.println("L'ordre de les ciutats ordenades alfabeticament �s : " + arrayCiutat[i]);
	    }	 
	
	}
	

}
