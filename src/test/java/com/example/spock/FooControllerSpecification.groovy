package com.example.spock

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.ResultActions
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get

@WebMvcTest(FooController)
class FooControllerSpecification extends Specification {

    @Autowired
    protected MockMvc mvc

    def '/foo should return world'() {
//        given:
//        1 * client.getDefault() >> new Hello('world')

        when:
        ResultActions entity = mvc.perform(get('/'))

        then:
//        print(entity.class)
//        print(entity)
        entity.andReturn().response.status == 200
        entity.andReturn().response.contentAsString == 'hello world'
    }

}
