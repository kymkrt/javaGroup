package t50_Exercise;

public class Home_Menu implements Home_Food {
	int tot = 2500;
	
	@Override
	public int tofu(String ans) {
		if(ans.equalsIgnoreCase("y")) return tot+=1000;
		else return tot;
	}

	@Override
	public int seaweed(String ans) {
		if(ans.equalsIgnoreCase("y")) return tot+=1000;
		else return tot;
	}

	@Override
	public int yogurt(String ans) {
		if(ans.equalsIgnoreCase("y")) return tot+=800;
		else return tot;
	}

	@Override
	public int banana(String ans) {
		if(ans.equalsIgnoreCase("y")) return tot+=500;
		else return tot;
	}

	@Override
	public int milk(String ans) {
		if(ans.equalsIgnoreCase("y")) return tot+=500;
		else return tot;
	}

	@Override
	public int amond(String ans) {
		if(ans.equalsIgnoreCase("y")) return tot+=700;
		else return tot;
	}
	
	@Override
	public void total() {
		System.out.println("총금액은 "+this.tot);
	}
	
@Override
	public int totalReset() {
		return tot=2000;
	}
}
