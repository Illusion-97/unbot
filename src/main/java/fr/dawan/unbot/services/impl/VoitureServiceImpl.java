package fr.dawan.unbot.services.impl;

import fr.dawan.unbot.dto.VoitureDto;
import fr.dawan.unbot.entities.Voiture;
import fr.dawan.unbot.generic.GenericServiceImpl;
import fr.dawan.unbot.mapper.VoitureMapper;
import fr.dawan.unbot.repositories.VoitureRepository;
import fr.dawan.unbot.services.VoitureService;

public class VoitureServiceImpl
        extends GenericServiceImpl<VoitureDto, Voiture, VoitureRepository, VoitureMapper>
        implements VoitureService {

    void tryMeh() {
        mapper.partialUpdate(null, null);
    }
}
