package pkgCore;

public class Computer {

	private Integer iyear;
	private String strname;
	private Integer iqty;
	
	public Computer ()
	{
		
	}
	public Computer (Integer iYear, String strName)
	{
		this.iyear = iYear;
		this.strname = strName;
		this.iqty = 1;
	}
	public Computer (Integer iYear, String strName, Integer iQty)
	{
		this(iYear, strName);
		this.iqty = iQty;
	}

	public Integer getIyear() {
		return iyear;
	}

	public String getStrname() {
		return strname;
	}

	public Integer getIqty() {
		return iqty;
	}
	
}
