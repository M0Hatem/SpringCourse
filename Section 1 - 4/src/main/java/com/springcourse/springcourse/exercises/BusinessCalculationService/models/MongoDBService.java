package com.springcourse.springcourse.exercises.BusinessCalculationService.models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MongoDBService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{1, 3, 4, 5, 6};
    }
}
