package com.example.houtai.boot;

import javax.validation.constraints.NotNull;

public class RequestCommandDTO extends RequestDTO{

    private static final long serialVersionUID = 3795404578488763175L;

    // message 为非空检查为空后返回的错误内容
    @NotNull(message = "请求操作信息不能为空")
    private CommandDTO commandDTO;
}
