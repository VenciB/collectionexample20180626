package by.htp.collectionexample.entity;

public class User implements Comparable<User>{
	
	private int age;
	private String name;

	public User( ) {
		super();
	}
	
	public User(String name) {
		super();
		this.name = name;
	}
	
	public User(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public User(int age) {
		super();
		this.age = age;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}

	@Override
	public int compareTo(User user) {
//		User user = null;
//		if( getClass() == o.getClass() ) {
//			user = (User)o;
//		}
		int result = this.name.compareTo( user.name );
		
		if( result == 0 ) {
			return this.age - user.age;
		}
		return result;
	}
	
}