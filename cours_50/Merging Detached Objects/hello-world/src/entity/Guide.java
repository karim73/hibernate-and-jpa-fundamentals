package entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Guide {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "staff_id", nullable = false)
	private String staffId;

	private String name;
	private Integer salary;

	@OneToMany(mappedBy = "guide")
	private Set<Student> students = new HashSet<Student>();

	public Guide() {	}
	public Guide(String staffId, String name, Integer salary) {
		this.staffId = staffId;
		this.name = name;
		this.salary = salary;
	}
	public void addStudent(Student student) {
		students.add(student);
		student.setGuide(this);
	}	
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Set<Student> getStudents() {
		return students;
	}

	public String toString() {
		return "Guide [id=" + id + ", staffId=" + staffId + ", name=" + name
				+ ", salary=" + salary + ", students=" + students + "]";
	}
	
}







