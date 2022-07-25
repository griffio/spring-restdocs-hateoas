package griffio.kollchap.demo

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.jpa.domain.AbstractPersistable
import javax.persistence.Entity
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

import org.hibernate.validator.constraints.Range

enum class GameCharacterAlignment {
    Chaotic,
    Lawful,
    Neutral
}
enum class GameCharacterRace {
    Dwarf,
    Elf,
    Halfling,
    Human
}
enum class GameCharacterClass {
    Cleric,
    Fighter,
    MagicUser,
    Thief
}

@Entity(name = "character")
class GameCharacter(
    @get:NotBlank val name: String,
    @get:NotBlank val background: String,
    @get:NotNull val race: GameCharacterRace,
    @get:NotNull val `class`: GameCharacterClass,
    @get:Range(min = 1, max = 20) val level: Int,
    @get:Range(min = 0, max = 9) val armourClass: Int,
    @get:Min(0) val hitPoints: Int,
    @get:NotNull val alignment: GameCharacterAlignment
) : AbstractPersistable<Long>() {
    @JsonIgnore
    override fun getId(): Long? = super.getId()

    @JsonIgnore
    override fun isNew(): Boolean = null == id
}
