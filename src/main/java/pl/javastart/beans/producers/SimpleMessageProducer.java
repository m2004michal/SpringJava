package pl.javastart.beans.producers;


import org.springframework.stereotype.Component;

@Component
@Message(type = Message.MessageType.SIMPLE)
public class SimpleMessageProducer implements MessageProducer {
    public String getMessage()  {
        return "Example message " + System.currentTimeMillis();
    }

}