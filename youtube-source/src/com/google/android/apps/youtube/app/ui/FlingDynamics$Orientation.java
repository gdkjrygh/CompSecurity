// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


public final class  extends Enum
{

    private static final ANY $VALUES[];
    public static final ANY ANY;
    public static final ANY HORIZONTAL;
    public static final ANY VERTICAL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/ui/FlingDynamics$Orientation, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        HORIZONTAL = new <init>("HORIZONTAL", 0);
        VERTICAL = new <init>("VERTICAL", 1);
        ANY = new <init>("ANY", 2);
        $VALUES = (new .VALUES[] {
            HORIZONTAL, VERTICAL, ANY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
