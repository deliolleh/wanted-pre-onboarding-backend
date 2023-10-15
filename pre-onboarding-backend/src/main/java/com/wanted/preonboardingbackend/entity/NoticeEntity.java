package com.wanted.preonboardingbackend.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class NoticeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String noticeName;

    @Column(nullable = false)
    private String position;

    @Column(nullable = false)
    private long salary;

    @Column(nullable = false)
    private String detail;

    @Column(nullable = false)
    private String useTech;

}
