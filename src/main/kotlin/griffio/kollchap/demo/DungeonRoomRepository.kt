package griffio.kollchap.demo

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.stereotype.Component

@Component // annotation enables Intellij to detect bean
@RepositoryRestResource(collectionResourceRel = "rooms", path = "rooms")
interface DungeonRoomRepository : CrudRepository<DungeonRoom, Long>
