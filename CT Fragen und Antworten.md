# CT Fragen und Antworten

## Kapitel 2

Folgende Fragen sollten Sie jetzt beantworten können
• Definieren Sie die Begriffe Fehlerwirkung, Fehlerzustand, Fehlhandlung.

> Fehlerwirkung - fehlerfunktion. (failure). Nicht erfüllen einer Anforderung.

> Fehlerzustand - Ursache einer Fehlerwirkung. (fault).

> Fehlhandlung - Fehler einer Person (error).

• Was ist Fehlermaskierung?

> Ein Umstand, bei dem ein Fehlerzustand die Aufdeckung eines anderen verhindert.

• Erläutern Sie den Unterschied zwischen Testen und Debugging.

> 

• Definieren Sie die Begriffe Verifizierung und Validierung.

> Validierung - Erfüllt das Entwicklungsergebnis die individuellen Anforderungen.

> Verifizierung - Erfüllen die Ergebnisse der Entwicklungsphasen die Vorgaben der Dokumente?

• Erläutern Sie, warum jeder Test eine stichprobenartige Prüfung ist.

> 

• Nennen Sie die Hauptmerkmale der Softwarequalität nach ISO 9126.

> Benutzbarkeit, Wartbarkeit, Funktionalität, Zuverlässigkeit, Effizienz, Änderbarkeit, Portierbarkeit.

• Definieren Sie den Begriff Zuverlässigkeit eines Systems.

> 

• Erläutern Sie die Hauptaktivitäten des fundamentalen Testprozesses.

>

• Was ist ein Testorakel?

> Etwas mit dem man Soll Wert ableiten kann. Es kann das Benutzungshandbuch, das System selbst (schlecht) oder ein ähnliches System bzw eine funktionierende Vorgängerversion sein.

• Warum sollte ein Entwickler nicht seine eigenen Programme testen?

> Blindheit gegenüber eigenen Fehlern. Anforderungen die falsch verstanden werden können nicht richtig getestet werden.

## Kapitel 3

• Erläutern Sie die einzelnen Phasen des allgemeinen V-Modells.

> Anforderungsdefinition: 

> funktionaler Systementwurf:

> technischer Systementwurf

> Komponenten-Spezifikation:

> Programmierung:

> Komponententest:

> Integrationstest:

> Systemtest:

> Abnehmetest:

• Definieren Sie die Begriffe Verifizierung und Validierung.

> **Validierung**

> Von rechts nach links.

> In jeder Teststufe ist also zu überprüfen, ob die Entwicklungsergebnisse diejenigen Anforderungen erfüllen, die auf der jeweiligen Abstraktionstufe relevant sind.

> Prüfen gegen die ursprüngliche Anforderung.

> **Verifizieren**

> Von unten nach oben.

> Auf eine einzelne Entwicklungsphase bezogen und soll die Korrektheit und Vollständigkeit eines Ergebnisses relativ zu seiner direkten Sprzifikation nachweisen.

> Untersucht wird ob eine Spezifikation richtig umgesetzt wurde.

• Begründen Sie, warum Verifizierung sinnvoll ist, auch wenn eine sorgfältige Validierung stattfindet (und umgekehrt).

> 

• Charakterisieren Sie die typischen Testobjekte im Komponententest.

> Die erstellten Softwarebausteine werden unmittelbar nach der Programmierphase erstmalig einen systematischen Test unterzogen.

> Module, Units oder Klassen.

> Softwarebausteine werden isoliert von anderen. Fehlerwirkungen können direkt zugeordnet werden.

• Nennen Sie die Testziele des Integrationstests.

> Es muss getestet werden ob das Zusammenspiel aller Einzelteile miteinander richtig funktionieren. Fehlerzustände in Schnittstellen und im Zusammenspiel zwischen integrierten Komponenten sollen gefunden werden.

> Keine oder syntaktisch falsche Daren über die Schnittstelle. Die übergebenen Daten werden unterschiedlich interpretiert. Falsches timing, falscher oder verspäteter Zeitpunkt.

• Welche Integrationsstrategien lassen sich unterscheiden?

> **Top-down-Integration**
	
>> Der Test beginnt mit Komponente die andere Aufruf, aber selbst nicht aufgerufen wird. Sukzessiv werden Komponenten niedriger Systemschichten dazu integriert.

>> Vorteil: Es werden nur einfache Treiber benötigt. Nachteil: Untere Komponenten müssen durch Platzhalter ersetzt werden was sehr aufwendig sein kann.

> **Bottom-up-Integration**

