package aula16e17;

public class Ex4 {
	public static void main(String[] args) {
		
		double populationA = 80000;
        double populationB = 200000;
        int cont= 0;
		
		while(populationA < populationB) {
			//quero saber porque isso n�o d� certo com n�meros abaixo de 4 
			
			populationA += (populationA/100)* 4;
			populationB = populationB + (populationB/100)* 3;
			cont++;
			
		}
		System.out.println("Popula��o A: " +populationA);
		System.out.println("Popula��o B: " +populationB);
		System.out.println("Anos " + cont);
	} 

}
