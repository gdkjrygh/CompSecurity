// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;


public final class type extends Enum
{

    private static final UPLOAD_DATE_THIS_MONTH $VALUES[];
    public static final UPLOAD_DATE_THIS_MONTH UPLOAD_DATE_ANY;
    public static final UPLOAD_DATE_THIS_MONTH UPLOAD_DATE_THIS_MONTH;
    public static final UPLOAD_DATE_THIS_MONTH UPLOAD_DATE_THIS_WEEK;
    public static final UPLOAD_DATE_THIS_MONTH UPLOAD_DATE_TODAY;
    private final int type;

    public static type valueOf(String s)
    {
        return (type)Enum.valueOf(com/google/android/apps/youtube/datalib/innertube/SearchService$UploadDateRestrictType, s);
    }

    public static type[] values()
    {
        return (type[])$VALUES.clone();
    }

    public final int getType()
    {
        return type;
    }

    static 
    {
        UPLOAD_DATE_ANY = new <init>("UPLOAD_DATE_ANY", 0, 0);
        UPLOAD_DATE_TODAY = new <init>("UPLOAD_DATE_TODAY", 1, 2);
        UPLOAD_DATE_THIS_WEEK = new <init>("UPLOAD_DATE_THIS_WEEK", 2, 3);
        UPLOAD_DATE_THIS_MONTH = new <init>("UPLOAD_DATE_THIS_MONTH", 3, 4);
        $VALUES = (new .VALUES[] {
            UPLOAD_DATE_ANY, UPLOAD_DATE_TODAY, UPLOAD_DATE_THIS_WEEK, UPLOAD_DATE_THIS_MONTH
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        type = j;
    }
}
