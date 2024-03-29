package griffio.kollchap.demo

val rooms = mapOf(
    "1" to ("Orc Guardroom" to "In this room are two sets of bunk beds...In the centre is a large battered table..."),
    "2" to ("Rubbish Dump" to "This room is used by the inhabitants...It is filled with broken furniture, bones..."),
    "3" to ("Floorless Room" to "This room was once the entrance to the main part of the shrine..."),
    "4" to ("Corridor Trap" to "The Slime is clinging to the west wall and will...fall on a party member..."),
    "5" to ("Storeroom" to "This room was once a storeroom for the temple...some moldy food remains..."),
    "6" to ("Healing Pool" to "This pool is circular with a radius of about three feet...and has a greenish tint..."),
    "7" to ("Coffin Storeroom" to "This room is bare except for fifteen plain wooden coffins...stacked in threes..."),
    "8" to ("Odric's Bedroom" to "This room has a sumptuously furnished bed with silk sheets..."),
    "9" to ("The Office" to "This room serves as Odric's office...On the table is a mass of papers..."),
    "9a" to ("Collapsed Room" to "The Rockmen are rummaging around in this room..."),
    "10" to ("UnderPriests' Room" to "This room is used by the three Clerics as a base..."),
    "11" to ("Room of Absolution" to "This room is almost wholly bare except for six large urns..."),
    "12" to ("Great Sacrifice Chamber" to "This room is vast...There is a pole in the centre..."),
    "13" to ("The Cells" to "There are three cells...The cells are all locked..."),
    "14" to ("Treasure Chamber" to "The door to this room is locked..."),
    "15" to ("Changing Room" to "This room is used by Odric for changing into his sacrifice robes..."),
    "16" to ("Old Waiting Room" to "This room was once a waiting room for the oracle..."),
    "17" to ("Oracle Room" to "This room used to be an oracle room...There is a statue of a seven-foot-high human..."),
    "18" to ("Pit Trap" to "At this point the floor is covering a pit...The pit used to be a tunnel..."),
    "19" to ("Goblins' Room" to "This room is very stark, with only straw for bedding, on the floor..."),
    "20" to ("Cave" to "This room is a cave littered with rocks and boulders...the atmosphere is humid..."),
    "21" to ("Statue Room" to "In the centre of the room is a statue of a man with his hands held out..."),
    "22" to ("Meditation Room" to "This room was originally a meditation room...the walls are ornately decorated..."),
    "23" to ("Flooded Storeroom" to "The stairs leading down are wet and so anyone going down them...")
)
// mapping of room to possible points of egress
val egress = mapOf(
    "1"  to arrayOf("2", "4", "5", "6"),
    "2"  to arrayOf("1", "4", "5", "6"),
    "3"  to arrayOf("4", "16", "17", "18"),
    "4"  to arrayOf("1", "2", "3", "5", "6"),
    "5"  to arrayOf("1", "2", "3", "5", "6"),
    "6"  to arrayOf("1", "2", "4", "5", "7", "8"),
    "7"  to arrayOf("6", "8"),
    "8"  to arrayOf("6", "7", "10", "12"),
    "9"  to arrayOf("6", "7", "9a", "10", "12"),
    "9a" to arrayOf("9"),
    "10" to arrayOf("8", "9", "11", "12"),
    "11" to arrayOf("10", "12", "21", "22", "23"),
    "12" to arrayOf("8", "9", "10", "11", "13", "15", "21", "22", "23"),
    "13" to arrayOf("12"),
    "14" to arrayOf("8", "15"),
    "15" to arrayOf("10", "12", "21", "22", "23"),
    "16" to arrayOf("3", "17", "18", "19", "21"),
    "17" to arrayOf("3", "16", "18", "19", "20", "21"),
    "18" to arrayOf("3", "16", "17", "19", "20", "21"),
    "19" to arrayOf("3", "16", "17", "18", "20", "21"),
    "20" to arrayOf("3", "16", "17", "18", "21"),
    "21" to arrayOf("3", "11", "12", "16", "17", "18", "19", "22", "23"),
    "22" to arrayOf("11", "12", "21", "23"),
    "23" to arrayOf("11", "12", "16", "21", "22", "23")
)
