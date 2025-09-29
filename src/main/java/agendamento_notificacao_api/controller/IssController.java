package agendamento_notificacao_api.controller;



import agendamento_notificacao_api.service.IssService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/iss")
public class IssController {

    private final IssService issService;

    public IssController(IssService issService) {
        this.issService = issService;
    }

    @GetMapping("/position")
    public Map<String, Object> getPosition() {
        return issService.getIssPosition();
    }
}
