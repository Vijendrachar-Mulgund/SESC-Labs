package uk.ac.leedsbeckett.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uk.ac.leedsbeckett.student.model.Course;
import uk.ac.leedsbeckett.student.model.CourseRepository;

@Configuration
public class MiscellaneousBeans {

    @Bean
    CommandLineRunner initDatabase(CourseRepository courseRepository) {
        return args -> {
            Course sesc = new Course();
            sesc.setTitle("SESC");
            sesc.setDesc("Software Engineering for Service Computing");
            sesc.setFee(10.00);
            courseRepository.save(sesc);

            Course isr = new Course();
            isr.setTitle("ISR");
            isr.setDesc("Intelligent Systems and Robotics");
            isr.setFee(8.50);
            courseRepository.save(isr);

            Course pm = new Course();
            pm.setTitle("PM");
            pm.setDesc("Project Management");
            pm.setFee(8.00);
            courseRepository.save(pm);

            Course nm = new Course();
            nm.setTitle("NM");
            nm.setDesc("Network Management");
            nm.setFee(7.50);
            courseRepository.save(nm);

            Course ss = new Course();
            ss.setTitle("SS");
            ss.setDesc("Smart Systems");
            ss.setFee(10.00);
            courseRepository.save(ss);

            Course rp = new Course();
            rp.setTitle("RP");
            rp.setDesc("Research Proposal");
            rp.setFee(9.00);
            courseRepository.save(rp);
        };
    }
}
