package indi.jends.javapp.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ui.context.support.UiApplicationContextUtils;

import java.util.Locale;

/**
 *
 * description: CommonUtils
 *
 * author: libeifeng
 * date: 2021-11-21 11:34
 */
@Configuration
public class CommonUtils implements ApplicationContextAware {

    //static quote
    private static ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        CommonUtils.ctx = applicationContext;
    }

    public static String getMessage(String code, Object[] params) {
        //Init Message
        String resultMsg = StringUtils.EMPTY;
        //Get Message
        if (null != ctx) {
            //Set Message
            resultMsg = ctx.getMessage(code, params, Locale.getDefault());
        }
        //return
        return resultMsg;
    }
}
