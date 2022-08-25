# Wzorzec projektowy - Polecenie (Command)

Wzorzec polecenie polega na przekształcaniu żądań użytkownika w obiekty.
Dzięki temu możemy przechowywać historię poleceń. Możemy odłożyć w czasie
wykonanie poleceń, nie musimy od razu zmieniać stanu aplikacji. Ponadto dzięki
dostępowi do historii możemy zaimplementować cofanie akcji. **W tej aplikacji
zaimplementowałem cofanie operacji**.

## Tytuł aplikacji: Kalkulator

Używanie aplikcji odbywa się przez standardowe wejście linii poleceń

    show - shows calculator result
    undo - undo last operation
    add <number> - adds <number> to the result
    subtract <number> - subtracts <number> from the result
    multiply <number> - multiply <number> and the result
    example: 'add 3' will add 3 to the result

### Klasa Client.java

Klasa odpowiedzialna za parsowanie standardowego wejscia i tworzenie komend.
Następnie komendy są przesyłane do `CalculatorService`

### Klasa CalculatorService.java

Klasa otrzymuje komendy i pozwala się każdej komendzie wykonać albo nie,
wywołując metodę `CalculatorCommand.triggerExecute`

### package command

W tym package przechowujemy komendy które pozwalają na komunikację pomiędzy
`Client` a `CalculatorService`

### Standardowe komendy:

 - AddCommand - dodaje liczbę
 - SubtractCommand - odejmuje liczbę
 - MultiplyCommand - mnoży liczbę

### Specjalne komendy

Specjalne komendy które wykonują specjalną akcję. Te komendy nie zapisują
się w historii dzięki metodzie `isSavedInHistory() => false`

 - ShowResultCommand - pokazuje stan kalkulatora na ekranie
 - UndoCommand - cofa ostatnią operację i usuwa ją z historii




