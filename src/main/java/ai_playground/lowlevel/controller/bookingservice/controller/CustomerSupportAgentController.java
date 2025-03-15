package ai_playground.lowlevel.controller.bookingservice.controller;

import ai_playground.lowlevel.controller.bookingservice.agent.CustomerSupportAgent;
import dev.langchain4j.service.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CustomerSupportAgentController {
    private final CustomerSupportAgent customerSupportAgent;

    @GetMapping("/customerSupportAgent")
    public String customerSupportAgent(@RequestParam String sessionId,
                                       @RequestParam String userMessage) {
        Result<String> result = customerSupportAgent.answer(sessionId, userMessage);
        return result.content();
    }
}
