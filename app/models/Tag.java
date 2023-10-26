package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import play.db.jpa.Model;

@Entity
public class Tag extends Model {

	private String name;
	private String description;
	private List<User> users;

	public Tag(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	@ManyToMany(mappedBy = "tags")
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
