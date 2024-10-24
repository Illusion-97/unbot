package fr.dawan.unbot.mapper;

import fr.dawan.unbot.dto.VoitureDto;
import fr.dawan.unbot.entities.Voiture;
import fr.dawan.unbot.generic.GenericMapper;

public interface VoitureMapper extends GenericMapper<VoitureDto, Voiture> {
    Voiture partialUpdate(VoitureDto dto, Voiture target);
}
