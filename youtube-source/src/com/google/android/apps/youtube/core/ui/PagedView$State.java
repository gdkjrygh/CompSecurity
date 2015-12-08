// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;


public final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR EMPTY;
    public static final ERROR ERROR;
    public static final ERROR ITEMS;
    public static final ERROR LOADING;
    public static final ERROR NEW;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/ui/PagedView$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NEW = new <init>("NEW", 0);
        EMPTY = new <init>("EMPTY", 1);
        LOADING = new <init>("LOADING", 2);
        ITEMS = new <init>("ITEMS", 3);
        ERROR = new <init>("ERROR", 4);
        $VALUES = (new .VALUES[] {
            NEW, EMPTY, LOADING, ITEMS, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
