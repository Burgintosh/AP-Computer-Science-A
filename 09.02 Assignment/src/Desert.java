
public class Desert extends Terrain {

	int sandGrains = 0;
	public Desert(int l, int w, int s) {
		super(l, w);
		sandGrains = s;
	}
	
	public String getGrainNumber()
    {
		return sandGrains + " grains of sand";
    }

}
