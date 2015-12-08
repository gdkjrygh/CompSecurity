// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import java.util.HashMap;
import java.util.Map;

public class zzh
{

    private static final String zzNq[] = {
        "text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity"
    };
    private static final Map zzNr;

    public static String zzai(int i)
    {
        if (i < 0 || i >= zzNq.length)
        {
            return null;
        } else
        {
            return zzNq[i];
        }
    }

    public static int zzbq(String s)
    {
        Integer integer = (Integer)zzNr.get(s);
        if (integer == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("[").append(s).append("] is not a valid global search section name").toString());
        } else
        {
            return integer.intValue();
        }
    }

    public static int zzkL()
    {
        return zzNq.length;
    }

    static 
    {
        int i = 0;
        zzNr = new HashMap(zzNq.length);
        for (; i < zzNq.length; i++)
        {
            zzNr.put(zzNq[i], Integer.valueOf(i));
        }

    }
}
