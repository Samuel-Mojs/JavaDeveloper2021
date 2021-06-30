
public class Napoj
{
	//fields
	private String nazov;
	private double cena;
	private final String E;
	private String velkost;
	
	
	
	//constructor
	public Napoj(String nazov, double cena, String E, String velkost)
	{
		this.nazov = nazov;
		this.cena = cena;
		this.E=E;
		this.velkost = velkost;
	}



	
	//methods
	
	
	
	@Override
	public String toString()
	{
		return "Napoj [nazov=" + nazov + ", cena=" + cena + ", velkost=" + velkost + "]";
	}




	public String getNazov()
	{
		return nazov;
	}




	public double getCena()
	{
		return cena;
	}




	public String getVelkost()
	{
		return velkost;
	}




	public String getE()
	{
		// 
		return "E";
	}
	
}
