// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.ui;


// Referenced classes of package com.weather.ads2.ui:
//            DfpAd

private static final class  extends Enum
{

    private static final FULL $VALUES[];
    public static final FULL AD_SLOT;
    public static final FULL FULL;
    public static final FULL NONE;
    public static final FULL PARENT_VIEW;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/ads2/ui/DfpAd$InitializeState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        PARENT_VIEW = new <init>("PARENT_VIEW", 1);
        AD_SLOT = new <init>("AD_SLOT", 2);
        FULL = new <init>("FULL", 3);
        $VALUES = (new .VALUES[] {
            NONE, PARENT_VIEW, AD_SLOT, FULL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
