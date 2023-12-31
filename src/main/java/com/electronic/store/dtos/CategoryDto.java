package com.electronic.store.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {

    private String categoryId;

    @NotBlank
    @Size(min = 4, message = "title must be of minimum 4 characters !!")
    private String title;

    @NotBlank(message = "Description required !!")
    private String description;

    private String coverImage;
}
