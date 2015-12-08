// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;


public final class partnerId extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN ADSENSE;
    public static final UNKNOWN DOUBLECLICK;
    public static final UNKNOWN FREEWHEEL;
    public static final UNKNOWN UNKNOWN;
    public final String partnerId;

    public static partnerId valueOf(String s)
    {
        return (partnerId)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/VastAd$BillingPartner, s);
    }

    public static partnerId[] values()
    {
        return (partnerId[])$VALUES.clone();
    }

    static 
    {
        ADSENSE = new <init>("ADSENSE", 0, "2");
        DOUBLECLICK = new <init>("DOUBLECLICK", 1, "1");
        FREEWHEEL = new <init>("FREEWHEEL", 2, "4");
        UNKNOWN = new <init>("UNKNOWN", 3, "0");
        $VALUES = (new .VALUES[] {
            ADSENSE, DOUBLECLICK, FREEWHEEL, UNKNOWN
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        partnerId = s1;
    }
}
