// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;


public final class reasonValue extends Enum
{

    private static final REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY $VALUES[];
    public static final REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY REASON_CLIENT_OFFLINE_AD_ASSET_EXPIRED;
    public static final REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY REASON_CLIENT_OFFLINE_AD_ASSET_FREQUENCY_CAP;
    public static final REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY;
    public static final REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY REASON_CLIENT_OFFLINE_INACTIVE_USER;
    public static final REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY REASON_CLIENT_OFFLINE_INSTREAM_FREQUENCY_CAP;
    public final int reasonValue;

    public static reasonValue valueOf(String s)
    {
        return (reasonValue)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/VastAd$OfflineAdFormatExclusionReason, s);
    }

    public static reasonValue[] values()
    {
        return (reasonValue[])$VALUES.clone();
    }

    public final String toString()
    {
        return String.valueOf(reasonValue);
    }

    static 
    {
        REASON_CLIENT_OFFLINE_INSTREAM_FREQUENCY_CAP = new <init>("REASON_CLIENT_OFFLINE_INSTREAM_FREQUENCY_CAP", 0, 16);
        REASON_CLIENT_OFFLINE_AD_ASSET_FREQUENCY_CAP = new <init>("REASON_CLIENT_OFFLINE_AD_ASSET_FREQUENCY_CAP", 1, 17);
        REASON_CLIENT_OFFLINE_AD_ASSET_EXPIRED = new <init>("REASON_CLIENT_OFFLINE_AD_ASSET_EXPIRED", 2, 18);
        REASON_CLIENT_OFFLINE_INACTIVE_USER = new <init>("REASON_CLIENT_OFFLINE_INACTIVE_USER", 3, 19);
        REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY = new <init>("REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY", 4, 23);
        $VALUES = (new .VALUES[] {
            REASON_CLIENT_OFFLINE_INSTREAM_FREQUENCY_CAP, REASON_CLIENT_OFFLINE_AD_ASSET_FREQUENCY_CAP, REASON_CLIENT_OFFLINE_AD_ASSET_EXPIRED, REASON_CLIENT_OFFLINE_INACTIVE_USER, REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        reasonValue = j;
    }
}
