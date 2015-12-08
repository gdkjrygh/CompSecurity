// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import java.util.HashMap;
import java.util.Map;

public class zzh
{

    private static final String zzJu[] = {
        "text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity"
    };
    private static final Map zzJv;

    public static String zzZ(int i)
    {
        if (i < 0 || i >= zzJu.length)
        {
            return null;
        } else
        {
            return zzJu[i];
        }
    }

    public static int zzbc(String s)
    {
        Integer integer = (Integer)zzJv.get(s);
        if (integer == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("[").append(s).append("] is not a valid global search section name").toString());
        } else
        {
            return integer.intValue();
        }
    }

    public static int zzjE()
    {
        return zzJu.length;
    }

    static 
    {
        int i = 0;
        zzJv = new HashMap(zzJu.length);
        for (; i < zzJu.length; i++)
        {
            zzJv.put(zzJu[i], Integer.valueOf(i));
        }

    }
}
