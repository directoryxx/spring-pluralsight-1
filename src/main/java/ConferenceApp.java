import com.directoryxx.repository.SpeakerRepositoryImpl;
import com.directoryxx.service.SpeakerService;
import com.directoryxx.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConferenceApp {

    public static void main(String args[]){


        SpeakerService service = new SpeakerServiceImpl(new SpeakerRepositoryImpl());


        System.out.println(service.findAll().get(0).getFirstName());


    }
}
