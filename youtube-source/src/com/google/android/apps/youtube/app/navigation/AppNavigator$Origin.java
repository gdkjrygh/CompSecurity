// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.navigation;


final class  extends Enum
{

    private static final FROM_OTHER $VALUES[];
    public static final FROM_OTHER FROM_GUIDE;
    public static final FROM_OTHER FROM_OTHER;
    public static final FROM_OTHER FROM_WATCH;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/navigation/AppNavigator$Origin, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FROM_GUIDE = new <init>("FROM_GUIDE", 0);
        FROM_WATCH = new <init>("FROM_WATCH", 1);
        FROM_OTHER = new <init>("FROM_OTHER", 2);
        $VALUES = (new .VALUES[] {
            FROM_GUIDE, FROM_WATCH, FROM_OTHER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
