import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		
		return students [];
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		for(int i=0;i<students.length;i++)
		{
			this.students[i].setId(students[i].getId());
			this.students[i].setFullName(students[i].getFullName());
			this.students[i].setBirthDate(students[i].getBirthDate());
			this.students[i].setAvgMark(students[i].getAvgMark());
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		this.students[index]=student[index];
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		LinkedList<Student> ll=new LinkedList<Student>(students.length);
		for(int i=0;i<students.length;i++)
		{
			ll.add(students[i]);
		}
		ll.addFirst(student);
		students=ll.toArray(new Student[ll.size()]);
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		LinkedList<Student> ll=new LinkedList<Student>(students.length);
		for(int i=0;i<students.length;i++)
		{
			ll.add(students[i]);
		}
		ll.addLast(student);
		students=ll.toArray(new Student[ll.size()]);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		LinkedList<Student> ll=new LinkedList<Student>(students.length);
		for(int i=0;i<students.length;i++)
		{
			ll.add(students[i]);
		}
		ll.add(student);
		students=ll.toArray(new Student[ll.size()]);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		LinkedList<Student> ll=new LinkedList<Student>(students.length);
		for(int i=0;i<students.length;i++)
		{
			ll.add(students[i]);
		}
		ll.remove(students[index]);
		students=ll.toArray(new Student[ll.size()]);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		LinkedList<Student> ll=new LinkedList<Student>(students.length);
		for(int i=0;i<students.length;i++)
		{
			if((students[i].getId()==student.getId())&&(students[i].getFullName()==student.getFullName())&&(student[i].getBirthDate()==student.setBirthDate())&&(student[i].getAvgMark==student.getAvgMark()))
			{
				continue;
			}
				ll.add(students[i]);
		}
		students=ll.toArray(new Student[ll.size()]);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		LinkedList<Student> ll=new LinkedList<Student>(students.length);
		for(int i=0;i<students.length;i++)
		{
			if(i==index)
			{
				continue;
			}
				ll.add(students[i]);
		}
		 students=ll.toArray(new Student[ll.size()]);
	}

	@Override
	public void removeFromElement(Student student) throws IllegalArgumentException {
		// Add your implementation here
		int flag=0;
		if(student==NULL)
		{
			throw new IllegalArgumentException;
		}
		for(int i=0;i<students.length;i++)
		{
			if(flag==1)
			{
				ll.remove(students[i]);
				continue;
			}
			if((students[i].getId()==student.getId())&&(students[i].getFullName()==student.getFullName())&&(student[i].getBirthDate()==student.setBirthDate())&&(student[i].getAvgMark==student.getAvgMark()))
			{
				flag=1;
			}
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		
		if(student==NULL)
		{
			throw new IllegalArgumentException;
		}
		for(int i=0;i<=index;i++)
		{
				ll.remove(students[i]);
		}	
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student==NULL)
		{
			throw new IllegalArgumentException;
		}
		 for(int i=0;i<=index;i++)
		{
			if((students[i].getId()==student.getId())&&(students[i].getFullName()==student.getFullName())&&(student[i].getBirthDate()==student.setBirthDate())&&(student[i].getAvgMark==student.getAvgMark()))
			{
				break;
			}
				ll.remove(students[i]);
		}	
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>();
		
		if(date==NULL)
		{
			throw new IllegalArugumentException;
		}
		for(int i=0;i<students.length;i++)
		{
			if((students[i].getBirthDate()).equals(date))
			{
				al.add(students[i]);
			}
		}
		Student[] s=ll.toArray(new Student[ll.size()]);
		return [] s;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>();
				for(int i=0;i<students.length;i++)
		{
			if((students[i].getBirthDate()).equals(date))
			{
				al.add(students[i]);
			}
		}
		Student[] s=ll.toArray(new Student[ll.size()]);
		return [] s;
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		Student s=NULL;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getAvgMark()>max)
			{
				max=students[i].getAvgMark();
				s=student[i];
			}
		}
		return s;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		for(int i=0;i<students.length;i++)
		{
			if((students[i].getId()==student.getId())&&(students[i].getFullName()==student.getFullName())&&(student[i].getBirthDate()==student.setBirthDate())&&(student[i].getAvgMark==student.getAvgMark()))
			{
				if(i+1>=students.length||students[i+1]==NULL)
				{
					throw new IllegalArgumentException;
					
				}
				return students[i+1];
			}
		}
	
	}
}
