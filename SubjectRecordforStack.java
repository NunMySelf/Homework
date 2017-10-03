package stack.subjectrec.utcc;

public class SubjectRecordforStack 
{
	private String name ;
	private String codename ;
	private int unit ;
	private String grade ;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getCodename() 
	{
		return codename;
	}
	public void setCodename(String codename) 
	{
		this.codename = codename;
	}
	public int getUnit() 
	{
		return unit;
	}
	public void setUnit(int unit) 
	{
		this.unit = unit;
	}
	public String getGrade() 
	{
		return grade;
	}
	public void setGrade(String grade) 
	{
		this.grade = grade;
	}
	public String toString(){
		return codename+" "+name+" "+unit+" "+grade+" ";
	}
	
	
	
	public static void main(String [ ] args)
	{
		SubjectRecordforStack A = new SubjectRecordforStack ();
		A.setName("Data Structure");
		A.setCodename("NC252");
		A.setUnit(4);
		A.setGrade("A");
		
		if (A.getGrade().equals("a"))
		{
			System.out.println("i am lucky. i have got A");
			
		}
		else 
		{
			System.out.println("Oh , i am not that lucky.");
		}
	}
	

}
