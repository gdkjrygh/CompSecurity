// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;


public final class  extends Enum
{

    private static final SIGNED_OUT $VALUES[];
    public static final SIGNED_OUT NEW;
    public static final SIGNED_OUT SIGNED_IN;
    public static final SIGNED_OUT SIGNED_OUT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/GuideActivity$SignedInState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NEW = new <init>("NEW", 0);
        SIGNED_IN = new <init>("SIGNED_IN", 1);
        SIGNED_OUT = new <init>("SIGNED_OUT", 2);
        $VALUES = (new .VALUES[] {
            NEW, SIGNED_IN, SIGNED_OUT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
