package com.worklog;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.worklog.dao.ReservationDao;
import com.worklog.entity.Reservation;

@SpringBootApplication
@RestController
public class WorkLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkLogApplication.class, args);
	}
	
	@Autowired
    ReservationDao reservationDao;
	
    // 起動時にReservationDao#insertで初期データを投入する
    @Bean
    CommandLineRunner runner() {
        return args -> Arrays.asList("spring", "spring boot", "spring cloud", "doma").forEach(s -> {
            Reservation r = new Reservation();
            r.name = s;
            reservationDao.insert(r);
        });
    }

    @RequestMapping(path = "/")
    List<Reservation> all() {
        return reservationDao.selectAll();
    }
	
    @RequestMapping(path = "/", params = "name")
    List<Reservation> name(@RequestParam String name) {
        return reservationDao.selectByName(name);
    }
}
