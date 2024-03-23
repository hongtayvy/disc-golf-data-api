package hongtay.vy.discgolfdataapi.controller;

import hongtay.vy.discgolfdataapi.common.DiscHelper;
import hongtay.vy.discgolfdataapi.dto.DiscDTO;
import hongtay.vy.discgolfdataapi.service.DiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
@RequestMapping(path = "/disc")
public class DiscController {
    @Autowired
    private DiscService discService;
    private final DiscHelper discHelper = new DiscHelper();
    @GetMapping
    public Mono<DiscDTO> getByDiscCompany(
            @RequestParam(required = true) Map<String, String> discParams
    ) {
        Map<String, String> request = discHelper.buildDiscRequest(discParams);
        return discService.getDiscs(request);
    }
}
