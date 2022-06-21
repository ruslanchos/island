package com.javarush.island.bityutskih;

import com.javarush.island.bityutskih.entity.ServiceRunner;
import com.javarush.island.bityutskih.services.ServiceRunner;

//import com.javarush.island.bityutskih.repository.EntityFactory;
//import com.javarush.island.bityutskih.repository.GameMapCreator;
//import com.javarush.island.bityutskih.services.GameWorker;
//import com.javarush.island.bityutskih.view.ConsoleView;
//import com.javarush.island.bityutskih.view.View;

public class Runner {
    public static void main(String[] args) {
        new ServiceRunner().runService();
    }
        //        EntityFactory entityFactory = new EntityFactory();
//        GameMapCreator gameMapCreator = new GameMapCreator(entityFactory);
//        GameMap gameMap = gameMapCreator.createRandomFilledGameMap(5, 20);
//        View view=new ConsoleView(gameMap);
//        Game game = new Game(gameMap, entityFactory,view);
//        GameWorker gameWorker = new GameWorker(game);
//        gameWorker.start();
    }
}