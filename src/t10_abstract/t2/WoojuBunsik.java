package t10_abstract.t2;

public class WoojuBunsik extends Bonsa {

	public WoojuBunsik() {
		super("우주분식", 6000, 7000, 7000, 6000, 1000);
	}
	
	@Override
	public void kimchi() {
		System.out.println("김치찌개 : "+getKimchi());
	}

	@Override
	public void budae() {
		System.out.println("부대찌개 : "+getBudae());

	}

	@Override
	public void bibim() {
		System.out.println("비빔밥 : "+getBibim());

	}

	@Override
	public void sundae() {
		System.out.println("순대 : "+getSundae());

	}

	@Override
	public void konggi() {
		System.out.println("공기밥 : "+getKonggi());

	}

}
