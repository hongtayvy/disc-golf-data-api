package hongtay.vy.discgolfdataapi.mapper;

import hongtay.vy.discgolfdataapi.dto.DiscDTO;
import hongtay.vy.discgolfdataapi.entity.DiscEntity;
import hongtay.vy.discgolfdataapi.model.Disc;

public class DiscMapper {
    public Disc toDisc(DiscEntity discEntity){
        return new Disc(
                discEntity.getCompany(),
                discEntity.getName(),
                discEntity.getPlastic(),
                discEntity.getSpeed(),
                discEntity.getGlide(),
                discEntity.getTurn(),
                discEntity.getFade()
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
