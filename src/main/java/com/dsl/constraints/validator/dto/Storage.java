package com.dsl.constraints.validator.dto;

import com.dsl.constraints.validator.validators.CreateValidation;
import com.dsl.constraints.validator.validators.UniqueName;
import com.dsl.constraints.validator.validators.UpdateValidation;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;

@Data
@UniqueName(groups = {Default.class, CreateValidation.class})
public class Storage
{
    private Long id;

    @NotBlank(groups = Default.class)
    private String name;

    @NotNull(groups = {Default.class, UpdateValidation.class})
    private Integer quantity;
}
