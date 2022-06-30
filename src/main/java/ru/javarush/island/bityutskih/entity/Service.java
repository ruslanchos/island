package ru.javarush.island.bityutskih.entity;
package ru.javarush.island.bityutskih.Services.ServiceStatistics;
import static ru.javarush.island.bityutskih.Services.Random.getRandomsNum;
import java.util.concurrent.CopyOnWriteArrayList;


public class Service {

    private final CopyOnWriteArrayList<Nature> nature = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<Nature> getNature() {
        return nature;
    }
/*    private final Service[][] Services;
    private ServiceStatistics ServiceStatistics;*/
    public void makeNature() {
        preAnimal(new Bear());
        preAnimal(new Snake());
        preAnimal(new Boar());
        preAnimal(new Buffalo());
        preAnimal(new Caterpillar());
        preAnimal(new Deer());
        preAnimal(new Duck());
        preAnimal(new Eagle());
        preAnimal(new Fox());
        preAnimal(new Goat());
        preAnimal(new Horse());
        preAnimal(new Mouse());
        preAnimal(new Plant());
        preAnimal(new Rabbit());
        preAnimal(new Sheep());
        preAnimal(new Wolf());
    }
    private void preAnimal(Nature n){
        nature.add(n);
        for(int i = 1; i <= getRandomsNum(n.getobjPerService() / 2, n.getobjPerService() + 1); i++) {
            nature.add(n.getInstance());
        }
    }
}
