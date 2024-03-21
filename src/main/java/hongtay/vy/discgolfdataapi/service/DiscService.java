package hongtay.vy.discgolfdataapi.service;

import hongtay.vy.discgolfdataapi.entity.DiscEntity;
import hongtay.vy.discgolfdataapi.repository.DiscRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscService {
    @Autowired
    private DiscRepository discRepository;
    public DiscEntity getDisc(){
        DiscEntity discEntity = discRepository.findByCompany("innova");

        return discEntity;
    }

}
