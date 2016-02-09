
package entity;

import javax.persistence.Entity;

@Entity
public class Cat extends Animal {
	
	@Override
	public String makeNoise() {
		return "meow meow..";
	}
	
}




