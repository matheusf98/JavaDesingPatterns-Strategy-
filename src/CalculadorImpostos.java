
public class CalculadorImpostos {
	
	public void RealizaCalculo (Orcamento or, Imposto impo) {
		
		double Valor = impo.Calcula(or);
		System.out.println(Valor);
	}
}
