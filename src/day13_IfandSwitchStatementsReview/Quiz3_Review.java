package day13_IfandSwitchStatementsReview;

public class Quiz3_Review {
	
	public static void main(String[] args) {
		
	// Question 1:
		
		int num = 9;
		if(num++ == 10) {  // line 1    num=10
	     //  9  == 10 => false
			System.out.println("Hello World "+num);    // line 2

			}
			else {
			System.out.println("Hello Universe "+num);  // line 3

			}
		
		
	// Question 2:
		
		int score=0;

		if(score == 0) {
       //   0 == 0 => True
		score += 50;   // score = 50

		}

		if(score !=0 ) {
    //      50 != 0  => true
		score +=50;   // 50 += 50 ==> 100

		}
		System.out.println(score);
		
		
	// Question 3:
		
		char grade ='A';

		boolean Passed = grade == 'A' || grade =='B';
		          //         True     ||     False    ==> True

		boolean Passed2 =grade == 'C' || grade =='D';
                  //          False   ||    False   ==> False
		 

		if( Passed || Passed2) {
		//   True  ||   False  ==> True
		System.out.println("You've passed the exam");  // this one will get executed

		}
		else {
		System.out.println("You failed");
		}

		
    // Question 4:
		
		boolean A = true, B =  !false;

		if(B) {

		System.out.println("B");   // it will print B, because it is true.

		}

		else if(A) {

		System.out.println("A");

		}

		else {

		System.out.println("C");

		}
		
		
	// Question 5:
		
		
		boolean result = true;

		if(result) {

		System.out.println("it's true");

		}

		else {

		System.out.println("it's false");

		}

	//	else if(result) {    // gives compile error, because "else if" statement was separated from if block by the "else" block.

	//	System.out.println("None of the above");
		
		
	//  Question 6 is true.
		
    
	// Question 7 is False.
		
	
	// Question 8 :
		
		
		boolean A1 = true, B1 = !A;

		if(A1) {
     //   true
			if(B1) {
			// False
			System.out.println("Monday");
			}
			else {
			System.out.println("Tuesday");  // this statement will get executed
			}
		}
		else {
			if(A1) {
			System.out.println("Thursday");
			}
			else {
			System.out.println("Friday");
	
			}

		}
		
		
	// Question 9:
		
		
		int number =10;

		if(--number > 10) {
        //      9   > 10   ==> False
		System.out.println("Hello Cybertek "+number);

		}else if(number ==9) {
           //      True
		System.out.println("Hello World "+number);    // this block gets executed

		}

		
		// Question 10 :
		
		
		boolean X = true;

		boolean Y = !X==false;  // Y = True
        //         false  == false    ==> true
		boolean Z = Y;  // Z = true

		if( X ) {
		System.out.println("Hello Everyone");
		} 
		if( Y ) {
		System.out.println("Today is great day");
		} 
		if( Z ) {
		System.out.println("We have picnic on Saturday");
		}
		// all of the if statements above get executed.
		
		
		
	// nested if : we use it when there is precondition. Or if a condition can be evaluated to multiple scenarios.
		
		
		/*
		 vote age:
		    age >= 18  ==> eligible to vote
		    age>= 70  ==> can vote three times
		    70 > age >= 50 ==> can vote twice
		    50> age >= 80  ==> can vote one time
		 */
		
		int age = 45;
		
	if (age>= 0 && age <= 150) {
		if (age>18) {
			if (age >= 70) {
				System.out.println("can vote three times");
			}
			else if (age >=50) {
				System.out.println("can vote two times");
			}
			else {
			System.out.println("can vote one time");
				}
			}
		else {
			System.out.println("not eligible to vote");
		}
	}
	else {
		System.out.println("invalid entry");
	}
			

	}

}
