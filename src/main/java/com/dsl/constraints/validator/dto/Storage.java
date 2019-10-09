package com.dsl.constraints.validator.dto;

import com.dsl.constraints.validator.validators.CreateValidation;
import com.dsl.constraints.validator.validators.UniqueName;
import com.dsl.constraints.validator.validators.UpdateValidation;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@UniqueName(groups = CreateValidation.class)
public class Storage
{
    private Long id;

    @NotBlank
    private String name;

    @NotNull(groups = UpdateValidation.class)
    private Integer quantity;
}
