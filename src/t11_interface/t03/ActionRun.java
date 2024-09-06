package t11_interface.t03;

public class ActionRun {
	public static void main(String[] args) {
		Action[] actions = {new Policeman(), new Fireman(), new Chef()};
		String[] title = {"경찰관","소방관","요리사"};
		int cnt = 0;
		for(Action action :actions) {
			action.person(title[cnt]);
			action.catching();
			action.searching();
			action.fire();
			action.rescue();
			action.pizza();
			action.spaghetti();
			System.out.println();
			cnt++;
		}
	}
}
