package agendamento_notificacao_api.service;



import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import java.util.Map;

@Service
public class IssService {
    private final RestTemplate restTemplate = new RestTemplate();

    public Map<String, Object> getIssPosition() {
        String url = "http://api.open-notify.org/iss-now.json";
        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
        return response.getBody();
    }
}
