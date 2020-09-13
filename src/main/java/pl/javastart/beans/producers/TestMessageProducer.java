package pl.javastart.beans.producers;

import org.springframework.stereotype.Component;

@Component
@Message(type = Message.MessageType.TEST)
public class TestMessageProducer implements MessageProducer {

    @Override
    public String getMessage() { return "Test message"; }
}
