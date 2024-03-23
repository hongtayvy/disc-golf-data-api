package hongtay.vy.discgolfdataapi.mapper;

import hongtay.vy.discgolfdataapi.common.StringConstants;
import hongtay.vy.discgolfdataapi.model.DiscCompany;
import hongtay.vy.discgolfdataapi.model.DiscType;
import hongtay.vy.discgolfdataapi.model.DiscName;
import hongtay.vy.discgolfdataapi.model.DiscPlastic;

public class DiscEnumMapper {
    public String getCompany(String company){
        return switch(company){
            case StringConstants.INNOVA -> DiscCompany.INNOVA.getCompany();
            case StringConstants.DISCRAFT -> DiscCompany.DISCRAFT.getCompany();
            default -> DiscCompany.UNKNOWN.getCompany();
        };
    }

    public String getName(String name){
        return switch(name){
            case StringConstants.TEEBIRD -> DiscName.TEEBIRD.getName();
            case StringConstants.BUZZZ -> DiscName.BUZZZ.getName();
            case StringConstants.ROC -> DiscName.ROC.getName();
            default -> DiscName.UNKNOWN.getName();
        };
    }

    public String getPlastic(String plastic){
        return switch(plastic){
            case StringConstants.STAR -> DiscPlastic.STAR.getPlastic();
            case StringConstants.TITANIUM -> DiscPlastic.TITANIUM.getPlastic();
            case StringConstants.KCPRO -> DiscPlastic.KCPRO.getPlastic();
            default -> DiscPlastic.UNKNOWN.getPlastic();
        };
    }

    public String getType(String type){
        return switch(type){
            case StringConstants.FAIRWAY -> DiscType.FAIRWAY.getType();
            case StringConstants.MIDRANGE -> DiscType.MIDRANGE.getType();
            default -> DiscType.UNKNOWN.getType();
        };
    }
}
