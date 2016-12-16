package collections.equality;

import java.util.HashSet;
import java.util.Set;

public class Name {

	private String firstName;

	private String lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Name))
			return false;
		Name n = (Name) obj;
		return n.firstName.equals(this.firstName)
				&& n.lastName.equals(this.lastName);
	}
	

	public static void main(String[] args) {
		Set<Name> s = new HashSet<Name>();
		s.add(new Name("Mickey", "Mouse"));
		System.out.println(s.contains(new Name("Mickey", "Mouse")));
	}
}
