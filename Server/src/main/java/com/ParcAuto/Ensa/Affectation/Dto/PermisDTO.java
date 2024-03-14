package com.ParcAuto.Ensa.Affectation.Dto;

import com.ParcAuto.Ensa.Affectation.Entities.PermisRemise;
import com.ParcAuto.Ensa.Affectation.Entities.PermisType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PermisDTO {
    private Long id;
    private int numPermis;
    private Date finValidite;
    private List<String> types; // Change type to a list of PermisType
    private Date dateRemisePermis;
    private String lieuRemisePermis;
}