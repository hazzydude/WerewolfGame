package main;

public class Compass {
	
	double treasureDistance;
	double werewolfDistance;
	String wolfDirection;
	
	public Compass() {
		
	}
	
	public void treasureDistUpdate(int[] personPos,int[] treasurePos) {
		
		this.treasureDistance= Math.hypot(treasurePos[0] - personPos[0], treasurePos[1]-personPos[1]);
		
		//will it like negatives????
		
	}
	
	public void werewolfDistUpdate(int[] personPos,int[] werewolfPos) {
		
		this.werewolfDistance= Math.hypot(werewolfPos[0] - personPos[0], werewolfPos[1]-personPos[1]);
		
		
	}
	
	public void footStepDirection(int[] personPos,int[] werewolfPos) {
		
		//System.out.println("player position:" + personPos[0] + " " + personPos[0]);
		//System.out.println("wolf position:" + werewolfPos[0] + " " + werewolfPos[1]);
		
		
		int[] vector = {0,0};
		vector[0] = werewolfPos[0] - personPos[0];
		vector[1] = werewolfPos[1] - personPos[1];
		
		//System.out.println("relation vector:" + vector[0] + " " + vector[1]);
		
		if (Math.abs( vector[0])>=Math.abs( vector[1])) {
			//either north or south
			if (vector[0]>0) {
				this.wolfDirection="North";
			} else {
				this.wolfDirection="South";
			}
		} else if (Math.abs( vector[0])<Math.abs( vector[1])) {
			//either East or West
			if (vector[1]>0) {
				this.wolfDirection="East";
			} else {
				this.wolfDirection="West";
			}
		}
	}
	
	
	
	

	public String getWolfDirection() {
		return wolfDirection;
	}

	public void setWolfDirection(String wolfDirection) {
		this.wolfDirection = wolfDirection;
	}

	public double getTreasureDistance() {
		return treasureDistance;
	}

	public void setTreasureDistance(double distance) {
		this.treasureDistance = distance;
	}

	public double getWerewolfDistance() {
		return werewolfDistance;
	}

	public void setWerewolfDistance(double werewolfDistance) {
		this.werewolfDistance = werewolfDistance;
	}
	
	

}
