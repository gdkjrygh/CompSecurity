// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;


// Referenced classes of package com.adobe.mobile:
//            Analytics

public static final class value extends Enum
{

    private static final PROXIMITY_UNKNOWN $VALUES[];
    public static final PROXIMITY_UNKNOWN PROXIMITY_FAR;
    public static final PROXIMITY_UNKNOWN PROXIMITY_IMMEDIATE;
    public static final PROXIMITY_UNKNOWN PROXIMITY_NEAR;
    public static final PROXIMITY_UNKNOWN PROXIMITY_UNKNOWN;
    private final int value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/adobe/mobile/Analytics$BEACON_PROXIMITY, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    protected int getValue()
    {
        return value;
    }

    public String toString()
    {
        switch (.adobe.mobile.Analytics.BEACON_PROXIMITY[ordinal()])
        {
        default:
            return "0";

        case 1: // '\001'
            return "1";

        case 2: // '\002'
            return "2";

        case 3: // '\003'
            return "3";
        }
    }

    static 
    {
        PROXIMITY_IMMEDIATE = new <init>("PROXIMITY_IMMEDIATE", 0, 1);
        PROXIMITY_NEAR = new <init>("PROXIMITY_NEAR", 1, 2);
        PROXIMITY_FAR = new <init>("PROXIMITY_FAR", 2, 3);
        PROXIMITY_UNKNOWN = new <init>("PROXIMITY_UNKNOWN", 3, 0);
        $VALUES = (new .VALUES[] {
            PROXIMITY_IMMEDIATE, PROXIMITY_NEAR, PROXIMITY_FAR, PROXIMITY_UNKNOWN
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
