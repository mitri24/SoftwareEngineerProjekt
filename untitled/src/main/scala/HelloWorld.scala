object HelloWorld {
  def main(args: Array[String]): Unit = { // hier werden argumente mitgegeben
    val name = "Mark"
    val age = 18 // val bedeutet value
    var res = " " //var bedeutet variable
    var y = 0
    println("Hello, World")

    //STRING INTERPOLATION : wir wollen einen gegebenen String mit einem neuen Wert ersetzen

    println(name + " is " + age + " years old"); // eine möglichkeit der Verbindung
    println(s"$name is $age years old"); // s string interpolation,
    // ist aber nicht Typ-sicher
    println(f"$name%s is $age%d years old"); //f string interpolation
    // $s bedeutet, dass wir eine Stringvariable meinen
    // %d steht für integer
    // %f steht für float
    println(raw"hello \nWorld"); // raw string interpolation
    // \n wird auch geprintet,

    //IF ELSE STATEMENTS:
    if (18 == age) { //identisch wie in Java
      println("true")
      res = "age == 20"

    }
    else {
      println("false")
      res = "age != 20"; //reassignment
    }

    println(res)
    val res2 = if (age == 20) "age ==20" else "age !=20" // das ist eine andere Syntax für if else
    println(res2)
    // while (age <30){}

    do {
      y += 1
    } while (y < 10)


  }
}

//Object is a class, aber es hat bereits eine Instanz. Also können wir keinen neues Keyword an diesem Object benutzen
// Hello World ist der Name des Objektes
//def: methode wird deklariert
//jedes Scala project muss eine Main-methode haben



