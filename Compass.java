package main;

public class Compass {



	public Compass() {

	}

	public void distUpdate(Person player, GameEntity entity) {

		int[] personPosition = player.getPlayerPosition();
		int[] entityPosition = entity.getLocation();

		entity.setDistanceFromPlayer(Math.hypot(entityPosition[0] - personPosition[0],
				entityPosition[1] - personPosition[1]));
	}

	
	public void generalDirection(Person player, GameEntity entity) {
		
		int[] enitityLocation = entity.getLocation();
		int[] personPos = player.getPlayerPosition();
		
		int[] vector = { 0, 0 };
		vector[0] = enitityLocation[0] - personPos[0];
		vector[1] = enitityLocation[1] - personPos[1];


		if (Math.abs(vector[0]) >= Math.abs(vector[1])) {
			// either north or south
			if (vector[0] > 0) {
				entity.setDirectionFromPlayer("North");
			} else {
				entity.setDirectionFromPlayer("South");
			}
		} else if (Math.abs(vector[0]) < Math.abs(vector[1])) {
			// either East or West
			if (vector[1] > 0) {
				entity.setDirectionFromPlayer("East");
			} else {
				entity.setDirectionFromPlayer("West");
			}
		}
	}

}
