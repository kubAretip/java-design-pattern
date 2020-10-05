# SINGLETON

Tylko jedna instancja obiektu w aplikacji

**4 problemy z singletonami**
1. Zapobieganie prblemów z wielowątkowością (np dwa wątki w tym samym czasie będą chciały stworzyć dwie instancje)
             
        Rozwiązanie
             1. metoda synchronized
             2. blok synchroniczny
             3. tworzenie obiektu od razu (przy polu klasy)
             
2. Obiekt jest tylko unikalny w obrębie jednego classloadera 
        
        Rozwiązanie:
            Stosowanie synchronizacji pomiędzy classloaderami
        
3. Problemy z serializacją

         Rozwiązanie:
            ktoś może podczas działania programu zaserializować a potem odserializować dowolną ilość kopii,
            aby temu zapobiec trzeba zaimplementować metodę protected Object readResolve(), która zwraca instancję
            ta metoda wykonuje się po każdej deserializacji
     
4. Reflekcje
    
         Rozwiązanie:
         Nie ma ładnego rozwiązania. Można tego uniknąć implementując singleton jako enum.