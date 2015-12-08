// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;


public final class Y extends Enum
{

    private static final LOADING $VALUES[];
    public static final LOADING CAN_LOAD_MORE;
    public static final LOADING LOADING;
    public static final LOADING NO_COMMENTS;
    public static final LOADING NO_MORE_COMMENTS;

    public static Y valueOf(String s)
    {
        return (Y)Enum.valueOf(com/google/android/apps/youtube/app/ui/presenter/CommentFooterPresenter$Model$State, s);
    }

    public static Y[] values()
    {
        return (Y[])$VALUES.clone();
    }

    static 
    {
        CAN_LOAD_MORE = new <init>("CAN_LOAD_MORE", 0);
        NO_MORE_COMMENTS = new <init>("NO_MORE_COMMENTS", 1);
        NO_COMMENTS = new <init>("NO_COMMENTS", 2);
        LOADING = new <init>("LOADING", 3);
        $VALUES = (new .VALUES[] {
            CAN_LOAD_MORE, NO_MORE_COMMENTS, NO_COMMENTS, LOADING
        });
    }

    private Y(String s, int i)
    {
        super(s, i);
    }
}
