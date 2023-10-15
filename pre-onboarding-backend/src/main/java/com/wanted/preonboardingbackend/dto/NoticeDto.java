package com.wanted.preonboardingbackend.dto;

import com.wanted.preonboardingbackend.entity.NoticeEntity;
import lombok.Data;

@Data
public class NoticeDto {

    private String noticeName;

    private String position;

    private long salary;

    private String detail;

    private String useTech;

    public NoticeDto(NoticeEntity noticeEntity) {
        this.noticeName = noticeEntity.getNoticeName();
        this.position = noticeEntity.getPosition();
        this.salary = noticeEntity.getSalary();
        this.detail = noticeEntity.getDetail();
        this.useTech = noticeEntity.getUseTech();
    }
}
