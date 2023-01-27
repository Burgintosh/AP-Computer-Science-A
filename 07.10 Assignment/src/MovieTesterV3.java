
public class MovieTesterV3 {

	public static void main(String[] args) {
		Movie[] movies = new Movie[10];

		movies[0] = new Movie("Your Name", 2016, "CoMix Wave Films");
		movies[1] = new Movie("A Silent Voice",    2016, "Kyoto Animation");
		movies[2] = new Movie("Spirited Away",   2001, "Studio Ghibli");
		movies[3] = new Movie("Howl's Moving Castle",     2004, "Studio Ghibli");
		movies[4] = new Movie("Grave of the Fireflies", 1988,   "Studio Ghibli");
		movies[5] = new Movie("A Whisker Away", 2020,   "Studio Colorido");
		movies[6] = new Movie("The Dark Knight", 2008,   "Warner Bros. Pictures");
		movies[7] = new Movie("Sonic the Hedgehog 2", 2022,   "Paramount Pictures Studios");
		movies[8] = new Movie("5 Centimeters per Second", 2007,   "Media Factory");
		movies[9] = new Movie("Star Wars", 1977,   "Lucasfilm Ltd.");
        

        System.out.println("    <<<< Before Sorting >>>> \n");
        printArr(movies);

        
        sortTitle(movies, 1);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by title in ascending order >>>>\n");
        printArr(movies);
        
        
        sortTitle(movies, 2);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by title in descending order >>>>\n");
        printArr(movies);
        
        
        sortYear(movies, 1);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by year in ascending order >>>>\n");
        printArr(movies);
        
        
        sortYear(movies, 2);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by year in descending order >>>>\n");
        printArr(movies);
        
        
        sortStudio(movies, 1);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by studio in ascending order >>>>\n");
        printArr(movies);
        
        
        sortStudio(movies, 2);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by studio in descending order >>>>\n");
        printArr(movies);
        
	}
	
	public static void printArr(Movie[] arr)
	{
		for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
	}
	
	public static void sortTitle(Movie[] source, int sortType)
	{
        int i;
        int k;
        int posMax;
        Movie temp;
        
        
        if(sortType == 1) // Sort Ascending
        {
        	for(i = 0 ; i < source.length - 1; i++)
        	{
        		// find largest element in the i elements
        		posMax = source.length - 1;
            	for(k = source.length - 1; k >= i; k--)
            	{
                	if(source[k].getTitle().compareToIgnoreCase(source[posMax].getTitle()) > 0)
                    posMax = k;
            	}
            	// swap the item with the largest cost 
            	// with the element in position i
            	// now the item is in its proper location
            	temp = source[i];
            	source[i] = source[posMax];
            	source[posMax] = temp;
        	}
        }
        else if(sortType == 2) //Sort Descending
        {
        	for(i = source.length - 1; i >= 0; i--)
        	{
        		// find largest element in the i elements
        		posMax = 0;
            	for(k = 0; k <= i; k++)
            	{
                	if(source[k].getTitle().compareToIgnoreCase(source[posMax].getTitle()) > 0)
                    posMax = k;
            	}
            	
            	temp = source[i];
            	source[i] = source[posMax];
            	source[posMax] = temp;
        	}
        }
    }
	
	public static void sortYear(Movie[] source, int sortType)
	{
        int i;
        int k;
        int posMax;
        Movie temp;
        
        
        if(sortType == 1) //Sort Ascending
        {
        	for(i = source.length - 1; i >= 0; i--)
        	{
        		// find largest element in the i elements
        		posMax = 0;
            	for(k = 0; k <= i; k++)
            	{
                	if(source[k].getYear() > source[posMax].getYear())
                    posMax = k;
            	}
            	
            	temp = source[i];
            	source[i] = source[posMax];
            	source[posMax] = temp;
        	}
        }
        else if(sortType == 2) // Sort Descending
        {
        	for(i = 0; i < source.length - 1; i++)
        	{
        		// find largest element in the i elements
        		posMax = source.length - 1;
            	for(k = source.length - 1; k >= i; k--)
            	{
                	if(source[k].getYear() > source[posMax].getYear())
                    posMax = k;
            	}
            	
            	temp = source[i];
            	source[i] = source[posMax];
            	source[posMax] = temp;
        	}
        }
    }
	
	public static void sortStudio(Movie[] source, int sortType)
	{
        int i;
        int k;
        int posMax;
        Movie temp;
        
        
        if(sortType == 1) // Sort Ascending
        {
        	for(i = 0 ; i < source.length - 1; i++)
        	{
        		// find largest element in the i elements
        		posMax = source.length - 1;
            	for(k = source.length - 1; k >= i; k--)
            	{
                	if(source[k].getStudio().compareToIgnoreCase(source[posMax].getStudio()) > 0)
                    posMax = k;
            	}
            	
            	temp = source[i];
            	source[i] = source[posMax];
            	source[posMax] = temp;
        	}
        }
        else if(sortType == 2) //Sort Descending
        {
        	for(i = source.length - 1; i >= 0; i--)
        	{
        		// find largest element in the i elements
        		posMax = 0;
            	for(k = 0; k <= i; k++)
            	{
                	if(source[k].getStudio().compareToIgnoreCase(source[posMax].getStudio()) > 0)
                    posMax = k;
            	}
            	
            	temp = source[i];
            	source[i] = source[posMax];
            	source[posMax] = temp;
        	}
        }
    }
	
}
