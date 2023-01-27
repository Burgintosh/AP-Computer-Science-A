
public class GameTerrainTester {

	public GameTerrainTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Mountain mountainRange = new Mountain (100, 200, 4); 
		System.out.println("Mountain " + mountainRange.getTerrainSize() + " and has " + mountainRange.getMountainNumber() + "\n");
		
		WinterMountain mountainWinter = new WinterMountain (200, 250, 9, 19.32); 
		System.out.println("Winter Mountain " + mountainWinter.getTerrainSize() + " and has " + mountainWinter.getMountainNumber() + " and " + mountainWinter.getTemp() + "\n");
		
		Forest forest = new Forest (1000, 500, 970); 
		System.out.println("Forest " + forest.getTerrainSize() + " and has " + forest.getTreeNumber() + "\n");
		
		Desert desert = new Desert (5000, 2000, 9700); 
		System.out.println("Desert " + desert.getTerrainSize() + " and has " + desert.getGrainNumber() + "\n");
		
		WindyDesert desertWind = new WindyDesert (800, 500, 3000, 50); 
		System.out.println("Windy Desert " + desertWind.getTerrainSize() + " and has " + desertWind.getGrainNumber() + " and a " +desertWind.getWindSpeed() + "\n");
	}

}
