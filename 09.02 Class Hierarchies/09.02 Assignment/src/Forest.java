
public class Forest extends Terrain {

	int treeNum = 0;
	public Forest(int l, int w, int n) {
		super(l, w);
		treeNum = n;
	}

	public String getTreeNumber()
    {
		return treeNum + " trees";
    }

}
