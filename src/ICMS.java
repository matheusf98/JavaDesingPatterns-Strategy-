
public class ICMS implements Imposto {

	@Override
	public double Calcula(Orcamento or) {
		return or.getvalor() * 0.2;
		
	}
}
