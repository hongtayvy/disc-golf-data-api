package hongtay.vy.discgolfdataapi.common;

import hongtay.vy.discgolfdataapi.model.DiscParameter;

import java.util.HashMap;
import java.util.Map;

import static hongtay.vy.discgolfdataapi.common.StringConstants.COMPANY;
import static hongtay.vy.discgolfdataapi.common.StringConstants.NAME;
import static hongtay.vy.discgolfdataapi.common.StringConstants.PLASTIC;
import static hongtay.vy.discgolfdataapi.common.StringConstants.TYPE;

public class DiscHelper{
    public Map<String, String> buildDiscRequest(Map<String, String> discParams){
        Map<String, String> discRequest = new HashMap<>();
        for(Map.Entry<String, String> entry : discParams.entrySet()){
            if(entry != null) {
                switch (entry.getKey()) {
                    case COMPANY-> discRequest.put(DiscParameter.COMPANY.getParameter(), entry.getValue());
                    case NAME -> discRequest.put(DiscParameter.NAME.getParameter(), entry.getValue());
                    case PLASTIC -> discRequest.put(DiscParameter.PLASTIC.getParameter(), entry.getValue());
                    case TYPE -> discRequest.put(DiscParameter.TYPE.getParameter(), entry.getValue());
                }
            }
        }

        return discRequest;
    }
}
