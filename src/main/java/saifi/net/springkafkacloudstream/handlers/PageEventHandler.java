package saifi.net.springkafkacloudstream.handlers;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import saifi.net.springkafkacloudstream.events.PageEvent;

import java.util.function.Consumer;

@Component
public class PageEventHandler {

    @Bean
    public Consumer<PageEvent> pageEventConsumer(){

        return (input)->{
            System.out.println("*******************");
            System.out.print(input.toString());
            System.out.println("********************");
        };
    }
}
