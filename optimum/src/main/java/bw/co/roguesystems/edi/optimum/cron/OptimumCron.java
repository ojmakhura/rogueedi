package bw.co.roguesystems.edi.optimum.cron;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OptimumCron {
    
    private final RestTemplate restTemplate;

    public OptimumCron(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private String getDateTime() {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return current.format(formatter);
    }

    @Async
    @Scheduled(cron = "@weekly", zone = "Africa/Gaborone")
    public void weeklySchedule() {
        String formatTime = this.getDateTime();
        log.info("Weekly cron job at " + formatTime);
    }
}
