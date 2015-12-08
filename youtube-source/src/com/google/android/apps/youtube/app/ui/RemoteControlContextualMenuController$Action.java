// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


final class Y extends Enum
{

    private static final REMOVE $VALUES[];
    public static final REMOVE ADD;
    public static final REMOVE REMOVE;

    public static Y valueOf(String s)
    {
        return (Y)Enum.valueOf(com/google/android/apps/youtube/app/ui/RemoteControlContextualMenuController$Action, s);
    }

    public static Y[] values()
    {
        return (Y[])$VALUES.clone();
    }

    static 
    {
        ADD = new <init>("ADD", 0);
        REMOVE = new <init>("REMOVE", 1);
        $VALUES = (new .VALUES[] {
            ADD, REMOVE
        });
    }

    private Y(String s, int i)
    {
        super(s, i);
    }
}
