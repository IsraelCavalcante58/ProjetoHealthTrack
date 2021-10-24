package com.HealthTrack;

import com.HealthTrack.model.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Calendar;

@SpringBootApplication
public class HealthTrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthTrackApplication.class, args);

		Usuario user1 = new Usuario();
		user1.setNome("Danielly");
		user1.setAltura(1.69f);
		user1.setPais("Brasil");
		user1.setEstado("São Paulo");
		user1.setCidade("São José dos Campos");
		user1.setDataNasc(LocalDate.of(1998, Calendar.NOVEMBER, 28));
//        user1.setDataNasc(new Date(1998, Calendar.NOVEMBER, 28));
		user1.setNumeroCelular("+55 (11) 98033-7048");
		user1.setPeso(33);
		user1.dadosUsuario();
	}

}
