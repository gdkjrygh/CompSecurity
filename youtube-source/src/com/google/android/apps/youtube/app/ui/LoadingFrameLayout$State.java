// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


public final class  extends Enum
{

    private static final EMPTY $VALUES[];
    public static final EMPTY CONTENT;
    public static final EMPTY EMPTY;
    public static final EMPTY ERROR;
    public static final EMPTY LOADING;
    public static final EMPTY NEW;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/ui/LoadingFrameLayout$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NEW = new <init>("NEW", 0);
        LOADING = new <init>("LOADING", 1);
        CONTENT = new <init>("CONTENT", 2);
        ERROR = new <init>("ERROR", 3);
        EMPTY = new <init>("EMPTY", 4);
        $VALUES = (new .VALUES[] {
            NEW, LOADING, CONTENT, ERROR, EMPTY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
