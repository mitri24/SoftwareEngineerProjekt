/*
Verwaltet alle Level des Spiels.
levels ist eine Liste aller Level.
currentLevel zeigt an, in welchem Level sich der Spieler gerade befindet.
 */

case class Welt(
                    levels: String,
                    currentLevel: Int,
                    score: Int,
                     )