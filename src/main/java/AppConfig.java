import com.directoryxx.repository.SpeakerRepository;
import com.directoryxx.repository.SpeakerRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.directoryxx.service.SpeakerService;
import com.directoryxx.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new SpeakerRepositoryImpl();
    }
}
