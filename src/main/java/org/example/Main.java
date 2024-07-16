package org.example;

//Erstellen Sie ein neues Projekt in IntelliJ (bitte verwenden Sie eine Java-Anwendung) und verwenden Sie die java.
// time-Klassen, um verschiedene Datumsoperationen durchzuführen.

//Schritt 1: Schreiben Sie Code zur Ausgabe des aktuellen Datums und der Uhrzeit.

//Schritt 2: Fügen Sie eine Zeitspanne von 2 Wochen zu dem aktuellen Datum hinzu und geben Sie das neue Datum aus.

//Schritt 3: Vergleichen Sie das aktuelle Datum mit einem angegebenen zukünftigen Datum und geben Sie aus,
// ob das aktuelle Datum vor oder nach dem angegebenen Datum liegt.

//Schritt 4: Berechnen Sie die Differenz in Tagen zwischen zwei beliebigen Daten und geben Sie das Ergebnis aus.

//ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
//Instant zeitpunkt = Instant.now();

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Main {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime twoWeeks = today.plusDays(14);
        System.out.println("Date today: " + today);
        System.out.println("Date in two weeks: " + twoWeeks);

        if (today.isAfter(twoWeeks)) {
            System.out.println("Today is after two weeks");
        }
        else{
            System.out.println("Today is not after two weeks");
        }
        // Zwei beliebige Daten definieren
//        LocalDate datum1 = LocalDate.of(2023, 7, 16);
//        LocalDate datum2 = LocalDate.of(2024, 7, 16);

        // Differenz in Tagen berechnen
        long differenzInTagen = ChronoUnit.DAYS.between(today, twoWeeks);

        // Ergebnis ausgeben
        System.out.println("Die Differenz in Tagen zwischen " + today + " und " + twoWeeks + " beträgt: " + differenzInTagen + " Tage.");

    }
}