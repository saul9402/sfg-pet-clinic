package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name ="name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "type_id")
    private PetType petType;
	
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
    
    @Column(name ="birth_date")
    private LocalDate birthDate;

    public Pet() {
    }

    public Pet(String name, PetType petType, Owner owner, LocalDate birthDate) {
        this.name = name;
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(petType, pet.petType) &&
                Objects.equals(owner, pet.owner) &&
                Objects.equals(birthDate, pet.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petType, owner, birthDate);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType=" + petType +
                ", owner=" + owner +
                ", birthDate=" + birthDate +
                '}';
    }
}
