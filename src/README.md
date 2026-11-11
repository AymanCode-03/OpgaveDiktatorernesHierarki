    Diktatorernes Hierarki
### Magnus - Stefan - Ahmad - Ayman

    Hvordan kører programmet?:
Programmet startes i main metoden i Main.java. 
Her oprettes en liste af forskellige diktatorer, 
som derefter behandles i et loop, hvor hver diktator udfører sine handlinger.

    Formål:
Dette projekt er udviklet for at lære OOP i Java gennem
et karakter-styringssystem gennem diktatorerne hierarki.

    Klasser:
- Leader (Abstrakt Superklasse)
- MilitarDictator 
- PoliticalDictator
- AIDictator
- PowerActions (Interface)
- Annihilation (Interface)
- Main

    Hvorfor har vi valgt dette opdeling?:
Vi har valg en superklasse (Leader) for at definere fælles egenskaber 
og metoder for alle diktatorer. Vi har valgt at lave to interfaces 
(PowerActions og Annihilation) for at definere specifikke handlinger, 
som nogle diktatorer kan udføre.

    Hvad vi har lært:
- Arv (extends) → at bruge arv mellem klasser.
- Interface (implements) → arbejde med interface.
- Polymorfi → at bruge polymorfi i lister.
- Overriding → at overskrive metoder med @Override.
- instanceof & Casting → at anvende instanceof og casting.

    Funktionalitet:
Programmet opretter forskellige Diktator-karakter og demonstrerer:

- giveSpeech()
- destroyWorld()
- implementPolicy() 
- repressOpposition() 
- holdParade() 

Karaktererne gemmes i lister og behandles ved hjælp af polyformi.

    Hvad vi har testet?:
Vi har testet, at alle metoderne fungerer som forventet, og at polymorfi 
fungerer korrekt i listerne. Vi har også testet, at de forskellige diktatorer 
udfører deres specifikke handlinger korrekt.

    Udfordringer:
En af de største udfordringer var opdeling af metoderne i main, så koden 
blev mere overskuelig og lettere at vedligeholde. 
Vi har også haft udfordringer med at forstå instanceof og casting, 
men vi har lært at bruge det korrekt i vores program. Vi har også haft udfordringer med
at ligge klasserne i mappe/packages.








