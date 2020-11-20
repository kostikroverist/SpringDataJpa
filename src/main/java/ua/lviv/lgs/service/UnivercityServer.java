package ua.lviv.lgs.service;

import ua.lviv.lgs.domain.Univercity;

import java.util.List;

public interface UnivercityServer {


    Univercity save(Univercity univercity);

    Univercity findById(Long id);


    Univercity update(Univercity univercity);

     void deleteVyId(Long id);


    List<Univercity> findAll();


    List<Univercity> findByName(String name);


    List<Univercity> findByUniversityAddress(String universityAddress);
}
