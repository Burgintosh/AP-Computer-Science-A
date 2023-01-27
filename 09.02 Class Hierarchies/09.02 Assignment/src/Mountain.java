
public class Mountain extends Terrain{

	int mountainNum = 0;
	public Mountain(int l, int w, int m) {
		super(l, w);
		mountainNum = m;
	}

	public String getMountainNumber()
    {
        return mountainNum + " mountains";
    }

}