>> Test beginnt mit Elementaren Komponenten des Systems, die keine weiteren Komponenten aufrufen (außer Funktionen des OS). Größere Teilsysteme werden sukzessiv aus getesteten Konponenten zusammen gesetzt.

>> Vorteil: Keine Platzhalter notwendig. Nachteil: Übergeordnete müssen durch Treiber simuliert werden.

> **Ad-Hoc-Integration**

>> Zufällige Reihenfolge oder in Reihenfolge ihrer Fertigstellung. Sobald eine Komponente ihren Komponententest absolviert hat wird si mit einer bereits getesteten Komponente integriert.

>> Vorteil: Zeitgewinn, jeder Baustein wird frühesmöglich in seine passende Umgebung integriert. Nachteil: Es werden sowohl Treiber als auch Platzhalter benötigt.

> **Big-Bang-Integration**

>> Wenn alles fertig ist wird es alles zusammen integriert.

>> Nachteile: sehr lange Wartezeit. Schlechte zuordnung der Fehlerwirkungen.

• Welche Gründe sprechen dafür, Tests in einer separaten Testinfrastruktur durchzuführen?

> Man kann so Monitore und Treiber einbauen.

> Systemtest werden um kosten zu sparen der Systemtest in der Produktivumgebung durchgeführt.

• Erläutern Sie anforderungsbasiertes Testen.

> Das Anforderungsdokument wird als Testbasis herangezogen. Zu jeder Anforderung wird ein oder mehrere Systemtestfälle angeleitet und in der Systemtestspezifikation dokumentiert.

• Definieren Sie Lasttest, Performanztest, Stresstest.

> Lasttest: Messung des Systemsverhalten in Abhängigkeit steigener Systemlast.

> Performanztest: Messung der verarbeitungsgeschwindihkeit bzw Antwortzeit für bestimmte Anwendungsfälle, in der Regel in Abhängigkeit steigender Last.

> Stresstest: Beobachtung des Systemsverhalten bei Überlastung.

• Was sind die Unterscheidungsmerkmale?

> 

• Worin unterscheiden sich Fehlernachtest und Regressionstest?

> Fehlernachtest werden benutzt um zu schauen ob eine vorgenommene Fehlerkorrektur erfolgreich war. Ein Regressionstest wird bei Änderungen des Programms oder der Umgebung vorgenommen, meist werden alle Programmteile gestestet die geändert wurden.

• In welcher Projektphase nach allgemeinem V-Modell sollte das Testkonzept erstellt werden?

> 

• Was sind die Ziele von Fehlernach- und Regressionstest?

> Fehlernachtest: nachprüfen ob Fehler nach Fehlerkorrektur immer noch auftauchen. 

> Regressionstest: ob bei Änderungen andere Programmteile beeinträchtigt werden oder nach einer Änderung vorher Maskierte fehler auftauchen.

• Welche Testarten lassen sich unterscheiden?

> funktionaler Test, nicht-funktionaler Test, strukturorientierter Test, änderungsorientierter Test.

## Kapitel 4

• Was sind die grundlegenden Schritte, die bei einem Review durchzuführen sind. (Bitte beschreiben!)

> **Planung** - Manager wählt Team aus. Objekt soll Review-fähig sein. Ort und Zeit für Kick Off festlegen.

> **Kick Off** - Zur verfügung stellen aller Dokumente. Wenn nötig kurze Vorstellung des Dokumentes. Prüfkriterien festlegen.

> **Individuelle Vorbereitung** - Gutachter setzen sich mit Dokument auseinander.

> **Reviewsitzung** - Von Moderator geführt, max 2h.Beurteilung des Objektes in Bezug auf einheltung und Umsetzung der Vorgaben und Richtlinien.

> **Überarbeitung** - Beheben der aufgedeckten Fehlerzuständen und Protokollierung des aktellen Statuses.

> **Nachbereitung** - Kontrolle der ordnungsgemäßen Durchführung des Überarbeitung.

• Welche Reviewarten werden unterschieden?

> **Informelles Review** - Kein formaler Prozess, meist einzeln. Vier-Augen-Prinziep.

> **Walkthrough** - Der Autor präsentiert das Dokument den Gutachtern. Eher keine Vor- und Nachbereitung, keine Kontrolle. Es werden einzelne Beispiele durchgespielt. Das ganze ist eher um Unklarheiten und Denkfehler in schriftlichen Dokumenten zu finden. 

> **Technisches Review** - Ziel: Überinstimmung des Dokumentes mit der Spezifikation. Viel Vorbereitung. Kann sehr formal sein. Diskussion, Entscheidungen, Alternativen bewerten und technische Probleme lösen.

> **Inspektion** - Sehr formal. Ziel: Fehlerzustände finden.

