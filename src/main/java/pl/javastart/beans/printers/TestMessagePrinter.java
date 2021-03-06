package pl.javastart.beans.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.javastart.beans.producers.Message;
import pl.javastart.beans.producers.MessageProducer;

@Component
public class TestMessagePrinter {

    @Autowired
    @Message(type = Message.MessageType.TEST)
    private MessageProducer producer;

    public void print(){
        System.out.println("Message produced " + producer.getMessage());
    }
}
