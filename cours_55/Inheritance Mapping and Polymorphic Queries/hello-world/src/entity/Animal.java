
package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) 
//@Inheritance(strategy=InheritanceType.JOINED) // to be used when you want to test JOINED strategy for inheritance mapping
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) // to be used when you want to test TABLE_PER_CLASS (Table per concrete class) strategy for inheritance mapping
public abstract class Animal {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@GeneratedValue(strategy=GenerationType.TABLE) // to be used when using TABLE_PER_CLASS strategy
	private Long id;
	
	//@Column(nullable=false) // cannot be used when using SINGLE_TABLE strategy
	private String name;	
	
	public void setName(String name) { 	
                   	this.name = name; 
	}
	
	public abstract String makeNoise();
	
	public String toString() {
		return name + " making " + makeNoise() + " noises";
	}	

}
