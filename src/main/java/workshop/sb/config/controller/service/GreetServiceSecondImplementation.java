package workshop.sb.config.controller.service;

import org.springframework.stereotype.Service;

// TODO 2 nazwij serwis, przekazując nazwę jako argument w adnotacji @Service
@Service("second")
public class GreetServiceSecondImplementation implements GreetService {

    public static String SECOND_IMPL = " from the second implementation.";

    @Override
    public String getMsg() {
        return MSG + SECOND_IMPL;
    }
}
