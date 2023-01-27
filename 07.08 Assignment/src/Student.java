/**
 *
 * 
 * 
 */

public class Student
{
    // instance variables
    private int quiz1;
    private int quiz2;
    private int quiz3;
    private int quiz4;
    private int quiz5;
    private String name;

    // Constructor for objects of class Candidate
    public Student(String name, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5)
    {
        // initialize instance variables
        this.name = name;
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.quiz3 = quiz3;
        this.quiz4 = quiz4;
        this.quiz5 = quiz5;
    }


    public int getQuiz1()
    {
        return quiz1;
    }

    public void setQuiz1(int n)
    {
        quiz1 = n;
    }
    
    public int getQuiz2()
    {
        return quiz2;
    }

    public void setQuiz2(int n)
    {
        quiz2 = n;
    }
    
    public int getQuiz3()
    {
        return quiz3;
    }

    public void setQuiz3(int n)
    {
        quiz3 = n;
    }
    
    public int getQuiz4()
    {
        return quiz4;
    }

    public void setQuiz4(int n)
    {
        quiz4 = n;
    }
    
    public int getQuiz5()
    {
        return quiz5;
    }

    public void setQuiz5(int n)
    {
        quiz5 = n;
    }

    public String getName()
    {
        return name;
    }
    
    public void setName(String n)
    {
        name = n;
    }
}
