package griffio.kollchap.demo

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.Entity
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

import org.hibernate.validator.constraints.Range
import jakarta.persistence.Embeddable
import jakarta.persistence.Embedded

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
    @get:NotNull val alignment: GameCharacterAlignment,
    @get:Range(min = 1, max = 20) val level: Int,
    @get:Range(min = 0, max = 9) val armourClass: Int,
    @get:Min(0) val hitPoints: Int,
    @Embedded @get:NotNull val characteristics: GameCharacterStats
) : MappedIdentity<String>() {
    @JsonIgnore
    override fun getId(): String? = super.getId()

    @JsonIgnore
    override fun isNew(): Boolean = null == id
}

@Embeddable
class GameCharacterStats(
    @get:Range(min = 3, max = 18) val str: Int,
    @get:Range(min = 3, max = 18) val int: Int,
    @get:Range(min = 3, max = 18) val wis: Int,
    @get:Range(min = 3, max = 18) val dex: Int,
    @get:Range(min = 3, max = 18) val con: Int,
    @get:Range(min = 3, max = 18)val chr: Int
)

val threeDSix = 3..18

fun rollCharacteristics(): GameCharacterStats {
    return GameCharacterStats(
        str = threeDSix.random(),
        int = threeDSix.random(),
        wis = threeDSix.random(),
        dex = threeDSix.random(),
        con = threeDSix.random(),
        chr = threeDSix.random()
    )
}
