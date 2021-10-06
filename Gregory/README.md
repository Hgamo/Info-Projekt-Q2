# 5 in einer Reihe Grégory


## Baumdiagramm des Spiels
Meine Spielsitation kann aus dem Teilbaum [gregory.drawio] entnommen werden. 
Die Datenstruktur in Form einer Java-Klasse kann aus [GameSituation.java] entnommen werden.

## Kommentar

Meiner Meinung nach ist auf Grund der Vereinfachung des Baumes und des gewählten Teilbaumes einfach einen Algorithmus für den nächsten Schritt zu finden.Der Computer würde den nächsten Schritt ausführen. Für ihn bestände die Möglichkeit seinen Zug auf den Feldern 21 oder 28 platzieren, um zumindest das Gewinnen von Spieler 1 zu verhindern. Dieser Algorithmus wäre jedoch nur auf diesen einen konkreten Spielverlauf anwendbar.
Damit ein allgemeingültiger Algorithmus entwickelt werden könnte würde ein größeres Baumdiagramm benötigt werden. Um einen Algorithmus zu entwickeln wäre es sinnvoll den vollständigen Spielbaum zu betrachten. Somit könnte er effizient gestaltet werden, um so die bestmöglichen Entscheidungen für den Computer oder den Spieler zu treffen.

