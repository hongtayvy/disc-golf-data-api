package hongtay.vy.discgolfdataapi.controller;

import hongtay.vy.discgolfdataapi.dto.DiscDTO;
import hongtay.vy.discgolfdataapi.entity.DiscEntity;
import hongtay.vy.discgolfdataapi.repository.DiscRepository;
import hongtay.vy.discgolfdataapi.service.DiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Optional;

@RestController
@RequestMapping(path = "/disc")
public class DiscController {
    @Autowired
    private DiscService discService;
    @GetMapping
    public Mono<DiscDTO> getDisc() {
        return discService.getDisc();
    }
}
