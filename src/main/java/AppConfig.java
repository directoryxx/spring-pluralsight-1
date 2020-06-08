import org.springframework.context.annotation.Configuration;
import com.directoryxx.service.SpeakerService;
import com.directoryxx.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

    public SpeakerService getSpeakerService(){
        return new SpeakerServiceImpl();
    }
}
