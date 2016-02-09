
package entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Actor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@ManyToMany(mappedBy="actors")
	private Set<Movie> movies = new HashSet<Movie>();
	
	public Actor() {}	
	public Actor(String name) {
		this.name = name;
	}

	public Set<Movie> getMovies() {
		return movies;
	}
}













