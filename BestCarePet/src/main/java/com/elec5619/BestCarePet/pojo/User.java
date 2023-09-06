package com.elec5619.BestCarePet.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@TableName(value = "User")
public class User  {
    private Long id;
    private String name;
    private String password;
    private String type;
    private String phone_number;
    private String email;
    private String location;
    private String rating;

}
