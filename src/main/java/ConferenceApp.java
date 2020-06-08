import com.directoryxx.repository.SpeakerRepositoryImpl;
import com.directoryxx.service.SpeakerService;
import com.directoryxx.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConferenceApp {

    public static void main(String args[]){

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SpeakerService service = appContext.getBean("speakerService",SpeakerService.class);


        System.out.println(service.findAll().get(0).getFirstName());


    }
}
