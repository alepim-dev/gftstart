package ex2;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ex2main {
	
	public static Integer contaPares(int[] v) {
		int q=0;
		for(int a: v) {
			if(a%2==0) {
				q++;
			}
		}
		
		return q;
	}
	
	public static Integer contaImpares(int[] v) {
		int q=0;
		for(int a: v) {
			if(a%2!=0) {
				q++;
			}
		}
		
		return q;
	}

	public static  Integer contarepetidos(int[] v){
		int a=0;
		for(int q=0; q<v.length; q++) {
			for(int w=0; w<v.length; w++) {
				if(v[q]==v[w]&& q!=w) {
					a++;
					break;
				}
			}
		}
		return a/2;
	}
	
	public static  void imprimeRepetidos(int[] v){
		
		List<Integer> repetidos = new ArrayList<>();
		for(int q=0; q<v.length; q++) {
			for(int w=0; w<v.length; w++) {
				if(v[q]==v[w]&& q!=w) {
					if(!repetidos.contains(v[q])) {
					repetidos.add(v[q]);
				}
				
			}
		}
		}
		System.out.println(repetidos);
	
	}
	
	
	
	public static void insereNumero(int[] v)	{

		int t = v.length;
		int c=0;
		Scanner scan = new Scanner(System.in);
		 do {
			 System.out.println("digite um numero");
			 int n = scan.nextInt();
			 v[c]= n;
			 c++;
		 }while(c<t);
		 scan.close();
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o tamanho do vetor");
		int t = sc.nextInt();
		int[] vetor = new int[t];
		
		insereNumero(vetor);
		 
		 sc.close();
		
		
		
		
	System.out.println(contaPares(vetor));
	System.out.println(contaImpares(vetor));
	System.out.println(contarepetidos(vetor));
     imprimeRepetidos(vetor);	

}
}