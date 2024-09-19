package com.s8restful.resftulwebservice.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
    @GetMapping("/filtering")
    public MappingJacksonValue filtering() {
        SomeBean someBean = new SomeBean("value1", "value2", "value3");
        return getMappingJacksonValue(someBean);
    }


    @GetMapping("/filteringV2")
    public MappingJacksonValue filteringV2() {
        SomeBean someBean = new SomeBean("value1", "value2", "value3");
        return getMappingJacksonValue(someBean);
    }
    
    private static @NotNull MappingJacksonValue getMappingJacksonValue(SomeBean someBean) {
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
        PropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }
}
