/*
Repräsentiert den Spieler, der durch das Spiel navigiert.
Der name dient zur Identifizierung.
level zeigt an, wie weit der Spieler im Spiel fortgeschritten ist.
score zählt die Punkte, die der Spieler durch das Lösen von Aufgaben sammelt.
inventory speichert alle Gegenstände, die der Spieler gesammelt hat.
knowledge ist ein Maß dafür, wie gut der Spieler die Scala-Konzepte verstanden hat.
 */

// Definition der Spielerklasse
case class Spieler(
                    name: String,               // Name des Spielers
                    level: Int,                 // Aktuelles Level des Spielers
                    score: Int,                 // Gesamtpunktzahl
                    inventory: List[String],    // Sammlung von Gegenständen
                    knowledge: Double           // Fortschrittsbalken für Scala-Wissen (zwischen 0.0 und 1.0)
                  )


//zu implementierende methoden
//addItem: Fügt einen Gegenstand zum Inventar hinzu.
//removeItem: Entfernt einen Gegenstand aus dem Inventar.
//addScore: Erhöht die Punktzahl.
//levelUp: Erhöht das Level des Spielers.


