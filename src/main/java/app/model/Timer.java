package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {

    private Long nanoTime = System.currentTimeMillis();

    public Long getTime() {
        return nanoTime;
    }
}