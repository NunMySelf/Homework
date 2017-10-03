
/**
*@auther Sakdinan 5907101013
*/
package stack.subjectrec.utcc;
public class StackSub 
{
	private int maxSize ;
	private SubjectRecordforStack [] StackSub ;
	private int top ;
	


	   public StackSub(int maxSize)   
	   
	      {
	      this.maxSize = maxSize;             
	      this.StackSub = new SubjectRecordforStack[this.maxSize];
	      this.top = -1; 
	      }
	
	   public void push(SubjectRecordforStack SubjectRecord) 
	      {
		   StackSub[++top] = SubjectRecord;     
	      }

	   public SubjectRecordforStack pop()         
	      {
	      return StackSub[top--];  
	      }
	
	   
	
	   public boolean isEmpty()   
	      {
	      return (top == -1);
	      }
	
	   public boolean isFull()     
	      {
	      return (top == maxSize-1);
	      }

	   public static void main(String [ ] args){
			SubjectRecordforStack A = new SubjectRecordforStack();
			A.setName("Data Structure1");
			A.setCodename("NC252");
			A.setUnit(4);
			A.setGrade("A");
			
			SubjectRecordforStack B = new SubjectRecordforStack();
			B.setName("Data Structure2");
			B.setCodename("NC253");
			B.setUnit(4);
			B.setGrade("A");
			
			SubjectRecordforStack C = new SubjectRecordforStack();
			C.setName("Data Structure3");
			C.setCodename("NC254");
			C.setUnit(4);
			C.setGrade("A");
			
			StackSub stack =  new StackSub(10);
			stack.push(A);
			stack.push(B);
			stack.push(C);
			
			
			SubjectRecordforStack D = stack.pop();
			System.out.println(D);
			SubjectRecordforStack E = stack.pop();
			System.out.println(E);
			SubjectRecordforStack F = stack.pop();
			System.out.println(F);
			
			
			
			
		}
	
}
