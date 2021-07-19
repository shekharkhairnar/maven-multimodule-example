package org.sktch.domain;

import lombok.Data;

@Data
public class ComplimentryCourse {
    private Integer id;
    private String name;

    public ComplimentryCourse(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
