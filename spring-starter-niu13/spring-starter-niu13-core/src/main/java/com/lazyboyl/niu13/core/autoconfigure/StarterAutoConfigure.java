package com.lazyboyl.niu13.core.autoconfigure;

import com.lazyboyl.niu13.core.config.FaceScannerRegister;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author linzf
 * @since 2020/9/21
 * 类描述：
 */
@Configuration
@Import({FaceScannerRegister.class})
@ConditionalOnProperty(
        prefix = "xxxface",
        name = "isopen",
        havingValue = "true"
)
public class StarterAutoConfigure {

}
