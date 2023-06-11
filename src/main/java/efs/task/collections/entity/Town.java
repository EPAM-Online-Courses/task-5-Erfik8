package efs.task.collections.entity;

import java.util.*;

public class Town implements Comparable{
    private String townName;
    private List<String> startingHeroClasses;

    public Town(String townName, List<String> startingHeroesClass) {
        this.townName = townName;
        startingHeroClasses = startingHeroesClass;
    }

    public String getTownName() {
        return townName;
    }

    public List<String> getStartingHeroClasses() {
        return startingHeroClasses;
    }

    //TODO implementacja metody equal porównująca obiekty Town na podstawie tylko townName.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        else if (o == null || getClass() != o.getClass()) return false;
        else {
            Town town = (Town) o;
            return townName.equals(town.townName);
        }
    }

    //TODO implementacja metody equal biorąca pod uwagę tylko townName.
    @Override
    public int hashCode() {
        return Objects.hash(townName);
    }

    @Override
    public String toString() {
        return "Miasto :" + townName;
    }

    public int compareTo(Object town) {
        Town otherTown = (Town) town;
        return this.getTownName().compareTo(otherTown.getTownName());
    }
}