• Welche Rollen wirken an einem technischen Review mit?

> Manager

> Moderator

> Autor

> Gutachter

> Protokollant

• Warum sind Reviews ein effizientes Mittel zur Qualitätssicherung?

> Fehler werden frühzeitig erkannt und behoben. Reduzierte fehlerhäufigkeit. Wissensaustausch unter den Teilnehmern.

• Was umfasst der Begriff „statische Analyse“? Bitte erklären!

> Ziel: Aufdeckung vorhandener Fehlerzustände oder fehlerträchtiger Stellen in einem Dokument. Beispiel Compiler Syntax überprüfung oder werkzeuggestützte 'Best Practice' Analyse.

• Wie stehen statische Analyse und Reviews in Zusammenhang?

> Sie stehen in engem Zusammenhang. Wird vor dem Review eine statische Analyse angewandt könenn bereits eien Anzahl von Fehlern und Unstimmigkeiten gefunden werden. Dadurch kann die Arbeit für das Review Team reduziert werden. Außederm sind werkzeuggestützte statische Analysen billiger.

• Warum kann die statische Analyse nicht alle in einem Programm enthaltenen Fehlerzustände aufdecken?

> Statische Analsyse kann nur Fehler in der Syntax, Abweichungen von Standards oder Anomalien finden. Viele Fehler treten erst bei der Ausführung auf.

• Welche Arten von Datenflussanomalien werden unterschieden?

> **ur** - Ein undefineirter Wert wird gelesen.

> **du** - Die Variable erhält einen Wert der alledings ungültig wird ohne das er benutzt wird.

> **dd** - Die Variable erhält auf einem Programmpfad ein zweites Mal einen Wrt ohne dass der erste verwdnet wurde.

• Was sagt die zyklomatische Zahl über die Kontrollfluss-Komplexität eines Programms aus?

> Bei einer hohen zyklomatischen Zahl kann man annehmen das der Code komplex und schwerer zu verstehen ist.

> Über die zyklomatische Zahl kann man auch den Testaufwand abschätzen.

> Zyklomatische Zahl: Anzahl der unabhängigen Pfade.

> Zyklomatische Zahl - 1: Anzahl der Entscheidungen.

> v(G) = e - v + 2.

• Was sind typische Fehlerzustände im Quellcode und Entwurf, die durch eine werkzeuggestützte statische Analyse identifiziert werden können?

> Referenzierung einer Variable die nicht definiert ist. Inkonsistente Schnittstellen. Dead Code. Syntax-Verletzungen.

> (Nutzen: Frühe erkennung von Fehlerzuständen. Frühe Warnung vor verdächtigen Aspekten im Code oder Design durch Berechnungen von Metriken.  Verbeserte Lesbarkeit, Änderbarkeit, Wartbarkeit.)

## Kapitel 5 - Teil 1

• Welches ist der wesentliche Unterschied zwischen dynamischen und statischen Tests.

> Programme sind statische Beschreibung von dynamischen Prozessen. Statische Test prüfen die Testobjekte an sich (informele Texte, Modelle, Programmcode). Dynamische Teste prüfen die durch Interpretation einer beschribung (Testobjekt) resultierenden Prozesse.

• Welche grundlegenden Funktionen und Eigenschaften muss ein Testrahmen haben?

> Eine Testumgebung mit den notwendigen Treibern und Platzhaltern.

> PoC: Point of Control, versorgt das Testobjekt mit Testdaten.

> PoO: Point of Observation, Schnittstele an der Reaktion und Ausgaben des Testobjektes beobachtet und aufgezeichnet werden.

> Stub: Rudimentäre oder Spezielle implementierung um eine noch nicht existierende Komponente zu simulieren.

> Dummy: Platzhalter mit rudimentärer Funktionalität.

> Mock: Platzhalter mit erweiterter Funktionalität, zB zum Logging oder Plausibilitätsprüfung.

• Welches ist der wesentliche Unterschied zwischen Black-Box-Testentwurfsverfahren und White-Box Verfahren zur Testfallermittlung?

> Bei Black-Box testing analysiert man die zugrunde liegenden Dokumente. Die Testbedingungen müssen auf die Anforderungen zurückverfolgbar sein um Auswikungen von Änderungen an der Spezifikation ermitteln zu können.

> Black Box: Spezifikationsorientierter Testentwurf.

> Bei White-Box Test können Testfälle aufgrund der Programmstruktur gewonnen werden.

> White Box: Strukturorientierter Testentwurf.

• Worauf basieren funktionale Tests?

