
public class WinterMountain extends Mountain {

	double temp = 0;
	public WinterMountain(int l, int w, int m, double t) {
		super(l, w, m);
		temp = t;
	}

	public String getTemp()
    {
        return "temperature " + temp + " degrees";
    }

}
