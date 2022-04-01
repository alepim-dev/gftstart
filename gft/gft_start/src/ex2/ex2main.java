package ex2;

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
				if(v[q]==v[w]) {
					a++;
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		 int[] vetor = {31,15,17,48,22,17};
		
		for(int a: vetor) {
			System.out.println(a);
		}
		
		
		
	System.out.println(contaPares(vetor));
	System.out.println(contaImpares(vetor));
	System.out.println(contarepetidos(vetor));

}
}