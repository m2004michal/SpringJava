package pl.javastart.beans.decorators;


import org.springframework.stereotype.Component;

@Component
@Decorator(type = Decorator.DecoratorType.UPPER)
public class UpperCaseMessageDecorator implements MessageDecorator {

    @Override
    public String decorate(@Decorator(type = Decorator.DecoratorType.UPPER)String msg) {
        return msg.toUpperCase();
    }
}
