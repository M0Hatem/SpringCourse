package com.springcourse.springcourse.exercises.BusinessCalculationService.models;

import org.springframework.stereotype.Component;

@Component
public class MySQLService implements DataService
{
    @Override
    public int[] retrieveData() {
        return new int[]{1,3,4,5,6};
    }
}
