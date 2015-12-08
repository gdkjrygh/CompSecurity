// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.common.fromguava.c;

public final class name extends Enum
{

    private static final UNSUPPORTED $VALUES[];
    public static final UNSUPPORTED MULTI_SELECT;
    public static final UNSUPPORTED SINGLE_ANSWERS;
    public static final UNSUPPORTED UNSUPPORTED;
    private final String name;

    public static name fromName(String s)
    {
        name aname[] = values();
        int j = aname.length;
        for (int i = 0; i < j; i++)
        {
            name name1 = aname[i];
            if (name1.name.equals(s))
            {
                return name1;
            }
        }

        return UNSUPPORTED;
    }

    public static UNSUPPORTED valueOf(String s)
    {
        return (UNSUPPORTED)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/SurveyQuestion$Type, s);
    }

    public static UNSUPPORTED[] values()
    {
        return (UNSUPPORTED[])$VALUES.clone();
    }

    public final String getName()
    {
        return name;
    }

    static 
    {
        SINGLE_ANSWERS = new <init>("SINGLE_ANSWERS", 0, "single-answer");
        MULTI_SELECT = new <init>("MULTI_SELECT", 1, "multi-select");
        UNSUPPORTED = new <init>("UNSUPPORTED", 2, "unsupported");
        $VALUES = (new .VALUES[] {
            SINGLE_ANSWERS, MULTI_SELECT, UNSUPPORTED
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        name = (String)c.a(s1);
    }
}
