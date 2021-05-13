
public class Ukol {
	private String ukol;
	private Priorita priorita;

	public Ukol(String ukol,Priorita priorita) {
		this.priorita=priorita;
		this.ukol=ukol;
				
		
	}
	
	public String getUkolString() {
		return ukol;
	}

	@Override
	public String toString() {
		return "Ukol [ukol=" + ukol + ", priorita=" + priorita + "]";
	}

}
