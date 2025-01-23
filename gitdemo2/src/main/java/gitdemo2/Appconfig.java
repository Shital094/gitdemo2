package gitdemo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

	@Bean(name="st")
	public Student s() {
	Student s= new Student();
	s.setRollno(11);
	s.setName("shital");
	s.setAddress("manipal");
	s.setMobno(896325);
	return s;
	}
	}

