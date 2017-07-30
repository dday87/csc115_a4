package jsjf;



public class Driver {

	public static void main(String[] args) {
	    /*
		 * Assignment 4 - Question 2
		 */
		
		DropoutStack<Object> myDropoutStack = new DropoutStack<Object>();
		
		System.out.println(myDropoutStack.isEmpty());						// Returns a boolean that tells us if the stack is empty
		myDropoutStack.push("Element 1");												// Pushes elements onto the stack
		myDropoutStack.push("Element 2");
		System.out.println(myDropoutStack.size());
		myDropoutStack.push("Element 3");
		System.out.println(myDropoutStack.size());
		myDropoutStack.push("Element 4");
		myDropoutStack.push("Element 5");
		System.out.println(myDropoutStack.isEmpty());
		System.out.println(myDropoutStack.size());
		
	    myDropoutStack.pop();
	 	myDropoutStack.peek();
	 	myDropoutStack.push("Element 6");	
	 	myDropoutStack.push("Element 7");	
	 	myDropoutStack.removeEnd();
	 	System.out.println(myDropoutStack.toString());						// Prints the stack to the console showing that the bottom element is gone
		myDropoutStack.push("Element 8");	
	 	myDropoutStack.push("Element 9");
	 	myDropoutStack.push("Element 10");
	 	myDropoutStack.removeEnd();
	 	System.out.println(myDropoutStack.toString());
	 	
		
	}
		
		

		


}
