package projekt201805chw;

public class Adres {
	private String ulica;
	private String kod;
	private String miasto;

	public Adres(String ulica, String kod, String miasto) {
		this.ulica = ulica;
		this.kod = kod;
		this.miasto = miasto;
	}
	
	@Override
	public String toString() {
		return "Adres "+ulica+" "+kod+" "+miasto;
	}

}
