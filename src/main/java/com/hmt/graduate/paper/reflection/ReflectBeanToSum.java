package com.hmt.graduate.paper.reflection;

import com.hmt.graduate.paper.pojo.Cam;

import java.lang.reflect.Field;

public class ReflectBeanToSum {

    public static void sumForAllFiled(Cam cam) throws IllegalAccessException {
        Class clazz = cam.getClass();
        Integer sum = 0;
        Field[] fields = clazz.getDeclaredFields();
        for (Field field:fields){
            field.setAccessible(true);
            String fieldName = field.getName();
            if ("id".equals(fieldName) || "status".equals(fieldName) ||
                    "createTime".equals(fieldName) || "score".equals(fieldName)){
                continue;
            }
            String type = field.getType().toString();
            if (type.endsWith("Integer")){
                Integer value = (Integer) field.get(cam);
                if (value == null)
                    continue;
                sum += value;
            }
        }
        cam.setScore(sum);
    }

}
