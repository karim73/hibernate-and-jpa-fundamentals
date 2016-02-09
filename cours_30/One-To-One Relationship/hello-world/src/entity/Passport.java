
package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="passport_number")
	private String passportNumber;
	
	@OneToOne(mappedBy="passport")
	private Customer customer;

	public Passport() {}
	public Passport(String passportNumber) {
		this.passportNumber = passportNumber;
	}	
	
	public Customer getCustomer() {
		return customer;
	}
	
}













