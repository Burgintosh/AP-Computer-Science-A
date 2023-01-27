import java.util.ArrayList;
import java.util.List;

public class ElectionTesterV8 {

	public static void main(String[] args) {
		List<Candidate> candidateObjects = new ArrayList<Candidate>();
		
		
        // create Candidates
		candidateObjects.add( new Candidate("Tony Stark", 3691));
		candidateObjects.add( new Candidate("Henry Pym", 2691));        
		candidateObjects.add( new Candidate("Barry B. Benson", 1962));
		candidateObjects.add( new Candidate("Sally Rodgers", 1491));
		candidateObjects.add( new Candidate("Candice Dowen", 1968));
		
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
		
		insertCandidate1(candidateObjects, 2, "Hank Johnson", 9999);
		voteSum = totalVotes(candidateObjects);
		printTable(candidateObjects, voteSum);
		
		insertCandidate2(candidateObjects, "Henry Pym", "Satoru Umezawa", 2500);
		voteSum = totalVotes(candidateObjects);
		printTable(candidateObjects, voteSum);
		
		deleteCandidate1(candidateObjects, 3);
		voteSum = totalVotes(candidateObjects);
		printTable(candidateObjects, voteSum);
		
		deleteCandidate2(candidateObjects, "Candice Dowen");
		voteSum = totalVotes(candidateObjects);
		printTable(candidateObjects, voteSum);

	}
	public static void printCandidate(List<Candidate> itemList)
	{
		for(Candidate item: itemList)
	           System.out.println(item);
	}
	
	public static int totalVotes(List<Candidate> itemList)
	{
		int voteSum = 0;
		
		for(int i = 0; i < itemList.size(); i++)
		{
			voteSum = voteSum + itemList.get(i).getVotes();
			
		}
		return voteSum;
	}
	
	public static void printTable(List<Candidate> itemList, int voteSum)
	{
		double votepercent = 5;
		

		System.out.println("\nCandidate      Votes Received       % of Total Votes    ");
		System.out.println("___________________________________________________________");
		for(int i = 0; i < itemList.size(); i++)
		{
			votepercent = ((double)itemList.get(i).getVotes() / (double)voteSum) * 100;
			
			System.out.printf("%-18s %-18d %8.2f\n", itemList.get(i).getName(), itemList.get(i).getVotes(), votepercent);
		}
		
		System.out.println("\nThe total number of votes is: " + voteSum);
	}
	
	
	public static void changeCandidate(List<Candidate> itemList, String findName, String replaceName)
    {
		System.out.println("\n\n<<Changing " + findName + " to " + replaceName + ">>\n");
        for(int i = 0; i < itemList.size(); i++)
        {
        	if(itemList.get(i).getName().equals(findName))
        	{
        		itemList.get(i).setName(replaceName);
        	}
        }
    }
	
	public static void changeVotes(List<Candidate> itemList, String findName, int replaceVotes)
    {
		System.out.println("\n\n<<Changing " + findName + " votes to " + replaceVotes + ">>\n");
        for(int i = 0; i < itemList.size(); i++)
        {
           if(itemList.get(i).getName().equals(findName))
           {
        	   itemList.get(i).setVotes(replaceVotes);
           }
        }    
    }
	
	public static void changeAll(List<Candidate> itemList, String findName, String replaceName, int replaceVotes)
    {
		System.out.println("\n\n<<Changing " + findName + " to " + replaceName + " and votes to " + replaceVotes + ">>\n");
        for(int i = 0; i < itemList.size(); i++)
        {
           if(itemList.get(i).getName().equals(findName))
           {
        	   itemList.get(i).setName(replaceName);
        	   itemList.get(i).setVotes(replaceVotes);
           }
        }
    }
	
	
	public static void insertCandidate1(List<Candidate> itemList, int location, String addName, int addVotes)
    {
		System.out.println("\n\n<<In position " + location + ", add " + addName + ", " + addVotes + " votes>>\n");
		
		
		
			itemList.add(location, new Candidate(addName, addVotes));
		
    }
	
	

    public static void insertCandidate2(List<Candidate> itemList, String findName, String addName, int addVotes)
    {
    	System.out.println("\n\n<<Add " + addName + " before " + findName + " with " + addVotes + " votes>>\n");
        int location = 0;

        // find location of item you want to insert before
        for(int i = 0; i < itemList.size(); i++)
            if(itemList.get(i).getName().equals(findName))
                location = i;
        itemList.add(location, new Candidate(addName, addVotes));
    }
    
    
    public static void deleteCandidate1(List<Candidate> itemList, int location)
    {
    	System.out.println("\n\n<<Remove the candidate in position " + location + ">>\n");
		
		
    	itemList.remove(location);
    }
    
    
    
    public static void deleteCandidate2(List<Candidate> itemList, String findName)
    {
    	System.out.println("\n\n<<Remove " + findName + " from the list>>\n");
    	
    	int location = 0;
    	for(int i = 0; i < itemList.size(); i++)
            if(itemList.get(i).getName().equals(findName))
                location = i;
    	
    	itemList.remove(location);
        
    }
	
}
