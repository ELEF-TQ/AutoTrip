package com.ParcAuto.Ensa.Affectation.Dto;

import jakarta.annotation.Nullable;
import lombok.Data;

@Data
public class VehiculeDTO {
    private String immatriculation;
    private String marque;
    private String modele;
    private String type;
    private Double kilometrage;
    private Boolean disponible;
    private String typePermisRequis;
    private String equipementsSpeciaux;
}
