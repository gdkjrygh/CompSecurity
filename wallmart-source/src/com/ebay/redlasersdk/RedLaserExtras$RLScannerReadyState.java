// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ebay.redlasersdk;


// Referenced classes of package com.ebay.redlasersdk:
//            RedLaserExtras

public static final class  extends Enum
{

    private static final UnknownState $VALUES[];
    public static final UnknownState APILevelTooLow;
    public static final UnknownState BadLicense;
    public static final UnknownState EvalModeReady;
    public static final UnknownState LicensedModeReady;
    public static final UnknownState MissingPermissions;
    public static final UnknownState NoCamera;
    public static final UnknownState ScanLimitReached;
    public static final UnknownState UnknownState;
    public static final UnknownState UnsupportedHardware;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/ebay/redlasersdk/RedLaserExtras$RLScannerReadyState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        EvalModeReady = new <init>("EvalModeReady", 0);
        LicensedModeReady = new <init>("LicensedModeReady", 1);
        APILevelTooLow = new <init>("APILevelTooLow", 2);
        NoCamera = new <init>("NoCamera", 3);
        BadLicense = new <init>("BadLicense", 4);
        ScanLimitReached = new <init>("ScanLimitReached", 5);
        MissingPermissions = new <init>("MissingPermissions", 6);
        UnsupportedHardware = new <init>("UnsupportedHardware", 7);
        UnknownState = new <init>("UnknownState", 8);
        $VALUES = (new .VALUES[] {
            EvalModeReady, LicensedModeReady, APILevelTooLow, NoCamera, BadLicense, ScanLimitReached, MissingPermissions, UnsupportedHardware, UnknownState
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
