
public class ISS implements Imposto {

	@Override
	public double Calcula(Orcamento or) {
		return or.getvalor() * 0.5;
		
	}
}
