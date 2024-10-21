/*
Definiert eine einzelne Spielstufe.
Der name gibt dem Level einen Namen.
difficulty bestimmt, wie schwierig das Level ist.
tasks enthält eine Liste aller Aufgaben, die der Spieler in diesem Level lösen muss.
rewards sind die Belohnungen, die der Spieler erhält, wenn er das Level erfolgreich abschließt.
 */

case class Level(
                    name: String,
                    difficulty: Int,
                    tasks: List[String],
                    rewards: List[String],

                  )