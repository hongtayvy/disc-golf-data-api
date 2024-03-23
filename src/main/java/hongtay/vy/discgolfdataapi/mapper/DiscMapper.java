package hongtay.vy.discgolfdataapi.mapper;

import hongtay.vy.discgolfdataapi.dto.DiscDTO;
import hongtay.vy.discgolfdataapi.entity.DiscEntity;
import hongtay.vy.discgolfdataapi.model.Disc;

import java.util.Optional;
public class DiscMapper {
    private final DiscEnumMapper discEnumMapper = new DiscEnumMapper();
    public Disc toDisc(DiscEntity discEntity) {
        return new Disc(
                discEnumMapper.getCompany(discEntity.getCompany()),
                discEnumMapper.getName(discEntity.getName()),
                discEnumMapper.getPlastic(discEntity.getPlastic()),
                discEnumMapper.getType(discEntity.getType()),
                discEntity.getSpeed(),
                discEntity.getGlide(),
                discEntity.getTurn(),
                discEntity.getFade()
        );
    }

    public DiscDTO toDiscDTO(Disc disc) {
        return new DiscDTO(
                disc.getCompany(),
                disc.getName(),
                disc.getPlastic(),
                disc.getType(),
                disc.getSpeed(),
                disc.getGlide(),
                disc.getTurn(),
                disc.getFade()
        );
    }
}
