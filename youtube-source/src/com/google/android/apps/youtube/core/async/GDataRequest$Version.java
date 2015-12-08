// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;


public final class headerValue extends Enum
{

    private static final V_2_1 $VALUES[];
    public static final V_2_1 V_2;
    public static final V_2_1 V_2_1;
    public final String headerValue;

    public static headerValue parse(String s)
    {
        if ("2.1".equals(s))
        {
            return V_2_1;
        } else
        {
            return V_2;
        }
    }

    public static V_2 valueOf(String s)
    {
        return (V_2)Enum.valueOf(com/google/android/apps/youtube/core/async/GDataRequest$Version, s);
    }

    public static V_2[] values()
    {
        return (V_2[])$VALUES.clone();
    }

    public final String toString()
    {
        return headerValue;
    }

    static 
    {
        V_2 = new <init>("V_2", 0, "2");
        V_2_1 = new <init>("V_2_1", 1, "2.1");
        $VALUES = (new .VALUES[] {
            V_2, V_2_1
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        headerValue = s1;
    }
}
