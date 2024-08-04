package com.springcourse.springcourse.exercises.BusinessCalculationService.Services;

import com.springcourse.springcourse.exercises.BusinessCalculationService.models.DataService;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {
    private final DataService dataService;
    BusinessCalculationService(DataService dataService){
        super();
        this.dataService = dataService;
    }
    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
