package pl.javastart.beans.producers;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Message(type = Message.MessageType.SIMPLE)
public class SimpleMessageProducer implements MessageProducer {
    public String getMessage()  {
        return "Example message " + System.currentTimeMillis();
    }

}