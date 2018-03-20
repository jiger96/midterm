package Exception;
import com.cisc181.core.Person;


public class PersonException extends Exception {
	private Person Person;

	
	public PersonException(Person person) {
		super();
		this.Person = person;
	}
	public Person getPerson() {
		return Person;
	}

	public void setPerson(Person person) {
		Person = person;
	}
	
}
