package com.example.spock

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.ResponseEntity
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationSpecification extends Specification {

    @Autowired
    TestRestTemplate restTemplate

    def '/foo should return world'() {

        when:
        ResponseEntity entity = restTemplate.getForEntity('/', String.class)

        then:
        print(entity.class)
        print(entity)
        entity.statusCode.value() == 200
        entity.body == 'hello world'
    }

}
