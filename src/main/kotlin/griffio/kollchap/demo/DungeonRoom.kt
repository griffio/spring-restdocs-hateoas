package griffio.kollchap.demo

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.Column
import javax.persistence.Entity
import javax.validation.constraints.NotBlank

@Entity(name = "room")
class DungeonRoom(
    @get:NotBlank @Column(name = "map_key") val key: String,
    @get:NotBlank val name: String,
    @get:NotBlank val description: String,
) : MappedIdentity<String>() {
    @JsonIgnore
    override fun getId(): String? = super.getId()

    @JsonIgnore
    override fun isNew(): Boolean = null == id
}
