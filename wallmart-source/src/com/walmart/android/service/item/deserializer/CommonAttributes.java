// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item.deserializer;

import android.text.TextUtils;

public class CommonAttributes
{

    public static final String CHILDREN = "children";
    public static final String DEFAULT_STRING = "";
    public static final String DISPLAY_VALUE = "displayValue";
    public static final String NAME_VALUE_LIST = "nameValueList";
    public static final String NON_BREAKING_SPACE = "&nbsp;";
    public static final String NUTRIENT_AMOUNT = "nutrient_amount";
    public static final String NUTRIENT_DVP = "nutrient_dvp";
    public static final String NUTRIENT_NAME = "nutrient_name";
    public static final String SPACE = " ";
    public static final String VALUES = "values";
    public static final String VALUE_MAP = "valueMap";

    public CommonAttributes()
    {
    }

    public static String replaceNbsp(String s)
    {
        String s1 = s;
        if (!TextUtils.isEmpty(s))
        {
            s1 = s.replace("&nbsp;", " ");
        }
        return s1;
    }
}
