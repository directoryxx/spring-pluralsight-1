import com.directoryxx.service.SpeakerService;
import com.directoryxx.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConferenceApp {

    public static void main(String args[]){

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service);

        System.out.println(service.findAll().get(0).getFirstName());

        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service2);
    }
}
