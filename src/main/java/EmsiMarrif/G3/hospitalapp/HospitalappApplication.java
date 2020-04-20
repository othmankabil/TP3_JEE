package EmsiMarrif.G3.hospitalapp;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.unit.DataSize;

import EmsiMarrif.G3.hospitalapp.dao.PatienRepository;
import EmsiMarrif.G3.hospitalapp.entities.patient;

@SpringBootApplication
public class HospitalappApplication implements CommandLineRunner {
	@Autowired
	private PatienRepository patienRepository;
	public static void main(String[] args) {
		SpringApplication.run(HospitalappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		
		patienRepository.save(new 
				patient("kabil",new Date(),true,5));
		patienRepository.save(new 
				patient("ahmed",new Date(),false,13));
		
		patienRepository.findAll().forEach(p->{System.out.println(p.getName());});
	}

}
