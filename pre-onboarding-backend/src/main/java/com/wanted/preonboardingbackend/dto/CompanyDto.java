package com.wanted.preonboardingbackend.dto;

import lombok.Data;

@Data
public class CompanyDto {
    private long companyId;
    private String name;
    private String location;
    private String nation;

}
