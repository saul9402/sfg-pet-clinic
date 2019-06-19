package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Ya que esta clase no se usara como tal como una entidad en nuetro proyecto,
 * sino que sólo será heredada por otras entidades se mapea con esta anotación
 * 
 * @MappedSuperclass esto le indica a hibernate que no debe crear la tabla
 *                   Person y que será heredada por una clase en la cual sí
 *                   deberá crear la tabla con los atributos aqui definidos y en
 *                   la clase hijo también
 */
@MappedSuperclass
public class Person extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	public Person() {
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
	}
}
