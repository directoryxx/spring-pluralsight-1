import com.directoryxx.service.SpeakerService;
import com.directoryxx.service.SpeakerServiceImpl;

public class ConferenceApp {

    public static void main(String args[]){
        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
