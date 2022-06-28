package com.state.united.washington.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    @JsonProperty(value = "user_id")
    private String id;

    private String name;

    private String email;

    private String departe;

    private String address;

}
