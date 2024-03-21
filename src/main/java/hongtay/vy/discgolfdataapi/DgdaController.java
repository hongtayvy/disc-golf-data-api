package hongtay.vy.discgolfdataapi;

import hongtay.vy.discgolfdataapi.dto.DiscDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/dgd")
public class DgdaController {
    private final DgdaService dgdaService = new DgdaService();
    @GetMapping
    public Mono<DiscDTO> getDisc() {return dgdaService.getDisc();}
}
