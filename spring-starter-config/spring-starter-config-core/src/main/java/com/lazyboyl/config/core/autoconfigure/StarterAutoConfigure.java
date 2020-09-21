package com.lazyboyl.config.core.autoconfigure;

import com.lazyboyl.config.core.config.FaceScannerRegister;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author linzf
 * @since 2020/9/21
 * 类描述：
 */
@Configuration
@Import({FaceScannerRegister.class})
public class StarterAutoConfigure {

}
