/**
Eine Klasse, deren Exemplare Informationen über ein Buch halten.
Dies könnte Teil einer größeren Anwendung sein, einer
Bibliothekssoftware beispielsweise.
*
@author (Ihren Namen hier eintragen.)
@version (das heutige Datum eintragen.)
*/
class Buch {
// Exemplarvariablen
// Anfang Variablen
private String autor;
private String titel;
private int seiten;
// Ende Variablen

/**
* Setze den Autor und den Titel, wenn ein Exemplar erzeugt wird.     */
public Buch(String buchautor, String buchtitel)     {
autor  = buchautor;
titel  = buchtitel;
seiten = 0;
}

// Anfang Ereignisprozeduren
public String getAutor() {
return autor;
}

public String getTitel() {
return titel;
}

// Ende Ereignisprozeduren
// weitere Methoden hier einfügen ...
}
