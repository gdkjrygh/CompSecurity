// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;


public final class subType extends Enum
{

    private static final SURVEY $VALUES[];
    public static final SURVEY NONE;
    public static final SURVEY SKIPPABLE;
    public static final SURVEY SURVEY;
    public final String subType;

    public static subType valueOf(String s)
    {
        return (subType)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/VastAd$AdFormatSubType, s);
    }

    public static subType[] values()
    {
        return (subType[])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0, "0");
        SKIPPABLE = new <init>("SKIPPABLE", 1, "1");
        SURVEY = new <init>("SURVEY", 2, "3");
        $VALUES = (new .VALUES[] {
            NONE, SKIPPABLE, SURVEY
        });
    }

    private Q(String s, int i, String s1)
    {
        super(s, i);
        subType = s1;
    }
}
