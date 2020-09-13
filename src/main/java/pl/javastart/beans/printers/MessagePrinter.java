package pl.javastart.beans.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.javastart.beans.producers.Message;
import pl.javastart.beans.producers.MessageProducer;


@Component
public class MessagePrinter {

        @Autowired
    @Message(type = Message.MessageType.SIMPLE)
    private MessageProducer producer;

        public void print(){
            System.out.println("Message produced" + producer.getMessage());
        }
}
