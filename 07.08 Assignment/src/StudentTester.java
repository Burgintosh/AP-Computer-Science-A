import java.util.ArrayList;
import java.util.List;

public class StudentTester {

	public static void main(String[] args) {
		List<Student> studentObjects = new ArrayList<Student>();
		
		
        // create Candidates
		studentObjects.add( new Student("Barry Allen", 91, 98, 75, 89, 80));
		studentObjects.add( new Student("Billy Bob", 20, 5, 16, 12, 33));        
		studentObjects.add( new Student("Johnny Appleseed", 62, 54, 76, 89, 4));
		studentObjects.add( new Student("Tim Apple", 90, 91, 92, 93, 94));
		studentObjects.add( new Student("Gaben Newell", 80, 78, 100, 98, 88));
		
		
		printTable(studentObjects);
		
		changeStudent(studentObjects, "Barry Allen", "Mike Wazowski");
		printTable(studentObjects);
		
		changeQuiz(studentObjects, "Gaben Newell", 2, 100);
		printTable(studentObjects);
		
		changeObject(studentObjects, "Johnny Appleseed", "Burgess Doan", 100, 100, 100, 100, 100);
		printTable(studentObjects);
		
		insertStudent(studentObjects, "Billy Bob", "Hank Johnson", 105, 110, 115, 120, 125);
		printTable(studentObjects);
		
		deleteStudent(studentObjects, "Tim Apple");
		printTable(studentObjects);

	}
	
	public static void printTable(List<Student> itemList)
	{
		

		System.out.println("\n Student           Q1       Q2       Q3       Q4       Q5     ");
		System.out.println("___________________________________________________________");
		for(int i = 0; i < itemList.size(); i++)
		{
			
			System.out.printf("%-18s %-8d %-8d %-8d %-8d %-8d\n", itemList.get(i).getName(), itemList.get(i).getQuiz1(), itemList.get(i).getQuiz2(), itemList.get(i).getQuiz3(), itemList.get(i).getQuiz4(), itemList.get(i).getQuiz5());
		}
	}
	
	
	public static void changeStudent(List<Student> itemList, String findName, String replaceName)
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
	
	public static void changeQuiz(List<Student> itemList, String findName, int quizNumber, int replaceQuiz)
    {
		System.out.println("\n\n<<Changing " + findName + " quiz #" + quizNumber + " to " + replaceQuiz + ">>\n");
        for(int i = 0; i < itemList.size(); i++)
        {
           if(itemList.get(i).getName().equals(findName))
           {
        	   if(quizNumber == 1)
        		   itemList.get(i).setQuiz1(replaceQuiz);
        	   
        	   if(quizNumber == 2)
            	   itemList.get(i).setQuiz2(replaceQuiz);
        	   
        	   if(quizNumber == 3)
            	   itemList.get(i).setQuiz3(replaceQuiz);
        	   
        	   if(quizNumber == 4)
            	   itemList.get(i).setQuiz4(replaceQuiz);
        	   
        	   if(quizNumber == 5)
            	   itemList.get(i).setQuiz5(replaceQuiz);
           }
        }    
    }
	
	public static void changeObject(List<Student> itemList, String findName, String replaceName, int replaceQuiz1, int replaceQuiz2, int replaceQuiz3, int replaceQuiz4, int replaceQuiz5)
    {
		System.out.println("\n\n<<Changing " + findName + " to " + replaceName + " with quiz scores " + replaceQuiz1 + ", " + replaceQuiz2 + ", " + replaceQuiz3 + ", " + replaceQuiz4 + ", " + replaceQuiz2 + ">>\n");
        for(int i = 0; i < itemList.size(); i++)
        {
           if(itemList.get(i).getName().equals(findName))
           {
        	   itemList.get(i).setName(replaceName);
        	   itemList.get(i).setQuiz1(replaceQuiz1);
        	   itemList.get(i).setQuiz2(replaceQuiz2);
        	   itemList.get(i).setQuiz3(replaceQuiz3);
        	   itemList.get(i).setQuiz4(replaceQuiz4);
        	   itemList.get(i).setQuiz5(replaceQuiz5);
           }
        }
    }
	
	

    public static void insertStudent(List<Student> itemList, String findName, String addName, int addQuiz1, int addQuiz2, int addQuiz3, int addQuiz4, int addQuiz5)
    {
    	System.out.println("\n\n<<Add " + addName + " before " + findName + " with quiz scores " + addQuiz1 + ", " + addQuiz2 + ", " + addQuiz3 + ", " + addQuiz4 + ", " + addQuiz5 + ", " +  " votes>>\n");
        int location = 0;

        // find location of item you want to insert in front of
        for(int i = 0; i < itemList.size(); i++)
            if(itemList.get(i).getName().equals(findName))
                location = i;
        itemList.add(location, new Student(addName, addQuiz1, addQuiz2, addQuiz3, addQuiz4, addQuiz5));
    }
    
    public static void deleteStudent(List<Student> itemList, String findName)
    {
    	System.out.println("\n\n<<Remove " + findName + " from the list>>\n");
    	
    	int location = 0;
    	for(int i = 0; i < itemList.size(); i++)
            if(itemList.get(i).getName().equals(findName))
                location = i;
    	
    	itemList.remove(location);
        
    }
	
}
