package com.scl.component;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: chenglu
 * Date: 2020/2/17
 * Description:
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String parameter = request.getParameter("l");
        Locale locale = null;
        if (!StringUtils.isEmpty(parameter)) {
            String[] split = parameter.split("_");
            locale = new Locale(split[0], split[1]);
        }else {
            locale = new Locale("zh", "CN");
        }
            return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
    }
}
