package com.dsl.constraints.validator.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "storage")
public class StorageEntity
{
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private Integer quantity;
}
