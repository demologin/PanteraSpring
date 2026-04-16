package com.javarus.pantera.lesson02.entity;

import com.javarus.pantera.lesson02.validator.annotation.Max;
import com.javarus.pantera.lesson02.validator.annotation.Min;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private Long id;

    @Max(9)
    @Min(4)
    private String name;

    private String email;

    @Min(8)
    private String password;

}
