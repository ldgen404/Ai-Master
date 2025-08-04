package com.ldgen.ldgenaimaster.ai.model;

import dev.langchain4j.model.output.structured.Description;
import lombok.Data;

@Description("html代码结果")
@Data
public class HtmlCodeResult {

    @Description("html代码")
    private String htmlCode;

    @Description("代码描述")
    private String description;
}
