package nl.paulwagener.zorgapp

import org.jetbrains.exposed.dao.EntityID
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.IntIdTable

object Locations : IntIdTable() {
    val name = varchar("name", 255)
    val idle_text = text("idle_text")

}

class Location(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Location>(Locations)

    var name by Locations.name
    var idle_text by Locations.idle_text
}
