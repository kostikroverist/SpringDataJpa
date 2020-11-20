package ua.lviv.lgs.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.dao.UnivercityRepository;
import ua.lviv.lgs.domain.Univercity;
import ua.lviv.lgs.service.UnivercityServer;

import java.util.List;
@Service
public class UnivercityServerImpl implements UnivercityServer {

    @Autowired
    private UnivercityRepository univercityRepository;

    @Override
    public Univercity save(Univercity univercity) {
        return  univercityRepository.saveAndFlush(univercity);
    }

    @Override
    public Univercity findById(Long id) {
        return univercityRepository.getOne(id);
    }

    @Override
    public Univercity update(Univercity univercity) {
        return univercityRepository.save(univercity);
    }

    @Override
    public void deleteVyId(Long id) {
    univercityRepository.deleteById(id);
    }

    @Override
    public List<Univercity> findAll() {
        return univercityRepository.findAll();
    }

    @Override
    public List<Univercity> findByName(String name) {
        return univercityRepository.findByName(name);
    }

    @Override
    public List<Univercity> findByUniversityAddress(String universityAddress) {
        return univercityRepository.findByUniversityAddress(universityAddress);
    }
}
