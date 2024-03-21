package hongtay.vy.discgolfdataapi.controller;

import hongtay.vy.discgolfdataapi.entity.DiscEntity;
import hongtay.vy.discgolfdataapi.service.DiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/disc")
public class DiscController {
    @Autowired
    private DiscService discService;
    @GetMapping
    public DiscEntity getDisc() {
        return discService.getDisc();
    }
}
