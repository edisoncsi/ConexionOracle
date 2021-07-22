package com.ejm.ec;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ejm.ec.model.Canton;

@SpringBootApplication
/*public class ConexionOracleApplication  implements CommandLineRunner  {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ConexionOracleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        String sql = "SELECT * FROM Canton";
         
        List<Canton> students = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Canton.class));
         
        students.forEach(canton ->System.out.println(canton.getNom_canton()));
    }
	
}*/
public class ConexionOracleApplication  extends SpringBootServletInitializer {
	
	
	public static void main(String[] args) {
		SpringApplication.run(ConexionOracleApplication.class, args);
	}

}
