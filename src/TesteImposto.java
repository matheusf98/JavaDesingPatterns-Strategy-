
public class TesteImposto {

	public static void main(String[] args) {
		ISS iss = new ISS();
		ICMS icms = new ICMS();
		
		Orcamento orca = new Orcamento(100.0);
		
		CalculadorImpostos CL = new CalculadorImpostos();
		
		CL.RealizaCalculo(orca, iss);
		CL.RealizaCalculo(orca, icms);
	}
}
