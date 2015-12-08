// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.enums;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.weather.util.enums:
//            EnumConverter

public class ReverseEnumMap
{

    private final Map map = new HashMap();

    public ReverseEnumMap(Class class1)
    {
        class1 = (Enum[])class1.getEnumConstants();
        int j = class1.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = class1[i];
            map.put(((EnumConverter)obj).convert(), obj);
        }

    }

    public Enum get(String s)
    {
        return (Enum)map.get(s);
    }
}
