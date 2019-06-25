package guru.springframework.sfgpetclinic.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Ya que esta clase no se usara como tal como una entidad en nuetro proyecto,
 * sino que sólo será heredada por otras entidades se mapea con esta anotación
 * 
 * @MappedSuperclass esto le indica a hibernate que no debe crear la tabla
 *                   Person y que será heredada por una clase en la cual sí
 *                   deberá crear la tabla con los atributos aqui definidos y en
 *                   la clase hijo también
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

	private static final long serialVersionUID = 1L;

	public Person(Long id, String firstName, String lastName) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

}
