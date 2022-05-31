package com.state.united.washington.h2db.tables;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column
    private long id;

    @Column
    private String name;
}
