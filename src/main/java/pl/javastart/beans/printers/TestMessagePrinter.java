package pl.javastart.beans.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.javastart.beans.decorators.Decorator;
import pl.javastart.beans.decorators.MessageDecorator;
import pl.javastart.beans.producers.MessageProducer;
import pl.javastart.beans.producers.Producer;

@Component
public class TestMessagePrinter {

    private MessageProducer producer;
    private MessageDecorator decorator;

    @Autowired
    public TestMessagePrinter(@Producer(type = Producer.ProducerType.TEST) MessageProducer producer) {
        this.producer = producer;
    }
    public MessageDecorator getDecorator(){
        return decorator;
    }

    @Autowired(required = false)
    public void setDecorator(@Decorator(type = Decorator.DecoratorType.LOWER) MessageDecorator decorator){
        this.decorator = decorator;
    }

    public void print() {
        String message = producer.getMessage();
        message = decorator != null? decorator.decorate(message) : message;
        System.out.println(message);
    }

}
