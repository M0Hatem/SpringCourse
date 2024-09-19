package com.s8restful.resftulwebservice.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
    @GetMapping("/v1/person")
    public Person getV1OfPerson() {
        return new Person("mohamed hatem");
    }

    @GetMapping("/v2/person")
    public PersonV2 getV2OfPerson() {
        return new PersonV2("mohamed", " hatem");
    }

    @GetMapping(path = "/person", params = "version=1")
    public Person getV1OfPersonParam() {
        return new Person("mohamed hatem");
    }

    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getV2OfPersonParam() {
        return new PersonV2("mohamed", "hatem");
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public Person getV1OfPersonHeader() {
        return new Person("mohamed hatem");
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
    public Person getV1OfPersonAccept() {
        return new Person("mohamed hatem");
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getV2OfPersonAccept() {
        return new PersonV2("mohamed", "hatem");
    }


}
