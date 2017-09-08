public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		StudentGroup s=new StudentGroup();
		student[] s1=s.getStudents();
		s.setStudents(s1);
		Student stu=s.getStudent(index);
		s.setStudent(student,index);
		s.add(student,index);
		s.addFirst(student);
		s.addLast(student);
		s.remove(index);
		s.remove(student);
		s.removeFromIndex(index);
		s.removeFromElement(student);
		s.removeToIndex(index);
		s.removeToElement(student);
		s.bubbleSort();
		s.getByBirthDate(date);
		s.getBetweenBirthDates( firstDate,lastDate);
		s.getNearBirthDate(date, days);
		s.getCurrentAgeByDate( indexOfStudent);
		s.getStudentsByAge(age);
		s.getStudentsWithMaxAvgMark();
		s.getNextStudent(student);
		
	
		
		
	}

}
