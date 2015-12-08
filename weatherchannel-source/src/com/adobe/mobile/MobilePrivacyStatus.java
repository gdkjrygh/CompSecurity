// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;


public final class MobilePrivacyStatus extends Enum
{

    private static final MobilePrivacyStatus $VALUES[];
    public static final MobilePrivacyStatus MOBILE_PRIVACY_STATUS_OPT_IN;
    public static final MobilePrivacyStatus MOBILE_PRIVACY_STATUS_OPT_OUT;
    public static final MobilePrivacyStatus MOBILE_PRIVACY_STATUS_UNKNOWN;
    private final int value;

    private MobilePrivacyStatus(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static MobilePrivacyStatus valueOf(String s)
    {
        return (MobilePrivacyStatus)Enum.valueOf(com/adobe/mobile/MobilePrivacyStatus, s);
    }

    public static MobilePrivacyStatus[] values()
    {
        return (MobilePrivacyStatus[])$VALUES.clone();
    }

    protected int getValue()
    {
        return value;
    }

    static 
    {
        MOBILE_PRIVACY_STATUS_OPT_IN = new MobilePrivacyStatus("MOBILE_PRIVACY_STATUS_OPT_IN", 0, 0);
        MOBILE_PRIVACY_STATUS_OPT_OUT = new MobilePrivacyStatus("MOBILE_PRIVACY_STATUS_OPT_OUT", 1, 1);
        MOBILE_PRIVACY_STATUS_UNKNOWN = new MobilePrivacyStatus("MOBILE_PRIVACY_STATUS_UNKNOWN", 2, 2);
        $VALUES = (new MobilePrivacyStatus[] {
            MOBILE_PRIVACY_STATUS_OPT_IN, MOBILE_PRIVACY_STATUS_OPT_OUT, MOBILE_PRIVACY_STATUS_UNKNOWN
        });
    }
}
