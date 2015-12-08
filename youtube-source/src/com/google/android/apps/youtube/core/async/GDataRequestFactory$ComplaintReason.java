// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.youtube.p;

public final class stringId extends Enum
{

    private static final SPAM $VALUES[];
    public static final SPAM DANGEROUS;
    public static final SPAM HATE;
    public static final SPAM PORN;
    public static final SPAM RIGHTS;
    public static final SPAM SPAM;
    public static final SPAM VIOLENCE;
    public final int stringId;

    public static stringId valueOf(String s)
    {
        return (stringId)Enum.valueOf(com/google/android/apps/youtube/core/async/GDataRequestFactory$ComplaintReason, s);
    }

    public static stringId[] values()
    {
        return (stringId[])$VALUES.clone();
    }

    static 
    {
        PORN = new <init>("PORN", 0, p.bT);
        VIOLENCE = new <init>("VIOLENCE", 1, p.bW);
        HATE = new <init>("HATE", 2, p.bS);
        DANGEROUS = new <init>("DANGEROUS", 3, p.bR);
        RIGHTS = new <init>("RIGHTS", 4, p.bU);
        SPAM = new <init>("SPAM", 5, p.bV);
        $VALUES = (new .VALUES[] {
            PORN, VIOLENCE, HATE, DANGEROUS, RIGHTS, SPAM
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        stringId = j;
    }
}
