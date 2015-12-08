// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;


public final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN FEMALE;
    public static final UNKNOWN MALE;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/identity/UserProfile$Gender, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MALE = new <init>("MALE", 0);
        FEMALE = new <init>("FEMALE", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            MALE, FEMALE, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
