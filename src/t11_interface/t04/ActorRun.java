package t11_interface.t04;

public class ActorRun {

	public static void main(String[] args) {
		System.out.println("배우는 다음과 같은 역할을 할수 있습니다");
		Actor actor = new Actor();
		System.out.println();
		
		System.out.println("경찰관 역할");
		actor.catching();
		actor.seraching();
		System.out.println();

		System.out.println("소방관 역할");
		actor.fire();
		actor.rescue();
		System.out.println();
		
		System.out.println("요리사 역할");
		actor.pizza();
		actor.spaghetti();
		System.out.println();
		
	}
}