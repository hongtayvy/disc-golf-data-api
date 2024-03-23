package hongtay.vy.discgolfdataapi.service;

import hongtay.vy.discgolfdataapi.dto.DiscDTO;
import hongtay.vy.discgolfdataapi.entity.DiscEntity;
import hongtay.vy.discgolfdataapi.mapper.DiscMapper;
import hongtay.vy.discgolfdataapi.model.Disc;
import hongtay.vy.discgolfdataapi.repository.DiscRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class DiscService {
    @Autowired
    private DiscRepository discRepository;
    private DiscMapper discMapper = new DiscMapper();
    public Mono<DiscDTO> getDisc(){
        DiscEntity discEntity = discRepository.findByCompany("innova");
        Disc disc = discMapper.toDisc(discEntity);
        DiscDTO discDTO = discMapper.toDiscDTO(disc);
        return Mono.just(discDTO);
    }

}
