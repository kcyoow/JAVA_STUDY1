package icehs.science.ch10;
import icehs.science.ch09.Teacher;
import icehs.science.ch09.Student;
import icehs.science.ch09.Person;
public class HumanPolyTest {

	public static void main(String[] args) {
		Person [] persons = {
				new Person(),
				new Student(),
				new Teacher()
		};
		persons[0].eat();
		persons[1].eat();
		persons[2].eat();
		
		System.out.println();
		
		((Student)(persons[1])).study();
		((Teacher)(persons[2])).teach();
		
		System.out.println();
		
		  for(int i = 0; i < persons.length ; i++) { 
			  if(persons[i] instanceof Student) {
				  ((Student)(persons[i])).study();
			  } else if (persons[i] instanceof Teacher) {
				  ((Teacher)(persons[i])).teach();
			  }
		  
		  }
		 
	}

}
