package pl.javastart.beans.decorators;

import org.springframework.stereotype.Component;

@Component
@Decorator(type = Decorator.DecoratorType.LOWER)
public class LowerCaseMessageDecorator implements MessageDecorator {

    @Override
    public String decorate(@Decorator(type = Decorator.DecoratorType.LOWER) String msg) {
        return msg.toLowerCase();
    }
}
