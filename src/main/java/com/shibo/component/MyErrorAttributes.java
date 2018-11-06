package com.shibo.component;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class MyErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes,
                                                  boolean includeStackTrace) {
        Map<String, Object> errorAttribute = super.getErrorAttributes(requestAttributes,includeStackTrace);
        errorAttribute.put("mymessage","我在errorAttributes里，用来整合所有错误信息");
        errorAttribute.put("ext",requestAttributes.getAttribute("ext",0));
        return errorAttribute;
    }

}
