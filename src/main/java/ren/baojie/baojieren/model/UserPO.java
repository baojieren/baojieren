package ren.baojie.baojieren.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class UserPO implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private Integer age;

    private LocalDateTime createTime;

    private static final long serialVersionUID = 1L;
}