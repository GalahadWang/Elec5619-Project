package com.elec5619.BestCarePet.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "Staff")
public class Staff {
    private Long id;
    private String name;
    private String password;
    private String email;
    private String phone_number;
}
