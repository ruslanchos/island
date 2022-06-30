package ru.javarush.island.bityutskih.Services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Limit {
    private final int maxCountInService;
    private final double maxWeight;
    private final int maxSpeed;
    private final double maxFood;
    private final int flockSize;
}
