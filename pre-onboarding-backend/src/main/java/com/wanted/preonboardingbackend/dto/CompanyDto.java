package com.wanted.preonboardingbackend.dto;

import com.wanted.preonboardingbackend.entity.CompanyEntity;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
public class CompanyDto {
    private String name;
    private String location;
    private String nation;

    public CompanyDto(CompanyEntity companyEntity) {
        this.name = companyEntity.getName();
        this.location = companyEntity.getLocation();
        this.nation = companyEntity.getNation();
    }

}
