public class Start {

    // <- Das hier ist ein Kommentar
    // Hinter den zwei // könnt ihr Text schreiben, der nicht vom Programm gesehen wird


    // Die Main-Methode ist unser "Ankerpunkt", damit das Programm weiß wo es starten soll
    public static void main(String[] args) {
        // Hier erstellen wir die player1 Variable und packen direkt ein Spieler-Objekt rein
        Player player1 = new Player();
        // Dem Spieler Objekt können wir dann Werte zuweisen
        // Das Zuweisen erfolgt über den = Operator (von rechts nach links)
        player1.gold = 10;
        player1.lvl = 1;
        player1.life = 100.0f;
        player1.name = "Jonas";

        // Hier werden Enemy Variablen angelegt und direkt mit einem Objekt gefüllt
        // Danach werden dem enemy1 und enemy2 Objekt Werte gegeben
        Enemy enemy1 = new Enemy();
        enemy1.lvl = 2;
        enemy1.name = "Peter der Zerstörer";
        enemy1.life = 50.0f;
        enemy1.damage = 10;

        Enemy enemy2 = new Enemy();
        enemy2.lvl = 4;
        enemy2.name = "Kleine Ratte";
        enemy2.life = 10.0f;

        // Hier legen wir eine neue Variable (Box) vom Typ float (Kommazahl) an
        // und weisen ihr direkt die Zahl 10.0f zu
        float uebrigesLeben = 10.0f;

        // Hier überschreiben wir den alten Wert 10.0f mit dem neuen Lebenswert
        // Nach dem der Spieler Schaden bekommen hat
        uebrigesLeben = player1.life * 2 - enemy1.damage;

        // Um auch sehen zu können wie die Werte jetzt aussehen lassen wir uns
        // die Ergebnisse in der Konsole ausgeben
        System.out.println(uebrigesLeben);
        System.out.println(player1.gold);
        System.out.println(enemy2.lvl);
    }
}
