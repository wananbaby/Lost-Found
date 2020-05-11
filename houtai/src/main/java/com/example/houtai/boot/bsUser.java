package com.example.houtai.boot;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class bsUser implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -4510122533298217661L;

    /**
     * 账户ID
     */
    private Long userId;
    /**
     * 账户名称
     */
    private String userName;

    public CommandDTO getCommandDTO() {
        CommandDTO dto = new CommandDTO();
        dto.setUser(userId == null ? null : userId.intValue());
        dto.setUserName(userName);
        return dto;
    }

    public boolean isAdmin() {
        return "admin".equals(userName);
    }

}
