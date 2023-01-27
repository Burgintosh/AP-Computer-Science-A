
public class ElectionTesterV7 {

	public static void main(String[] args) {
		Candidate[ ] candidateObjects = new Candidate[5];
		candidateObjects[0] = new Candidate("Tony Stark", 3691);
		candidateObjects[1] = new Candidate("Henry Pym", 2691);
		candidateObjects[2] = new Candidate("Barry B. Benson", 1962);
		candidateObjects[3] = new Candidate("Sally Rodgers", 1491);
		candidateObjects[4] = new Candidate("Candice Dowen", 1968);
		
		Candidate[ ] candidateObjectsNew = new Candidate[6];
		Candidate[ ] candidateObjectsNew2 = new Candidate[7];
		
		System.out.println("Raw Election Data:\n" );
		printCandidate(candidateObjects);
		int voteSum = totalVotes(candidateObjects);
		printTable(candidateObjects, voteSum);
		
		changeCandidate(candidateObjects, "Tony Stark", "Mike Wazowski");
		printTable(candidateObjects, voteSum);
		
		changeVotes(candidateObjects, "Barry B. Benson", 5);
		voteSum = totalVotes(candidateObjects);
		printTable(candidateObjects, voteSum);
		
		changeAll(candidateObjects, "Sally Rodgers", "Burgess Doan", 5231);
		voteSum = totalVotes(candidateObjects);
		printTable(candidateObjects, voteSum);
		
		candidateObjectsNew = insertCandidate1(candidateObjects, 2, "Hank Johnson", 9999);
		voteSum = totalVotes(candidateObjectsNew);
		printTable(candidateObjectsNew, voteSum);
		
		candidateObjectsNew2 = insertCandidate2(candidateObjectsNew, "Henry Pym", "Satoru Umezawa", 2500);
		voteSum = totalVotes(candidateObjectsNew2);
		printTable(candidateObjectsNew2, voteSum);
		
		candidateObjectsNew = deleteCandidate1(candidateObjectsNew2, 2);
		voteSum = totalVotes(candidateObjectsNew);
		printTable(candidateObjectsNew, voteSum);
		
		candidateObjects = deleteCandidate2(candidateObjectsNew, "Candice Dowen");
		voteSum = totalVotes(candidateObjects);
		printTable(candidateObjects, voteSum);

	}
	
	public static void printCandidate(Candidate[] itemList)
	{
		for(int i = 0; i < itemList.length; i++)
		{
			System.out.println(itemList[i]);
		}
	}
	
	public static int totalVotes(Candidate[] itemList)
	{
		int voteSum = 0;
		for(int i = 0; i < itemList.length; i++)
		{
			voteSum = voteSum + itemList[i].getVotes();
			
		}
		return voteSum;
	}
	
	public static void printTable(Candidate[] itemList, int voteSum)
	{
		double votepercent = 0.0;
		

		System.out.println("\nCandidate      Votes Received       % of Total Votes    ");
		System.out.println("___________________________________________________________");
		for(int i = 0; i < itemList.length; i++)
		{
			System.out.println("Got here + " + i);
			votepercent = ((double)itemList[i].getVotes() / (double)voteSum) * 100;
			
			System.out.printf("%-18s %-18d %8.2f\n", itemList[i].getName(), itemList[i].getVotes(), votepercent);
		}
		
		System.out.println("\nThe total number of votes is: " + voteSum);
	}
	
	public static void changeCandidate(Candidate[] itemList, String findName, String replaceName)
    {
		System.out.println("\n\n<<Changing " + findName + " to " + replaceName + ">>\n");
        for(int i = 0; i < itemList.length; i++)
        {
        	if(itemList[i].getName().equals(findName))
        	{
        		itemList[i].setName(replaceName);
        	}
        }
    }
	
	public static void changeVotes(Candidate[] itemList, String findName, int replaceVotes)
    {
		System.out.println("\n\n<<Changing " + findName + " votes to " + replaceVotes + ">>\n");
        for(int i = 0; i < itemList.length; i++)
        {
           if(itemList[i].getName().equals(findName))
           {
        	   itemList[i].setVotes(replaceVotes);
           }
        }    
    }
	
	public static void changeAll(Candidate[] itemList, String findName, String replaceName, int replaceVotes)
    {
		System.out.println("\n\n<<Changing " + findName + " to " + replaceName + " and votes to " + replaceVotes + ">>\n");
        for(int i = 0; i < itemList.length; i++)
        {
           if(itemList[i].getName().equals(findName))
           {
        	   itemList[i].setName(replaceName);
        	   itemList[i].setVotes(replaceVotes);
           }
        }
    }
	
	
	
	public static Candidate[] insertCandidate1(Candidate[] itemList, int location, String addName, int addVotes)
    {
		System.out.println("\n\n<<In position " + location + ", add " + addName + ", " + addVotes + " votes>>\n");
		Candidate[ ] newArr = new Candidate[itemList.length + 1];
		
		
		//Places elements into the new array until it gets to the added object's location
		for(int i = 0; i < location; i++)
			newArr[i] = itemList[i];
		
		newArr[location] = new Candidate(addName, addVotes);
		
		if(location + 1 < newArr.length)
			for(int i = location + 1; i < newArr.length; i++)
				newArr[i] = itemList[i - 1];
		return newArr;
    }
	
	

    public static Candidate[] insertCandidate2(Candidate[] itemList, String findName, String addName, int addVotes)
    {
    	System.out.println("\n\n<<Add " + addName + " before " + findName + " with " + addVotes + " votes>>\n");
        int location = 0;
        Candidate[ ] newArr = new Candidate[itemList.length + 1];

        // find location of item you want to insert before
        for(int i = 0; i < itemList.length - 1; i++)
            if(itemList[i].getName().equals(findName))
                location = i;

        
      //Places elements into the new array until it gets to the added object's location
      	for(int i = 0; i < location; i++)
      		newArr[i] = itemList[i];
      		
      	newArr[location] = new Candidate(addName, addVotes);
      	
      	if(location + 1 < newArr.length - 1)
      		for(int i = location; i < newArr.length - 1; i++)
      			newArr[i + 1] = itemList[i];
      	return newArr;
    }
    
    
    public static Candidate[] deleteCandidate1(Candidate[] itemList, int location)
    {
    	System.out.println("\n\n<<Remove the candidate in position " + location + ">>\n");
		Candidate[ ] newArr = new Candidate[itemList.length - 1];
		
		
		//Places elements into the new array until it gets to the removed object's location
		for(int i = 0; i < location; i++)
			newArr[i] = itemList[i];
		
		
		if(location < newArr.length)
			for(int i = location; i < newArr.length; i++)
				newArr[i] = itemList[i + 1];
		return newArr;
    }
    
    
    
    public static Candidate[] deleteCandidate2(Candidate[] itemList, String findName)
    {
    	System.out.println("\n\n<<Remove " + findName + " from the list>>\n");
        int location = 0;
        Candidate[ ] newArr = new Candidate[itemList.length - 1];

        // find location of item you want to insert before
        for(int i = 0; i < itemList.length; i++)
            if(itemList[i].getName().equals(findName))
                location = i;

        
      //Places elements into the new array until it gets to the removed object's location
      	for(int i = 0; i < location; i++)
      		newArr[i] = itemList[i];
      		
      	
      	//if(location < newArr.length)
      		for(int i = location; i < newArr.length; i++)
      			newArr[i] = itemList[i + 1];
      	return newArr;
    }
    
    
}
