package t10_abstract.t2;

public abstract class Bonsa {
	private String shopName;
	private int kimchi;
	private int budae;
	private int bibim;
	private int sundae;
	private int konggi;
	
	
	
	public Bonsa(String shopName, int kimchi, int budae, int bibim, int sundae, int konggi) {
		this.shopName = shopName;
		this.kimchi = kimchi;
		this.budae = budae;
		this.bibim = bibim;
		this.sundae = sundae;
		this.konggi = konggi;
	}
	public abstract void kimchi();
	public abstract void budae();
	public abstract void bibim();
	public abstract void sundae();
	public abstract void konggi();
	
	
	public int getKimchi() {
		return kimchi;
	}
	public int getBudae() {
		return budae;
	}
	public int getBibim() {
		return bibim;
	}
	public int getSundae() {
		return sundae;
	}
	public int getKonggi() {
		return konggi;
	}
	public void getShopName() {
		System.out.println("점포명: "+shopName);
	}
	
}
