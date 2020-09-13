package pl.javastart.beans.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.javastart.beans.producers.Message;
import pl.javastart.beans.producers.MessageProducer;


@Component
public class MessagePrinter {

        @Autowired
    @Message(type = Message.MessageType.FILE)
    private MessageProducer producer;

        public void print(){
            System.out.println("Message produced" + producer.getMessage());
        }
}