> Ein dynamischer Test bei dem die testfälle durch die funktionale Spezifikation abgeleitet werden. Der Überdeckungsgrad wird anhand der Spezifikation festgestellt.

• Was versteht man unter der Äquivalenzklassenbildung?

> Man teilt den Ein- und Ausgabewerte in Klassen bei denen sich der Prüfling äquivalent verhält. Man hofft das wenn es dort einen Fehler gibt, dieser durch jeden Wert in der Klasse aufgedeckt wird.

• Wann ist die Grenzwertanalyse einsetzbar?

> Wenn es in einer Komponente Verzweigungen, Fallunterscheidungen oder Schleifendurchläufe gibt.

• Wann ist der zustandsbasierte Test einsetzbar?

> Wenn ein System seinen Zustand ändern kann.

> Ein zustandsbasiertes Test ist ein Nachweis das sich das Testobjekt konform zum Zustandsdiagramm verhält.

> Besonders geeignet sind objektorientierte Systeme, wo Objekte unterschiedliche Zustände annehmen können.

• Wie ist eine Entscheidungstabelle aufgebaut?

> Jede Spalte in der Tabelle entspricht einer Regel im Geschäftsprozess die eine eindutige Kombination der Bedingungen definiert, welche wiedrum die Ausführun der mit dieser Regel verbundenen Aktionen nach sich zieht.

> Bedingung > | Regel

> Aktion > | Aktionszeiger

> Üben??

• Wann ist der anwendungsfallbasierte Test einsetzbar?

> Wenn das System viele Geschäftsprozesse abbildet in denen es viele definierte Anwendungsfälle gibt.

> Außerdem ist es für den Entwurf fpr Abnahmetests mit Kundenbeteidigung sehr hilfreich da das sie Art ist mit dem der Kunde später mit dem System interagiert.

• Welche weiteren Black-Box-Testentwurfsverfahren gibt es noch?

> **Ursache-Wirkungsgraphen**

> **Klassifikationsbäume**

> **Syntaxtest**

> **Zufallstest**

> **Smoke-Test** - 'Ausprobieren' des Testobjektes das vorwiegend die prinzipielle Lauf- und Testfähigkeit prüft. Man braucht keine Soll-Ergebnisse also wird kein Testorakel benuzt. Der Smoke Test ziehlt eher darauf ab ob das System abstürzt.

## Kapitel 5 - Teil 2

• Was bedeutet der Begriff Anweisungsüberdeckung?

> Der Grad der Anweisungsüberdeckung gibt an wie viel Prozent der im Programmcode enthaltenden Anweisungen ausgeführt werden. Bei einem Kontrollflussgrafen erreicht man 100% Anweisungsüberdeckung wenn man jeden Knoten mindestens einmal besucht.

> Die Anweisungsüberdeckung ist eher Schwach, da so 'Entscheidungs'-Fehler in Schleifen und Entscheidungen oder gar fehlende Anweisungen nicht entdeckt werden.

> 100% Anweisungsüberdeckung ist erstrebenswert aber nicht immer erreichbar.

• Worin unterscheiden sich Anweisungs- und Entscheidungsüberdeckung?

> Entscheidungsüberdeckung betrachtet in erster Linie die Entscheidungen die zu allen Möglichkeiten ausgeführt werden sollen.

> Im Kontrollflussgraphen bedeutet das das man jede Kante mindestens einmal besuchen muss.

> Die Entscheidungsüberdeckung ist ein starkes Kriterium.

> Bei 100% Entscheidungsüberdeckung hat man auch automatisch 100% Zweig- und Anweisungsüberdeckung.

• Nach welcher Formel wird die erreichte Anweisungsüberdeckung berechnet?

> Anzahl der durchlaufenden Anweisungen / Gesamte Anweisungen * 100 %.

• Wozu dient die Instrumentierung?

> 

• Exkurs: Worauf zielt die Bedingungsüberdeckung ab?

> Wenn es in Enscheidungen nicht nur einfache Ausdrücke stehen sondern viele mit logischen Verknüpfungen dazwischen kann das schnell sehr komplex werden.

• Exkurs: Worin unterscheiden sich die einfache Bedingungsüberdeckung und die Mehrfachbedingungsüberdeckung?

> Bei der Einfachen Bedingungsüberdeckung wird jede Teilbedingung in jeder Entscheidung mindestens einmal mit dem ert True und False ausgeführt.

> Die Mehrfachbedingungsüerdeckung fordert die ausführung aller Teilbedingungen in allen Kombinationen.

• Was ist unter erfahrungsbasierten (exploratives) Testen zu verstehen?

> Tests werden aufgrund der Erfahrung und der Intuition des Testers entwickelt. Dabei kann man auch Listen mit häufig vorkommenden Fehlern verwenden.

