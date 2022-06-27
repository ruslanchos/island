package ru.javarush.island.bityutskih.services;

public class Tasks {
import lombok.Getter;

import java.util.function.Consumer;

    @Getter
    public class Task {

        private final Organism organism;
        private final Consumer<Organism> operation;

        public Task(Organism organism, Consumer<Organism> operation) {
            this.organism = organism;
            this.operation = operation;
        }

        public void run() {
            operation.accept(organism);
        }


    }
}
