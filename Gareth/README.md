# 5 in einer Reihe Gareth

## Spielsituation
Die Situation auf dem Spielfeld kann der Wurzel des gezeichneten Teilbaums [gareth.drawio](gareth.drawio) entnommen werden.
### Weiter Angaben
nextPlayer = NextPlayer.TWO;<br>
wonPlayer = WonPlayer.NOONE

## Bewertung
Die das gegebene Diagramm reicht nicht aus, um eine vollumfängliche Beurteilung der Spielsituation und dem Spielverlauf so wie die bestmögliche Entscheidung zu treffen. Dennoch könne für beide Spieler Situationen entstehen, die zwangsläufig oder möglicherweise zu einem Gewinn führen.
Für eine algorithmisch genaue Entscheidung ist es sinnvoll den gesamten Spielbaum zu errechnen, um so die bestmögliche Entscheidung zu treffen. Angesichts der relativ überschaubaren Komplexität des Spieles ist dies mit heutigen Rechensystemen auch ohne große Belastung möglich. Beachten sollte man jedoch den Algorithmus zur Beurteilung des gewonnenen Spielers aus einer Spielsituation. Die Funktion (nicht im Quelltext gegeben, da nicht gefordert)
```java
  WonPlayer getWonPlayer(Matchfield  matchfield){
    ...
    if(...){
      return WonPlayer.ONE
    }else if(...){
      return WonPlayer.TWO
    }else{
      return WonPlayer.NOONE
    }
  }
```
muss erkennen, dass ein Spieler gewonnen hat und dabei die im Wiki gegeben, Sonderregeln zur Wiederherstellung der Fairness beachten.
