package A.statistics;

public interface FindInterface {

    String INTERFACENAME = "Интерфейс для поиска разных значений в коллекциях";

    default void printEntryInfo(){
        System.out.println("Все расчеты сделаны с помощью интерфейсов наследников от интерфейса FindInterface");
    }

}
