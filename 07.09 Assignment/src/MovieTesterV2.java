
public class MovieTesterV2 {

	public static void main(String[] args) {
		Movie[] movies = new Movie[10];
		Movie[] sorted = new Movie[10];

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

        
        sorted = sortTitle(movies, 1);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by title in ascending order >>>>\n");
        printArr(sorted);
        
        
        sorted = sortTitle(movies, 2);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by title in descending order >>>>\n");
        printArr(sorted);
        
        
        sorted = sortYear(movies, 1);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by year in ascending order >>>>\n");
        printArr(sorted);
        
        
        sorted = sortYear(movies, 2);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by year in descending order >>>>\n");
        printArr(sorted);
        
        
        sorted = sortStudio(movies, 1);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by studio in ascending order >>>>\n");
        printArr(sorted);
        
        
        sorted = sortStudio(movies, 2);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by studio in descending order >>>>\n");
        printArr(sorted);
        
	}
	
	public static void printArr(Movie[] arr)
	{
		for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
	}
	
	public static Movie[] sortTitle(Movie[] source, int sortType)
    {
		Movie[] newArr = new Movie[10];
		
		
		if(sortType == 1) //Sort Ascending
		{	
			for(int i = 0; i < source.length; i++)
        	{
        		Movie next = source[i];
            	int insertIndex = 0;
            	int k = i;
            	while(k > 0 && insertIndex == 0)
            	{
                	if(next.getTitle().compareToIgnoreCase(newArr[k - 1].getTitle()) < 0)
                	{
                		insertIndex = k;
                	}
                	else
                	{
                		newArr[k] = newArr[k - 1];
                	}
                	k--;
            	}

            	newArr[insertIndex] = next;
        	}
    	}
        else if(sortType == 2) // Sort Descending
		{
			for(int i = 0; i < source.length; i++)
        	{
        		Movie next = source[i];
            	int insertIndex = 0;
            	int k = i;
            	while(k > 0 && insertIndex == 0)
            	{
                	if(next.getTitle().compareToIgnoreCase(newArr[k - 1].getTitle()) > 0)
                	{
                    	insertIndex = k;
                	}
                	else
                	{
                		newArr[k] = newArr[k - 1];
                	}
                	k--;
            	}

            	newArr[insertIndex] = next;
        	}
		}
		return newArr;
    }
	
	public static Movie[] sortYear(Movie[] source, int sortType)
    {
		Movie[] newArr = new Movie[10];
		
		
		if(sortType == 1) //Sort Ascending
		{	
			for(int i = 0; i < source.length; i++)
			{
				Movie next = source[i];
				int insertIndex = 0;
				int k = i;
				while(k > 0 && insertIndex == 0)
				{
					if(next.getYear() > newArr[k - 1].getYear())
					{
						insertIndex = k;
					}
					else
					{
						newArr[k] = newArr[k - 1];
					}
					k--;
				}

				newArr[insertIndex] = next;
			}
		}
		else if(sortType == 2) // Sort Descending
		{
			for(int i = 0; i < source.length; i++)
	        {
	        	Movie next = source[i];
	            int insertIndex = 0;
	            int k = i;
	            while(k > 0 && insertIndex == 0)
	            {
	                if(next.getYear() < newArr[k - 1].getYear())
	                {
	                    insertIndex = k;
	                }
	                else
	                {
	                	newArr[k] = newArr[k - 1];
	                }
	                k--;
	            }

	            newArr[insertIndex] = next;
	        }
		}
		return newArr;
    }
	
	public static Movie[] sortStudio(Movie[] source, int sortType)
    {
		Movie[] newArr = new Movie[10];
		
		
		if(sortType == 1) //Sort Ascending
		{
			for(int i = 0; i < source.length; i++)
			{
				Movie next = source[i];
				int insertIndex = 0;
				int k = i;
				while(k > 0 && insertIndex == 0)
				{
					if(next.getStudio().compareToIgnoreCase(newArr[k - 1].getStudio()) < 0)
					{
						insertIndex = k;
					}
					else
					{
						newArr[k] = newArr[k - 1];
					}
					k--;
				}

				newArr[insertIndex] = next;
			}
			
		}
		else if(sortType == 2) // Sort Descending
		{
			for(int i = 0; i < source.length; i++)
	        {
	        	Movie next = source[i];
	            int insertIndex = 0;
	            int k = i;
	            while(k > 0 && insertIndex == 0)
	            {
	                if(next.getStudio().compareToIgnoreCase(newArr[k - 1].getStudio()) > 0)
	                {
	                    insertIndex = k;
	                }
	                else
	                {
	                	newArr[k] = newArr[k - 1];
	                }
	                k--;
	            }

	            newArr[insertIndex] = next;
	        }
		}
		return newArr;
    }
}
