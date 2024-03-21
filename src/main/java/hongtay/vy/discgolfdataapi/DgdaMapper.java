package hongtay.vy.discgolfdataapi;

import hongtay.vy.discgolfdataapi.dto.DiscDTO;
import hongtay.vy.discgolfdataapi.model.Disc;

public class DgdaMapper {
    public Disc toDisc(DiscDTO discDTO){
        return new Disc(
                discDTO.getCompany(),
                discDTO.getName(),
                discDTO.getPlastic(),
                discDTO.getSpeed(),
                discDTO.getGlide(),
                discDTO.getTurn(),
                discDTO.getFade()
        );
    }

    public DiscDTO toDiscDTO(Disc disc){
        return new DiscDTO(
                disc.getCompany(),
                disc.getName(),
                disc.getPlastic(),
                disc.getSpeed(),
                disc.getGlide(),
                disc.getTurn(),
                disc.getFade()
        );
    }
}
