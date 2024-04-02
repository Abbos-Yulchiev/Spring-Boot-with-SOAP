package com.example.demo.core.util;

import com.example.demo.provider.uws.GenericParam;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class Utilities {

    public static String getValueByKey(List<GenericParam> list, String key) {
        for (GenericParam data : list) {
            if (data.getParamKey().equals(key)) {
                return data.getParamValue();
            }
        }
        return null;
    }
}
