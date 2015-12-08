// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;


// Referenced classes of package com.adobe.mobile:
//            Analytics

public static final class  extends Enum
{

    private static final PROXIMITY_FAR $VALUES[];
    public static final PROXIMITY_FAR PROXIMITY_FAR;
    public static final PROXIMITY_FAR PROXIMITY_IMMEDIATE;
    public static final PROXIMITY_FAR PROXIMITY_NEAR;
    public static final PROXIMITY_FAR PROXIMITY_UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/adobe/mobile/Analytics$BEACON_PROXIMITY, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
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
        PROXIMITY_UNKNOWN = new <init>("PROXIMITY_UNKNOWN", 0);
        PROXIMITY_IMMEDIATE = new <init>("PROXIMITY_IMMEDIATE", 1);
        PROXIMITY_NEAR = new <init>("PROXIMITY_NEAR", 2);
        PROXIMITY_FAR = new <init>("PROXIMITY_FAR", 3);
        $VALUES = (new .VALUES[] {
            PROXIMITY_UNKNOWN, PROXIMITY_IMMEDIATE, PROXIMITY_NEAR, PROXIMITY_FAR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
