
public class WindyDesert extends Desert{

	int windSpeed = 0;
	public WindyDesert(int l, int w, int s, int a) {
		super(l, w, s);
		windSpeed = a;
	}
	
	public String getWindSpeed()
    {
        return "wind speed " + windSpeed + " miles per hour";
    }

}
