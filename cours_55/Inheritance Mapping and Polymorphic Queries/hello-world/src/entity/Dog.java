
package entity;

import javax.persistence.Entity;

@Entity
public class Dog extends Animal {

	@Override
	public String makeNoise() {
		return "woof woof..";
	}

}










