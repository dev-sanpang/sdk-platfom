package com.aether.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import com.aether.constant.Constant;

/**
 * 处理错误信息工具
 * 
 * @author liuyang 　 * @date 创建时间：2016年9月30日 上午10:39:14
 *
 */

public class ErrorsUtil {

    /**
     * 获取错误信息工具
     * 
     * @return
     */
    public static String getErrorName(BindingResult result) {
        List<ObjectError> allErrors = result.getAllErrors();
        StringBuilder sbuBuilder = new StringBuilder();
        for (ObjectError objectError : allErrors) {
            String defaultMessage = objectError.getDefaultMessage();
            sbuBuilder.append(defaultMessage);
            sbuBuilder.append(Constant.LINK_STR);
        }
        return sbuBuilder.toString();
    }

    public static Map<String, String> getErrors(BindingResult result) {
        Map<String, String> map = new HashMap<String, String>();
        List<FieldError> list = result.getFieldErrors();
        for (FieldError error : list) {
            System.out.println("error.getField():" + error.getField());
            System.out.println("error.getDefaultMessage():"
                    + error.getDefaultMessage());

            map.put(error.getField(), error.getDefaultMessage());
        }
        return map;
    }
}