> Das testen geschied mehr oder mindet willkürlich ohne fest spezifiziere Soll-Werte

> Wenn nicht genug Dokumentatuin für das Programm zur verfügung steht kann es per 'exploration' erkundet werden.

## Kapitel 6 (Kommt nicht in Dai's Klausur vor!)

• Welche grundsätzlichen Modelle einer Aufgabenteilung zwischen Entwicklung und Test lassen sich unterscheiden?

> Unabhängige Testen sind unvoreigenommen und sehen dadurch andere Fehlermöglichkeiten. Es können auch falsche Annahmen was die Anforderungen angeht entdeckt werden.

> Verschiedene Modelle:

> Ein Entwickler ist nur für das Testen da.

> Die Entwickler testen ihren Code gegenseitig.

> Unabhängiges Testteam.

> Für spezielle Testziele, spezielle Tester.

> Externe Organisation.

• Welches sind die typischen Aufgaben der Rollen Testmanager und Tester?

> **Testmanager**

> Testrichtlinien und eine Teststrategie erstellen.

> Planung der Tests, Auswahl der Metriken, festlegen was automatisiert werden kann.

> Überwachung und Steuerung.

> Termin festlegung

> **Tester**

> Dokumente hinsichtlich der prüfbarkeit analysieren, prüfen und bewerten.

> Testspezifikation.

> Implementierung Testumgebung.

> Ausarbeitung von Testdaten.

> Durchführung der Tests.

• Nennen Sie zwei Verfahren zur Schätzung des Testaufwands

> Der Testaufwand hängt von vielen Dingen ab: Charakteristiken des Produktes, wie zB die Güte der Dokumentation, die größe und die Testbarkeit.

> Merkmale des Entwicklungsprozesses.

> Ergebnisse der Tests.

> **Expertenschätzung**

> Ein oder mehrere Experten geben ihre (möglichst) Objektive Meinung über die einzelnen Komponenten ab. Dies kann schriftlich Formal oder durch Gruppensitzungen stattfinden.

> **Analogieschätzung**

> Man vergleicht das Projekt mit bereits abgeschlossenen Projekten und kann über diese Relation den ungefähren Aufwand abschätzen.

• Welche Arten von Metriken zur Überwachung des Testfortschritts lassen sich unterscheiden?

> **Testfallbasierte Metriken**

> Anzahl der durchgeführten/geplanten und bestandenden/fehlgeschlagenen Tests.

> **Testobjektbasierte Metriken**

> Testabdeckung der Anforderungen, Risiken oder des Codes.

> **Kostenbasierte Metrik**

> Vergleichen der Kosten für das Auffinden des nächsten Fehlers und den nächsten Testdurchlauf.

> Weitere Kriterien können sein:

> Überdekungsmaße, Schätzungen der verbleibenden Fehlerdichte. Umfang der verbleibenden Risiken und Termin der Auslieferung.

• Welche Informationen soll ein Teststatusbericht enthalten?

> Was getestet wurde, Teststufe, Datum etc.

> Testfortschritt.

> Status der Fehler.

> Risiken.

> Ausblick.

> Gesamtbewertung.

• Welches sind die Aktivitäten des Risikomanagements?

> Ermitteln des Risikokontestes.

> Risikoidentifikation.

> Risikoanalyse und -priorisierung.

> Risikosteuerung und -bewältigung.

> Risikoüberprüfung und -überwachung.

• Wie berechnet man ein Risiko?

> Die Höhe eines Risikos ergbit sich aus der Wahrscheinlichkeit des Eintretens und aus dem damit verbundenen Schaden.

> R = W * S.

• Was sind typische Produkt- und Projektrisiken?

> Lieferaspekte (versagen eine dritten Partei).

> Organisatorische Aspekte (Qualifikation, Mitarbeiterngpässe).

> Politische Aspekte (Kommunikationsprobleme, nicht angemessende Haltung, Nicht Nutzen von Erkenntnissen).

> Technische Aspekte (Anforderung zu ungenau, Unzureichende Qualität, verspätete Lieferung).

## Kapitel 7

• Welche Daten soll eine Fehlermeldung enthalten?


• Was ist der Unterschied zwischen Fehlerpriorität und Fehlerklasse?


• Wozu wird ein Fehlerstatusmodell benötigt?


• Welche Aufgabe hat ein Änderungskontrollausschuss?


• Welche Anforderungen aus Sicht des Tests stellen sich an das Konfigurationsmanagement?


• Welche grundsätzlichen Arten von Normen und Standards lassen sich unterscheiden?

