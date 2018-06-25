package com.example.spock

import org.springframework.context.annotation.Import
import spock.lang.Specification
import spock.lang.Subject

@Import(IntegrationTestConfiguration)
class FooServiceSpecification extends Specification {

    @Subject FooService service

    ExternalApiClient client = Mock()

    def setup() {
        service = new FooService(client)
    }

    def 'foo() should return foo'() {

        when:
        def foo = service.foo()

        then:
        foo == 'foo'
    }

    def 'bar() should return bar'() {
        given:
        1 * client.bar() >> 'bar'

        when:
        def bar = service.bar()

        then:
        bar == 'bar'
    }
}
