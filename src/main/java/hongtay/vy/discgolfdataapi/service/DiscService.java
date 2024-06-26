package hongtay.vy.discgolfdataapi.service;

import hongtay.vy.discgolfdataapi.dto.DiscDTO;

import hongtay.vy.discgolfdataapi.entity.DiscEntity;
import hongtay.vy.discgolfdataapi.mapper.DiscMapper;
import hongtay.vy.discgolfdataapi.model.Disc;
import hongtay.vy.discgolfdataapi.repository.DiscRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Map;

import static hongtay.vy.discgolfdataapi.common.StringConstants.COMPANY;
import static hongtay.vy.discgolfdataapi.common.StringConstants.NAME;
import static hongtay.vy.discgolfdataapi.common.StringConstants.PLASTIC;
import static hongtay.vy.discgolfdataapi.common.StringConstants.TYPE;

@Service
public class DiscService {
    @Autowired
    private DiscRepository discRepository;

    private final DiscMapper discMapper = new DiscMapper();

    public Mono<DiscDTO> getDiscs(Map<String, String> discRequest){
        Map.Entry<String, String> entry = discRequest.entrySet().iterator().next();
        return switch (entry.getKey()){
            case COMPANY-> getByDiscCompany(entry.getValue());
            case NAME -> getByDiscName(entry.getValue());
            case PLASTIC -> getByDiscPlastic(entry.getValue());
            case TYPE -> getByDiscType(entry.getValue());
            default -> throw new IllegalStateException("Unexpected value: " + entry.getKey());
        };
    }

    public Mono<DiscDTO> getByDiscCompany(String discCompany){
        return Mono.just(
                discMapper.toDiscDTO(
                        discMapper.toDisc(
                                discRepository.findByCompany(discCompany)
                        )
                )
        );
    }
    public Mono<DiscDTO> getByDiscName(String discName){
        return Mono.just(
                discMapper.toDiscDTO(
                        discMapper.toDisc(
                                discRepository.findByName(discName)
                        )
                )
        );
    }
    public Mono<DiscDTO> getByDiscPlastic(String discPlastic){
        return Mono.just(
                discMapper.toDiscDTO(
                        discMapper.toDisc(
                                discRepository.findByName(discPlastic)
                        )
                )
        );
    }
    public Mono<DiscDTO> getByDiscType(String discType){
        return Mono.just(
                discMapper.toDiscDTO(
                        discMapper.toDisc(
                                discRepository.findByType(discType)
                        )
                )
        );
    }
}
