package com.ldgen.ldgenaimaster.ai;

import com.ldgen.ldgenaimaster.ai.model.HtmlCodeResult;
import com.ldgen.ldgenaimaster.ai.model.MultiFileCodeResult;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @class: com.ldgen.ldgenaimaster.ai.AiCodeGeneratorServiceTest
 * @author: LBigGen
 * @create: 2025-08-02 21:18
 */

@SpringBootTest
class AiCodeGeneratorServiceTest {

    @Resource
    AiCodeGeneratorService aiCodeGeneratorService;

    @Test
    void generateHtmlCode() {
        HtmlCodeResult result = aiCodeGeneratorService.generateHtmlCode("做个程序员李大根的工作记录小工具");
        Assertions.assertNotNull(result);
    }

    @Test
    void generateMultiFileCode() {
        MultiFileCodeResult multiFileCode = aiCodeGeneratorService.generateMultiFileCode("做个程序员李大根的留言板");
        Assertions.assertNotNull(multiFileCode);
    }

}
