# Info-Projekt-Q2

## Was ist 5 in einer Reihe

"5 in einer Reihe" ist ein Strategiespiel für 2 Spieler. Auf einer 15x15 Felder großen Spielfläche versucht jeder Spieler, fünf Kästchen horizonal, vertikal oder diagonal hintereinander zu setzen. Die Spieler dürfen abwechselnd ein Kreuz ihrer Farbe (klassisch "x" und "o" dargestellt) setzen. Der Spieler, der zuerst fünf Kästchen nebeneinander gesetzt hat hat gewonnen. Das Spiel endet entweder so, oder dem Belegen aller Felder ohne Gewinner (unentschieden). Während "5 in einer Reihe" aus europäischer Sicht eine Erweiterung des deutlich einfacheren Spieles "Tic Tac Toe" ist, gilt es im ostasiatischen Raum als Verinfachung des komplexeren Gos.

Bei einem 15x15-großen Spielfeld und fehlerfreien Zügen gewinnt immer der Spieler, der zuerst gesetzt hat. Das in Japan beliebte "Renju" soll mehr Chancengleichheit schaffen, in dem der zweite Spieler auch bei einem durch Zusatz-Regeln verbotenen Zug des ersten gewinnt. Eine andere Möglichkeit ist das weitere Begrenzen des Spielfeldes. 

Für unser Projekt haben wir ein Spielfeld von 7x7 gewählt. Damit können wir in Spielbaumen mit der selben Anzahl an Knoten deutlich mehr Niveaus darstellen und Spielveräufe anschaulicher simulieren. Um die Chancengleichheit auszubalancieren übernehmen wir die Renju-Variante. Zus#tzlich gilt also: Der zweite Spieler gewinnt auch wenn der erste Spieler einen der folgenden Fehler begeht:
- Es entsteht eine Reihe der eignenen Farbe, die länger als 5 Kästchen ist ("überlang")
- Es entsehen zwei(!) Reihen der eigenen Farbe mit der Länge drei oder vier, die nicht durch gegnerische Kästchen blockiert ist

Wir empfehlen auch den "15 in einer Reihe"-Simulator ohne weitere Regeln zum Chancenausgleich auf der Website von DBUS! Deutschland. Hier kann ausgewählt werden, ob der Computer den ersten oder zweiten Spieler simuliert: http://www.dbus.de/games/fiveinarow.html
