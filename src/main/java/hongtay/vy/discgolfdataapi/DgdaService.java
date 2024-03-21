package hongtay.vy.discgolfdataapi;

import hongtay.vy.discgolfdataapi.dto.DiscDTO;
import hongtay.vy.discgolfdataapi.model.Disc;
import reactor.core.publisher.Mono;

public class DgdaService {
    private final DgdaMapper dgdaMapper = new DgdaMapper();
    private final DiscDTO discDTO = new DiscDTO("Innova", "TeeBird", "Star", 7, 5, 0, 2);

    public Mono<DiscDTO> getDisc(){
        Mono<DiscDTO> monoDiscDTO = Mono.just(discDTO);
        return  monoDiscDTO
                .map(dgdaMapper::toDisc)
                .map(dgdaMapper::toDiscDTO);
    }

}
